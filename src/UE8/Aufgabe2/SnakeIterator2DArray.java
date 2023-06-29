package UE8.Aufgabe2;

import java.util.Iterator;

public class SnakeIterator2DArray<T> implements Iterator<T> {

    private T[][] array;
    private int arraylength1field;
    private int lastarrayfieldlength;
    private int arraylength2field;
    private int current1field;
    private int current1field2;
    private int current2field;
    private boolean direction;

    public SnakeIterator2DArray(T[][] array){
        this.array = array;
        arraylength1field = array.length;
        //lastarrayfieldlength = array.length;
        lastarrayfieldlength = array[0].length;
        current1field = 0;
        current2field = 0;
        direction = true;
    }

    @Override
    public boolean hasNext() {
        return current1field < arraylength1field;
    }

    @Override
    public T next() {
        arraylength2field = array[current1field].length;
        if (lastarrayfieldlength != arraylength2field){
            lastarrayfieldlength = arraylength2field;
            if (current2field != 0){current2field = arraylength2field-1;}
        }
        T value = array[current1field][current2field];

        if (direction){
            if (current2field == arraylength2field -1){
                current1field++;
                direction = false;
            }else {
                current2field++;
            }
        }else{
            if (current2field == 0){
                current1field++;
                direction = true;
            }else{
                current2field--;
            }
        }


        return value;
    }
        public static void main(String[] args) {
            Integer[][] array = {{1, 2, 3, 4, 5,}, {9, 8, 7, 6}, {10, 11, 12, 13, 14 , 15, 16, 17},{20, 19, 18}};
            SnakeIterator2DArray<Integer> iterator = new SnakeIterator2DArray<>(array);

            while (iterator.hasNext()) {
                Integer value = iterator.next();
                System.out.print(value + " ");
            }
            System.out.println();
        }

}

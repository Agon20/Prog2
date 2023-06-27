package UE8.Aufgabe2;

import java.util.Iterator;

public class SnakeIterator2DArray<T> implements Iterator<T> {

    private T[][] array;
    private int arraylength1field;
    private int lastarrayfieldlength;
    private int arraylength2field;
    private int current1field;
    private int current2field;
    private boolean direction;

    public SnakeIterator2DArray(T[][] array){
        this.array = array;
        arraylength1field = array.length;
        lastarrayfieldlength = array.length;
        //arraylength2field = array[0].length;
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
        T value = array[current1field][current2field];

        if (direction){
            if (current2field == arraylength2field -1){
                current2field = arraylength2field-1;
                current1field++;
                direction = false;
            }else {
                current2field++;
            }
        }else{
            if (lastarrayfieldlength != arraylength2field){
                lastarrayfieldlength = arraylength2field;
                current2field = arraylength2field;
            }
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
            Integer[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8, 9, 9}, {10, 11, 12, 13}};
            SnakeIterator2DArray<Integer> iterator = new SnakeIterator2DArray<>(array);

            while (iterator.hasNext()) {
                Integer value = iterator.next();
                System.out.print(value + " ");
            }
            System.out.println();
        }

}

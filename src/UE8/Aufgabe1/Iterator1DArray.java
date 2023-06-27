package UE8.Aufgabe1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator1DArray<T> implements Iterator<T> {

    private T[] array;
    //generic array ablegen
    private int start;
    private int ende;

    public Iterator1DArray(T[] array){
        this.array = array;
        start = 0;
        ende = this.array.length;
    }
    public Iterator1DArray(T[] array, int start){
        this.array = array;
        this.start = start;
        ende = this.array.length;
    }
    public Iterator1DArray(T[] array, int start, int ende){
        this.array = array;
        this.start = start;
        this.ende = ende;
    }

    @Override
    public boolean hasNext() {
        return start < ende;
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return array[start++];
    }

    public static void main(String[] args) {
        String[] a = {"A","B","C","D"};
        Iterator<String> i = new Iterator1DArray<>(a);
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

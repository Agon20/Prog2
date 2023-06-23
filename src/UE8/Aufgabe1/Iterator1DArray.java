package UE8.Aufgabe1;

import java.util.Iterator;

public class Iterator1DArray<T> implements Iterator<T> {

    //generic array ablegen
    private int start;
    private int ende;

    public Iterator1DArray(){
        //generic array erstellen
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}

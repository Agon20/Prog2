package UE5.Aufgabe3;

import UE4.Aufgabe2.DynArray;
import UE5.Aufgabe2.Folge;

public class FolgeMitDynArray<T> implements Folge<T> {
    private DynArray<T> speicher;

    public FolgeMitDynArray(){
        speicher = new DynArray<>();
    }
    @Override
    public boolean isEmpty() {
        return speicher.size() == 0;
    }

    @Override
    public int size() {
        return speicher.size();
    }

    @Override
    public int capacity() {
        return speicher.capacity();
    }

    @Override
    public void insert(T eingabeObjekt) {
        speicher.addLast(eingabeObjekt);
    }

    @Override
    public void remove() {
        speicher.removeFirst();
    }

    @Override
    public void elementAufruf() {

    }

    @Override
    public T get(int pos) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T set(int pos, T e) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public T remove(int pos) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void insert(int pos, T e) throws IndexOutOfBoundsException {
    }
}

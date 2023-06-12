package UE5.Aufgabe3;

import UE5.Aufgabe2.Folge;

public class FolgeMitRing<T> implements Folge<T> {
    private Ringpuffer<T> speicher;
    private final int capacity;

    public FolgeMitRing(int capacity){
        this.capacity = capacity;
        speicher = new Ringpuffer<>(capacity);
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
        return capacity;
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
        return speicher.get(pos);
    }

    @Override
    public T set(int pos, T e) throws IndexOutOfBoundsException {
        return speicher.set(pos, e);
    }

    @Override
    public T remove(int pos) throws IndexOutOfBoundsException {
        return speicher.removeFirst(pos);
    }

    @Override
    public void insert(int pos, T e) throws IndexOutOfBoundsException {
        speicher.addPos(pos, e);
    }
}

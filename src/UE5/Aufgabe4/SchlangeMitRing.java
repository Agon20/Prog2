package UE5.Aufgabe4;

import UE2.Aufgabe3.Schlange;
import UE4.Aufgabe3.Ringpuffer;

public class SchlangeMitRing<T> implements Schlange<T> {
    private Ringpuffer<T> speicher;
    private int capacity;
    public SchlangeMitRing(int capacity){
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
    public int capacity() { return capacity; }

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
        for (int i = 0; i < speicher.size(); i++){
            System.out.println(speicher.get(i));
        }
    }

    @Override
    public T front() {
        return speicher.get(0);
    }
}

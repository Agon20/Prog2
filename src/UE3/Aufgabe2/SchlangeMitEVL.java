package UE3.Aufgabe2;

import UE2.Aufgabe3.Schlange;
import UE3.Aufgabe1.EVL;

public class SchlangeMitEVL<T> implements Schlange<T> {
    private EVL<T> speicherliste;

    public SchlangeMitEVL(){
        speicherliste = new EVL<T>();
    }

    @Override
    public boolean isEmpty() {
        if (speicherliste.size() == 0){return true;}else{return false;}
    }

    @Override
    public int size() {
        return speicherliste.size();
    }

    @Override
    public int capacity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void insert(T eingabeObjekt) {
        speicherliste.addLast(eingabeObjekt);
    }

    @Override
    public void remove() {
        speicherliste.removeFirst();
    }

    @Override
    public void elementAufruf() {
        System.out.println(speicherliste.toString());
    }

    @Override
    public T front() {
        return speicherliste.getFirst();
    }
}

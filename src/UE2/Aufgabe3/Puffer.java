package UE2.Aufgabe3;

public interface Puffer<T>{
    boolean isEmpty();
    int size();
    int capacity();
    void insert(T eingabeObjekt);
    void remove();
    void elementAufruf();
}
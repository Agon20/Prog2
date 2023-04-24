package UE2.Aufgabe2;

interface Puffer<T>{
    boolean isEmpty();
    int size();
    int capacity();
    void insert(T eingabeObjekt);
    void remove();
}
package UE0.Aufgabe2;

interface Puffer{
    boolean isEmpty();
    int size();
    int capacity();
    void insert(int eingabeObjekt);
    void remove();
}
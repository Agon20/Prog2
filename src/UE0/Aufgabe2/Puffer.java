package UE0.Aufgabe2;

public interface Puffer{
    boolean isEmpty();
    int size();
    int capacity();
    void insert(int eingabeObjekt);
    void remove();
}
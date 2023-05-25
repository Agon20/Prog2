package UE5.Aufgabe2;

import UE2.Aufgabe3.Puffer;

public interface Folge<T> extends Puffer<T> {
    T get(int pos);
    T set(int pos, T e);
    void remove();
    void insert(int pos, T e);
}
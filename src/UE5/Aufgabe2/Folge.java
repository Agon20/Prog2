package UE5.Aufgabe2;

import UE2.Aufgabe3.Puffer;

public interface Folge<T> extends Puffer<T> {
    T get(int pos) throws IndexOutOfBoundsException;
    T set(int pos, T e) throws IndexOutOfBoundsException;
    T remove(int pos) throws IndexOutOfBoundsException;
    void insert(int pos, T e) throws IndexOutOfBoundsException;
}
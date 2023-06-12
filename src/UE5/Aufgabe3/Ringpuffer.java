package UE5.Aufgabe3;

import java.util.NoSuchElementException;

public class Ringpuffer<T> {
    private T[] ringpufferArray;
    private int zeiger = 0;
    private int size;
    public Ringpuffer(int capacity){
        ringpufferArray = (T[]) new Object[capacity];
    }
    public int size() {
        return size;
    }
    public T get(int pos) throws NullPointerException{
        int ii = zeiger + pos;
        if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
        if (ringpufferArray[ii] != null) {return ringpufferArray[ii];}
        else {throw new NullPointerException("Element on position pos is null...");}
    }
    public T set (int pos, T e) throws NullPointerException, NoSuchElementException{
        if (e == null){throw new NoSuchElementException();}
        int ii = zeiger + pos;
        if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
        if (ringpufferArray[ii] != null) {
            T rueckgabe = ringpufferArray[ii];
            ringpufferArray[ii] = e;
            return rueckgabe;
        } else {
            throw new NullPointerException("Element on position pos is null...");
        }
    }
    public void addFirst(T e) throws IndexOutOfBoundsException, NoSuchElementException {
        if (e == null){throw new NoSuchElementException("e is null");}
        if (size != ringpufferArray.length){
            if (ringpufferArray[zeiger] == null){
                ringpufferArray[zeiger] = e;
            } else {
                for (int i = ringpufferArray.length-1; i > 0; i--){
                    int ii = zeiger + i;
                    if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
                    ringpufferArray[ii] = ringpufferArray[ii-1];
                }
                ringpufferArray[zeiger] = e;
            }
            size++;
        }else {
            throw new IndexOutOfBoundsException("Array is full");
        }
    }
    public void addPos(int pos, T e) throws IndexOutOfBoundsException, NoSuchElementException {
        if (e == null){throw new NoSuchElementException("e is null");}
        if (size != ringpufferArray.length){
            zeiger += pos;
            if (ringpufferArray[zeiger] == null){
                ringpufferArray[zeiger] = e;
            } else {
                for (int i = ringpufferArray.length-1; i > 0; i--){
                    int ii = zeiger + i;
                    if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
                    ringpufferArray[ii] = ringpufferArray[ii-1];
                }
                ringpufferArray[zeiger] = e;
            }
            size++;
        }else {
            throw new IndexOutOfBoundsException("Array is full");
        }
    }
    public void addLast(T e) throws IndexOutOfBoundsException, NoSuchElementException {
        if (e == null){throw new NoSuchElementException("e is null");}
        if (size != ringpufferArray.length){
            for (int i = 0; i < ringpufferArray.length; i++){
                int ii = zeiger + i;
                if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
                if (ringpufferArray[ii] == null){
                    ringpufferArray[ii] = e;
                    break;
                }
            }
            size++;
        } else {
            throw new IndexOutOfBoundsException("Array is full");
        }
    }
    public T removeFirst() throws NullPointerException {
        if (size != 0){
            T rueckgabe = ringpufferArray[zeiger];
            for (int i = 0; i < ringpufferArray.length-1; i++){
                ringpufferArray[i] = ringpufferArray[i++];
            }
            size--;
            zeiger += 1;
            return rueckgabe;
        }else {
            throw new NullPointerException("Array is empty");
        }
    }
    public T removeFirst(int pos) throws NullPointerException {
        if (size != 0 && ringpufferArray[zeiger+pos] != null){
            zeiger += pos;
            T rueckgabe = ringpufferArray[zeiger];
            for (int i = 0; i < ringpufferArray.length-1; i++){
                ringpufferArray[i] = ringpufferArray[i++];
            }
            size--;
            zeiger += 1;
            return rueckgabe;
        }else {
            throw new NullPointerException("Array is empty");
        }
    }
    public T removeLast() throws NullPointerException {
        if (size != 0){
            if (size == ringpufferArray.length){
                int ii = zeiger + ringpufferArray.length-1;
                T rueckgabe = ringpufferArray[ii];
                ringpufferArray[ii] = null;
                size--;
                return rueckgabe;
            }
            for (int i = ringpufferArray.length-1; i >= 0; i--){
                int ii = zeiger + i;
                if (ii >= ringpufferArray.length){ii = ii - ringpufferArray.length;}
                if (ringpufferArray[ii] != null){
                    T rueckgabe = ringpufferArray[ii];
                    ringpufferArray[ii] = null;
                    size--;
                    return rueckgabe;
                }
            }
            throw new NullPointerException("Failure to remove last object...");
        }else{
            throw new NullPointerException("Array is full");
        }
    }
}

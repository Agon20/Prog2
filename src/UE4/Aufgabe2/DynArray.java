package UE4.Aufgabe2;

import java.util.NoSuchElementException;

public class DynArray<T> {
    private int size;
    private T[] data;
    public DynArray(){
        size = 0;
        data = (T[]) new Object[1];
    }
    public int size(){
        return size;
    }
    public int capacity(){
        return data.length;
    }
    public Object get(int pos) throws NullPointerException{
        if (pos > capacity()){
            throw new IndexOutOfBoundsException("pos not exist");
        }
        if(data[pos] != null){return data[pos];}
        throw new NullPointerException("pos is null");
    }
    public Object set(int pos, T e){
        if (data[pos] != null){
            T cach = data[pos];
            data[pos] = e;
            return cach;
        }else{
            throw new NullPointerException(("pos is null"));
        }
    }
    public void addFirst(T e) throws NoSuchElementException, NullPointerException{
        if (e == null){
            throw new NoSuchElementException("Cannot add null");
        }
        if (data[0] != null){
            extension();
        }
        int tempoCapacity = capacity() -1;
        for (int i = tempoCapacity; i != 0; i--){
            if (data[i] == null){
                    data[i] = data[i-1];
                    data[i-1] = null;
            }
        }
        if (data[0] == null){
            data[0] = e;
            size++;
        }else{
            throw new NullPointerException("failure..."); // Glaub nicht erreichbar
        }
    }
    public void addLast(T e){
        if (e == null){
            throw new NoSuchElementException("Cannot add null");
        }
        if (data[0] != null){extension();}
        if (data[size] == null){
            data[size] = e;
            size++;
        }
    }
    public String removeFirst() throws NullPointerException{
        if (data[0] != null){
        String cachObject = data[0].toString();
        size--;
        return cachObject;
        }else{
            throw new NullPointerException("Cannot remove, list is empty");
        }
    }
    public Object removeLast() throws IndexOutOfBoundsException{
        int tempoSize = size -1;
        if (tempoSize >= 0){
            if (data[tempoSize] != null){
                size--;
                return data[tempoSize];
            }
        }
        throw new IndexOutOfBoundsException("Cannot remove from empty list");
    }

    // Array Bedingungen, halbieren, verdoppeln
    private void extension(){
        if (size == capacity()){
            extensionDouble();
        }else if (size <= capacity()/4){
            extensionOneQuarter();
        }
    }
    private void extensionDouble(){
        int max_cap = capacity()*2;
        T[] cachArray = (T[]) new Object[max_cap];
        for (int i = 0; i < size; i++){
            cachArray[i] = data[i];
        }
        data = cachArray;
    }
    private void extensionOneQuarter(){
        int max_cap = capacity()/2;
        T[] cachArray = (T[]) new Object[max_cap];
        for (int i = 0; i < size; i++){
            cachArray[i] = data[i];
        }
        data = cachArray;
    }
}

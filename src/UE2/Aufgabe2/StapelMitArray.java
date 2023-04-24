package UE2.Aufgabe2;

import UE2.Aufgabe3.Funktion;

import java.util.NoSuchElementException;

public class StapelMitArray<T> implements Stapel<T> {
    private T[] StapelArray;
    public StapelMitArray(int maxGroesse){
        StapelArray = (T[]) new Object[maxGroesse];
    }
    @Override
    public boolean isEmpty() {
        for(int i = 0; i < StapelArray.length; i++) {
            if(StapelArray[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int sizeCounter = 0;
        for(int i = 0; i < StapelArray.length; i++){
            if(StapelArray[i] != null){
                sizeCounter++;
            }
        }
        return sizeCounter;
    }

    @Override
    public int capacity() {
        return StapelArray.length;
    }

    @Override
    public void insert(T eingabeObjekt) {
        if(size() == StapelArray.length){
            throw new IllegalStateException("Speicher ist voll...");
        }
        for(int i = 0; i < StapelArray.length; i++){
            if(StapelArray[i] == null){
                StapelArray[i] = eingabeObjekt;
                break;
            }
        }
    }

    @Override
    public void remove() {
        if(size() == 0){
            throw new NoSuchElementException("Speicher ist leer...");
        }
        for(int i = 0; i < StapelArray.length; i++){
            if(i+1 < StapelArray.length) {
                StapelArray[i] = StapelArray[i + 1];
            }else{
                StapelArray[i] = null;
            }
        }
    }

    @Override
    public T top() {
        if(size() == 0){
            throw new  NoSuchElementException("Speicher ist leer...");
        }else{
            return StapelArray[size()-1];
        }
    }
    public void applytoAll(Funktion function){
        for (int i = 0; i < StapelArray.length; i++){
            StapelArray[i] = (T) function.auswerten(StapelArray[i]);
        }
    }
}

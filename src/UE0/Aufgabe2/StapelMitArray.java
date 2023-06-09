package UE0.Aufgabe2;

import UE1.Aufgabe3.Funktion;

import java.util.NoSuchElementException;

public class StapelMitArray implements Stapel{
    private int[] StapelArray;
    public StapelMitArray(int maxGroesse){
        StapelArray = new int[maxGroesse];
    }
    @Override
    public boolean isEmpty() {
        for(int i = 0; i < StapelArray.length; i++) {
            if(StapelArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int sizeCounter = 0;
        for(int i = 0; i < StapelArray.length; i++){
            if(StapelArray[i] != 0){
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
    public void insert(int eingabeObjekt) {
        if(size() == StapelArray.length){
            throw new java.lang.IllegalStateException("Speicher ist voll...");
        }
        for(int i = 0; i < StapelArray.length; i++){
            if(StapelArray[i] == 0){
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
                StapelArray[i] = 0;
            }
        }
    }

    @Override
    public int top() {
        if(size() == 0){
            throw new  NoSuchElementException("Speicher ist leer...");
        }else{
            return StapelArray[size()-1];
        }
    }
    public void applytoAll(Funktion function){
        for (int i = 0; i < StapelArray.length; i++){
            StapelArray[i] = function.auswerten(StapelArray[i]);
        }
    }
}

package UE0;

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
            throw new java.util.NoSuchElementException("Speicher ist leer...");
        }
        for(int i = 0; i < StapelArray.length; i++){
            if(StapelArray[i] == 0){
                StapelArray[i-1] = 0;
            }
        }
    }

    @Override
    public int top() {
        if(size() == 0){
            throw new  java.util.NoSuchElementException("Speicher ist leer...");
        }else{
            return StapelArray[size()-1];
        }
    }
}

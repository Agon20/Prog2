package UE0;

public class SchlangeMitArray implements Schlange{
    private int[] SchlangenArray;
    public SchlangeMitArray(int maxGroesse){
        SchlangenArray = new int[maxGroesse];
    }
    @Override
    public boolean isEmpty() {
        for(int i = 0; i < SchlangenArray.length; i++) {
            if(SchlangenArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int sizeCounter = 0;
        for(int i = 0; i < SchlangenArray.length; i++){
            if(SchlangenArray[i] != 0){
                sizeCounter++;
            }
        }
        return sizeCounter;
    }

    @Override
    public int capacity() {
        return SchlangenArray.length;
    }

    @Override
    public void insert(int eingabeObjekt) {
        if(size() == SchlangenArray.length){
            throw new java.lang.IllegalStateException("Speicher ist voll...");
        }
        for(int i = 0; i < SchlangenArray.length; i++){
            if(SchlangenArray[i] == 0){
                SchlangenArray[i] = eingabeObjekt;
                break;
            }
        }
    }

    @Override
    public void remove() {
        if(size() == 0){
            throw new java.util.NoSuchElementException("Speicher ist leer...");
        }
        for(int i = 0; i < SchlangenArray.length; i++){
            if(SchlangenArray[i] == 0){
                SchlangenArray[i-1] = 0;
            }
        }
    }

    @Override
    public int front() {
        int aktuelleStelle = 0;
        if(size() == 0){
            throw new java.util.NoSuchElementException("Speicher ist leer...");
        }
        for(int i = 0; i < SchlangenArray.length; i++){
                if(SchlangenArray[i] != 0){
                    aktuelleStelle = i;
                    break;
                }
        }
        return SchlangenArray[aktuelleStelle];
    }
}

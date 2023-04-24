package UE2.Aufgabe2;

public class SchlangeMitArray<T> implements Schlange<T> {
    private T[] SchlangenArray;
    public SchlangeMitArray(int maxGroesse){
        SchlangenArray = (T[]) new Object[maxGroesse];
    }
    @Override
    public boolean isEmpty() {
        for(int i = 0; i < SchlangenArray.length; i++) {
            if(SchlangenArray[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int sizeCounter = 0;
        for(int i = 0; i < SchlangenArray.length; i++){
            if(SchlangenArray[i] != null){
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
    public void insert(T eingabeObjekt) {
        if(size() == SchlangenArray.length){
            throw new IllegalStateException("Speicher ist voll...");
        }
        for(int i = 0; i < SchlangenArray.length; i++){
            if(SchlangenArray[i] == null){
                SchlangenArray[i] = eingabeObjekt;
                break;
            }
        }
    }

    @Override
    public void remove() {
        if(size() == 0){
            throw new java.util.NoSuchElementException("Speicher ist leer...");
        }else{
            for(int i = 0; i < SchlangenArray.length; i++){
                if(i+1 < SchlangenArray.length) {
                    SchlangenArray[i] = SchlangenArray[i + 1];
                }else {
                    SchlangenArray[i] = null;
                }
            }
        }
    }

    @Override
    public T front() {
        int aktuelleStelle = 0;
        if(size() == 0){
            throw new java.util.NoSuchElementException("Speicher ist leer...");
        }
        for(int i = 0; i < SchlangenArray.length; i++){
                if(SchlangenArray[i] != null){
                    aktuelleStelle = i;
                    break;
                }
        }
        return SchlangenArray[aktuelleStelle];
    }
}

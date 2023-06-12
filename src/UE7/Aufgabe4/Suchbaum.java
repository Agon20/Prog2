package UE7.Aufgabe4;

import java.util.Comparator;

public class Suchbaum<T> implements Comparable<T>{
    private Knoten<T> wurzel;
    private final Comparator<T> comparator;

    public Suchbaum(){ this(null);}

    public Suchbaum(Comparator<T> comparator) {
        wurzel = null;
        this.comparator = comparator;
    }

    private class Knoten<T>{

        private T wert;
        private Knoten<T> links;
        private Knoten<T> rechts;
        public Knoten(T wert){
            this.wert = wert;
            links = null;
            rechts = null;
        }

    }
    public boolean isEmpty(){
        return wurzel == null;
    }

    public void insert(T i){
        if(!contains(i)){
            Knoten<T> knoten = new Knoten<>(i);
            if (wurzel == null){wurzel = knoten;}
            else{
                Knoten<T> node = wurzel;
                while (true){
                    if (compareElements(knoten.wert , node.wert) < 0){
                        if(node.links == null){
                            node.links = knoten;
                            break;
                        }else{node = node.links;}
                    }
                    if (compareElements(knoten.wert , node.wert) > 0){
                        if(node.rechts == null){
                            node.rechts = knoten;
                            break;
                        }else{node = node.rechts;}
                    }
                }
            }
        }else {
            throw new IllegalArgumentException("Element already exists in the tree");
        }
    }
    public boolean contains(T i) {
        return containsRekursiv(wurzel, i);
    }
    private boolean containsRekursiv(Knoten<T> knoten, T i) {
        if (knoten == null) {
            return false;
        }
        int comparison = comparator.compare(i, knoten.wert);
        if (knoten.wert.equals(i)) {
            return true;
        } else if (0 < comparison) {
            return containsRekursiv(knoten.links, i);
        } else {
            return containsRekursiv(knoten.rechts, i);
        }
    }

    public String toString() {
        return toStringHelper(wurzel);
    }

    private String toStringHelper(Knoten<T> knoten) {
        if (knoten == null) {
            return "";
        }

        String linkeUnterbaum = toStringHelper(knoten.links);
        String rechteUnterbaum = toStringHelper(knoten.rechts);

        return "(" + linkeUnterbaum + ")" + knoten.wert + "(" + rechteUnterbaum + ")";
    }

    public int hoehe() {
        return berechneHoehe(wurzel);
    }

    private int berechneHoehe(Knoten<T> knoten) {
        if (knoten == null) {
            return 0;
        }

        int linkeHoehe = berechneHoehe(knoten.links);
        int rechteHoehe = berechneHoehe(knoten.rechts);

        return Math.max(linkeHoehe, rechteHoehe) + 1;
    }

    public int size() {
        return sizeRekursiv(wurzel);
    }

    private int sizeRekursiv(Knoten<T> knoten) {
        if (knoten == null) {
            return 0;
        }

        int linksGroesse = sizeRekursiv(knoten.links);
        int rechtsGroesse = sizeRekursiv(knoten.rechts);

        return 1 + linksGroesse + rechtsGroesse;
    }

    private int compareElements(T element1, T element2) {
        if (comparator == null) {
            // Verwende die natürliche Ordnung (compareTo)
            if (element1 instanceof Comparable && element2 instanceof Comparable) {
                Comparable<T> comparableElement1 = (Comparable<T>) element1;
                return comparableElement1.compareTo(element2);
            } else {
                throw new IllegalArgumentException("Die Elemente implementieren nicht das Comparable-Interface.");
            }
        } else {
            // Verwende den Comparator (compare)
            return comparator.compare(element1, element2);
        }
    }
}

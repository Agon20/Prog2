package UE6.Aufgabe1;

public class IntSuchbaum {
    private Knoten wurzel;
    public IntSuchbaum(){
        wurzel = null;
    }
    private class Knoten{
        private Integer wert;
        private Knoten links;
        private Knoten rechts;
        public Knoten(int wert){
            this.wert = wert;
            links = null;
            rechts = null;
        }
    }
    public boolean isEmpty(){
        return wurzel == null;
    }
    public void insert(Integer i){
        if(!contains(i)){
            Knoten knoten = new Knoten(i);
            if (wurzel == null){wurzel = knoten;}
            else{
                Knoten node = wurzel;
                while (true){
                    if (i < node.wert){
                        if(node.links == null){
                            node.links = knoten;
                            break;
                        }else{node = node.links;}
                    }
                    if (i > node.wert){
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
    public boolean contains(Integer i) {
        return containsRekursiv(wurzel, i);
    }

    private boolean containsRekursiv(Knoten knoten, Integer i) {
        if (knoten == null) {
            return false;
        }
        if (knoten.wert.equals(i)) {
            return true;
        } else if (i < knoten.wert) {
            return containsRekursiv(knoten.links, i);
        } else {
            return containsRekursiv(knoten.rechts, i);
        }
    }

    public String toString() {
        return toStringHelper(wurzel);
    }

    private String toStringHelper(Knoten knoten) {
        if (knoten == null) {
            return "";
        }

        String linkeUnterbaum = toStringHelper(knoten.links);
        String rechteUnterbaum = toStringHelper(knoten.rechts);
        if (!linkeUnterbaum.equals("")){
            linkeUnterbaum = "(" + linkeUnterbaum + ")";
        }
        if (!rechteUnterbaum.equals("")){
            rechteUnterbaum = "(" + rechteUnterbaum + ")";
        }

        return linkeUnterbaum + knoten.wert + rechteUnterbaum;
    }

    public int hoehe() {
        return berechneHoehe(wurzel);
    }

    private int berechneHoehe(Knoten knoten) {
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

    private int sizeRekursiv(Knoten knoten) {
        if (knoten == null) {
            return 0;
        }

        int linksGroesse = sizeRekursiv(knoten.links);
        int rechtsGroesse = sizeRekursiv(knoten.rechts);

        return 1 + linksGroesse + rechtsGroesse;
    }

}

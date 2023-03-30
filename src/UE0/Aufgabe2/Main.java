package UE0.Aufgabe2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stapel");

        StapelMitArray stapelObjekt = new StapelMitArray(5);
        System.out.println("Leer " + stapelObjekt.isEmpty());
        stapelObjekt.insert(1);
        System.out.println("Leer " + stapelObjekt.isEmpty());
        System.out.println("Size " + stapelObjekt.size());
        System.out.println("capacity " + stapelObjekt.capacity());
        stapelObjekt.insert(2);
        stapelObjekt.insert(4);
        System.out.println("Top " + stapelObjekt.top());
        System.out.println("size " + stapelObjekt.size());
        stapelObjekt.remove();
        System.out.println("size " + stapelObjekt.size());


        System.out.println("Schlange");

        SchlangeMitArray schlangeObjekt = new SchlangeMitArray(5);
        System.out.println("Leer " + schlangeObjekt.isEmpty());
        schlangeObjekt.insert(1);
        System.out.println("Leer " + schlangeObjekt.isEmpty());
        System.out.println("Size " + schlangeObjekt.size());
        System.out.println("capacity " + schlangeObjekt.capacity());
        schlangeObjekt.insert(2);
        schlangeObjekt.insert(4);
        System.out.println("front " + schlangeObjekt.front());
        System.out.println("size " + schlangeObjekt.size());
        schlangeObjekt.remove();
        System.out.println("size " + schlangeObjekt.size());
    }
}

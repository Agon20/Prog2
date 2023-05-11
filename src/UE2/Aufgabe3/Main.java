package UE2.Aufgabe3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stapel\n");

        StapelMitArray stapelObjekt = new StapelMitArray(5);
        System.out.println("Leer " + stapelObjekt.isEmpty() + "\nErwartet: true");
        stapelObjekt.insert(1);
        System.out.println("Leer " + stapelObjekt.isEmpty()+ "\nErwartet: false");
        System.out.println("Size " + stapelObjekt.size()+ "\nErwartet: 1");
        System.out.println("capacity " + stapelObjekt.capacity()+ "\nErwartet: 5");
        stapelObjekt.insert(2);
        stapelObjekt.insert(4);
        System.out.println("Top " + stapelObjekt.top()+ "\nErwartet: 4");
        System.out.println("size " + stapelObjekt.size()+ "\nErwartet: 3");
        stapelObjekt.remove();
        System.out.println("size " + stapelObjekt.size()+ "\nErwartet: 2");


        System.out.println("\nSchlange\n");

        SchlangeMitArray schlangeObjekt = new SchlangeMitArray(5);
        System.out.println("Leer " + schlangeObjekt.isEmpty()+ "\nErwartet: true");
        schlangeObjekt.insert(1);
        System.out.println("Leer " + schlangeObjekt.isEmpty()+ "\nErwartet: false");
        System.out.println("Size " + schlangeObjekt.size()+ "\nErwartet: 1");
        System.out.println("capacity " + schlangeObjekt.capacity()+ "\nErwartet: 5");
        schlangeObjekt.insert(2);
        schlangeObjekt.insert(4);
        System.out.println("front " + schlangeObjekt.front()+ "\nErwartet: 1");
        System.out.println("size " + schlangeObjekt.size()+ "\nErwartet: 3");
        schlangeObjekt.remove();
        System.out.println("size " + schlangeObjekt.size()+ "\nErwartet: 2");
    }
}

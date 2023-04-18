package UE1.TestclassForUE0;

import UE0.Aufgabe2.StapelMitArray;
import UE1.Aufgabe3.Funktion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StapelMitArrayTest {

    StapelMitArray testStapel = new StapelMitArray(5);
    @Test
    public void testisEmpty(){
        System.out.println("Methode isEmpty() testen...");

        //Test, ob der Speicher leer ist
        assertTrue(testStapel.isEmpty());

        //Element hinzufügen
        testStapel.insert(1);

        //Test, ob der Speicher nicht leer ist
        assertFalse(testStapel.isEmpty());

        System.out.println("...top");
    }
    @Test
    public void testSize(){
        System.out.println("Methode size() testen...");

        //Test ob size 0 ist
        assertEquals(0, testStapel.size());

        //Element hinzufügen
        testStapel.insert(1);

        //Test ob size 1 ist;
        assertEquals(1, testStapel.size());

        //Element hinzufügen
        testStapel.insert(1);

        //Test ob size 2 ist;
        assertEquals(2, testStapel.size());

        System.out.println("...top");
    }
    @Test
    public void testCapacity(){
        System.out.println("Methode capacity() testen...");

        //Test, ob die Länge des Speichers richtig ist
        assertEquals(5, testStapel.capacity());

        System.out.println("...top");
    }
    @Test
    public void testInsert(){
        System.out.println("Methode insert() testen...");

        //Test, ob die Länge des Speichers 0 entspricht
        assertEquals(0, testStapel.size());

        //Element hinzufügen
        testStapel.insert(2);

        //Test, ob ein Element hinzugefügt wurde
        assertEquals(1, testStapel.size());

        //4 weitere Elemente hinzufügen
        testStapel.insert(1);
        testStapel.insert(10);
        testStapel.insert(4);
        testStapel.insert(3);

        //Test, ob bei Überschreiten der Kapazität des Speichers eine Exception geworfen wird
        assertThrows(IllegalStateException.class, () -> testStapel.insert(21));

        System.out.println("...top");
    }
    @Test
    public void testRemove(){
        System.out.println("Methode remove() testen...");

        //Test, ob der Speicher leer ist
        assertEquals(0, testStapel.size());

        //5 Elemente hinzufügen
        testStapel.insert(1);
        testStapel.insert(10);
        testStapel.insert(4);
        testStapel.insert(3);
        testStapel.insert(2);

        //Test, ob der Speicher voll ist
        assertEquals(5, testStapel.size());

        //Das Löschen eines Elementes
        testStapel.remove();

        //Test, ob das Löschen funktioniert
        assertEquals(4, testStapel.size());

        //Test, ob bei Überschreiten der Kapazität des Arrays eine Exception geworfen wird
        //assertThrows(IllegalStateException.class, () -> testSchlange.insert(21));

        System.out.println("...top");
    }
    @Test
    public void testTop(){
        System.out.println("Methode top() testen...");

        //Test, ob der Speicher leer ist
        assertEquals(0, testStapel.size());

        //2 Elemente hinzufügen
        testStapel.insert(4);
        testStapel.insert(1);

        //Test, ob Element hinzugefügt wurde
        assertEquals(2, testStapel.size());

        //Test, ob das aktuell vorderste Element geliefert wird
        assertEquals(1, testStapel.top());

        //Test, ob bei Überschreiten der Kapazität des Arrays eine Exception geworfen wird
        //assertThrows(IllegalStateException.class, () -> testSchlange.insert(21));

        System.out.println("...top");
    }
    @Test
    public void testApplytoAll(){
        //Test, ob der Speicher leer ist
        assertEquals(0, testStapel.size());

        //Element hinzufügen
        testStapel.insert(2);

        //Lambda für Verdoppeln
        Funktion verdoppeln = wert -> wert * 2;

        //Lambda für Quadrieren
        Funktion quadrieren = wert -> wert * wert;

        //applyToAll mit Verdoppeln ausführen
        testStapel.applytoAll(verdoppeln);

        //Test, ob applyToAll verdoppelt wurde
        assertEquals(4,testStapel.top());

        //applyToAll mit Quadrieren ausführen
        testStapel.applytoAll(quadrieren);

        //Test, ob applyToAll quadriert wurde
        assertEquals(16,testStapel.top());
    }
}
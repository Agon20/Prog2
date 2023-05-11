package UE2.Aufgabe4TestKlassen;

import UE2.Aufgabe3.StapelMitArray;
import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class GenericStapelMitArrayTest {
    StapelMitArray testStapelG = new StapelMitArray(5);

    @Test
    void testIsEmpty(){
        // Testen, ob der Speicher leer ist
        assertTrue(testStapelG.isEmpty());

        // Element hinzufügen
        testStapelG.insert("Was");
        testStapelG.insert(3);

        // Testen, ob der Speicher nicht leer ist
        assertFalse(testStapelG.isEmpty());
    }
    @Test
    void testSize(){
        // Test, ob size 0 ist
        assertEquals(0, testStapelG.size());
        // Element hinzufügen
        testStapelG.insert("sizeTester");
        // Test, ob size 1 ist
        assertEquals(1, testStapelG.size());
        // Element hinzufügen
        testStapelG.insert(21);
        // Test, ob size 2 ist
        assertEquals(2, testStapelG.size());
    }
    @Test
    void testCapacity(){
        // Test, ob die Länge des Speichers richtig ist
        assertEquals(5, testStapelG.capacity());
    }
    @Test
    void testInsert(){
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(0, testStapelG.size());
        // Element hinzufügen
        testStapelG.insert(2);
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(1, testStapelG.size());
        // 4 weitere Elemente hinzufügen
        testStapelG.insert(2);
        testStapelG.insert("testeInsert");
        testStapelG.insert("Was das");
        testStapelG.insert(true);
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(5, testStapelG.size());
        //Test, ob bei Überschreiten der Kapazität des Speichers eine Exception geworfen wird
        assertThrows(IllegalStateException.class, () -> testStapelG.insert(21));
    }
    @Test
    public void testRemove(){
        // Test, ob der Speicher leer ist
        assertEquals(0, testStapelG.size());
        // Test, ob Fehlermeldung kommt
        assertThrows(NoSuchElementException.class,() -> {
            testStapelG.remove();});
        // 5 Elemente hinzufügen
        testStapelG.insert(1);
        testStapelG.insert(10);
        testStapelG.insert("testRemove");
        testStapelG.insert(false);
        testStapelG.insert(2);
        // Test, ob der Speicher voll ist
        assertEquals(5, testStapelG.size());
        // Das Löschen eines Elementes
        testStapelG.remove();
        // Test, ob das Löschen funktioniert
        assertEquals(4, testStapelG.size());

        //Test, ob bei Überschreiten der Kapazität des Arrays eine Exception geworfen wird
        //assertThrows(IllegalStateException.class, () -> testSchlange.insert(21));

        System.out.println("...top");
    }
    @Test
    public void testTop(){

        //Test, ob der Speicher leer ist
        assertEquals(0, testStapelG.size());

        //2 Elemente hinzufügen
        testStapelG.insert(true);
        testStapelG.insert(1);

        //Test, ob Element hinzugefügt wurde
        assertEquals(2, testStapelG.size());
        //Test, ob das aktuell vorderste Element geliefert wird
        assertEquals(1, testStapelG.top());
        testStapelG.insert("testTop");
        // Test, ob das aktuell vorderste Element geliefert wird
        assertEquals("testTop", testStapelG.top());

    }
}

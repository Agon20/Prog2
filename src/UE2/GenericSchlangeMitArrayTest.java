package UE2;

import UE2.Aufgabe2.SchlangeMitArray;
import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class GenericSchlangeMitArrayTest {
    SchlangeMitArray testSchlangeG = new SchlangeMitArray(5);

    @Test
    void testIsEmpty(){
        // Testen, ob der Speicher leer ist
        assertTrue(testSchlangeG.isEmpty());

        // Element hinzufügen
        testSchlangeG.insert("Was");
        testSchlangeG.insert(3);

        // Testen, ob der Speicher nicht leer ist
        assertFalse(testSchlangeG.isEmpty());
    }
    @Test
    void testSize(){
        // Test, ob size 0 ist
        assertEquals(0, testSchlangeG.size());
        // Element hinzufügen
        testSchlangeG.insert("sizeTester");
        // Test, ob size 1 ist
        assertEquals(1, testSchlangeG.size());
        // Element hinzufügen
        testSchlangeG.insert(21);
        // Test, ob size 2 ist
        assertEquals(2, testSchlangeG.size());
    }
    @Test
    void testCapacity(){
        // Test, ob die Länge des Speichers richtig ist
        assertEquals(5, testSchlangeG.capacity());
    }
    @Test
    void testInsert(){
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(0, testSchlangeG.size());
        // Element hinzufügen
        testSchlangeG.insert(2);
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(1, testSchlangeG.size());
        // 4 weitere Elemente hinzufügen
        testSchlangeG.insert(2);
        testSchlangeG.insert("testeInsert");
        testSchlangeG.insert("Was das");
        testSchlangeG.insert(true);
        // Test, ob die Size des Speichers 0 entspricht
        assertEquals(5, testSchlangeG.size());
        // Test, ob bei Überschreiten der Kapazität des Speichers eine Exception geworfen wird
        assertThrows(IllegalStateException.class, () -> testSchlangeG.insert(21));
    }
    @Test
    public void testRemove(){
        // Test, ob der Speicher leer ist
        assertEquals(0, testSchlangeG.size());
        // Test, ob Fehlermeldung kommt
        assertThrows(NoSuchElementException.class,() -> {testSchlangeG.remove();});
        // 5 Elemente hinzufügen
        testSchlangeG.insert(1);
        testSchlangeG.insert(10);
        testSchlangeG.insert("testRemove");
        testSchlangeG.insert(false);
        testSchlangeG.insert(2);
        // Test, ob der Speicher voll ist
        assertEquals(5, testSchlangeG.size());
        // Das Löschen eines Elementes
        testSchlangeG.remove();
        // Test, ob das Löschen funktioniert
        assertEquals(4, testSchlangeG.size());
    }
    @Test
    public void testFront(){

        // Test, ob der Speicher leer ist
        assertEquals(0, testSchlangeG.size());

        // 2 Elemente hinzufügen
        testSchlangeG.insert(true);
        testSchlangeG.insert(1);

        // Test, ob Element hinzugefügt wurde
        assertEquals(2, testSchlangeG.size());

        // Test, ob das aktuell vorderste Element geliefert wird
        assertEquals(true, testSchlangeG.front());
        // Element hinzufügen
        testSchlangeG.remove();
        // Test, ob das aktuell vorderste Element geliefert wird
        assertEquals(1, testSchlangeG.front());

    }
}

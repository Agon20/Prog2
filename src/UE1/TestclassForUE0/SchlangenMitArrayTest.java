package UE1.TestclassForUE0;

import UE0.Aufgabe2.SchlangeMitArray;
import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class SchlangenMitArrayTest {

    SchlangeMitArray testSchlange = new SchlangeMitArray(5);
    @Test
    public void testisEmpty(){
        System.out.println("Methode isEmpty() testen...");

        //Test, ob der Speichers leer ist
        assertTrue(testSchlange.isEmpty());

        //Element hinzufügen
        testSchlange.insert(1);

        //Test, ob der Speichers nicht leer ist
        assertFalse(testSchlange.isEmpty());

        System.out.println("...top");
    }
    @Test
    public void testSize(){
        System.out.println("Methode size() testen...");

        //Test ob size 0 ist
        assertEquals(0, testSchlange.size());

        //Element hinzufügen
        testSchlange.insert(1);

        //Test ob size 1 ist;
        assertEquals(1, testSchlange.size());

        //Element hinzufügen
        testSchlange.insert(1);

        //Test ob size 2 ist;
        assertEquals(2, testSchlange.size());

        System.out.println("...top");
    }
    @Test
    public void testCapacity(){
        System.out.println("Methode capacity() testen...");

        //Test, ob die Länge des Speichers richtig ist
        assertEquals(5, testSchlange.capacity());

        System.out.println("...top");
    }
    @Test
    public void testInsert(){
        System.out.println("Methode insert() testen...");

        //Test, ob die Länge des Speichers 0 entspricht
        assertEquals(0, testSchlange.size());

        //Element hinzufügen
        testSchlange.insert(2);

        //Test, ob ein Element hinzugefügt wurde
        assertEquals(1, testSchlange.size());

        //4 weitere Elemente hinzufügen
        testSchlange.insert(1);
        testSchlange.insert(10);
        testSchlange.insert(4);
        testSchlange.insert(3);

        //Test, ob bei Überschreiten der Kapazität des Speichers eine Exception geworfen wird
        assertThrows(IllegalStateException.class, () -> testSchlange.insert(21));


        System.out.println("...top");
    }
    @Test
    public void testRemove(){
        System.out.println("Methode remove() testen...");

        //Test, ob der Speicher leer ist
        assertEquals(0, testSchlange.size());

        //Test, ob Fehlermeldung kommt
        assertThrows(NoSuchElementException.class,() -> {testSchlange.remove();});

        //5 Elemente hinzufügen
        testSchlange.insert(1);
        testSchlange.insert(10);
        testSchlange.insert(4);
        testSchlange.insert(3);
        testSchlange.insert(2);

        //Test, ob der Speicher voll ist
        assertEquals(5, testSchlange.size());

        //Das Löschen eines Elementes
        testSchlange.remove();

        //Test, ob das Löschen funktioniert
        assertEquals(4, testSchlange.size());

        //Test, ob bei Überschreiten der Kapazität des Arrays eine Exception geworfen wird
        //assertThrows(IllegalStateException.class, () -> testSchlange.insert(21));

        System.out.println("...top");
    }
    @Test
    public void testFront(){
        System.out.println("Methode front() testen...");

        //Test, ob der Speicher leer ist
        assertEquals(0, testSchlange.size());

        //2 Elemente hinzufügen
        testSchlange.insert(4);
        testSchlange.insert(1);

        //Test, ob Element hinzugefügt wurde
        assertEquals(2, testSchlange.size());

        //Test, ob das aktuell vorderste Element geliefert wird
        assertEquals(4, testSchlange.front());

        System.out.println("...top");
    }
}
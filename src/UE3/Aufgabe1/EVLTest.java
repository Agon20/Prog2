package UE3.Aufgabe1;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class EVLTest {
    EVL<Object> objectEVL = new EVL<>();

    @Test
    void addFirst() {
        // Throws test
        assertThrows(NullPointerException.class, () -> objectEVL.addFirst(null));
        // add test
        objectEVL.addFirst("Erster Eingang");
        assertEquals("Erster Eingang", objectEVL.getFirst());
        // second add test
        objectEVL.addFirst("Zweiter Eingang");
        assertEquals("Zweiter Eingang", objectEVL.getFirst());
        // test if it was really deposited
        assertEquals(2, objectEVL.size());
    }

    @Test
    void addLast() {
        // Throws test
        assertThrows(NullPointerException.class, () -> objectEVL.addLast(null));
        // add test
        objectEVL.addLast("Erster Eingang");
        assertEquals("Erster Eingang", objectEVL.getLast());
        // second add test
        objectEVL.addLast("Zweiter Eingang");
        assertEquals("Zweiter Eingang", objectEVL.getLast());
        // test if it was really deposited
        assertEquals(2, objectEVL.size());
    }

    @Test
    void removeFirst() {
        // Throws test
        assertThrows(NoSuchElementException.class, () -> objectEVL.removeFirst());
        // add 2 objects with addFirst
        objectEVL.addFirst("Erster Eingang");
        objectEVL.addFirst("Zweiter Eingang");
        // test if it was really deposited
        assertEquals(2, objectEVL.size());
        // test to remove
        assertEquals("Zweiter Eingang", objectEVL.removeFirst());
        assertEquals("Erster Eingang", objectEVL.removeFirst());
        // test if it was really deleted
        assertEquals(0, objectEVL.size());
    }

    @Test
    void removeLast() {
        // Throws test
        assertThrows(NoSuchElementException.class, () -> objectEVL.removeLast());
        // add 2 objects with addLast
        objectEVL.addLast("Erster Eingang");
        objectEVL.addLast("Zweiter Eingang");
        // test if it was really deposited
        assertEquals(2, objectEVL.size());
        // test to remove
        assertEquals("Zweiter Eingang", objectEVL.removeLast());
        assertEquals("Erster Eingang", objectEVL.removeLast());
        // test if it was really deleted
        assertEquals(0, objectEVL.size());
    }

    @Test
    void getFirst() {
        // Throws test
        assertThrows(NoSuchElementException.class, () -> objectEVL.getFirst());
        // add object with addFirst
        objectEVL.addFirst("Erster Eingang");
        // get first object
        assertEquals("Erster Eingang", objectEVL.getFirst());
        // add object with addFirst
        objectEVL.addFirst(123);
        // get first object
        assertEquals(123, objectEVL.getFirst());
    }

    @Test
    void getLast() {
        // Throws test
        assertThrows(NoSuchElementException.class, () -> objectEVL.getLast());
        // add object with addLast
        objectEVL.addLast("Erster Eingang");
        // get first object
        assertEquals("Erster Eingang", objectEVL.getLast());
        // add object with addLast
        objectEVL.addLast(123);
        // get first object
        assertEquals(123, objectEVL.getLast());
    }

    @Test
    void contains() {
        // Throws test
        assertThrows(NoSuchElementException.class, () -> objectEVL.contains(21));
        // add object with addFirst
        objectEVL.addFirst("Erster Eingang");
        // add object with addLast
        objectEVL.addLast(123);
        // test contains method
        assertTrue(objectEVL.contains("Erster Eingang"));
        assertTrue(objectEVL.contains(123));
    }

    @Test
    void size() {
        // test size method
        assertEquals(0, objectEVL.size());
        // add object with addFirst
        objectEVL.addFirst("Erster Eingang");
        // add object with addLast
        objectEVL.addLast(123);
        // test size method
        assertEquals(2, objectEVL.size());
    }

    @Test
    void testToString() {
        // Throws test
        assertThrows(NullPointerException.class, () -> objectEVL.toString());
        // add 2 objects with addFirst
        objectEVL.addFirst("Erster Eingang");
        // test toString method
        assertEquals("Erster Eingang", objectEVL.toString());
        // add 2 objects with addFirst
        objectEVL.addFirst("Zweiter Eingang");
        objectEVL.addFirst(3);
        // add 2 objects with addLast
        objectEVL.addLast(21);
        objectEVL.addLast("Letzter Eingang");
        // test toString method
        assertEquals("3-Zweiter Eingang-Erster Eingang-21-Letzter Eingang", objectEVL.toString());
    }
}

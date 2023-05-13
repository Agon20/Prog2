package UE3.Aufgabe5;

import UE3.Aufgabe1.EVL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RDVLTest {
    RDVL<Object> objectRDVL = new RDVL<>();

    @Test
    void isEmpty() {
        assertTrue(objectRDVL.isEmpty());
        objectRDVL.add(21);
        assertFalse(objectRDVL.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, objectRDVL.size());
        objectRDVL.add("size test");
        assertEquals(1, objectRDVL.size());
    }

    @Test
    void add() {
        // test throw
        assertThrows(NullPointerException.class, () -> objectRDVL.add(null));
        // add objects
        objectRDVL.add("Was geht");
        assertEquals("Was geht", objectRDVL.element());
        objectRDVL.add("Rolando");
        assertEquals("Was geht", objectRDVL.entry.data);
        assertEquals("Rolando", objectRDVL.entry.next.data);
        assertEquals("Rolando", objectRDVL.entry.before.data);
        objectRDVL.add("Haaland");
        assertEquals("Was geht", objectRDVL.entry.data);
        assertEquals("Haaland", objectRDVL.entry.before.data);
        assertEquals("Was geht", objectRDVL.entry.before.next.data);
        assertEquals("Rolando", objectRDVL.entry.before.before.data);
        assertEquals("Rolando", objectRDVL.entry.next.data);
        assertEquals("Haaland", objectRDVL.entry.next.next.data);
    }

    @Test
    void remove() {
        // test throw
        assertThrows(NullPointerException.class, () -> objectRDVL.remove());
        // test size
        assertTrue(objectRDVL.isEmpty());
        // add objects
        objectRDVL.add("remove this");
        objectRDVL.add("remove this too");
        // test size
        assertFalse(objectRDVL.isEmpty());
        // remove
        objectRDVL.remove();
        objectRDVL.remove();
        // test size
        assertTrue(objectRDVL.isEmpty());
    }

    @Test
    void element() {
        // test throw
        assertThrows(NullPointerException.class, () -> objectRDVL.element());
        // add object
        objectRDVL.add("simsalabim");
        objectRDVL.add("Hello");
        // test element
        assertEquals("simsalabim", objectRDVL.element());
    }

    @Test
    void next() {
        // test size
        assertTrue(objectRDVL.isEmpty());
        // add object
        objectRDVL.add("21");
        objectRDVL.add("22");
        objectRDVL.add("23");
        // get entry
        assertEquals("21", objectRDVL.element());
        // use next()
        objectRDVL.next(2);
        // look up
        assertEquals("23", objectRDVL.entry.before.data);
    }

    @Test
    void prev() {
        // test size
        assertTrue(objectRDVL.isEmpty());
        // add object
        objectRDVL.add("21");
        objectRDVL.add("22");
        objectRDVL.add("23");
        // get entry
        assertEquals("21", objectRDVL.element());
        // use next()
        objectRDVL.prev(5);
        // look up
        assertEquals("23", objectRDVL.entry.next.data);
    }
}
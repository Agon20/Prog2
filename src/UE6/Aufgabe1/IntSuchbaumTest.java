package UE6.Aufgabe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntSuchbaumTest {
    IntSuchbaum baum = new IntSuchbaum();

    @Test
    void isEmpty() {
        assertTrue(baum.isEmpty());
        baum.insert(21);
        assertFalse(baum.isEmpty());
    }

    @Test
    void insert() {
        baum.insert(21);
        baum.insert(22);
        baum.insert(23);
        assertTrue(baum.contains(21));
        assertTrue(baum.contains(22));
        assertTrue(baum.contains(23));
        assertFalse(baum.isEmpty());
    }

    @Test
    void contains() {
        baum.insert(21);
        baum.insert(22);
        baum.insert(23);
        assertTrue(baum.contains(21));
        assertTrue(baum.contains(22));
        assertTrue(baum.contains(23));
        assertFalse(baum.isEmpty());
    }

    @Test
    void testToString() {
        assertEquals("",baum.toString());
        baum.insert(21);
        baum.insert(22);
        baum.insert(20);
        baum.insert(19);
        baum.insert(25);
        baum.insert(23);
        baum.insert(24);
        assertEquals("((19)20)21(22((23(24))25))",baum.toString());
    }

    @Test
    void hoehe() {
        assertEquals(0, baum.hoehe());
        baum.insert(21);
        assertEquals(1, baum.hoehe());
        baum.insert(22);
        baum.insert(20);
        baum.insert(19);
        baum.insert(24);
        assertEquals(3, baum.hoehe());
    }

    @Test
    void size() {
        assertEquals(0, baum.size());
        baum.insert(21);
        assertEquals(1, baum.size());
        baum.insert(22);
        baum.insert(20);
        baum.insert(19);
        baum.insert(24);
        assertEquals(5, baum.size());
    }
}
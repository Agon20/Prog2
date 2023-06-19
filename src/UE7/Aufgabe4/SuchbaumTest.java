package UE7.Aufgabe4;

import UE6.Aufgabe1.IntSuchbaum;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SuchbaumTest<T> {

    Comparator<Integer> comparator = Comparator.naturalOrder();
    Comparator<String> comparator2 = Comparator.naturalOrder();
    //Suchbaum<Integer> Suchbaum = new Suchbaum<>(comparator);
    Suchbaum<String> Suchbaum = new Suchbaum<>(comparator2);

    @Test
    void isEmpty() {
        assertTrue(Suchbaum.isEmpty());
        //Suchbaum.insert(21);
        Suchbaum.insert("Hello");
        assertFalse(Suchbaum.isEmpty());
    }

    @Test
    void insert() {
        Suchbaum.insert("22");
        Suchbaum.insert("23");
        Suchbaum.insert("24");
        assertThrows(IllegalArgumentException.class ,()->Suchbaum.insert("24"));
        assertTrue(Suchbaum.contains("22"));
        assertTrue(Suchbaum.contains("23"));
        assertTrue(Suchbaum.contains("24"));
        assertFalse(Suchbaum.isEmpty());
    }

    @Test
    void contains() {
        Suchbaum.insert("31");
        Suchbaum.insert("30");
        assertTrue(Suchbaum.contains("30"));
    }

    @Test
    void testToString() {
        Suchbaum.insert("24");
        Suchbaum.insert("26");
        Suchbaum.insert("27");
        Suchbaum.insert("19");
        Suchbaum.insert("25");
        assertEquals("(19)24((25)26(27))", Suchbaum.toString());
    }

    @Test
    void hoehe() {
        Suchbaum.insert("24");
        Suchbaum.insert("26");
        Suchbaum.insert("27");
        Suchbaum.insert("19");
        Suchbaum.insert("25");
        Suchbaum.insert("30");
        assertEquals(4,Suchbaum.hoehe());
    }

    @Test
    void size() {
        Suchbaum.insert("24");
        Suchbaum.insert("26");
        Suchbaum.insert("27");
        Suchbaum.insert("19");
        Suchbaum.insert("25");
        Suchbaum.insert("30");
        assertEquals(6, Suchbaum.size());
    }
}
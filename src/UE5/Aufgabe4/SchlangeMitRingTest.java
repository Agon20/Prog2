package UE5.Aufgabe4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SchlangeMitRingTest {
    private int capacity = 4;
    SchlangeMitRing<Object> schlange = new SchlangeMitRing<>(capacity);

    @Test
    void isEmpty() {
        assertTrue(schlange.isEmpty());
        schlange.insert(21);
        assertFalse(schlange.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, schlange.size());
    }

    @Test
    void capacity() {
        assertEquals(capacity, schlange.capacity());
    }

    @Test
    void insert() {
        assertTrue(schlange.isEmpty());
        schlange.insert(21);
        schlange.insert("22");
        assertEquals(21, schlange.front());
        assertFalse(schlange.isEmpty());
    }

    @Test
    void remove() {
        assertTrue(schlange.isEmpty());
        schlange.insert(21);
        schlange.insert("22");
        assertEquals(21, schlange.front());
        schlange.remove();
        assertEquals("22", schlange.front());
        assertFalse(schlange.isEmpty());
    }

    @Test
    void elementAufruf() {
        assertTrue(schlange.isEmpty());
        schlange.insert(21);
        schlange.insert("22");
        schlange.insert(23);

        String expectedOutput = "21\r\n22\r\n23\r\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        schlange.elementAufruf();
        String actualOutput = outputStream.toString();

        assertEquals(expectedOutput, actualOutput);

        assertFalse(schlange.isEmpty());
    }

    @Test
    void front() {
        assertTrue(schlange.isEmpty());
        schlange.insert(21);
        schlange.insert("22");
        assertEquals(21, schlange.front());
        assertFalse(schlange.isEmpty());
    }
}
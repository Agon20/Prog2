package UE4.Aufgabe3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class RingpufferTest {
    Ringpuffer<Object> objectRingpuffer = new Ringpuffer<>(4);
    @Test
    void size() {
        assertEquals(0, objectRingpuffer.size());
        objectRingpuffer.addFirst(21);
        assertEquals(1, objectRingpuffer.size());
    }

    @Test
    void get() {
        assertThrows(NullPointerException.class, ()-> objectRingpuffer.get(4));
        objectRingpuffer.addLast(21);
        objectRingpuffer.addLast("22");
        assertEquals("22", objectRingpuffer.get(1));
        assertEquals(21, objectRingpuffer.get(0));
    }

    @Test
    void set() {
        assertThrows(NullPointerException.class, ()-> objectRingpuffer.set(2,2));
        assertThrows(NoSuchElementException.class, ()-> objectRingpuffer.set(2,null));
        objectRingpuffer.addLast(221);
        objectRingpuffer.addLast("Täter");
        assertEquals("Täter", objectRingpuffer.set(1,22));
        assertEquals(221, objectRingpuffer.set(0,21));
    }

    @Test
    void addFirst() {
        assertThrows(NoSuchElementException.class, ()-> objectRingpuffer.addFirst(null));
        assertEquals(0, objectRingpuffer.size());
        objectRingpuffer.addFirst(21);
        objectRingpuffer.addFirst(22);
        objectRingpuffer.addFirst(23);
        objectRingpuffer.addFirst("24");
        assertThrows(IndexOutOfBoundsException.class, ()-> objectRingpuffer.addFirst(25));
        assertEquals(4, objectRingpuffer.size());
        assertEquals("24", objectRingpuffer.get(3));
        assertEquals(23, objectRingpuffer.get(2));
        assertEquals(22, objectRingpuffer.get(1));
        assertEquals(21, objectRingpuffer.get(0));
    }

    @Test
    void addLast() {
        assertThrows(NoSuchElementException.class, ()-> objectRingpuffer.addLast(null));
        assertEquals(0, objectRingpuffer.size());
        objectRingpuffer.addLast(21);
        objectRingpuffer.addLast(22);
        objectRingpuffer.addLast(23);
        objectRingpuffer.addLast("24");
        assertEquals(4, objectRingpuffer.size());
        assertEquals(21, objectRingpuffer.get(0));
        assertEquals(22, objectRingpuffer.get(1));
        assertEquals(23, objectRingpuffer.get(2));
        assertEquals("24", objectRingpuffer.get(3));
        assertThrows(IndexOutOfBoundsException.class, ()-> objectRingpuffer.addLast(21));
    }

    @Test
    void removeFirst() {
        assertThrows(NullPointerException.class, ()-> objectRingpuffer.removeFirst());
        objectRingpuffer.addLast(21);
        objectRingpuffer.addLast(22);
        objectRingpuffer.addLast(23);
        objectRingpuffer.addLast("24");
        assertEquals(4, objectRingpuffer.size());
        assertEquals(21,objectRingpuffer.removeFirst());
        assertEquals(22,objectRingpuffer.removeFirst());
        assertEquals(23,objectRingpuffer.removeFirst());
        assertEquals("24",objectRingpuffer.removeFirst());
        assertEquals(0, objectRingpuffer.size());
    }

    @Test
    void removeLast() {
        assertThrows(NullPointerException.class, ()-> objectRingpuffer.removeFirst());
        objectRingpuffer.addLast(21);
        objectRingpuffer.addLast(22);
        objectRingpuffer.addLast(23);
        objectRingpuffer.addLast("24");
        assertEquals(4, objectRingpuffer.size());
        assertEquals("24",objectRingpuffer.removeLast());
        assertEquals(23,objectRingpuffer.removeLast());
        assertEquals(22,objectRingpuffer.removeLast());
        assertEquals(21,objectRingpuffer.removeLast());
        assertEquals(0, objectRingpuffer.size());
    }
}
package UE4.Aufgabe2;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DynArrayTest {
    DynArray<Object> objectDynArray = new DynArray<>();

    @Test
    void size() {
        assertEquals(0, objectDynArray.size());
        objectDynArray.addLast("Test");
        objectDynArray.addLast(21);
        assertEquals(2, objectDynArray.size());
    }

    @Test
    void capacity() {
        assertEquals(1, objectDynArray.capacity());
        objectDynArray.addLast(21);
        objectDynArray.addLast("22");
        objectDynArray.addLast(23);
        objectDynArray.addLast("twentyfour");
        assertEquals(4, objectDynArray.capacity());
    }

    @Test
    void get() {
        assertThrows(IndexOutOfBoundsException.class,() -> objectDynArray.get(5));
        assertThrows(NullPointerException.class,() -> objectDynArray.get(0));
        objectDynArray.addLast(21);
        assertEquals(21, objectDynArray.get(0));
        objectDynArray.addLast("twentyone");
        assertEquals("twentyone", objectDynArray.get(1));
    }

    @Test
    void set() {
        assertThrows(IndexOutOfBoundsException.class,() -> objectDynArray.set(21,"Hello"));
        assertThrows(NullPointerException.class,() -> objectDynArray.set(0,null));
        objectDynArray.addLast(21);
        objectDynArray.addLast("Messi");
        assertEquals(21,objectDynArray.set(0,"twentyone"));
        assertEquals("Messi", objectDynArray.set(1,"Ronaldo"));
    }

    @Test
    void addFirst() {
        assertThrows(NoSuchElementException.class, () -> objectDynArray.addFirst(null));
        objectDynArray.addFirst(21);
        assertEquals(21, objectDynArray.get(0));
        objectDynArray.addFirst("22");
        assertEquals("22", objectDynArray.get(0));
        objectDynArray.addFirst("22");

    }

    @Test
    void addLast() {
        //assertThrows(NoSuchElementException.class, objectDynArray.addLast(null));
        objectDynArray.addLast(21);
        objectDynArray.addLast(22);
        assertEquals(22, objectDynArray.get(1));
        objectDynArray.addLast("tweet");
        assertEquals("tweet", objectDynArray.get(2));
    }

    @Test
    void removeFirst() {
        assertThrows(NullPointerException.class,() -> objectDynArray.removeFirst());
        objectDynArray.addFirst(21);
        objectDynArray.addFirst("22");
        objectDynArray.addLast(23);
        objectDynArray.addLast("24");
        assertEquals("22", objectDynArray.removeFirst());
    }

    @Test
    void removeLast() {
        assertThrows(IndexOutOfBoundsException.class,() -> objectDynArray.removeLast());
        objectDynArray.addLast(21);
        objectDynArray.addLast(22);
        objectDynArray.addLast("Wow");
        objectDynArray.addLast("What");
        assertEquals("What", objectDynArray.removeLast());
    }
}
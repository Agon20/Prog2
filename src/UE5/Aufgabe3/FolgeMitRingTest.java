package UE5.Aufgabe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FolgeMitRingTest {
    int length = 4;
    FolgeMitRing<Object> folge = new FolgeMitRing<>(length);

    @Test
    void isEmpty() {
        assertTrue(folge.isEmpty());
        folge.insert(21);
        assertFalse(folge.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, folge.size());
        folge.insert(21);
        folge.insert("twenty-two");
        assertEquals(2, folge.size());
    }

    @Test
    void capacity() {
        assertEquals(length, folge.capacity());
    }

    @Test
    void insert() {
        assertTrue(folge.isEmpty());
        folge.insert(21);
        folge.insert(22);
        folge.insert("twenty-three");
        assertEquals("twenty-three", folge.get(2));
        assertEquals(22, folge.get(1));
        assertEquals(21, folge.get(0));
    }

    @Test
    void remove() {
        assertTrue(folge.isEmpty());
        folge.insert(21);
        folge.insert(22);
        folge.insert("twenty-three");
        folge.remove();
        assertEquals(22, folge.get(0));
        folge.remove();
        assertEquals("twenty-three", folge.get(0));
        folge.remove();
        assertTrue(folge.isEmpty());
    }

    @Test
    void elementAufruf() {
    }

    @Test
    void get() {
        assertThrows(IndexOutOfBoundsException.class,()-> folge.get(21));
        folge.insert(21);
        folge.insert("22");
        assertEquals("22", folge.get(1));
    }

    @Test
    void set() {
        assertThrows(IndexOutOfBoundsException.class,()-> folge.set(21, 21));
        folge.insert(21);
        folge.insert("22");
        assertEquals("22", folge.set(1, 22));
        assertEquals(21, folge.set(0, "21"));
    }

    @Test
    void testRemoveWithArgument() {
    }

    @Test
    void testInsertWithArgument() {
    }
}
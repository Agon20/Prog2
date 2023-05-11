package UE2.Aufgabe7TestKlasse;

import UE2.Aufgabe6.Paar;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PaarTest {
    Paar<String, Integer> p1 = new Paar<>("Max",22);
    Paar<String, Integer> p2 = new Paar<>("Hans",33);
    Paar<String, Integer> p3 = new Paar<>("Max",22);
    Paar<Integer, String> p4 = new Paar<>(9040701,"Erik");
    @Test
    void testGetErstes(){
        assertEquals("Max", p1.getErstes());
        assertEquals(9040701, p4.getErstes());
    }
    @Test
    void testGetZweites(){
        assertEquals(33, p2.getZweites());
        assertEquals("Erik", p4.getZweites());
    }
    @Test
    void testSetErstes(){
        // Test, ob der neue Namen setzt und der vorherige Name zurückgegeben wird
        assertEquals("Max", p1.setErstes("Maximilian"));
        // Test, ob der neue Name gesetzt wurde
        assertEquals("Maximilian",p1.getErstes());
        // Test, ob der neue Namen setzt und der vorherige Name zurückgegeben wird
        assertEquals(9040701, p4.setErstes(9041721));
        // Test, ob der neue Name gesetzt wurde
        assertEquals(9041721,p4.getErstes());
    }
    @Test
    void testSetZweites(){
        // Test, ob der neue Namen setzt und der vorherige Name zurückgegeben wird
        assertEquals(33, p2.setZweites(44));
        // Test, ob der neue Name gesetzt wurde
        assertEquals(44,p2.getZweites());
        // Test, ob der neue Namen setzt und der vorherige Name zurückgegeben wird
        assertEquals("Erik", p4.setZweites("Siegfried"));
        // Test, ob der neue Name gesetzt wurde
        assertEquals("Siegfried",p4.getZweites());
    }
    @Test
    void testBeides(){
        p4.setBeides(9044664,"Dieter");
        assertEquals(9044664, p4.getErstes());
        assertEquals("Dieter", p4.getZweites());
    }
    @Test
    void testEquals(){
        assertTrue(p1.equals(p3));
        assertFalse(p2.equals(p4));
    }
    @Test
    void testToString(){
        assertEquals("(Max,22)", p1.toString());
    }
}

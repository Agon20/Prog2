package UE1.Aufgabe4;

import UE0.Aufgabe3.Boxer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBoxer {
    //Boxer hinzufügen
    Boxer boxer1 = new Boxer("Mike","Tyson", 101);
    Boxer boxer2 = new Boxer("Mike","Tyson", 101);
    Boxer boxer3 = new Boxer("Mike","Tyson", 101);
    @Test
    void testGetGewicht(){
        //Test, ob Gewicht richtig wiedergegeben wird
        assertEquals(101,boxer1.getGewicht());
    }
    @Test
    void TestEqualsMethode(){
        assertTrue(boxer1.equals(boxer2));
    }
    @Test
    void TestEquals(){
        //Reflexivität: Ein Objekt muss gleich sich selbst sein
        assertTrue(boxer1.equals(boxer1));

        //Symmetrie: Gleichheit sollte in beiden Richtungen gelten
        assertTrue(boxer1.equals(boxer2));
        assertTrue(boxer2.equals(boxer1));

        //Transitivität: Wenn A gleich B und B gleich C, dann muss A auch gleich C sein
        assertTrue(boxer1.equals(boxer2));
        assertTrue(boxer2.equals(boxer3));
        assertTrue(boxer1.equals(boxer3));

        //Konsistenz: Mehrfacher Vergleich sollte konsistentes Ergebnis liefern
        assertTrue(boxer1.equals(boxer2));
        assertTrue(boxer1.equals(boxer2));
        assertTrue(boxer1.equals(boxer2));

        //Korrekter Vergleich mit null: Objekte sollten nicht gleich null sein
        assertNotNull(boxer1);
        assertNotNull(boxer2);
        assertNotNull(boxer3);

    }
}

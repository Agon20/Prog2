package UE1.Aufgab4;

import UE0.Aufgabe3.Boxer;
import UE0.Aufgabe3.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestStudent {
    Student student1 = new Student("Siegfried","Meier",9050130);
    Student student2 = new Student("Siegfried","Meier",9050130);
    Student student3 = new Student("Siegfried","Meier",9050130);

    @Test
    void testGetGewicht(){
        //Test, ob Gewicht richtig wiedergegeben wird
        assertEquals(9050130,student1.getMatrikel());
    }
    @Test
    void TestMethodeEquals(){}
    @Test
    void TestEquals(){
        //Reflexivität: Ein Objekt muss gleich sich selbst sein
        assertTrue(student1.equals(student1));

        //Symmetrie: Gleichheit sollte in beiden Richtungen gelten
        assertTrue(student1.equals(student2));
        assertTrue(student2.equals(student1));

        //Transitivität: Wenn A gleich B und B gleich C, dann muss A auch gleich C sein
        assertTrue(student1.equals(student2));
        assertTrue(student2.equals(student3));
        assertTrue(student1.equals(student3));

        //Konsistenz: Mehrfacher Vergleich sollte konsistentes Ergebnis liefern
        assertTrue(student1.equals(student2));
        assertTrue(student1.equals(student2));
        assertTrue(student1.equals(student2));

        //Korrekter Vergleich mit null: Objekte sollten nicht gleich null sein
        assertNotNull(student1);
        assertNotNull(student2);
        assertNotNull(student3);

    }
}

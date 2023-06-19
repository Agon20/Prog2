package UE7.Aufgabe2;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxerTest {

    @Test
    void testEquals() {
    }

    @Test
    void compareTo() {
        Boxer b1 = new Boxer("Tyson","Mike", 86);
        Boxer b2 = new Boxer("Ali","Mohammed", 86);

        System.out.println(b1.compareTo(b2));
    }
}
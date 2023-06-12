package UE7.Aufgabe3;

import UE7.Aufgabe2.Boxer;
import java.util.Comparator;

public class ComparatorBoxerGewicht implements Comparator<Boxer> {
    @Override
    public int compare(Boxer b1, Boxer b2) {
        return Integer.compare(b1.getGewicht(), b2.getGewicht());
    }
}

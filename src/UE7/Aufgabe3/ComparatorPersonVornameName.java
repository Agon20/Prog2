package UE7.Aufgabe3;

import UE7.Aufgabe2.Person;

import java.util.Comparator;

public class ComparatorPersonVornameName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int nameVergleich = p1.getName().compareTo((p2.getName()));
        if (nameVergleich !=0){
            return nameVergleich;
        }
        return p1.getVorname().compareTo(p2.getVorname());
    }
}

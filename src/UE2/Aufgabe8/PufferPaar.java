package UE2.Aufgabe8;

import UE0.Aufgabe3.Boxer;
import UE0.Aufgabe3.Student;
import UE2.Aufgabe3.Puffer;
import UE2.Aufgabe3.SchlangeMitArray;
import UE2.Aufgabe3.StapelMitArray;
import UE2.Aufgabe6.Paar;

public class PufferPaar {
    public static void main(String[] args) {
        // servicePoint erstellen
        Puffer<Paar<Student, String>> servicePoint = new SchlangeMitArray<>(4);
        // Studenten erstellen
        Paar<Student, String> student1 = new Paar<>(
                new Student("Kaminski","Jan", 9059427),
                "Ronaldo the Goat!"
        );
        Paar<Student, String> student2 = new Paar<>(
                new Student("Max","Steinmeier",9040875),
                "Wie kann ich mich im WLAN anmelden?"
        );
        Paar<Student, String> student3 = new Paar<>(new Student(
                "Gorbatschov","Aleks", 9074512),
                "Ronaldo the Goat forever!"
        );
        Paar<Student, String> student4 = new Paar<>(
                new Student("Ronaldo","Berke", 940247),
                "Who is Messi?"
        );
        // Studenten in servicePoint hinzufügen
        servicePoint.insert(student1);
        servicePoint.insert(student2);
        servicePoint.insert(student3);
        servicePoint.insert(student4);

        // Elemente aus servicePoint anzeigen
        System.out.println("servicePoint:");
        servicePoint.elementAufruf();

        // boxEvent
        Puffer<Paar<Boxer, Boxer>> boxEvent = new SchlangeMitArray<>(3);
        // Studenten erstellen
        Paar<Boxer, Boxer> boxer1 = new Paar<>(
                new Boxer("Kaminski","Jan", 70),
                new Boxer("Ronaldo","Berke", 75)
        );
        Paar<Boxer, Boxer> boxer2 = new Paar<>(
                new Boxer("Azemi","Agon", 80),
                new Boxer("Gorbatschov","Aleks", 80)
        );
        Paar<Boxer, Boxer> boxer3 = new Paar<>(
                new Boxer("Tyson","Mike", 101),
                new Boxer("Holyfield","Evander", 98)
        );
        // Studenten in servicePoint hinzufügen
        boxEvent.insert(boxer1);
        boxEvent.insert(boxer2);
        boxEvent.insert(boxer3);

        // Elemente aus boxEvent anzeigen
        System.out.println("\nboxEvent:");
        boxEvent.elementAufruf();
    }
}

package UE7.Aufgabe2;

public class Student extends Person implements Comparable<Student>{
    private int matrikelnummer;
    public Student(String name, String vorname, int matrikelnummer) {
        super(name, vorname);
        this.matrikelnummer = matrikelnummer;
    }
    public int getMatrikel(){
        return this.matrikelnummer;
    }
    public boolean equals(Student student1, Student student2){
        String einsname = student2.getName();
        String einsnachname = student2.getVorname();
        int einsmatrikel = student2.getMatrikel();
        String zweiname = student1.getName();
        String zweinachname = student1.getVorname();
        int zweimatrikel = student1.getMatrikel();
        if(einsname.equals(zweiname)){
            if(einsnachname.equals(zweinachname)){
                if(einsmatrikel == zweimatrikel){
                    return true;
                }
            }
        }
        return false;
    }
    public int compareTo(Student other){
        return Integer.compare(this.matrikelnummer, other.matrikelnummer);
    }
}

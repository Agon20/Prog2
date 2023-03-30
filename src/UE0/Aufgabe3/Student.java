package UE0.Aufgabe3;

public class Student extends Person{
    private int matrikelnummer;
    public Student(String name, String vorname, int matrikelnummer) {
        super(name, vorname);
        this.matrikelnummer = matrikelnummer;
    }
    public String getMatrikel(){
        String ergebnisstring = toString();
        return ergebnisstring + ", " + this.matrikelnummer;
    }
    public String equals(Student student){
        String einsname = getName();
        String einsnachname = getVorname();
        String einsmatrikel = getMatrikel();
        String zweiname = student.getName();
        String zweinachname = student.getVorname();
        String zweimatrikel = student.getMatrikel();
        if(einsname.equals(zweiname)){
            if(einsnachname.equals(zweinachname)){
                if(einsmatrikel.equals(zweimatrikel)){
                    return "Sind gleich";
                }
            }
        }
        return einsname + ", " + einsnachname + ", " + einsmatrikel
                + " vs " +
                zweiname + ", " + zweinachname + ", " + zweimatrikel;
    }
}

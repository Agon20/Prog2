package UE7.Aufgabe2;

public abstract class Person {
    private String name;
    private String vorname;

    public Person(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }

    public String getName(){
        return this.name;
    }
    public String getVorname(){
        return this.vorname;
    }
    public String toString(){
        return this.name + ", " + this.vorname;
    }
    public boolean equals(Student student){
        String einsname = getName();
        String einsnachname = getVorname();
        String zweiname = student.getName();
        String zweinachname = student.getVorname();
        if(einsname.equals(zweiname)){
            if(einsnachname.equals(zweinachname)){
                return true;
            }
        }
        return false;
    }
}

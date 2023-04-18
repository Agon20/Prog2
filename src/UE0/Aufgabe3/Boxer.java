package UE0.Aufgabe3;

public class Boxer extends Person{
    private int gewicht;
    public Boxer(String name, String vorname, int gewicht) {
        super(name, vorname);
        this.gewicht = gewicht;
    }
    public int getGewicht(){
        return this.gewicht;
    }
    public boolean equals(Boxer boxer){
        String einsname = boxer.getName();
        String einsnachname = boxer.getVorname();
        int einsgewicht = boxer.getGewicht();
        String zweiname = getName();
        String zweinachname = getVorname();
        int zweigewicht = getGewicht();
        if(einsname.equals(zweiname)){
            if(einsnachname.equals(zweinachname)){
                if(einsgewicht==(zweigewicht)){
                    return true;
                }
            }
        }
        return false;
    }
}

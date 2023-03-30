package UE0.Aufgabe3;

public class Boxer extends Person{
    private int gewicht;
    public Boxer(String name, String vorname, int gewicht) {
        super(name, vorname);
        this.gewicht = gewicht;
    }
    public String getGewicht(){
        String ergebnisstring = toString();
        return ergebnisstring + ", " + this.gewicht + "kg";
    }
    public String equals(Boxer boxer){
        String einsname = getName();
        String einsnachname = getVorname();
        String einsgewicht = getGewicht();
        String zweiname = boxer.getName();
        String zweinachname = boxer.getVorname();
        String zweigewicht = boxer.getGewicht();
        if(einsname.equals(zweiname)){
            if(einsnachname.equals(zweinachname)){
                if(einsgewicht.equals(zweigewicht)){
                    return "Sind gleich";
                }
            }
        }
        return einsname + ", " + einsnachname + ", " + einsgewicht + "kg"
                + " vs " +
                zweiname + ", " + zweinachname + ", " + zweigewicht + "kg";
    }
}

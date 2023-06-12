package UE7.Aufgabe2;

public class Boxer extends Person implements Comparable<Boxer>{
    private Integer gewicht;
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
    public int compareTo(Boxer other){
        int gewichtVergleich = this.gewicht.compareTo(other.gewicht);
        if(gewichtVergleich != 0){
            return gewichtVergleich;
        }
        int nameVergleich = this.getName().compareTo((other.getName()));
        if (nameVergleich !=0){
            return nameVergleich;
        }
        return this.getVorname().compareTo(other.getVorname());
    }
}

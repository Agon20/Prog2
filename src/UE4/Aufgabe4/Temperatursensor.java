package UE4.Aufgabe4;

import UE4.Aufgabe3.Ringpuffer;
import java.lang.Float;

public class Temperatursensor{
    private Ringpuffer<Float> temperaturliste;

    public Temperatursensor(){
        temperaturliste = new Ringpuffer<>(24);
    }
    public void neueMessung(Float werte){
        try {
            temperaturliste.addFirst(werte);
        }catch (IndexOutOfBoundsException e){
            temperaturliste.removeLast();
            temperaturliste.addFirst(werte);
        }
    }
    public Float aktuelleTemperatur(){
        try {
            return temperaturliste.get(0);
        }catch (NullPointerException e){
            return Float.NaN;
        }
    }
    public Float durchschnittsTemperatur(){
        try {
            int count = 0;
            float durchschnitt = 0;
            for (int i = 0; i < temperaturliste.size(); i++){
                durchschnitt += temperaturliste.get(i);
                count++;
            }
            return durchschnitt/count;
        }catch (NullPointerException e){
            return Float.NaN;
        }
    }
    public void reset(){
        for (int i = 0; i < temperaturliste.size(); i++){
            temperaturliste.removeLast();
        }
    }
}

package UE2.Aufgabe3Function;

@FunctionalInterface
public interface Funktion<T> {
    T auswerten(T wert);
}
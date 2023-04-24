package UE2.Aufgabe3;

@FunctionalInterface
public interface Funktion<T> {
    T auswerten(T wert);
}
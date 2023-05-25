package UE3.Aufgabe3;

import UE2.Aufgabe3.SchlangeMitArray;
import UE3.Aufgabe2.SchlangeMitEVL;

public class TimeTestSchlange {
    public static void main(String[] args) {
        SchlangeMitArray<Integer> sma = new SchlangeMitArray<>(1000);
        SchlangeMitEVL<Integer> sme = new SchlangeMitEVL<>();

        long start;
        long finish;
        long elapsed;

        start = System.currentTimeMillis();

        for(int i = 1; i <= 1000; i++){
            sma.insert(i);
        }
        for(int i = 1; i <= 1000; i++){
            sma.remove();
        }

        finish = System.currentTimeMillis();
        elapsed = finish - start;

        long smaTime = elapsed;


        start = System.currentTimeMillis();

        for(int i = 1; i <= 1000; i++){
            sme.insert(i);
        }

        for(int i = 1; i <= 1000; i++){
            sme.remove();
        }

        finish = System.currentTimeMillis();
        elapsed = finish - start;

        long smeTime = elapsed;

        System.out.println("SMA: " + smaTime);
        System.out.println("SME: " + smeTime);
    }
}

package Trash;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        List<String> students = List.of("Peter","Paul","Marie");
        Consumer<String> swem = s -> System.out.println(s + "!!");
        students.forEach(swem);
        students.forEach(s -> System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1)));

        Supplier<Double> random1000 = () -> Math.random() * 1000;
        System.out.println(random1000.get());
    }
}

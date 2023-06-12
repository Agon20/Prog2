package UE7.Aufgabe2;

public class main {

    public static void main(String[] args) {
        Student student1 = new Student("Marc", "Washington", 12324);
        System.out.println(student1.getMatrikel());
        Student student2 = new Student("Mark", "Washington", 12324);
        System.out.println(student1.getMatrikel());
        System.out.println(student1.equals(student2));
        Boxer boxer1 = new Boxer("Khamsa","Chimaev",79);
        System.out.println(boxer1.getGewicht());
        Boxer boxer2 = new Boxer("Hamsa","Chimaev",79);
        System.out.println(boxer2.getGewicht());
        System.out.println(boxer1.equals(boxer2));
    }
}

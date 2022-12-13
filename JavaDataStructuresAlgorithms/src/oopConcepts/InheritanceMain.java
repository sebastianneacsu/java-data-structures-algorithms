package oopConcepts;

public class InheritanceMain {
    public static void main(String[] args){
        Car c = new Car();
        c.display();
        System.out.println(c.seats);
        Ferrari f = new Ferrari();
        f.displayFerrari();
        f.display();
        System.out.println(f.seats);
        Car cf = new Ferrari();
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); // eats grass
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    // Run Time Polymorphism (Method Overriding)
    void eat() {
        System.out.println("eats grass");
    }
}
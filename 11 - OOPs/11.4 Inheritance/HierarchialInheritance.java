public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammal cat = new Mammal();
        cat.eat();
        cat.walk();
        Bird parrot = new Bird();
        parrot.breathe();
        parrot.fly();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

// Derived class
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

// Derived class
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish rohu = new Fish();
        rohu.color = "Blue"; // Base class property
        rohu.eat(); // Base class function
        rohu.breathe(); // Base class function but overwritten in derived class
        rohu.fins = 4; // Derived class property
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
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }

    // Overwrite the function breathe()
    void breathe() {
        System.out.println("breathes in water");
    }
}
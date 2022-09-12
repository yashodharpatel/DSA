public class AbstractClasses {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); // will give error

        // Constructor Hierarchy
        // Animal -> Horse -> Mustang
        Mustang myHorse = new Mustang();// Animal constructor called
                                        // Horse constructor called
                                        // Mustang constructor called
    }
}

// Abstract class
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    // Abstract method - It is compulsory to override this method for child classes
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    @Override
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chiken extends Animal {
    @Override
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
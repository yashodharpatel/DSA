public class Practice {
    public static void main(String[] args) {
        Vechile obj1 = new Car();
        obj1.print(); // Derived class - Car (Because function is override)

        Vechile obj2 = new Vechile();
        obj2.print(); // Base class - Vechile
    }
}

class Vechile {
    void print() {
        System.out.println("Base class - Vechile");
    }
}

class Car extends Vechile {
    @Override
    void print() {
        System.out.println("Derived class - Car");
    }
}
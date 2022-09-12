public class Super {
    public static void main(String[] args) {
        Horse mustang = new Horse();
        System.out.println(mustang.color);
    }
}

class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor caled");
    }
}

class Horse extends Animal {
    {
        super.color = "Red";
    }

    Horse() {
        super();
        System.out.println("Horse constructor called");
    }
}
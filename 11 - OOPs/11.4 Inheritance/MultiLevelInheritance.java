public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog coco = new Dog();
        coco.color = "Black";
        coco.eat();
        coco.legs = 4;
        coco.breed = "lab";
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}
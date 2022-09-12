public class ClassesandObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Yash";
        // p1.age = 19;
        p1.setAge(19); 
        // p1.city = "Mumbai";
        p1.setCity("Mumbai");

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.city);
    }
}

class Person { 
    String name;
    int age;
    String city;

    void setAge(int newAge) {
        age = newAge;
    }

    void setCity(String newCity) {
        city = newCity;
    }
}
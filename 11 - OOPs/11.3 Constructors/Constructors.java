public class Constructors {
    public static void main(String[] args) {
        // Non-parameterized constructor
        Student s1 = new Student();

        // Parameterized constructors
        Student s2 = new Student("Yash");
        s2.marks[0] = 99;
        s2.marks[1] = 87;
        s2.marks[2] = 89;

        Student s3 = new Student(18);
        // Student s4 = new Student("Yash", 18); (Will give error as we haven't
        // initialize any constructor which matches this parameter)

        // Copy constructor
        Student s4 = new Student(s2);
        // System.out.println(s4.name); // Yash
        System.out.println(s4.marks[0]); // 99
        System.out.println(s4.marks[1]); // 87
        System.out.println(s4.marks[2]); // 89

        s2.marks[1] = 100; // This is written after the Copy constructor as it should not change marks in
                           // obj s4, but it will change as our entire array is not copied , its refrence
                           // is copied (shallow copy)

        s2.name = "Jay"; // This will not change in s4

        System.out.println(s4.marks[1]); // 100
        System.out.println(s4.name); // Yash
    }
}

class Student {
    String name;
    int age;
    int marks[] = new int[3];

    // Non-parameterized constructor (default)
    Student() {
        System.out.println("Consturctor is called");
    }

    // Parameterized constructors
    Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVM";
        System.out.println(s1.calculatePercentage(88, 76, 54));

        Student s2 = new Student();
        System.out.println(s2.schoolName); // JVM
        System.out.println(s2.calculatePercentage(98, 76, 54));

        // Below is proper way to access static fields, because static fields are not
        // based on objects
        System.out.println(Student.schoolName); // JVM
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    static int calculatePercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}
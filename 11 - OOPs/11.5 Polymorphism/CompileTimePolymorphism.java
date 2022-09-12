public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        // Compile Time Polymorphism (Method Overloading)
        System.out.println(calc.sum(10, 20));
        System.out.println(calc.sum(10, 30, 10));
        System.out.println(calc.sum((float) 7.89, (float) 89.54));
    }
}

class Calculate {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}
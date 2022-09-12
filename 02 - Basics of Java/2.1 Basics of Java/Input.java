import java.util.Scanner;

public class Input {
    public static double PI = 3.14;
    public static int GST = 18;

    public static void main(String[] args) {
        // Basic Calculator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:
                break;
        }

        System.out.println(result);

        // Area of Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double areaOfCircle = PI * radius * radius;
        System.out.print("Area of circle: " + areaOfCircle);

        // GST Calculator
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float sum = pencil + pen + eraser;
        System.out.println("Total Bill is: " + sum);

        float gst = (sum / 100) * GST;
        System.out.println("Total Bill with 18% GST: " + (sum + gst));

        sc.close();
    }
}
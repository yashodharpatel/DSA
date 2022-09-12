import java.util.Scanner;

public class TypeConversion {
	public static void main(String[] args) {
		// Below code will give an error as we cannot convert from long to int
		// long a = 25;
		// int b = a;

		// But we can convert from int to long
		int a = 25;
		long b = a;
		System.out.println(b);

		Scanner sc = new Scanner(System.in);
		// int number = sc.nextFloat(); // This line will give error
		float number = sc.nextInt(); // 24
		System.out.println(number); // 24.0

		sc.close();
	}
}
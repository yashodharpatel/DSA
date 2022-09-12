import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int n = sc.nextInt();
				if (n % 10 == 0) {
					continue;
				} else {
					System.out.println(n);
				}
			}
		}
	}
}
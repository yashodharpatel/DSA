public class BasicPatterns {
    public static void main(String[] args) {
        int n = 5;

        // Star pattern
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Half pyramid pattern
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // Inverted star pattern
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted half pyramid with numbers
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= (n - line + 1); number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        // Character pattern
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        // Floyd's Triangle
        int num = 1;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Inverted & rotated half pyramid
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n; star++) {
                if (star <= (n - line)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
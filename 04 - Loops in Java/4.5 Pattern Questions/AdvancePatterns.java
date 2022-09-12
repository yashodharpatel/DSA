public class AdvancePatterns {
    public static void hollowRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j == 1 || j == width || i == 1 || i == height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void ZeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces - n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars - n
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hallowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hallowDiamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hallowDiamondInRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");

            }
            // spaces
            for (int j = 1; j <= (2 * i) - 3; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");

            }
            // spaces
            for (int j = 1; j <= (2 * i) - 3; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void zigzag(int n) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j + i) % 4 == 0 || (i == 2 && j % 2 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRectangle(5, 7);
        // ZeroOneTriangle(5);
        // butterflyPattern(5);
        // solidRhombus(5);
        // hallowRhombus(5);
        // diamond(5);
        // hallowDiamond(5);
        // hallowDiamondInRectangle(7);
        // numberPyramid(5);
        // palindromicPattern(5);
        zigzag(12);
    }
}
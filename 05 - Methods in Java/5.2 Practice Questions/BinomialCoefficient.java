public class BinomialCoefficient {
    public static int calculateFactorial(int n) {
        int factorial;

        if (n < 2) {
            factorial = 1;
        } else {
            factorial = n * calculateFactorial(n-1);
        }

        return factorial;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = calculateFactorial(n);
        int fact_r = calculateFactorial(r);
        int fact_nmr = calculateFactorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
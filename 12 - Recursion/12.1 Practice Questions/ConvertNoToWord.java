public class ConvertNoToWord {
    public static void main(String[] args) {
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        convertNumberToWord(arr, 2019);
    }

    private static void convertNumberToWord(String[] arr, int n) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        convertNumberToWord(arr, n / 10);
        System.out.print(arr[lastDigit] + " ");
    }
}
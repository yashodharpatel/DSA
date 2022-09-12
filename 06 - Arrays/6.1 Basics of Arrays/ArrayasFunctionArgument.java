public class ArrayasFunctionArgument {
    private static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for (int index = 0; index < marks.length; index++) {
            marks[index] = marks[index] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 }; // pass by refrence
        int nonChangeable = 5; // pass by value
        update(marks, nonChangeable);

        // print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(nonChangeable); // 5 will not get updated
    }
}
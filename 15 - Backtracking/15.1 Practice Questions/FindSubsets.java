import java.util.ArrayList;

public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsetsStr(str, new StringBuilder(""), 0);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        findSubsetsArr(arr, new ArrayList<Integer>(), 0);
    }

    private static void findSubsetsArr(ArrayList<Integer> arr, ArrayList<Integer> ansArr, int i) {
        if (i == arr.size()) {
            System.out.println(ansArr);
            return;
        }

        // Yes
        ansArr.add(arr.get(i));
        findSubsetsArr(arr, ansArr, i + 1);
        
        // No
        ansArr.remove(ansArr.size() - 1);
        findSubsetsArr(arr, ansArr, i + 1);
    }

    private static void findSubsetsStr(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        findSubsetsStr(str, ans.append(str.charAt(i)), i + 1); // Yes (Recursion)
        findSubsetsStr(str, ans.deleteCharAt(ans.length() - 1), i + 1); // No (Backtracking)
    }
}
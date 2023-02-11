public class TowerofHanoi {
    public static void main(String[] args) {
        towerofHanoi(3, "S", "H", "D");
    }

    private static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest); // We know that if there is only
                                                                                       // 1 disk we directly move it to
                                                                                       // our destination(C) from
                                                                                       // source(A)
            return;
        }
        towerofHanoi(n - 1, src, dest, helper); // Shift n-1 disks from source(A) to helper(B) using destination(C)
        System.out.println("transfer disk " + n + " from " + src + " to " + dest); // Shift last disk from source(A) to
                                                                                   // destination(C)
        towerofHanoi(n - 1, helper, src, dest); // Shift n-1 disks from helper(B) to destination(C) using source(A)
    }
}
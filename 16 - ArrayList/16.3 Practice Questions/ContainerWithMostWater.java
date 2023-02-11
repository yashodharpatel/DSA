import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxArea(height));
    }

    private static int maxArea(ArrayList<Integer> height) {
        int maxWater = 0;

        // brute-force [O(n^2)]
        // for (int i = 0; i < height.size(); i++) {
        //     for (int j = i + 1; j < height.size(); j++) {
        //         int h = Math.min(height.get(i), height.get(j));
        //         int w = j - i;
        //         int currWater = h * w;
        //         maxWater = Math.max(currWater, maxWater);
        //     }
        // }

        // optimized 2 pointer approach [O(n)]
        int n = height.size();
        int leftPointer = 0, rightPointer = n - 1;

        while (leftPointer < rightPointer) {
            // calculate area
            int h = Math.min(height.get(leftPointer), height.get(rightPointer));
            int w = rightPointer - leftPointer;
            int currWater = h * w;
            maxWater = Math.max(currWater, maxWater);

            // update ptr
            if (height.get(leftPointer) < height.get(rightPointer)) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWater;
    }
}
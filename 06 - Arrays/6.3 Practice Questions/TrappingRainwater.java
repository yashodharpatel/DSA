public class TrappingRainwater {
    public static int totalTrappedWater(int[] array) {
        int n = array.length;
        int leftPointer = 0, rightPointer = n - 1;
        int leftMax = 0, rightMax = 0;
        int totalTrappedWater = 0;

        while (leftPointer <= rightPointer) {
            // check if bar at leftpointer is smaller than bar at rightpointer
            if (array[leftPointer] <= array[rightPointer]) {
                // if leftmax is smaller than current bar then current bar is the leftmax
                if (leftMax <= array[leftPointer]) {
                    leftMax = array[leftPointer];
                } else {
                    totalTrappedWater += leftMax - array[leftPointer];
                }

                leftPointer++;
            } else {
                // if rightmax is smaller than current bar then current bar is the rightmax
                if (rightMax <= array[rightPointer]) {
                    rightMax = array[rightPointer];
                } else {
                    totalTrappedWater += rightMax - array[rightPointer];
                }

                rightPointer--;
            }
        }
        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(totalTrappedWater(height));
    }
}
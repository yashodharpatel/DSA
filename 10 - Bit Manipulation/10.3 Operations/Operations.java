public class Operations {
    private static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    private static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    private static int updateIthBit(int n, int i, int newBit) {
        // Approach 1
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        // Approach 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    private static int clearIBits(int n, int i) {
        int bitMask = (~0) << i; // ~0 and -1 are same (value of -1 is 1111 1111)
        return (n & bitMask);
    }

    private static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(updateIthBit(10, 1, 0));

        System.out.println(clearIBits(13, 2));

        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
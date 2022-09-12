public class ShortestPath {
    private static float calculateShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E': // East
                    x++;
                    break;
                case 'W': // West
                    x--;
                    break;
                case 'N': // North
                    y++;
                    break;
                case 'S': // South
                    y--;
                    break;

                default:
                    System.out.println("Invalid Direction");
                    break;
            }
        }

        int xSQ = x * x;
        int ySQ = y * y;

        return (float) (Math.sqrt(xSQ + ySQ));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(calculateShortestPath(path));
    }
}
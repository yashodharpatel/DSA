public class Length {
    public static void main(String[] args) {
        String str = "yashodhar";
       calLength(str, 0);
    }

    private static void calLength(String str, int i) {
        if(i == str.length()){
            System.out.println(i);
            return;
        }

        calLength(str, i+1);
    }
}

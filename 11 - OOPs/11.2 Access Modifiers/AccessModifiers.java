public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "yashodharpatel";
        System.out.println(b1.username);

        // b1.password = "12345678"; // cannot be accessible
        b1.setPassword("12345678"); // setter
        System.out.println(b1.getPassword());// getter
    }
}

class BankAccount {
    public String username;
    private String password;

    // Getter
    public String getPassword() {
        return this.password;
    }

    // Setter
    public void setPassword(String password) {
        this.password = password;
    }
}
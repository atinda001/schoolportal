Import java.util.scanner;
public class login {
    public static void main(String[]args) {
        int Password;
        scanner Mypass = new scanner(System.in);
        System.out.println("Enter Password");
        Password = Mypass.nextint();
        if (Password == 1234) {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong PAssword! Try Again")
        }

    }
}

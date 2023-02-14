import java.util.Scanner;

import static java.lang.System.out;

public class Authenticator2 {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            out.print("Password: ");
            String password = keyboard.next();

            if (password.equals("swordfish")) {
                out.println("You're in.");
            } else {
                out.println("Incorrect password");
            }

        } else {
            out.println("Unknown user");
        }

        keyboard.close();
    }
}

import java.util.Scanner;

import static java.lang.System.*;

public class CheckPassword {

    public static void main(String[] args) {

        out.print("What's the password?");

        var keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("You typed >>" + password + "<<");
        out.println();

        if (password == "swordfish") {
            out.println("""
                    The word you typed is stored
                    in the same place as the real
                    password. You must be a hacker.""");
        } else {
            out.println("""
                    The word you typed is not
                    stored in the same place as
                    the real password, but that's
                    no big deal.""");
        }
        out.println();

        if (password.equals("swordfish")) {
            out.println("""
                    The word you typed has the
                    same characters as the real
                    password. You can use our
                    precious system.""");
        } else {
            out.println("""
                    The word you typed doesn't
                    have the same characters as
                    the real password. You can't
                    use our precious system.""");
        }

        keyboard.close();
    }
}

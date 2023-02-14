import java.util.Scanner;

import static java.lang.System.out;

public class JustSwitchIt {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Which verse? ");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1 -> out.println("That's because he has no brain.");
            case 2 -> out.println("That's because he is a pain.");
            case 3 -> out.println("'Cause this is the last refrain.");
            default -> out.println("No such verse. Please try again.");
        }

        out.println("Oh, oh, oh, oh");

        keyboard.close();
    }
}

import java.util.Scanner;

import static java.lang.System.out;

public class MakingAGoodExpression {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Which verse? ");
        int verse = keyboard.nextInt();
        String line;

        line = switch (verse) {
            case 1 -> "That's because he has no brain.";
            case 2 -> "That's because he is a pain.";
            case 3 -> "'Cause this is the last refrain.";
            default -> "No such verse. Please try again.";
        };

        out.println(line);
        out.println("Oh, oh, oh, oh");

        keyboard.close();
    }
}

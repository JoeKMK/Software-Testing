import static java.lang.System.out;

public class AlsAllWet {

    public static void main(String[] args) {
        String intro = """
                Al's all wet. Oh, why is Al all wet? Oh,
                Al's all wet 'cause he's standing in the rain.""";

        for (int verse = 1; verse <= 3; verse++) {
            out.println(intro);
            out.println("Why is Al out in the rain?");

            out.println(switch (verse) {
                case 1 -> "That's because he has no brain.";
                case 2 -> "That's because he is a pain.";
                case 3 -> "'Cause this is the last refrain.";
                default -> "";
            });

            switch (verse) {
                case 3:
                    out.println("Last refrain, last refrain,");
                case 2:
                    out.println("He's a pain, he's a pain,");
                case 1:
                    out.println("Has no brain, has no brain,");
            }

            out.println("""
                    In the rain, in the rain.
                    Oh, oh, oh, oh""");
            out.println();
        }

        out.println(intro);
    }
}

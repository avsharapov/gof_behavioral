package behavioral.interpreter.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    static Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");

    public static void main(String[] args) {
        String input = "lions, and tigers, and bears! Oh, my!";

        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }

}

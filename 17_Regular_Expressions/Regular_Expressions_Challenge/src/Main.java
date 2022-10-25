import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Challenge 1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //Challenge 2
        String regEx = "I want a \\w+.";
        System.out.println(challenge1.matches(regEx));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regEx));

        //Challenge 3
        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        //Challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        //Challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        //Challenge 6
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        //Challenge 7
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

    }
}
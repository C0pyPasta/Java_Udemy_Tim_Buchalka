import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Regular Expressions are case sensitive

        String string = "I am a String. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y")); // The dot (.) will match all characters or numbers

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY")); // Carrot (^) only looks at the beginning of a string to find a pattern match

        String secondString = "abcDeeeF12GhhabcDeeeiiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee")); //Returns false because the string as a whole needs to match
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiijkl99z")); //Returns true
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiiijkl99z")); //Returns true

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END")); // Dollar sign at the end means it will look at the end of the string for a match
        System.out.println(alphanumeric.replaceAll("[aei]", "X")); // Square brackets are used to replace all occurrences of the letters within, so a, e and i in this case
                                                                                   // with, in this example the capital letter X -> abcDeeeF12Ghhiiiiijkl99z becomes XbcDXXXF12GhhXXXXXjkl99z

        System.out.println(alphanumeric.replaceAll("[aei]", " I replaced a letter here, "));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X")); // Replaces the letters a, e, and i only if they are followed by an F or a j

        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X")); //Replaces all characters except for an e and a J in this example

        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X")); // Does the same as the above -> a to f and 3 to 8, using - for ranges
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // the (?i) is used to ignore case sensitivity

        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X")); // The \\d is used to do the same as the above example, and replaces all digits (0-9) in the String
                                                                                    // note that the first slash in \\d is the escape character
        System.out.println(newAlphanumeric.replaceAll("\\D", "X")); // the \\D (Capital D) replaces all characters instead of digits

        String hasWhitespace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", "")); // With \\s you can 'select' ALL white space and replace it, in this case, with "" (so no spaces or tabs)
        System.out.println(hasWhitespace.replaceAll("\t", "X")); // Replaces the \t (tab) with X
        System.out.println(hasWhitespace.replaceAll("\\S", "X")); // Replaces all non whitespace characters (like space and tab) with an X
        System.out.println(newAlphanumeric.replaceAll("\\w", "S")); // Same as \\s, in this example replaced by S
        System.out.println(hasWhitespace.replaceAll("\\w", "S"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X")); // Adds X to the beginning and end of every word in the string

        // Quantifiers
        String thirdAlphanumericString = "abcDeeeF12GhhabcDeeehhiiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY")); // The e{3} means the e has to occur three times in a row, the {3} in this example is the quantifier
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY")); // In this case the + means we are looking for one or more e's, the + is the quantifier
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY")); // In this example the asterisk (*) means we are looking for 0 or more e's and isn't specified how many
                                                                                                  // so it could also be more than 3 e's
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY")); // In this example there's a match if there are 2 to 5 e's

        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y")); // This expression will look for a part of a string that has one h followed by 0 or more i's followed
                                                                                               // by a j

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";                  //Regular Expression (.*<h2>.*) to search for any number of characters before or after the <h2> tag (because a matcher only matches whole strings)
        Pattern pattern = Pattern.compile(h2Pattern);   //Instantiates a Pattern instance to be able to call a matcher instance on the next line
        Matcher matcher = pattern.matcher(htmlText);    //Matcher is fed the StringBuilder htmlText
        System.out.println(matcher.matches());          //Searches the htmlText for a match with the Regular Expression in the h2Pattern variable, returns true in this case

        //You can only use a matcher once! so you need to reset it if you want te re-use it
        matcher.reset();

        //Find, start and end methods of the Matcher Class
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end()); //In this example it finds one Occurrence and the begin and end index of the whole string because the RegEx (.*<h2>.*) is to broad.
        }

        String anotherh2Pattern = "<h2>";
        Pattern anotherPattern = Pattern.compile(anotherh2Pattern);
        Matcher anotherMatcher = anotherPattern.matcher(htmlText);

        int anotherCount = 0;
        while (anotherMatcher.find()) {
            anotherCount++;
            System.out.println("Second try Occurrence " + anotherCount + " : " + anotherMatcher.start() + " to " + anotherMatcher.end()); //Now gives the right amount of occurrences and begin and end index
        }                                                                                                                                 //Keep in mind the end index represents the first character AFTER the <h2> tag that we searched for

        String h2GroupPattern = "(<h2>.*?</h2>)"; // the left and right parenthesis are not part of the Regular Expression but used to group in case of multiple patterns
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
        // "abc" = "a" and "b" and "c"
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]"; //Search for t not ([^) not followed by a v. Does not find the last t because there's no character to compare to
        String tNotVRegExp = "t(?!v)"; //This one does find the last t because of the look ahead character ?
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        //--------------------------------------------------------------------------------------------------------------
        //Regular Expression to evaluate a US Phonenumber (800) 123-4567
        //^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$   //The Carrot ^ at the start indicates that the line has to start with the phonenumber. If it starts with anything else it's not a phonenumber
                                                                    //The {1} indicates how manny of the preceding expression are sought after. So [\(]{1} means looking for one (. Notice you have to denote with \
                                                                    //So in the next expression [0-9]{3} we are looking for three numbers between 0-9
                                                                    //The dollar indicates that nothing should follow after the telephone number

        String phone1 = "1234567890";       //Shouldn't match
        String phone2 = "(123) 456-7890";   //Match
        String phone3 = "123 456-78900";    //Shouldn't match
        String phone4 = "(123)456-7890";    //Shouldn't match

        System.out.println("=====================================================================================");
        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        //RegEx to evaluate Visa credit card which start with a 4 and are 16 characters long, older ones have 13 characters
        // ^4[0-9]{12}([0-9]{3})?$  //So starting with a 4 and followed by at least 12 numbers, then the grouped part ([0-9]{3}) which is optional so the ? mark is used which indicates 0 or more occurrences of the group
                                    //ending on a $ sign ($ is a boundary matcher) which means it should not have any characters after that

        String visa1 = "4444444444444"; //Match
        String visa2 = "5444444444444"; //No match
        String visa3 = "4444444444444444"; //Match
        String visa4 = "4444"; //No match

        System.out.println("=====================================================================================");
        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));


    }
}
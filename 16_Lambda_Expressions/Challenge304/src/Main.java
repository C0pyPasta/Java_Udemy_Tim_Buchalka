import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");

                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        runnable.run();

          //Same as above only with a lambda ----------------------------
//        Runnable runnable1 = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part : parts) {
//                 System.out.println(part);
//            }
//        };
//        runnable.run();


        System.out.println(everySecondChar("Hello World"));
        System.out.println(lambdaFunction.apply("1234567890"));
        System.out.println(everySecondChar(lambdaFunction.apply("1234567890")));
        //#5
        System.out.println(everySecondCharacter3(lambdaFunction, "1234567890"));
        System.out.println(iLoveJava.get());

        //#7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
        //#10 ----------------------------------------------------------------------------------------------------------
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name ->
//                    firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//        firstUpperCaseList.sort((string1, string2) -> string1.compareTo(string2));
//        firstUpperCaseList.forEach(string -> System.out.println(string));
//        firstUpperCaseList.sort(String::compareTo); //Does the same as - firstUpperCaseList.sort((string1, string2) -> string1.compareTo(string2));
//        firstUpperCaseList.forEach(System.out::println); //Does the same as - firstUpperCaseList.forEach(string -> System.out.println(string));
        // -------------------------------------------------------------------------------------------------------------

        //#11 ----------------------------------------------------------------------------------------------------------
//        topNames2015
//                .stream()
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);

        //#12 ----------------------------------------------------------------------------------------------------------
//        long namesBeginningWithA = topNames2015
//                .stream()
//                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
//                .filter(name -> name.startsWith("A"))
//                .count(); //To terminate
//        System.out.println("Number of names beginning with A is: " + namesBeginningWithA);

        //#13 ----------------------------------------------------------------------------------------------------------
        // Question: What will the following code print to the console?
        // topNames2015
        //      .stream()
        //      .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
        //      .peek(System.out::println)
        //      .sorted(String::compareTo);
        // Answer: It will print nothing as there is no terminal operation (like .count in the code above)
        //  Remember that stream chains are evaluated lazily. Nothing happens until a terminal operation is added to the chain. At that point, the chain is executed

        //#14 ----------------------------------------------------------------------------------------------------------
        // Question: Add a terminal operation to the chain from question #13 so that the peek call will execute
         topNames2015
              .stream()
              .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
              .peek(System.out::println)
              .collect(Collectors.toList());
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    //Same as above but as a lambda expression
    public static Function<String, String> lambdaFunction = (String s) -> {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(s.charAt(i));
            }
        }
        return returnVal.toString();
    };
    //#4
    public static String everySecondCharacter3(Function<String, String> func, String source) {
        return func.apply(source);
    }
    //#6
//    static Supplier<String> iLoveJava = () -> "I love Java!";  //Withoud return statement
    static Supplier<String> iLoveJava = () -> { return "I love Java!"; };   //With return statement, mind the curly braces!

}

//#8 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Question: Given a specific interface, how can we tell whether we can map a lambda expression to it? What's the criteria that has to be met?
// Answer: we can use an interface usually containing only one method (that must be implemented), these interfaces are called functional interface.
//  A functional interface can contain more than one method, but all the methods but one must have default implementations.
//  Most of the time, the documentation for an interface will state whether it is a functional interface.

// Question: With that in mind, can we use a lambda expression to represent an instance of the java.util.concurrent.Callable interface?
//  check Java documentation: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html
// Answer: Yes we can, the documentation states 'This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference' in the Callable<V> documentation
//  Also, the Callable interface has only one method that has to be implemented - the call() method.

// Question: Is the java.util.Comparator interface a functional interface
// Answer: Yes, the documentation of java.util.Comparator states 'This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference'
//  Despite containing over ten methods, only one method HAS to be implemented, the compare() method. Because of that, it's a functional interface.
//   -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Reminder, Lambdas are used instead of an anonymous class, a (static) class that is not instantiated


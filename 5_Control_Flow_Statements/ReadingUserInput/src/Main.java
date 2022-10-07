import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Met new maak je een instance (een object) van een class dus van een kassa klasse maak je 1 kassa en kan er meerdere maken met eigen geheugen

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){

            int yearOfBirth = scanner.nextInt(); // let op na een nextInt altijd een nextLine
            scanner.nextLine(); // handle next line character (enter key) anders pakt ie de tweede scanner.nextline hieronder niet

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth " + name + ", you nub!");
            }
        } else {
            System.out.println("unable to parse year of birth");
        }

        scanner.close();
    }
}
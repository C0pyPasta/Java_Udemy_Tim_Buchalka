import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        Scanner myScanner = new Scanner(System.in);
        while(count <= 10) {
            System.out.println("Enter number #" + count);

            boolean hasNextInt = myScanner.hasNextInt();

            if(hasNextInt && (myScanner.nextInt() >= 0)){
                sum += myScanner.nextInt();
                System.out.println("Sum is " + sum);
                count++;
            } else {
                System.out.println("Invalid number!");
                break;
            }
        }
        myScanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner myScanner = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int count = 0;
        boolean isAnInt = myScanner.hasNextInt();

        while(isAnInt) {
            int inputNumber = myScanner.nextInt();
            count++;
            sum += inputNumber;
            average = Double.parseDouble(sum);
            System.out.println("SUM = " + sum + " AVG = " + average);

        }
        System.out.println("SUM = XX AVG = YY");

        myScanner.close();
    }

}
public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 1; i<20; i++){
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count == 3){
                    break;
                }
            }
        }

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

            for(int i=0; i<5; i++) { //for(init; termination; increment)
                System.out.println("Loop " + i + " hello!");
            }

        for(double i=2.0; i<9.0; i++) {
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("*******************");
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        }

        public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
        }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
}
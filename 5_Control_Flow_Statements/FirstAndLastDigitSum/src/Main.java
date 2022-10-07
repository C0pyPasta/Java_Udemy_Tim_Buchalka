public class Main {
        public static void main(String [] args) {

            System.out.println(getDigitCount(0));
            System.out.println(reverse(1234));
            numberToWords(123);

        }
        public static void numberToWords(int number){
            if(number < 0){
                System.out.println("Invalid Value");
            } else {
                int rev = reverse(number);
                int count = getDigitCount(number);

                while(count > 0) {
                    int lastDigit = rev % 10;
                    rev = rev / 10;
                    count--;

                    switch (lastDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println();
                    }
                }
            }
        }

        public static int reverse(int number){
            int rev = 0;
            if(number < 0) {
                number = -1 * number;

                while (number > 0) {
                    int lastDigit = number % 10;
                    rev = lastDigit + rev * 10;
                    number /= 10;
                }
                return - rev;
            }

            while (number > 0) {
                int lastDigit = number % 10;
                rev = lastDigit + rev * 10;
                number /= 10;
            }
            return rev;
        }

        public static int getDigitCount(int num){
            if(num < 0){
                return -1;
            }
            else if(num == 0){
                return 1;
            }
            int count = 0;
            while(num > 0){
                count++;
                num /= 10;
            }
            return count;
        }
}


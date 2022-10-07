public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result -2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore <  100) {
            System.out.println("You got the high score!");
        }

        int secondTopscore = 81;
        if ((topScore > secondTopscore) && (topScore < 100)) {  // && = AND
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopscore <= 90)) {   //   ||  = OR
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }
        //ternary Operator (?) is operator met drie operands isCar, true en false
        isCar = true;
        boolean wasCar = isCar ? true : false; // isCar is deze true dan geeft ie true aan wasCar anders geeft ie false aan wasCar
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double addNumbers = ((myFirstDouble + mySecondDouble) * 100d);
        System.out.println(addNumbers);
        double myRemainder = addNumbers % 40.00d;
        System.out.println(myRemainder);
        boolean myBool = (myRemainder == 0.0) ? true : false;
        System.out.println("myBool = " + myBool);
        if (!myBool) {
            System.out.println("Got some remainder");
        }
    }
}
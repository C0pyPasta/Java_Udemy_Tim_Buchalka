import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was one");
                break;

            case 2:
                System.out.println("Value was 2");

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char myChar = 'A'; //Let op een char moet altijd tussen enkele quotes

        switch (myChar) {
            case 'A':
                System.out.println("It's an " + myChar);
                break;

            case 'B':
                System.out.println("It's a " + myChar);
                break;

            case 'C':
                System.out.println("It's a " + myChar);
                break;

            case 'D':
                System.out.println("It's a " + myChar);
                break;

            case 'E':
                System.out.println("It's a " + myChar);
                break;
            default:
                System.out.println("Not Found");
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

//        StaticTest firstinstance = new StaticTest("1st instance");
//        System.out.println(firstinstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);


    }

    public static int multiply(int number){
        return number * multiplier;
    }
}
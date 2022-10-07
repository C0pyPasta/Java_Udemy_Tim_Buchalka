public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // f voor float
        double myDoubleValue = 5d / 3d; // d voor double
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);


        //Challenge
        float myFloatValueTest = (float) 5.25; // float gacast op double die default gegeven wordt door Java

        // double wordt meeste gebruikt, float niet meer zoveel

        //Challenge
        double myPounds = 200d;
        double myKilograms = myPounds * 0.45359237d;
        System.out.println(myPounds + " pound = " + myKilograms + " Kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; //Underscore mag je als punt gebruiken voor leesbaarheid
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
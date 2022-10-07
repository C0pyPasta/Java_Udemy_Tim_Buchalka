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
        float myFloatValue = 5f / 3f; // f stands for float
        double myDoubleValue = 5d / 3d; // d stands for double
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);


        //Challenge
        float myFloatValueTest = (float) 5.25; // float cast on a double (default)

        //double is mostly used

        //Challenge
        double myPounds = 200d;
        double myKilograms = myPounds * 0.45359237d;
        System.out.println(myPounds + " pound = " + myKilograms + " Kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; //undescore instead of a . (dot) can be used
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}

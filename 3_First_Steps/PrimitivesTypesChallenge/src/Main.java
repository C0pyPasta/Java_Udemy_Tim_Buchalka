public class Main {

    public static void main(String[] args) {

        //Challenge
        byte myByte = 20;
        short myShort = 5;
        int myInt = 100;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 *(myByte + myShort + myInt));
    }
}

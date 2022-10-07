public class Main {

    public static void main(String[] args) {
        
        // primitive types in Java
        // - byte
        // - short
        // - int
        // - long
        // - float
        // - double
        // - char
        // - boolean

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " + myString);
        
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        
        String lastString = "10";
        int myInteger = 50;
        lastString = lastString + myInteger;
        System.out.println("LastString is equal to " + lastString);

        //Strings are immutable, if you alter one like we did above you are replacing it as a whole
    }
}

import java.util.Scanner;

public class X {
    private Scanner scanner;
    private int x;

    public X() {
        scanner = new Scanner(System.in);
        System.out.println("Insert a interger: ");
        this.x = scanner.nextInt();
    }

    public void x(){
        for(int x=1; x <= 12; x++){
            System.out.println( x + " times this x " + this.x + " = " + (x * this.x));
        }
    }
}

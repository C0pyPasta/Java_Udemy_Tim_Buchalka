import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double initialTransaction) {
        this.transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);
        this.name = name;
        System.out.println("Account made for customer " + name + " with a starting capital of " + transactions.get(0).toString());
    }


}

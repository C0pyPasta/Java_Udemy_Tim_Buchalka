public class VipCustomer {
    private String name, emailAddress;
    private double creditlimit;

    public VipCustomer() {
        this("Rudi", "rudi@rudiplast.nl", 2000);
    }
    public VipCustomer(String name, String emailAddress) {
        this(name, emailAddress, 2000);
    }
    public VipCustomer(String name, String emailAddress, double creditlimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditlimit = creditlimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditlimit() {
        return creditlimit;
    }
}

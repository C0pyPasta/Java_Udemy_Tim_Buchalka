public class BaseBurger {
    private String breadRollType;
    private String meat;

    private String name;
    private boolean lettuce, tomato, carrot, cucumber;

    private double price;

    public BaseBurger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.lettuce = true;
        this.tomato = true;
        this.carrot = true;
        this.cucumber = true;

        if(lettuce){
            this.price += 0.25;
        }

        if(tomato){
            this.price += 0.30;
        }

        if(carrot){
            this.price += 0.35;
        }

        if(cucumber){
            this.price += 0.40;
        }
    }

    public double getPriceTotal(){
        return this.price;
    }

    public void setPrice(double price) {
        this.price += price;
    }

    public void setName(String name) {
        this.name = name;
    }
}

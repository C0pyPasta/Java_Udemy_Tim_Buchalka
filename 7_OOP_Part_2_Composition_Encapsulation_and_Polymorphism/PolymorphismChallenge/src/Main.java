class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;

    private int speed;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {

        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Porche extends Car{
    public Porche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porche -> brake()";
    }
}

class Audi extends Car{
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}

class BMW extends Car{
    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println();

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porche porche = new Porche(6, "Porche");
        System.out.println(porche.startEngine());
        System.out.println(porche.accelerate());
        System.out.println(porche.brake());

        Mercedes mercedes = new Mercedes(6, "Mercedes");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

    }
}

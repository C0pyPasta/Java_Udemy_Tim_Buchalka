public class Main {
    public static void main(String[] args) {
//        Car porche = new Car();
//        Car holden = new Car();
//        porche.setModel("Carrera");
//        System.out.println("Model is " + porche.getModel());
//
//        VipCustomer vipper = new VipCustomer();
//        System.out.println(vipper.getName());
//
//        VipCustomer vipper2 = new VipCustomer("Bob", "testing@testing.com");
//        System.out.println(vipper2.getEmailAddress());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

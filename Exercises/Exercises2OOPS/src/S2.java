
//import Car.*;

public class S2 {

    public static void main(String []Args) {
        Car c1 = new Car("Honda", "Civic", 2015, 24);
//        Car c2 = new Car();

//        c1.Car();


        Truck t1 = new Truck("GMC", "TITAN", 2018, 20, 20, 2, 8);

//        t1.Truck();

        t1.setAxles(4);

        c1.display();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("");
        t1.display();

        ElectricVehicle ev1 = new ElectricVehicle("Tesla", "Model Y", 2023, 350, 10);

        System.out.println("------------------------------------------------------------------------");

        ev1.display();

    }

}

public class Truck extends Car{
    private float RideHeight;
    private int axles;
    private float capacity;

    public Truck(String name, String model, int year, float mileage, float rideHeight, int axles, float capacity) {
        super(name, model, year, mileage);
        RideHeight = rideHeight;
        this.axles = axles;
        this.capacity = capacity;
    }

    protected float getRideHeight() {
        return RideHeight;
    }

    protected void setRideHeight(float rideHeight) {
        RideHeight = rideHeight;
    }

    protected int getAxles() {
        return axles;
    }

    protected void setAxles(int axles) {
        this.axles = axles;
    }

    protected float getCapacity() {
        return capacity;
    }

    protected void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @java.lang.Override
    protected void display() {
        super.display();
        System.out.println("Ride Height: "+getRideHeight()+" inches");
        System.out.println("Axles: "+getAxles());
        System.out.println("Capacity: "+getCapacity()+" ton");
    }
}

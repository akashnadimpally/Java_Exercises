public class ElectricVehicle {

    private Car cardetails;
    private float distance_per_charge;
    private float chargingTime;

    protected ElectricVehicle(String name, String model, int year, float distance_per_charge, float chargingTime) {
        this.cardetails = new Car(name, model, year);
        this.distance_per_charge = distance_per_charge;
        this.chargingTime = chargingTime;
    }

    public Car getCardetails() {
        return cardetails;
    }

    public void setCardetails(Car cardetails) {
        this.cardetails = cardetails;
    }

    public float getDistance_per_charge() {
        return distance_per_charge;
    }

    public void setDistance_per_charge(float distance_per_charge) {
        this.distance_per_charge = distance_per_charge;
    }

    public float getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(float chargingTime) {
        this.chargingTime = chargingTime;
    }

    protected void display() {

        System.out.println("Name: "+cardetails.getName());
        System.out.println("Model: "+cardetails.getModel());
        System.out.println("Year: "+cardetails.getYear());
        System.out.println("Distance per 1 full Charge: "+getDistance_per_charge()+" km");
        System.out.println("Total charging time: "+getChargingTime()+" minutes");
    }

}

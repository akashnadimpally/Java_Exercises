public class Car {
    private String name;
    private String model;
    private int year;
    private float mileage;

    public Car(String name, String model, int year, float mileage) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected float getMileage() {
        return mileage;
    }

    protected void setMileage(float mileage) {
        this.mileage = mileage;
    }

    protected void display() {
        System.out.println("Name: "+getName());
        System.out.println("Model: "+getModel());
        System.out.println("Year: "+getYear());
        System.out.println("Mileage: "+getMileage()+" mpg");
    }

}
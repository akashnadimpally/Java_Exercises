public class Duck implements Swimmable, Flyable {

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    public void Display() {
        fly();
        swim();
    }

}

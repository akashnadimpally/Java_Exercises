//Define two interfaces, Flyable with a method fly and Swimmable with a method swim.
//Create a class Duck that implements both interfaces and provides implementations for fly and swim.
//In your main class, demonstrate polymorphism by treating Duck as both Flyable and Swimmable.

public class S1 {
    public static void main(String []args) {
        Duck d = new Duck();
//        d.Display();

        Flyable f = d;
        f.fly();

        Swimmable s = d;
        s.swim();

    }
}

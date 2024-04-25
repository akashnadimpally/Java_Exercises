class Animal {
    String name;
}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class S1 {
    public static void main(String []args) {
        Dog d = new Dog();
        d.name = "Test";
        System.out.println("Name of the Animal: "+d.name);
    }
}

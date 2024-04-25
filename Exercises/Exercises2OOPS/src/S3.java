//1. **Basic Interface Implementation:**
//        - Create an interface `Playable` with a method `play`.
//        - Implement this interface in classes `Game` and `Music`, each with their own version of `play`.
//        - Write a main class to create objects of `Game` and `Music` and invoke their `play` method.


public class S3 {
    public static void main(String []args) {
        Game g = new Game();
        Music m = new Music();

        g.play();
        m.play();
    }
}

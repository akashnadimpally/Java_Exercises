import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String []args) {
        List<String> books = new ArrayList<String>();

        books.add("Basics of Mechanical Engineering");
        books.add("Thermodynamics");
        books.add("Networking");
        books.add("Database");

        books.remove(0);

        System.out.println(books);



        System.out.println(books.get(2));

    }
}

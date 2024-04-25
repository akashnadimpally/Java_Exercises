import java.util.LinkedList;
import java.util.Queue;

public class Basic4 {

    public static void main(String []args) {

        Queue<String> q = new LinkedList<>();

        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");

        System.out.println(q);

        q.poll();

        System.out.println(q);


    }
}

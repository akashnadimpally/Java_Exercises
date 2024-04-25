import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inter2 {
    public static void main(String []args) {
        List<Integer> num = new ArrayList<>();

        num.add(3);
        num.add(8);
        num.add(1);
        num.add(-5);
        num.add(10);
        num.add(6);

        System.out.println(num);
//        System.out.println(Collections.sort(num));
        Collections.sort(num);
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
    }
}

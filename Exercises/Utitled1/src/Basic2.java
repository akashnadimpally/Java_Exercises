import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Basic2 {

    public static void main(String []args) {
        Set<Integer> mySet = new HashSet<Integer>();

        mySet.add(100);
        mySet.add(200);
        mySet.add(100);

        System.out.println(mySet);

    }

}

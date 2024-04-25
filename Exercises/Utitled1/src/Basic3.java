import java.util.HashMap;

public class Basic3 {

    public static void main(String []args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Test",1);
        myMap.put("Dev",0);
        myMap.put("Prod",2);

        System.out.println(myMap);

        System.out.println(myMap.get("Prod"));

    }

}

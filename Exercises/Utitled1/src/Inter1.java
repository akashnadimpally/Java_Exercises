import java.util.HashMap;

public class Inter1 {

    public static void main(String []args) {

        HashMap<String, String> myMap = new HashMap<>();

        myMap.put("India", "New Delhi");
        myMap.put("USA", "Washington DC");
        myMap.put("UK", "london");
        myMap.put("Australia", "Canberra");
        myMap.put("Germany", "Berlin");
        myMap.put("Japan", "Tokyo");
        myMap.put("Russia", "Moscow");
        myMap.put("Brazil", "Rio");

        System.out.println(myMap.get("UK"));

        System.out.println(myMap.containsValue("london"));

    }
}

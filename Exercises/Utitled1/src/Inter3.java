import java.util.*;

public class Inter3 {

    public static void main(String []args) {
        List<String> names = new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        names.add("A");

        System.out.println(names);

//        HashSet<String> Uniquenames = new HashSet<>(names);
//        System.out.println(Uniquenames);

        HashSet<String> Uniquenames = new HashSet<>();

//        for(String ele:names) {
//            if(!Uniquenames.add(ele)) {
//                System.out.println(ele);
//            }
//        }

        HashMap<String, Integer> myMap = new HashMap<>();


        for(String ele:names) {
            int count = myMap.getOrDefault(ele, 0);
            myMap.put(ele, count+1);
        }

        System.out.println(myMap);
    }

}

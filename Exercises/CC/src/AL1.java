import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL1 {
    public static void main(String []args) {
        List<String> color = new ArrayList<String>();
        color.add("Blue");
        color.add("Red");
        color.add("Yellow");
        color.add("Violet");
        color.add("Indigo");
        color.add("Green");
        color.add("Orange");

        System.out.println(color);

        for(String ele:color) {
            System.out.println(ele);
        }

        color.add(0,"White");

        System.out.println(color);

        System.out.println(color.get(3));

        color.set(3,"Gray");

        System.out.println(color);

        color.remove(3);

        System.out.println(color);

        System.out.println(color.contains("Black"));

        Collections.sort(color);

        System.out.println(color);

        List<String> temp = new ArrayList<String>();

        temp.addAll(color);

//        Collections.copy(color, temp);

        System.out.println(temp);
        System.out.println(color);

        Collections.shuffle(temp);

        System.out.println(temp);

        Collections.reverse(temp);

        System.out.println(temp);

        List<List <String>> subLists = new ArrayList<>();

        for(int i =0; i< temp.size();i++) {
            for(int j=i; j<=temp.size(); j++) {
                subLists.add(temp.subList(i,j));
            }
        }

        System.out.println(subLists);

        temp.add("Black");
        color.add("Maroon");

        ArrayList<String> OutputCompare = new ArrayList<>();

        for (String ele:color) {
            OutputCompare.add(temp.contains(ele) ? "yes":"no" );
        }

        System.out.println(color);
        System.out.println(temp);
        System.out.println(OutputCompare);

        List<String> joker = new ArrayList<>(color);

        Collections.copy(color, temp);

        Collections.copy(temp, joker);

        System.out.println(color);
        System.out.println(temp);

        System.out.println(joker);

        joker.removeAll(joker);

        System.out.println(joker);

        System.out.println(joker.isEmpty());

        color.add(null);

        System.out.println(color);



    }
}

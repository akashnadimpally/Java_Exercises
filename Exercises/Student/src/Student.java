import java.util.Arrays;

public class Student {

    private String Name;
    private int[] Marks;

    public Student(String name, int... marks) {
        Name = name;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int[] getMarks() {
        return Marks;
    }

    public void setMarks(int... marks) {
        Marks = marks;
    }


    public void getNumberOfMarks() {
        System.out.println("Number of Marks: "+Marks.length);
        for (int i=0; i<Marks.length; i++) {
            System.out.println(i+" : "+Marks[i]);
        }
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int element:Marks) {
            sum+=element;
        }
        return sum;
    }


    public int getMaximumMark() {
//        int res = Arrays.stream(Marks).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        int res = Integer.MIN_VALUE;
        for(int element: Marks) {
            if(element > res) {
                res = element;
            }
        }
        return res;
    }

    public int getMinimumMark() {
        int res = Integer.MAX_VALUE;

        for(int element: Marks) {
            if(element < res) {
                res = element;
            }
        }
        return res;
    }

    public float getAverageMarks() {

        int sum = getTotalSumOfMarks();
        int n = Marks.length;
        float AvgMarks = (float) sum/n;
        return AvgMarks;
    }
}

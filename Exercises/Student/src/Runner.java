public class Runner {

    public static void main(String []args) {
        int[] marks1 = {10,20,30,40,50};
        int[] marks2 = {100,20,300,40,50,600};
        Student s = new Student("Mark", marks1);
        Student s1 = new Student("Trump", marks2);
        int MaxNum = s.getMaximumMark();
        System.out.println(MaxNum);
        int MinNum = s.getMinimumMark();
        System.out.println(MinNum);
        int sumMarks = s.getTotalSumOfMarks();
        System.out.println("Sum of all Marks: "+sumMarks);
        float AvgMarks = s.getAverageMarks();
        System.out.println("Average of Marks: "+AvgMarks);

        int MaxNum1 = s1.getMaximumMark();
        System.out.println(MaxNum1);
        int MinNum1 = s1.getMinimumMark();
        System.out.println(MinNum1);
        int sumMarks1 = s1.getTotalSumOfMarks();
        System.out.println("Sum of all Marks: "+sumMarks1);
        float AvgMarks1 = s1.getAverageMarks();
        System.out.println("Average of Marks: "+AvgMarks1);
    }
}

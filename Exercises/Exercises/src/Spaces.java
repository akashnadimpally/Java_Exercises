public class Spaces {
    public static void main(String []Args) {
        String s = "The person who says something is impossible should not interrupt the person who is doing it.";
//        char[] charArray = s.toCharArray();
        int n = s.length();
        int res = 0;
        for (int c = 0; c<n; c++) {
            if(s.charAt(c) == ' '){
                res += 1;
            }
        }
        System.out.println("Number of spaces: "+res);
    }
}

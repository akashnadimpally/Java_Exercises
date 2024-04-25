public class Factorial {
    public static void main(String []Args) {
        int n;
        n = 5;
        for(int i=n; i>1; i--) {
            n = n * (i-1);
        }
        System.out.println(n);
    }
}

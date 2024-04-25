public class Count {
    public static void main(String []Args) {

        for (int i = 5; i <= 200; i += 5) {
            System.out.print(i + " ");
            if (i % 50 == 0) {
                System.out.println();
            }
        }

    }
}

import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        System.out.println("Even Numbers are : ");
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers are : ");
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        inp.close();
    }
}

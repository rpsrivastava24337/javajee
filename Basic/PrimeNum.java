import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        int c = 0;
        System.out.println("Enter a number ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not a Prime Number ");
        }

        inp.close();
    }
}

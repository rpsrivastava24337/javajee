import java.util.*;
public class SumOfN {   


    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a number ");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        for (int i = 0; i <= n; i++) {
            sum=sum+i;
        }
       
        System.out.println("sum is  "+sum);
        inp.close();
    }
}


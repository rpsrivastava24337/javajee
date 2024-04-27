public class SumOfTwoDigitNum{
public static void main(String[] args) {
     
      int num =Integer.parseInt(args[0]);
      int sum = (num%10)+(num/10);
      System.out.println("Sum is "+(sum));
     
    
}
}
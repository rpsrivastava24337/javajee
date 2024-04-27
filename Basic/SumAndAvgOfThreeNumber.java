public class SumAndAvgOfThreeNumber{
public static void main(String[] args) {

    int firstNumber=Integer.parseInt(args[0]);
    int secondNumber=Integer.parseInt(args[1]);
    int thirdNumber=Integer.parseInt(args[2]);


    System.out.println("The Sum of three number is " + (firstNumber+secondNumber+thirdNumber));
    System.out.println("The Average of three number is " + ((firstNumber+secondNumber+thirdNumber))/3);

    
}
}
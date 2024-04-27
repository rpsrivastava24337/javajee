public class SwapOfTwoNumberWithoutThirdVariable{
public static void main(String[] args) {

    int firstNumber=Integer.parseInt(args[0]);
    int secondNumber=Integer.parseInt(args[1]);
    firstNumber=firstNumber+secondNumber;
    secondNumber=firstNumber-secondNumber;
    firstNumber=firstNumber-secondNumber;
    
    System.out.println("The first number is "+firstNumber+ " and Second number is "+ secondNumber);

    
}
}
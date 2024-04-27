public class SalaryCalculation{
public static void main(String[] args) {
            int salary =Integer.parseInt(args[0]);
            System. out.println("Basic salary is : "+salary);
            int hra = (salary*15)/100;
            int entertainment = (salary*15)/100;
            int Conveyance = (salary*10)/100;
            int total =hra+entertainment+Conveyance+salary;
            System. out.println("The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance : "+ total);







     }
}
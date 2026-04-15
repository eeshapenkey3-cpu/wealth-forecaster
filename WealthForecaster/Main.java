import java.util.*;
public class Main{
    //psv
    public static void main(String[]args){
        //declare variables
        String name;
        int currentAge, retirementAge;

        //declare and create obj
        Scanner in = new Scanner(System.in);
        InvestmentAccount InvestAcc = new InvestmentAccount();
        User user = new User();

        //gather inputs
        System.out.println("enter name: ");
        name = in.nextLine();
        user.setName(name);

        System.out.println("enter current age: ");
        currentAge = in.nextInt();
        user.setCurrentAge(currentAge);

        System.out.println("enter retirement age: ");
        retirementAge = in.nextInt();
        user.setRetirementAge(retirementAge);
    }
}
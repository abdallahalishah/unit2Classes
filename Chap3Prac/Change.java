import java.util.Scanner;

public class Change

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the amount due (input amount in pennies): ");
        int amountDue = input.nextInt();
        
        System.out.print("How much are you paying (input amount in pennies): ");
        int payment = input.nextInt();
        
        int change = payment - amountDue;
        
        int remain1 = change%100;
        int dollars = change/100;
        
        int remain2 = remain1%25;
        int quarters = remain1/25;
        
        int remain3 = remain2%10;
        int dimes = remain2/10;
        
        int remain4 = remain3%5;
        int nickels = remain3/5;
        
        int pennies = remain4;
        
        System.out.println("Dollars: "+dollars);
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);
        
        
    }
}

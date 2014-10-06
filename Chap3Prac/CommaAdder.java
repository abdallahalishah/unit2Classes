import java.util.Scanner;

public class CommaAdder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1000 and 999999: ");
        String user = input.next();
        //System.out.println(user);
        
        int length = user.length();
        
        String correct = user.substring(0,length-3) + "," + user.substring(length-3);
        
        System.out.print(correct);
        
    }
}

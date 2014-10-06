import java.util.Scanner;

public class CommaRemover
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1,000 and 999,999: ");
        String user = input.next();
        //System.out.println(user);
        
        int length = user.length();        
        int comma = user.indexOf(",");
        
        String correct = user.substring(0, comma) + user.substring(comma+1);
        
        System.out.print(correct);
        
    }
}

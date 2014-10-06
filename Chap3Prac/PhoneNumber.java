import java.util.Scanner;

public class PhoneNumber

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type in a phone number wihout parenthesis, spaces,and hyphens: ");
        String user = input.next();
        
        int length = user.length();
        
        String correct = "(" + user.substring(0,3) + ")" + user.substring(length-7,length-4) + "-" + user.substring(length-4);
        
        System.out.print(correct);
        
    }
}

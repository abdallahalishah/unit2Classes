import java.util.Scanner;


public class RectangleCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double height, width, area, perimeter, diag;
        
        System.out.print("What is the height of the rectangle: ");
        height = input.nextDouble();
        
        System.out.print("What is the width of the rectangle: ");
        width = input.nextDouble();
        
        area = height * width;
        perimeter = (2 * height + 2 * width);
        diag = Math.sqrt(height * height + width * width);
        diag *= 100;
        diag = Math.round(diag);
        diag /= 100;
        
        System.out.println("");
        System.out.println("The area of the rectangle is: " + area);        
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is approximately: " + diag);
        
        
    }
}

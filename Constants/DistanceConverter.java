public class DistanceConverter
{
   static final double YARDS_TO_FEET = 3.0;
   static final double FEET_TO_INCHES = 12.0;
   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * YARDS_TO_FEET;
      double inches = feet * FEET_TO_INCHES;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}

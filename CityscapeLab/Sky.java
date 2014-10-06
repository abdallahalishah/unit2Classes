import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;
import java.awt.GradientPaint;

public class Sky
{
    private int width;
    private int height;
    private boolean dayNight=false;
    
    public Sky(int x, int y, boolean check)
    {
        this.height = y;
        this.width = x;
        this.dayNight = check;
    }

    
    public void draw(Graphics2D g2)
    {
        /* creates the sky object */
        Rectangle mainSky = new Rectangle(0,0,this.width,this.height);
        
        /* gets a random coordinate in the frame with 2 variables */
        Random gen = new Random();
        int randW = gen.nextInt(width);
        int randH = gen.nextInt(height);
        
        /* creates the colors for a day sky and a night sky */
        Color darkBlue = new Color(0,10,50);
        Color skyBlue = new Color(0,255,255);
        
        /* draws the sky depending on whether it is night or day */
        if (this.dayNight==true)
        {
            GradientPaint grad = new GradientPaint(0,-50,darkBlue,0,this.height,Color.BLACK);
            g2.setPaint(grad);g2.fill(mainSky);g2.draw(mainSky);
        }
        
        if (this.dayNight==false)
        {
            GradientPaint grad = new GradientPaint(0,-50,skyBlue,0,this.height,darkBlue);
            g2.setPaint(grad);g2.fill(mainSky);g2.draw(mainSky);
        }
        
        /* uses random coordinates to draw a certain amount of stars over the screen */
        g2.setColor(Color.WHITE);
        for (int i=1;i<900;i++){
        Rectangle star1 = new Rectangle(randW,randH,1,1);
        randW = gen.nextInt(width);
        randH = gen.nextInt(height);
        g2.fill(star1);g2.draw(star1);}
    }
}

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.GradientPaint;

public class Grass
{
    // gets the width of the frame
    private int width;
    
    // gets the height of the frame
    private int height;
    
    // boolean for whether the it is day or night
    private boolean dayNight;
    
    /**
     * Constructor for objects of class Building3
     * 
     * @param   x   gets the x coordinate of main building part
     * @param   y   gets the height of frame
     * @param   check   gets whether it is day or night
     */
    public Grass(int x, int y, boolean check)
    {
        this.height = y;
        this.width = x;
        this.dayNight = check;
    }

    
    /**
     * Method to create and draw everything for every instance created from this class
     * 
     * @param   g2      variable from the Graphics2D class which is used to draw everything to the frame
     * 
     */
    public void draw(Graphics2D g2)
    {
        /* creates the grass and grass outline object */
        Rectangle black = new Rectangle(0, this.height-452, this.width, 1000);
        Rectangle backGrass = new Rectangle(0, this.height-450, this.width, 1000);       
        
        /* draws outline and draws grass depending on whether is it day or night */
        g2.setColor(Color.BLACK);g2.fill(black);g2.draw(black);
        Color green = new Color(0,120,22);
        if (dayNight==true)
        {
            GradientPaint grad = new GradientPaint(0,this.height-800,Color.BLACK,
                                                   0,this.height+100+500,green); 
            g2.setPaint(grad);g2.fill(backGrass);g2.draw(backGrass);
        }
        
        if (dayNight==false)
        {
            GradientPaint grad = new GradientPaint(0,this.height-800,Color.WHITE,
                                                   0,this.height+100+500,green);
            g2.setPaint(grad);g2.fill(backGrass);g2.draw(backGrass);
        }
    }
}

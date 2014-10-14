import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates a window for buildings.
 * 
 * @author Abdallah Alishah
 * @version 5 October 2014
 */
public class Window
{
    // the x coordinate, y coordinate, and size of the window
    private int xCoor,yCoor,size;
    
    // checks for day or
    private boolean dayNight;

    /**
     * Constructor for objects of class Window
     * 
     * @param   x           the x coordinate of where the window is drawn
     * @param   y           the y coordinate of where the window is drawn
     * @param   dimensions  the dimension of what the height and width is
     * @param   check       whether it is day or night
     */
    public Window(int x,int y, int dimensions, boolean check)
    {
        this.xCoor = x;
        this.yCoor = y;
        this.size = dimensions;
        this.dayNight = check;
    }

    /**
     * Creates windows with a specified size, x coordinate, and y coordinate.
     * 
     * @param  g2      variable from the Graphics2D class which is used to draw everything to the frame
     */
    public void draw(Graphics2D g2)
    {
        Rectangle window = new Rectangle(xCoor+5,yCoor,size/2,size);
        Random gen = new Random();
        
        if (dayNight==true)
        {
            int r=0,g=0,b=0;
            int num = gen.nextInt(3);
            //if (num<2){r=0;g=0;}
            //if (num==2){r=255;g=255;}
            Color color = new Color(r,g,b);
            g2.setColor(color);g2.fill(window);g2.draw(window);
        }
        if (dayNight==false)
        {
            int r=0,g=0,b=255;
            int num = gen.nextInt(2);
            //if (num==0){r=0;g=0;}
            //if (num==1){r=255;g=255;}
            Color color = new Color(r,g,b);
            g2.setColor(color);g2.fill(window);g2.draw(window);
        }
    }
}

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

/**
 * Class that creates an antenna for a building.
 * 
 * @author Abdallah Alishah
 * @version 5 October 2014
 */
public class Antenna
{
    // instance variables - replace the example below with your own
    private boolean dayNight;
    
    // x and y coordinate and height and width or antenna
    private int x, y, width, height;

    /**
     * Constructor for objects of class Antenna
     * 
     * @param   x       x coordinate of antenna
     * @param   y       y coordinate of antenna
     * @param   w       width of antenna
     * @param   h       height of antenna
     */
    public Antenna(int x, int y, int w, int h, boolean check)
    {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
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
        // creates the antenna outline and antenna objects
        Rectangle antennaBack = new Rectangle(this.x-1,this.y-1,this.width+2,this.height+2);
        Rectangle antenna = new Rectangle(this.x,this.y,this.width,this.height);
        Random gen = new Random();
        
        // color for antenna during the night
        Color gray = new Color(50,50,50);
        
        // continously changes the color of the outline to the same color of the windows
        // to make an illusion of a sparking antenna
        // also changes the color of the main antenna depending on whether it is night or day
        if (dayNight==true)
        {
            int r=0,g=0,b=0;
            int num = gen.nextInt(3);
            if (num<2){r=0;g=0;}
            if (num==2){r=255;g=255;}
            Color color = new Color(r,g,b);
            g2.setColor(color);g2.fill(antennaBack);g2.draw(antennaBack);
            g2.setColor(gray);g2.fill(antenna);g2.draw(antenna);
        }
        if (dayNight==false)
        {
            int r=0,g=0,b=255;
            int num = gen.nextInt(2);
            if (num==0){r=0;g=0;}
            if (num==1){r=255;g=255;}
            Color color = new Color(r,g,b);
            g2.setColor(color);g2.fill(antennaBack);g2.draw(antennaBack);
            g2.setColor(Color.WHITE);g2.fill(antenna);g2.draw(antenna);
        }
    }
}

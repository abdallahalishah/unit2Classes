import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * Class that creates images and draws them to each building.
 * 
 * @author Abdallah Alishah
 * @version 5 October 2014
 */
public class Images
{
    // the x coordinate for where the building is being placed
    private int width;
    
    // the height of the frame
    private int height;
    
    // checks if it is day or night
    private boolean dayNight;
    
    /**
     * Constructor for objects of class Images
     * 
     * @param   x   gets the width of frame
     * @param   y   gets the height of frame
     * @param   check   gets whether it is day or night
     */
    public Images(int x, int y, boolean check)
    {
        this.width = x;
        this.height = y;
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
        Image img1 = Toolkit.getDefaultToolkit().getImage("comsciteacher.png");
        Image img2 = Toolkit.getDefaultToolkit().getImage("Moon.png");
        Image img3 = Toolkit.getDefaultToolkit().getImage("sun.png");
        Image img4 = Toolkit.getDefaultToolkit().getImage("coke.png");
        Image img5 = Toolkit.getDefaultToolkit().getImage("xbox.png");
        Image img6 = Toolkit.getDefaultToolkit().getImage("playstation.png");
        Image img7 = Toolkit.getDefaultToolkit().getImage("apple.png");
        Image img8 = Toolkit.getDefaultToolkit().getImage("microsoft.png");
        Image img9 = Toolkit.getDefaultToolkit().getImage("atat.png");
        Image img10 = Toolkit.getDefaultToolkit().getImage("ver.png");
        Image img11 = Toolkit.getDefaultToolkit().getImage("reebok.png");
        
        g2.drawImage(img1, this.width-160, this.height-413, null);
        if (dayNight==true){g2.drawImage(img2, this.width-120, -120, null);}
        if (dayNight==false){g2.drawImage(img3, this.width-175, -175, null);}
        g2.drawImage(img4, 80, this.height-250, null);
        g2.drawImage(img5, 152+20+80, this.height-250, null);
        g2.drawImage(img6, 152*2+20*2+80, this.height-250, null);
        g2.drawImage(img7, 152*3+20*3+80, this.height-250, null);
        g2.drawImage(img8, 152*4+20*4+80, this.height-250, null);
        g2.drawImage(img9, 152*5+20*5+80, this.height-250, null);
        g2.drawImage(img10, 152*6+20*6+80, this.height-250, null);
        g2.drawImage(img11, 152*7+20*7+80, this.height-250, null);
    }
}

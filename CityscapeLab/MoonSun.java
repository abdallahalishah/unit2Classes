import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.GradientPaint;

public class MoonSun
{
    // the width of the frame
    private int width;
    
    // the height of the frame
    private int height;
    
    // checks if it is day or night
    private boolean dayNight;
    
    /**
     * Constructor for objects of class MoonSun
     * 
     * @param   x   gets the x coordinate of main building part
     * @param   y   gets the height of frame
     * @param   check   gets whether it is day or night
     */
    public MoonSun(int x, int y, boolean check)
    {
        this.height = y;
        this.width = x;
        this.dayNight = check;
    }

    
    /**
     * Method to create and draw everything for every instance created from this class
     * 
     * @param   g2      variable from the Graphics2D class which is used to draw everything to the frame
     */
    public void draw(Graphics2D g2)
    {
        /* creates objects for the main body of the sun/moon */
        Ellipse2D.Double back = new Ellipse2D.Double(this.width-122,-122,244,244);
        Ellipse2D.Double mainC = new Ellipse2D.Double(this.width-120,-120,240,240);
        
        /* creates variables to make it easier to access parts of the sun/moon */
        int mainCX = (int)(mainC.getX());
        int mainCY = (int)(mainC.getY());
        int mainCW = (int)(mainC.getWidth());
        int mainCH = (int)(mainC.getHeight());
        
        
        //---------------------------------------------------------------------------------------------
        /* x and y coordinates for all the random details of the moon */
        int c1X[] = {mainCX+20,mainCX+17,mainCX+23,mainCX+28,mainCX+35,mainCX+36,mainCX+37,mainCX+38,
            mainCX+45,mainCX+50,mainCX+55,mainCX+59,mainCX+53,mainCX+54,mainCX+60,mainCX+70};
        int c1Y[] = {0,5,10,15,16,20,25,30,32,29,28,27,20,17,10,mainCY};
        int c2X[] = {mainCX+100,mainCX+97,mainCX+103,mainCX+108,mainCX+115,mainCX+116,mainCX+117,
            mainCX+118,mainCX+125,mainCX+130,mainCX+135,mainCX+139,mainCX+133,mainCX+134,mainCX+150,
            mainCX+150};
        int c2Y[] = {0,5,10,15,16,20,25,30,32,29,28,27,20,17,10,mainCY};
        int c3X[] = {mainCX+100,mainCX+97,mainCX+103,mainCX+108,mainCX+115,mainCX+116,mainCX+117,
            mainCX+118,mainCX+125,mainCX+130,mainCX+135,mainCX+139,mainCX+133,mainCX+134,mainCX+150,
            mainCX+150};
        int c3Y[] = {70,75,80,85,86,90,95,100,102,109,98,97,90,87,80,mainCY};
        int c4X[] = {mainCX+50,mainCX+46,mainCX+45,mainCX+46,mainCX+49,mainCX+58,mainCX+66,mainCX+72,
            mainCX+75,mainCX+78,mainCX+81,mainCX+79};
        int c4Y[] = {60,65,70,75,83,86,73,70,66,64,59,55};
        //---------------------------------------------------------------------------------------------
        
        
        /* creates objects for the random details of the moon */
        Polygon c1 = new Polygon(c1X,c1Y,c1X.length);
        Polygon c2 = new Polygon(c2X,c2Y,c1X.length);
        Polygon c3 = new Polygon(c3X,c3Y,c3X.length);
        Polygon c4 = new Polygon(c4X,c4Y,c4X.length);
        
        /* draws the sun or moon depending on whether it is day or night */
        g2.setColor(Color.BLACK);g2.fill(back);g2.draw(back);
        if (dayNight==true)
        {
            Color mainColor = new Color(128,128,128);
            GradientPaint grad = new GradientPaint(mainCX-mainCW*5,0-mainCW*6,Color.BLACK,
                                                   this.width+mainCX,-1*mainCW,mainColor);
            g2.setPaint(grad);g2.fill(mainC);g2.draw(mainC);
        }
        if (dayNight==false)
        {
            GradientPaint grad = new GradientPaint(mainCX-mainCW*5,0-mainCW*6,Color.YELLOW,
                                                   this.width+mainCX,-1*mainCW,Color.YELLOW);
            g2.setPaint(grad);g2.fill(mainC);g2.draw(mainC);
        }
        
        Color gray = new Color(90,90,90);
        if (dayNight==true)
        {
            g2.setColor(gray);
        }
        if (dayNight==false)
        {
            g2.setColor(Color.YELLOW);
        }
        g2.fill(c1);g2.draw(c1);
        g2.fill(c2);g2.draw(c2);
        g2.fill(c3);g2.draw(c3);
        g2.fill(c4);g2.draw(c4);
    }
}

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Sky
{
    private int width;
    private int height;
    
    public Sky(int x, int y)
    {
        this.height = y;
        this.width = x;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle mainSky = new Rectangle(0,0,this.width,this.height);
        
        Color skyBlue = new Color(0,33,110);
        g2.setColor(skyBlue);
        g2.fill(mainSky);
        g2.draw(mainSky);
    }
}

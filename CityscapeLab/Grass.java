import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Grass
{
    private int width;
    private int height;
    
    public Grass(int x, int y)
    {
        this.height = y;
        this.width = x;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle black = new Rectangle(0, this.height-452, this.width, 1000);
        Rectangle backGrass = new Rectangle(0, this.height-450, this.width, 1000);       
        
        g2.setColor(Color.BLACK);
        g2.fill(black);
        g2.draw(black);
        
        Color green = new Color(0,120,22);
        g2.setColor(green);
        g2.fill(backGrass);
        g2.draw(backGrass);
    }
}

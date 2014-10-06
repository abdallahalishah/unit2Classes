import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Target
{
    private int x;
    private int y;
    
    public Target(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics2D g2)
    {
        //Ellipse2D.Double c1 = new Ellipse2D.Double(this.x - 50, this.y - 50, 100, 100);
        //         Ellipse2D.Double c2 = new Ellipse2D.Double(this.x - 40, this.y - 40, 80, 80);
        //         Ellipse2D.Double c3 = new Ellipse2D.Double(this.x - 30, this.y - 30, 60, 60);
        //         Ellipse2D.Double c4 = new Ellipse2D.Double(this.x - 20, this.y - 20, 40, 40);
        //         Ellipse2D.Double c5 = new Ellipse2D.Double(this.x - 10, this.y - 10, 20, 20);
        
        Random gen = new Random();
        int num1 = gen.nextInt(500)+100;
        
        
        //         Ellipse2D.Double c1 = new Ellipse2D.Double(this.x , this.y , this.x, this.y);
        //         Ellipse2D.Double c2 = new Ellipse2D.Double(this.x, this.y , this.x-20, this.y-20);
        //         Ellipse2D.Double c3 = new Ellipse2D.Double(this.x , this.y , this.x-40, this.y-40);
        //         Ellipse2D.Double c4 = new Ellipse2D.Double(this.x , this.y , this.x-60, this.y-60);
        //         Ellipse2D.Double c5 = new Ellipse2D.Double(this.x , this.y , this.x-80, this.y-80);
        int num2 = num1/2;        
        int num3 = num2/5;
        int num4 = num1/5;
        
        Ellipse2D.Double c1 = new Ellipse2D.Double(this.x - num2, this.y - num2, num1, num1);
        Ellipse2D.Double c2 = new Ellipse2D.Double(this.x - num3*4, this.y - num3*4, num4*4, num4*4);
        Ellipse2D.Double c3 = new Ellipse2D.Double(this.x - num3*3, this.y - num3*3, num4*3, num4*3);
        Ellipse2D.Double c4 = new Ellipse2D.Double(this.x - num3*2, this.y - num3*2, num4*2, num4*2);
        Ellipse2D.Double c5 = new Ellipse2D.Double(this.x - num3, this.y - num3, num4, num4);
        
        int r = gen.nextInt(255);
        int g = gen.nextInt(255);
        int b = gen.nextInt(255);
        
        Color col1 = new Color(r, g, b);
        
        g2.setColor(col1);
        g2.fill(c1);
        g2.draw(c1);
        
        r = gen.nextInt(255);
        g = gen.nextInt(255);
        b = gen.nextInt(255);
        
        Color col2 = new Color(r, g, b);        
        
        g2.setColor(col2);
        g2.fill(c2);
        g2.draw(c2);
        
        r = gen.nextInt(255);
        g = gen.nextInt(255);
        b = gen.nextInt(255);
        
        Color col3 = new Color(r, g, b);    
        
        g2.setColor(col3);
        g2.fill(c3);
        g2.draw(c3);
        
        r = gen.nextInt(255);
        g = gen.nextInt(255);
        b = gen.nextInt(255);
        
        Color col4 = new Color(r, g, b);  
        
        g2.setColor(col4);
        g2.fill(c4);
        g2.draw(c4);
        
        r = gen.nextInt(255);
        g = gen.nextInt(255);
        b = gen.nextInt(255);
        
        Color col5 = new Color(r, g, b);  
        
        g2.setColor(col5);
        g2.fill(c5);
        g2.draw(c5);
        
    }
}
        
        
        
        
        
        
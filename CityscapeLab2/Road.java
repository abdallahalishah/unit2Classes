import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Road
{
    private int width;
    private int height;
    
    public Road(int x, int y)
    {
        this.height = y;
        this.width = x;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(0, this.height-175, this.width, 200);
        Rectangle curb = new Rectangle(0,(int)(road.getY()), this.width,15);
        Rectangle curbBack = new Rectangle(0, (int)(curb.getY())-2, this.width, 2);
        int num = (int)((this.height-road.getY())/2);
        int dashY = this.height-num-5;
        Rectangle dash1 = new Rectangle(0,dashY,35,10);
        int distance = 140;
        Rectangle dash2 = new Rectangle(distance,dashY,35,10);
        Rectangle dash3 = new Rectangle(distance*2,dashY,35,10);
        Rectangle dash4 = new Rectangle(distance*3,dashY,35,10);
        Rectangle dash5 = new Rectangle(distance*4,dashY,35,10);
        Rectangle dash6 = new Rectangle(distance*5,dashY,35,10);
        Rectangle dash7 = new Rectangle(distance*6,dashY,35,10);
        Rectangle dash8 = new Rectangle(distance*7,dashY,35,10);
        Rectangle dash9 = new Rectangle(distance*8,dashY,35,10);
        Rectangle dash10 = new Rectangle(distance*9,dashY,35,10);
        Rectangle dash11 = new Rectangle(distance*10,dashY,35,10);
        Rectangle dash12 = new Rectangle(distance*11,dashY,35,10);
        Rectangle dash13 = new Rectangle(distance*12,dashY,35,10);
        Rectangle dash14 = new Rectangle(distance*13,dashY,35,10);
        Rectangle dash15 = new Rectangle(distance*14,dashY,35,10);
        
        
        Color lightGray = new Color(150,150,150);
        g2.setColor(Color.BLACK);g2.fill(road);g2.draw(road);
        
        g2.fill(curbBack);g2.draw(curbBack);
        g2.setColor(lightGray);g2.fill(curb);g2.draw(curb);
        
        g2.setColor(Color.YELLOW/*all dashes color*/);g2.fill(dash1);g2.draw(dash1);
        g2.fill(dash2);g2.draw(dash2);g2.fill(dash3);g2.draw(dash3);
        g2.fill(dash4);g2.draw(dash4);g2.fill(dash5);g2.draw(dash5);
        g2.fill(dash6);g2.draw(dash6);g2.fill(dash7);g2.draw(dash7);
        g2.fill(dash8);g2.draw(dash8);g2.fill(dash9);g2.draw(dash9);
        g2.fill(dash10);g2.draw(dash10);g2.fill(dash11);g2.draw(dash11);
        g2.fill(dash12);g2.draw(dash12);g2.fill(dash13);g2.draw(dash13);
        g2.fill(dash14);g2.draw(dash14);g2.fill(dash15);g2.draw(dash15);
    }
}

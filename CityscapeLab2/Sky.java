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
        //Rectangle star1 = new Rectangle(50,10,1,1);
        Random gen = new Random();
        int randW = gen.nextInt(width);
        int randH = gen.nextInt(height);
        
        Color skyBlue = new Color(0,33,110);
        g2.setColor(skyBlue);g2.fill(mainSky);g2.draw(mainSky);
                
        g2.setColor(Color.WHITE);
        
        for (int i=1;i<800;i++){
        Rectangle star1 = new Rectangle(randW,randH,1,1);
        randW = gen.nextInt(width);
        randH = gen.nextInt(height);
        g2.fill(star1);g2.draw(star1);}
        
    }
}

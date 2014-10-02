import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;
import java.util.Random;

public class Car2
{
    private int width;
    private int height;
    
    public Car2(int x, int y)
    {
        this.width = x;
        this.height = y;
    }
    
    public void draw(Graphics2D g2)
    {
        
        Random gen = new Random();
        int num = gen.nextInt(this.width);
            
        Rectangle body = new Rectangle(num,this.height-135,80,20);
        int bodyX = (int)(body.getX());
        int bodyY = (int)(body.getY());
        int bodyW = (int)(body.getWidth());
        int bodyH = (int)(body.getHeight());
        int xPoly[] = {bodyX+bodyW/3,bodyX+(bodyW/6),bodyX+(bodyW/6)*5,bodyX+(bodyW/3)*2};
        int yPoly[] = {bodyY-15,bodyY,bodyY,bodyY-15};
        Polygon carTop = new Polygon(xPoly, yPoly, 4);
        int frontXPoly[] = {bodyX,bodyX,bodyX-30};
        int frontYPoly[] = {bodyY,bodyY+bodyH,bodyY+bodyH};
        Polygon carFront = new Polygon(frontXPoly,frontYPoly,3);
        int backXPoly[] = {bodyX+bodyW,bodyX+bodyW,bodyX+bodyW+10};
        int backYPoly[] = {bodyY,bodyY+bodyH,bodyY+bodyH};
        Polygon carBack = new Polygon(backXPoly,backYPoly,3);
        Ellipse2D.Double leftTire = new Ellipse2D.Double(bodyX+(bodyW/4)-7,bodyY+bodyH,14,14);
        Ellipse2D.Double rightTire = new Ellipse2D.Double(bodyX+(bodyW/4)*3-7,bodyY+bodyH,14,14);
        
        g2.setColor(Color.BLUE);g2.fill(body);g2.draw(body);
        g2.fill(carTop);g2.draw(carTop);
        g2.fill(carFront);g2.draw(carFront);
        g2.fill(carBack);g2.draw(carBack);
        Color gray = new Color(50,50,50);
        g2.setColor(gray);g2.fill(leftTire);g2.draw(leftTire);
        g2.setColor(gray);g2.fill(rightTire);g2.draw(rightTire);
        
    }
}
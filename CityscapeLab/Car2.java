import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Polygon;
import java.util.Random;

public class Car2
{
    /* gets the width of the frame */
    private int width;
    
    /* gets the height of the frame */
    private int height;
    
    /**
     * Constructor for objects of class Car2
     * 
     * @param   x   gets the x coordinate of main building part
     * @param   y   gets the height of frame
     */
    public Car2(int x, int y)
    {
        this.width = x;
        this.height = y;
    }
    
    /**
     * Method to create and draw everything for every instance created from this class
     * 
     * @param   g2          variable from the Graphics2D class which is used to draw everything to the frame
     * @param   num         the x coordinate of where the car is drawn
     * @param   numColor    the color to check what the car's color is
     */
    public void draw(Graphics2D g2,int num, int numColor)
    {
        /* main body for the car */
        Rectangle body = new Rectangle(this.width-num,this.height-135,80,20);
        
        /* creates variables to make it easier to access parts of the main body of the car */
        int bodyX = (int)(body.getX());
        int bodyY = (int)(body.getY());
        int bodyW = (int)(body.getWidth());
        int bodyH = (int)(body.getHeight());
        
        /* the x and y coordinates for top of the car */
        int xPoly[] = {bodyX+bodyW/3,bodyX+(bodyW/6),bodyX+(bodyW/6)*5,bodyX+(bodyW/3)*2};
        int yPoly[] = {bodyY-15,bodyY,bodyY,bodyY-15};        
        
        /* the x and y coordinates for front of the car */
        int frontXPoly[] = {bodyX,bodyX,bodyX-30};
        int frontYPoly[] = {bodyY,bodyY+bodyH,bodyY+bodyH};
        
        /* the x and y coordinates for back of the car */
        int backXPoly[] = {bodyX+bodyW,bodyX+bodyW,bodyX+bodyW+10};
        int backYPoly[] = {bodyY,bodyY+bodyH,bodyY+bodyH};
        
        /* the x and y coordinates for the window of the car */
        int topWinX[] = {bodyX+bodyW/3+3,bodyX+(bodyW/6+6),bodyX+(bodyW/6)*5-6,bodyX+(bodyW/3)*2-3};
        int topWinY[] = {bodyY-13,bodyY-3,bodyY-3,bodyY-13};
        
        /* the x and y coordinates for the exhaust */
        int exhaustX[] = {bodyX+bodyW-5,bodyX+bodyW+5,bodyX+bodyW+15,bodyX+bodyW};
        int exhaustY[] = {bodyY,bodyY+10,bodyY+10,bodyY};
        
        /* creates the tire objects */
        Ellipse2D.Double leftTire = new Ellipse2D.Double(bodyX+(bodyW/4)-7,bodyY+bodyH,14,14);
        Ellipse2D.Double rightTire = new Ellipse2D.Double(bodyX+(bodyW/4)*3-7,bodyY+bodyH,14,14);
        
        /* creates all the polygons for all the parts of the cars */
        Polygon carTop = new Polygon(xPoly, yPoly, 4);
        Polygon carFront = new Polygon(frontXPoly,frontYPoly,3);
        Polygon carBack = new Polygon(backXPoly,backYPoly,3);
        Polygon carTopWin = new Polygon(topWinX,topWinY,topWinX.length);
        Polygon exhaust = new Polygon(exhaustX,exhaustY,exhaustX.length);
        
        /* creates the detail of the front of the car */
        Point2D.Double frontTop = new Point2D.Double(bodyX+5,bodyY);
        Point2D.Double frontBottom = new Point2D.Double(bodyX-5,bodyY+bodyH);
        Line2D.Double front = new Line2D.Double(frontTop,frontBottom);
        
        /* creates an object for detail on the car */
        Point2D.Double pt1 = new Point2D.Double(bodyX+bodyW/6,bodyY+0);
        Point2D.Double pt2 = new Point2D.Double(bodyX+(bodyW/6)*5,bodyY+0);
        Line2D.Double line = new Line2D.Double(pt1,pt2);
        
        /* creates the objects to draw through the middle of the car */
        Rectangle midCut = new Rectangle(bodyX+(bodyW/2-2),bodyY-15,4,14);
        Rectangle midCut2 = new Rectangle(bodyX+bodyW/2-1,bodyY,2,bodyH);
        
        /* draws each part of the body depending on the parameter passed which determines the color */
        if (numColor==0){g2.setColor(Color.BLUE);g2.fill(body);g2.draw(body);}
        if (numColor==1){g2.setColor(Color.YELLOW);g2.fill(body);g2.draw(body);}
        if (numColor==2){g2.setColor(Color.GREEN);g2.fill(body);g2.draw(body);}
        if (numColor==3){g2.setColor(Color.RED);g2.fill(body);g2.draw(body);}
        g2.fill(carTop);g2.draw(carTop);
        g2.fill(carFront);g2.draw(carFront);
        g2.fill(carBack);g2.draw(carBack);
        
        /* draws the rest of the parts of the car */
        g2.setColor(Color.BLACK);g2.fill(carTopWin);g2.draw(carTopWin);
        g2.draw(front);g2.draw(line);
        if (numColor==0){g2.setColor(Color.BLUE);g2.fill(midCut);g2.draw(midCut);}
        if (numColor==1){g2.setColor(Color.YELLOW);g2.fill(midCut);g2.draw(midCut);}
        if (numColor==2){g2.setColor(Color.GREEN);g2.fill(midCut);g2.draw(midCut);}
        if (numColor==3){g2.setColor(Color.RED);g2.fill(midCut);g2.draw(midCut);}
        g2.setColor(Color.YELLOW);g2.fill(exhaust);g2.draw(exhaust);
        g2.setColor(Color.BLACK);g2.fill(midCut2);g2.draw(midCut2);
        Color gray = new Color(50,50,50);
        g2.setColor(gray);g2.fill(leftTire);g2.draw(leftTire);
        g2.setColor(gray);g2.fill(rightTire);g2.draw(rightTire);
    }
}
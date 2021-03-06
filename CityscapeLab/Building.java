import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Class that creates a building with certain specifications.
 * 
 * @author Abdallah Alishah
 * @version 5 October 2014
 */
public class Building
{
    // the x and y coordinate for where the building is being placed
    private int xPlace,yPlace;
    
    // the height of the frame
    private int height;
    
    // checks if it is day or night
    private boolean dayNight;
    
    // the height of the building
    private int buildH;
    
    // 1st 3 are daytime r,g,b values and the last 3 are for the night
    private int rD,gD,bD,rN,gN,bN;
    
    // number of windows 
    private int winNum;
    
    /**
     * Constructor for objects of class Building2
     * 
     * @param   x           the x coordinate of main building part
     * @param   y           the height of frame
     * @param   yPlace      the y coordinate of main building part
     * @param   mainH       the main building height
     * @param   rN          the r value from (r,g,b) during the night
     * @param   gN          the g value from (r,g,b) during the night
     * @param   bN          the b value from (r,g,b) during the night
     * @param   rD          the r value from (r,g,b) during the day
     * @param   gD          the g value from (r,g,b) during the day
     * @param   bD          the b value from (r,g,b) during the day
     * @param   check       whether it is day or night
     */
    public Building(int x, int h, int yPlace, int mainH, int rN, int gN,
    int bN, int rD, int gD, int bD, boolean check, int win)
    {
        this.height = h;
        this.xPlace = x;
        this.dayNight = check;
        this.yPlace = yPlace;
        this.buildH = mainH;
        this.rD = rD;
        this.rN = rN;
        this.gD = gD;
        this.gN = gN;
        this.bD = bD;
        this.bN = bN;
        this.winNum = win;
    }

    /**
     * Method to create and draw everything for every instance created from this class
     * 
     * @param   g2      variable from the Graphics2D class which is used to draw everything to the frame
     * 
     */
    public void draw(Graphics2D g2)
    {
        /* creates the outline and main building object */
        Rectangle back1 = new Rectangle(this.xPlace, this.yPlace, 152, this.buildH+4);
        Rectangle main1 = new Rectangle((int)(back1.getX())+ 2,this.yPlace+2, 148, this.buildH);
        
        /* creates variables to make it easier to access parts of the main building*/
        int main1X = (int)(main1.getX());
        int main1Y = (int)(main1.getY());
        int main1Height = (int)(main1.getHeight());
        int main1Width = (int)(main1.getWidth());
        
        /* makes the door object with outline */
        Rectangle doorBack = new Rectangle(main1X+(main1Width/4-20),main1Y+main1Height-60,40,60);
        Rectangle door = new Rectangle((int)(doorBack.getX())+2,(int)(doorBack.getY())+2,36,58);
        /* creates variables to make it easier to acces parts of the door */
        int doorH = (int)(door.getHeight());
        int doorW = (int)(door.getWidth());
        int doorX = (int)(door.getX());
        int doorY = (int)(door.getY());
        Ellipse2D.Double knob = new Ellipse2D.Double(doorX+(doorW-8),doorY+doorH/2,4,4);// doorknob
        
        /* creates variables to have a specified x coordinate for every row of windows */
        int win1X = main1X+5;
        int win2X = main1X+5*2+31;
        int win3X = main1X+5*3+31*2;
        int win4X = main1X+5*4+31*3;
        int size = 31,xCoor=0,yCoor=main1Y+5,count=0;
        
        /* changes the color of the building depending on whether it is day or night and draws it */
        g2.setColor(Color.BLACK);g2.fill(back1);g2.draw(back1);
        if (dayNight==true)
        {
            Color gray = new Color(this.rN,this.gN,this.bN);
            g2.setColor(gray);g2.fill(main1);g2.draw(main1);
        }
        
        if (dayNight==false)
        {
            Color gray = new Color(this.rD,this.gD,this.bD);
            g2.setColor(gray);g2.fill(main1);g2.draw(main1);
        }
        
        /* draws door, door outline, and doorknob */
        Color doorGray = new Color(92,92,92);
        g2.setColor(Color.BLACK);g2.fill(doorBack);g2.draw(doorBack);
        g2.setColor(doorGray);g2.fill(door);g2.draw(door);
        g2.setColor(Color.BLACK);g2.fill(knob);g2.draw(knob);
        
        /* uses a loop to specify amount of windows created using the window class */
        for (int i=0;i<this.winNum;i++)
        {
            count += 1;
            if (count==1){xCoor=win1X;}
            if (count==2){xCoor=win2X;}
            if (count==3){xCoor=win3X;}
            if (count==4){xCoor=win4X;}
            if (count==5){count=0;yCoor+=36;}
            Window win = new Window(xCoor,yCoor,size,dayNight);
            win.draw(g2);
        }
    }
}

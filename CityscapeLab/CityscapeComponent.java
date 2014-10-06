import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Abdallah Alishah
 * @version 5 October 2014
 */
public class CityscapeComponent extends JComponent
{
    //keeps track of where the cars are on the screen using the x coordinate
    private int count = 0;
    
    //the largest x and y in the frame
    private int x,y;
    
    //if this number is divisible by 2 then it is night
    private int running=1;
    
    //used for car objects to give them a random color
    private int color=0;
    
    //this boolean is to show whether or not it is day time or night time
    private boolean bool;
    /**
     * Gets a number so everytime the frame changes the car objects can move a specified amount of pixels
     *
     * 
     * @param    num    used to set the private variable, count, to this parameter for the car object
     */
    public void counter(int num)
    {
        this.count = num;
    }
    
    /**
     * This method is the main method used to create and draw objects
     *
     * 
     * @param    g    a parameter from the Graphics class that draws everything to the frame
     * 
     */
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        this.x = getWidth();
        this.y = getHeight();
        
        // create instances of classes 
        // 10: the space between the beginning and the first building
        // 152: the width of each building
        // 20: space between each building
        Building1 build1 = new Building1(10+152*2+20*2, y, bool);//position 3
        Building2 build2 = new Building2(10+20*7+152*7, y, bool);//position 8
        Building3 build3 = new Building3(10+20*3+152*3, y, bool);//position 4
        Building4 build4 = new Building4(10+152+20, y, bool);//placed at position 2
        Building5 build5 = new Building5(10, y, bool);//position 1
        Building6 build6 = new Building6(10+152*6+20*6, y, bool);//position 7
        Building7 build7 = new Building7(10+152*4+20*4, y, bool);//position 5
        Building8 build8 = new Building8(10+152*5+20*5, y, bool);//position 6
        Building9 build9 = new Building9(10+152*8+20*8, y, bool);//position 9
        Car1 car1 = new Car1(x, y);
        Car2 car2 = new Car2(x, y);
        Road road = new Road(x, y);
        Grass grass = new Grass(x, y, bool);
        Sky sky = new Sky(x, y, bool);
        MoonSun moon = new MoonSun(x, y, bool);
        Images img = new Images(x, y, bool);
        
        // use the draw method to draw all the instances
        sky.draw(g2);
        grass.draw(g2);
        road.draw(g2);
        build1.draw(g2);        
        build2.draw(g2);
        build3.draw(g2);
        build4.draw(g2);
        build5.draw(g2);
        build6.draw(g2);
        build7.draw(g2);
        build8.draw(g2);
        build9.draw(g2);
        car1.draw(g2,this.count,color);
        car2.draw(g2,this.count,color);
        img.draw(g2);
    }
    
    /**
     * Gets a number so everytime the frame changes the car objects can move a specified amount of pixels
     *
     * 
     * @param   check    used to set the variable, bool, to either true or false 
     */
    public void giveNum(int check)
    {
        this.running += check;
        int checkNum = this.running%2;
        if (checkNum==0){this.bool=true;}
        if (checkNum!=0){this.bool=false;}
    }
    
    /**
     * Makes the color variable a random value 0 - 3 to change the main color of the car object depending on the number
     *
     */
    public void color()
    {
        Random gen = new Random();
        this.color = gen.nextInt(4);
    }
}

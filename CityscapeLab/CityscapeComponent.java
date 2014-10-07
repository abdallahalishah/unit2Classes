import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Abdallah Alishah
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
        // added 172 (1st parameter) to each new building to draw them equally apart
        // (2nd parameter) subtracted certain amount for each building y coordinate
        // (3rd parameter) subtract 204 from number in second parameter for building height
        // (4th-6th parameter) night time r,g,b colors
        // (7th-9th parameter) day time r,g,b colors
        Building build1 = new Building(10,this.y,this.y-384,180,0,15,0,0,75,0,this.bool,14);
        Building build2 = new Building(182,this.y,this.y-564,360,11,8,12,111,48,52,this.bool,38);
        Building build3 = new Building(354,this.y,this.y-600,396,15,25,15,45,65,55,this.bool,44);
        Building build4 = new Building(526,this.y,this.y-708,504,0,0,20,0,0,70,this.bool,58);
        Building build5 = new Building(698,this.y,this.y-708,504,0,20,20,0,100,100,this.bool,58);
        Building build6 = new Building(870,this.y,this.y-600,396,15,25,15,45,65,55,this.bool,44);
        Building build7 = new Building(1042,this.y,this.y-528,324,0,0,20,0,0,80,this.bool,33);
        Building build8 = new Building(1214,this.y,this.y-492,288,30,0,0,70,0,0,this.bool,28);
        Building build9 = new Building(1386,this.y,this.y-420,216,0,0,20,0,0,70,this.bool,0);
        
        Antenna ant1 = new Antenna(566,67,4,198,this.bool);
        Antenna ant2 = new Antenna(810,67,4,198,this.bool);
        
        Car1 car1 = new Car1(this.y);
        Car2 car2 = new Car2(this.x,this.y);
        
        Road road = new Road(this.x,this.y);
        Grass grass = new Grass(this.x,this.y,this.bool);
        Sky sky = new Sky(this.x,this.y,this.bool);
        Images img = new Images(this.x,this.y,this.bool);
        
        // use the draw method to draw all the instances
        sky.draw(g2);
        grass.draw(g2);
        road.draw(g2);
        ant1.draw(g2);
        ant2.draw(g2);
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

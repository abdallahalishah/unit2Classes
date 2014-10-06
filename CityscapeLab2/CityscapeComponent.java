import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int y = getHeight();
        // create instances of classes and invoke the draw method on each
        // ...
        Building1 build1 = new Building1(x, y);
        Building2 build2 = new Building2(x, y);
        Building3 build3 = new Building3(x, y);
        Building4 build4 = new Building4(x, y);
        Building5 build5 = new Building5(x, y);
        Building6 build6 = new Building6(x, y);
        Car1 car1 = new Car1(x, y);
        Car2 car2 = new Car2(x, y);
        Road road = new Road(x, y);
        Grass grass = new Grass(x, y);
        Sky sky = new Sky(x, y);
        
        sky.draw(g2);
        grass.draw(g2);
        road.draw(g2);
        build1.draw(g2);        
        build2.draw(g2);
        build3.draw(g2);
        build4.draw(g2);
        build5.draw(g2);
        build6.draw(g2);
        car1.draw(g2);
        car2.draw(g2);
    }

}

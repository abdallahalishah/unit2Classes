import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Abdallah Alishah
 * @version 5 October 2014
 */
public class CityscapeViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args)
            throws InterruptedException
    //throws Exception
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        int num = 0, runTotal = 0;
        frame.setSize(1560 /* x */, 1000 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // loops the repaint method to create the illusion of animation
        while (true)
        {
            component.repaint();
            Thread.sleep(10);
            
            // adds a number to the x coordinate of the car object
            num += 50;
            runTotal += 1;
            
            // uses remainder to check whether the it is night or day
            int remain = runTotal%300;
            if (remain==0){component.giveNum(1);}
            
            component.counter(num);
            
            // restarts the value of num to redraw the car objects from the beginning
            if (num>2650){num=0;component.color();}
        }
    }

}

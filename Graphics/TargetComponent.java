import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = (getWidth()/2);
        int y = (getHeight()/2);
        
        Target target = new Target(x, y);
        target.draw(g2);
    }
}

        
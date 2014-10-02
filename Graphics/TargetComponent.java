import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int y = getHeight();
        
        Target target = new Target(x/2, y/2);
        target.draw(g2);
    }
}

        
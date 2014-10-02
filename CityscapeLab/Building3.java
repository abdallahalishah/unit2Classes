import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class Building3
{
    private int width;
    private int height;
    
    public Building3(int x, int y)
    {
        this.height = y;
        this.width = x;
    }

    
    public void draw(Graphics2D g2)
    {
        Rectangle back1 = new Rectangle(10+152+20+152+20, this.height-(600+31+31+31+5+5+5), 152, 400+31*3+5*3);
        Rectangle main1 = new Rectangle((int)(back1.getX())+ 2,this.height-(598+31*3+5*3), 148, 396+31*3+5*3);
        
        int main1X = (int)(main1.getX());
        int main1Y = (int)(main1.getY());
        int main1Height = (int)(main1.getHeight());
        int main1Width = (int)(main1.getWidth());
        
        Rectangle doorBack = new Rectangle(main1X+(main1Width/4-20),main1Y+main1Height-60,41,60);
        Rectangle door = new Rectangle((int)(doorBack.getX())+3,(int)(doorBack.getY())+2,36,58);
        int doorH = (int)(door.getHeight());
        int doorW = (int)(door.getWidth());
        int doorX = (int)(door.getX());
        int doorY = (int)(door.getY());
        Ellipse2D.Double knob = new Ellipse2D.Double(doorX+(doorW-8),doorY+doorH/2,4,4);
        
        /* WINDOWS!! */
        Random gen = new Random();
        int win1X = main1X+5;
        int win2X = main1X+5*2+31;
        int win3X = main1X+5*3+31*2;
        int win4X = main1X+5*4+31*3;
        int size = 31;
        Rectangle win1 = new Rectangle(win1X,main1Y+5,size,size);
        Rectangle win2 = new Rectangle(win2X,main1Y+5,size,size);
        Rectangle win3 = new Rectangle(win3X,main1Y+5,size,size);
        Rectangle win4 = new Rectangle(win4X,main1Y+5,size,size);
        Rectangle win5 = new Rectangle(win1X,main1Y+5+36,size,size);
        Rectangle win6 = new Rectangle(win2X,main1Y+5+36,size,size);
        Rectangle win7 = new Rectangle(win3X,main1Y+5+36,size,size);
        Rectangle win8 = new Rectangle(win4X,main1Y+5+36,size,size);
        Rectangle win9 = new Rectangle(win1X,main1Y+5+36*2,size,size);
        Rectangle win10 = new Rectangle(win2X,main1Y+5+36*2,size,size);
        Rectangle win11 = new Rectangle(win3X,main1Y+5+36*2,size,size);
        Rectangle win12 = new Rectangle(win4X,main1Y+5+36*2,size,size);
        Rectangle win13 = new Rectangle(win1X,main1Y+5+36*3,size,size);
        Rectangle win14 = new Rectangle(win2X,main1Y+5+36*3,size,size);
        Rectangle win15 = new Rectangle(win3X,main1Y+5+36*3,size,size);
        Rectangle win16 = new Rectangle(win4X,main1Y+5+36*3,size,size);
        Rectangle win17 = new Rectangle(win1X,main1Y+5+36*4,size,size);
        Rectangle win18 = new Rectangle(win2X,main1Y+5+36*4,size,size);
        Rectangle win19 = new Rectangle(win3X,main1Y+5+36*4,size,size);
        Rectangle win20 = new Rectangle(win4X,main1Y+5+36*4,size,size);
        Rectangle win21 = new Rectangle(win1X,main1Y+5+36*5,size,size);
        Rectangle win22 = new Rectangle(win2X,main1Y+5+36*5,size,size);
        Rectangle win23 = new Rectangle(win3X,main1Y+5+36*5,size,size);
        Rectangle win24 = new Rectangle(win4X,main1Y+5+36*5,size,size);
        Rectangle win25 = new Rectangle(win1X,main1Y+5+36*6,size,size);
        Rectangle win26 = new Rectangle(win2X,main1Y+5+36*6,size,size);
        Rectangle win27 = new Rectangle(win3X,main1Y+5+36*6,size,size);
        Rectangle win28 = new Rectangle(win4X,main1Y+5+36*6,size,size);
        Rectangle win29 = new Rectangle(win1X,main1Y+5+36*7,size,size);
        Rectangle win30 = new Rectangle(win2X,main1Y+5+36*7,size,size);
        Rectangle win31 = new Rectangle(win3X,main1Y+5+36*7,size,size);
        Rectangle win32 = new Rectangle(win4X,main1Y+5+36*7,size,size);
        Rectangle win33 = new Rectangle(win1X,main1Y+5+36*8,size,size);
        Rectangle win34 = new Rectangle(win2X,main1Y+5+36*8,size,size);
        Rectangle win35 = new Rectangle(win3X,main1Y+5+36*8,size,size);
        Rectangle win36 = new Rectangle(win4X,main1Y+5+36*8,size,size);
        Rectangle win37 = new Rectangle(win1X,main1Y+5+36*9,size,size);
        Rectangle win38 = new Rectangle(win2X,main1Y+5+36*9,size,size);
        Rectangle win39 = new Rectangle(win3X,main1Y+5+36*9,size,size);
        Rectangle win40 = new Rectangle(win4X,main1Y+5+36*9,size,size);
        Rectangle win41 = new Rectangle(win1X,main1Y+5+36*10,size,size);
        Rectangle win42 = new Rectangle(win2X,main1Y+5+36*10,size,size);
        Rectangle win43 = new Rectangle(win3X,main1Y+5+36*10,size,size);
        Rectangle win44 = new Rectangle(win4X,main1Y+5+36*10,size,size);
        Rectangle win45 = new Rectangle(win1X,main1Y+5+36*11,size,size);
        Rectangle win46 = new Rectangle(win2X,main1Y+5+36*11,size,size);
        Rectangle win47 = new Rectangle(win3X,main1Y+5+36*11,size,size);
        Rectangle win48 = new Rectangle(win4X,main1Y+5+36*11,size,size);
        
        Color blue = new Color(0,0,50);
        g2.setColor(Color.BLACK);g2.fill(back1);g2.draw(back1);
        g2.setColor(blue);g2.fill(main1);g2.draw(main1);
       
        Color brown = new Color(74,52,0);
        g2.setColor(Color.BLACK);g2.fill(doorBack);g2.draw(doorBack);
        g2.setColor(brown);g2.fill(door);g2.draw(door);
        g2.setColor(Color.BLACK);g2.fill(knob);g2.draw(knob);
        
        int r=0,g=0,b=0;
        int num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color = new Color(r,g,b);
        g2.setColor(color);g2.fill(win1);g2.draw(win1);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color2 = new Color(r,g,b);
        g2.setColor(color2);g2.fill(win2);g2.draw(win2);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color3 = new Color(r,g,b);
        g2.setColor(color3);g2.fill(win3);g2.draw(win3);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color4 = new Color(r,g,b);
        g2.setColor(color4);g2.fill(win4);g2.draw(win4);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color5 = new Color(r,g,b);
        g2.setColor(color5);g2.fill(win5);g2.draw(win5);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color6 = new Color(r,g,b);
        g2.setColor(color6);g2.fill(win6);g2.draw(win6);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color7 = new Color(r,g,b);
        g2.setColor(color7);g2.fill(win7);g2.draw(win7);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color8 = new Color(r,g,b);
        g2.setColor(color8);g2.fill(win8);g2.draw(win8);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color9 = new Color(r,g,b);
        g2.setColor(color9);g2.fill(win9);g2.draw(win9);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color10 = new Color(r,g,b);
        g2.setColor(color10);g2.fill(win10);g2.draw(win10);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color11 = new Color(r,g,b);
        g2.setColor(color11);g2.fill(win11);g2.draw(win11);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color12 = new Color(r,g,b);
        g2.setColor(color12);g2.fill(win12);g2.draw(win12);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color13 = new Color(r,g,b);
        g2.setColor(color13);g2.fill(win13);g2.draw(win13);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color14 = new Color(r,g,b);
        g2.setColor(color14);g2.fill(win14);g2.draw(win14);
                
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color15 = new Color(r,g,b);
        g2.setColor(color15);g2.fill(win15);g2.draw(win15);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color16 = new Color(r,g,b);
        g2.setColor(color16);g2.fill(win16);g2.draw(win16);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color17 = new Color(r,g,b);
        g2.setColor(color17);g2.fill(win17);g2.draw(win17);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color18 = new Color(r,g,b);
        g2.setColor(color18);g2.fill(win18);g2.draw(win18);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color19 = new Color(r,g,b);
        g2.setColor(color19);g2.fill(win19);g2.draw(win19);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color20 = new Color(r,g,b);
        g2.setColor(color20);g2.fill(win20);g2.draw(win20);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color21 = new Color(r,g,b);
        g2.setColor(color21);g2.fill(win21);g2.draw(win21);
        
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color22 = new Color(r,g,b);
        g2.setColor(color22);g2.fill(win22);g2.draw(win22);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color23 = new Color(r,g,b);
        g2.setColor(color23);g2.fill(win23);g2.draw(win23);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color24 = new Color(r,g,b);
        g2.setColor(color24);g2.fill(win24);g2.draw(win24);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color25 = new Color(r,g,b);
        g2.setColor(color25);g2.fill(win25);g2.draw(win25);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color26 = new Color(r,g,b);
        g2.setColor(color26);g2.fill(win26);g2.draw(win26);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color27 = new Color(r,g,b);
        g2.setColor(color27);g2.fill(win27);g2.draw(win27);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color28 = new Color(r,g,b);
        g2.setColor(color28);g2.fill(win28);g2.draw(win28);
        
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color29 = new Color(r,g,b);
        g2.setColor(color29);g2.fill(win29);g2.draw(win29);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color30 = new Color(r,g,b);
        g2.setColor(color30);g2.fill(win30);g2.draw(win30);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color31 = new Color(r,g,b);
        g2.setColor(color31);g2.fill(win31);g2.draw(win31);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color32 = new Color(r,g,b);
        g2.setColor(color32);g2.fill(win32);g2.draw(win32);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color33 = new Color(r,g,b);
        g2.setColor(color33);g2.fill(win33);g2.draw(win33);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color34 = new Color(r,g,b);
        g2.setColor(color34);g2.fill(win34);g2.draw(win34);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color35 = new Color(r,g,b);
        g2.setColor(color35);g2.fill(win35);g2.draw(win35);
        
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color36 = new Color(r,g,b);
        g2.setColor(color36);g2.fill(win36);g2.draw(win36);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color37 = new Color(r,g,b);
        g2.setColor(color37);g2.fill(win37);g2.draw(win37);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color38 = new Color(r,g,b);
        g2.setColor(color38);g2.fill(win38);g2.draw(win38);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color39 = new Color(r,g,b);
        g2.setColor(color39);g2.fill(win39);g2.draw(win39);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color40 = new Color(r,g,b);
        g2.setColor(color40);g2.fill(win40);g2.draw(win40);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color41 = new Color(r,g,b);
        g2.setColor(color41);g2.fill(win41);g2.draw(win41);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color42 = new Color(r,g,b);
        g2.setColor(color42);g2.fill(win42);g2.draw(win42);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color43 = new Color(r,g,b);
        g2.setColor(color43);g2.fill(win43);g2.draw(win43);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color44 = new Color(r,g,b);
        g2.setColor(color44);g2.fill(win44);g2.draw(win44);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color45 = new Color(r,g,b);
        g2.setColor(color45);g2.fill(win45);g2.draw(win45);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color46 = new Color(r,g,b);
        g2.setColor(color46);g2.fill(win46);g2.draw(win46);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color47 = new Color(r,g,b);
        g2.setColor(color47);g2.fill(win47);g2.draw(win47);
        
        num = gen.nextInt(2);
        if (num==0){r=0;g=0;}
        if (num==1){r=255;g=255;}
        Color color48 = new Color(r,g,b);
        g2.setColor(color48);g2.fill(win48);g2.draw(win48);
       
    }
}

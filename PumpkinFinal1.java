import java.awt.*;
import javax.swing.*;

class Pumkin extends JFrame
   {
   public Pumkin() 
      {
      super("Pumkin");
      setSize(500,500);
      Container con = this.getContentPane();
      con.setBackground(Color.DARK_GRAY);
      setVisible(true);
      }
   public void paint(Graphics g)
      {
      super.paint(g);
      int x0[] = {248,210,285}; 
      int y0[] = {225,300,300};
      g.setColor(Color.orange);
      g.fillRoundRect(20,100,460,330,250,250);
      
      
      g.setColor(Color.green);
      g.fillPolygon(x0,y0,3);
      int x1[] = {210,221,190,300,290,260,250};
      int y1[] = {35,95,100,100,97,30,40};
      g.fillPolygon(x1,y1,6);
      
      try
         {
         for (int i = 0 ; i < 5 ; ++i)
            {
            g.setFont(new Font("MonoSpaced",Font.ITALIC,24));
            g.setColor(Color.white);
            g.drawString("PUMPKIN...",40,470);
            
            g.setColor(Color.black);
            g.fillArc(70,190,130,80,0,360);
            g.fillArc(300,190,130,80,0,360);
            g.fillArc(150,300,200,100,180,180);
            g.fillPolygon(x0,y0,3);
            Thread.sleep(1000);
         
            g.setColor(Color.red);
            g.fillArc(70,190,130,80,0,360);
            g.fillArc(300,190,130,80,0,360);
            g.fillArc(150,300,200,100,0,-180);
            g.fillPolygon(x0,y0,3);
            Thread.sleep(1000);
         
            g.setColor(Color.white);
            g.fillArc(70,190,130,80,0,360);
            g.fillArc(300,190,130,80,0,360);
            g.fillArc(150,300,200,100,0,-180);
            g.fillPolygon(x0,y0,3);
            Thread.sleep(1000);
            }
      }catch(Exception e){}
      
      }
   public static void main(String [] args)
      {
      Pumkin p = new Pumkin();
      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
   }
import java.awt.*;
import javax.swing.*;
public class PieChartWriter extends JPanel
{
   String sentence1="";
   String sentence2="";
   String sentence3="";
   String sentence4="";
   String sentence5="";
   String sentence6="";


   Color color1;
   Color color2;
   Color color3;
   Color color4;
   Color color5;
   Color color6;


   int amount1=0;
   int amount2=0;
   int amount3=0;
   int amount4=0;
   int amount5=0;
   int amount6=0;
   int vlera1=0;
   int vlera2=0;
   int vlera3=0;
   int vlera4=0;
   int vlera5=0;
   int vlera6=0;


   public void setSlice1(String label,int amount,Color c)
   { 
      vlera1=(int) Math.round(amount*15);//(360.0/100)); // nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount1=vlera1;
      sentence1=label;
      color1=c;
      repaint();
   }
   public void setSlice2(String label,int amount,Color c)
   {   
      vlera2=(int) Math.round(amount*15);//(360.0/100)); // nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount2=amount1+vlera2;
      sentence2=label;
      color2=c;
      repaint();
   }
   public void setSlice3(String label,int amount,Color c)
   {
      vlera3=(int) Math.round(amount*15);//(360.0/100));// nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount3=amount2+vlera3;
      sentence3=label;
      color3=c;
      repaint();
   }
   public void setSlice4(String label,int amount,Color c)
   {  
      vlera4=(int) Math.round(amount*15);//(360.0/100)); // nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount4=amount3+vlera4;
      sentence4=label;
      color4=c;
      repaint();
   }
   public void setSlice5(String label,int amount,Color c)
   { 
      vlera5=(int) Math.round(amount*15);//(360.0/100)); // nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount5=amount4+vlera5;
      sentence5=label;
      color5=c;
      repaint();
   }
   public void setSlice6(String label,int amount,Color c)
   { 
      vlera6= Math.round(amount*15.0);//(360.0/100)); // nese e perdorim klasen testPieCharter1 vendosim kete vlere ne vend te 15
      amount6=amount5+vlera6;
      sentence6=label;
      color6=c;
      repaint();
   }
   public void paintComponent(Graphics g )
   {
      g.setColor(color1);
      g.fillArc(80,80,300,300,0,vlera1);
      g.drawString( sentence1,440,200);
      
      g.setColor(color2);
      g.fillArc(80,80,300,300,amount1,vlera2);
      g.drawString( sentence2,440,220);
      
      g.setColor(color3);
      g.fillArc(80,80,300,300,amount2,vlera3);
      g.drawString( sentence3,440,240);
      
      g.setColor(color4);
      g.fillArc(80,80,300,300,amount3,vlera4);
      g.drawString( sentence4,440,260);
     
      g.setColor(color5);
      g.fillArc(80,80,300,300,amount4,vlera5);
      g.drawString( sentence5,440,280);
     
      g.setColor(color6);
      g.fillArc(80,80,300,300,amount5,vlera6);
      g.drawString( sentence6,440,300);
   
   }
 
   public void setTitle  (String title)
   {
      JFrame f = new JFrame();
      f.getContentPane().add(this);     
      f.setTitle(title);
      f.setSize(700,500); 
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      
   
   }

       
}


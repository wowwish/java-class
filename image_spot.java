import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class image_spot extends Applet implements ItemListener
{
   CheckboxGroup cg;
   Checkbox c1;
   Checkbox c2;
   Checkbox c3;
   Checkbox c4;
   Checkbox c5;
   Label l1;
   Image img;
  
   public void init()
   {
   cg = new CheckboxGroup();
   c1 = new Checkbox("Flower", cg, false);
   c2 = new Checkbox("animal", cg, false);
   c3 = new Checkbox("doll", cg, false);
   c4 = new Checkbox("book", cg, false);
   c5 = new Checkbox("chocolate", cg, false);
   l1 = new Label("Who Is in the picture?");
   img = getImage(getCodeBase(),"flower.jpg");
   }

   public void start()
   {
   add(l1);
   add(c1);  add(c2);  add(c3);  add(c4);  add(c5);
   c1.addItemListener(this);
   c2.addItemListener(this);
   c3.addItemListener(this);
   c4.addItemListener(this);
   c5.addItemListener(this);
   }
   
   public void paint(Graphics g)
   {
   g.drawImage(img,50,200,this);
   }

   public void itemStateChanged(ItemEvent e)
   {
   Checkbox cb = cg.getSelectedCheckbox();
   if (cb == c1)
   showStatus("Correct answer");
   else
   showStatus("wrong");
   }
}

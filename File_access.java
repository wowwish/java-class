import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/*<applet code = File_access.class height=300 width=300></applet>*/

public class File_access extends Applet implements ActionListener
{

Button b;
Label l;
TextField tf1;
TextArea ta1;
public String s;
public BufferedReader br;

public void init()
{
 
 l=new Label("Enter the file name",Label.CENTER);
 b=new Button("SUBMIT");
 tf1=new TextField(15);
 ta1=new TextArea();
}

 public void start()
 {
   add(l);
   add(tf1);
   add(b);
   add(ta1);
   b.addActionListener(this);
 }


public void actionPerformed(ActionEvent e)
{
   try
  {
  String seq;
  String s=tf1.getText();
  br=new BufferedReader(new FileReader(s));
 
 while((seq=br.readLine())!=null)
 {
   ta1.append(seq+"\n");
 }
} 
catch(FileNotFoundException ex)
{System.out.println(ex);}

catch(IOException ex)
{System.out.println(ex);}

}
}

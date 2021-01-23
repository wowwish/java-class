import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppPassword extends Applet implements ActionListener
{
    Button b;
    Label l;
    TextField tf;
    Image i;
    Label l1;
    
    public void init()
    {
        b = new Button("Enter");
        l = new Label("Enter the Password : ", Label.LEFT);
        l1 = new Label("");
        tf = new TextField(25);
        tf.setEchoChar('*');
        i = getImage(getCodeBase(), "welcome.gif");
    }
    
    public void paint(Graphics g)
        {
            if (l1.getText().equals("WELCOME"))
                g.drawImage(i, 575, 175, this);
        }
    
    public void start()
    {
        setBackground(Color.green);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
        add(l1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(tf.getText().equals("1234"))
        {
            showStatus("Correct");
            l1.setText("WELCOME");
        }
        else
        {
            showStatus("Wrong");
            l1.setText("WRONG");
        }
    }
}



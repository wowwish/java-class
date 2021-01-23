import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class GLayout extends Applet implements ActionListener
{
    String exp = "";
    int answer = 0;
    Button b1, b2 ,b3 ,b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, Ans;
    TextField tf;
    public void init()
    {
        GridLayout gl = new GridLayout(5,4);
        setLayout(gl);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("/");
        b14 = new Button("x");
        b15 = new Button("Clear");
        b16 = new Button("=");
        Ans = new Button("Ans");
        tf = new TextField(15);
        tf.setEditable(false);
        tf.setText("Result");
    }
    
    public void start()
    {
        add(b16); add(tf); add(b15); add(b14);
        add(b1); add(b2); add(b3); add(b13);
        add(b4); add(b5); add(b6); add(b12);
        add(b7); add(b8); add(b9); add(b11);
        add(b10); add(Ans);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        Ans.addActionListener(this);
    }
    
    public int count(String a , char b)
    {
        int c = 0;
        for (int i = 0; i < a.length(); i++)
        {
            if (a.toCharArray()[i] == b)
                c++;
        }
        return c;
    }
    
    public int parse(String s)
    {
        int fn, ln, ans = 0;
        if(!(s.matches(".*\\d.*")) || (count(s,'+') +  count(s,'-') + count(s,'x') + count(s,'/')) > 1)
            ans = 0;
        else if (s.contains("+"))
        {
            fn = Integer.parseInt(s.split("\\+")[0]);
            ln = Integer.parseInt(s.split("\\+")[1]);
            ans = fn + ln;
        }
        else if (s.contains("-"))
        {
            fn = Integer.parseInt(s.split("-")[0]);
            ln = Integer.parseInt(s.split("-")[1]);
            ans =  fn - ln;
        }
        else if (s.contains("x"))
        {
            fn = Integer.parseInt(s.split("x")[0]);
            ln = Integer.parseInt(s.split("x")[1]);
            ans = fn * ln;
        }
        else if (s.contains("/"))
        {
            fn = Integer.parseInt(s.split("/")[0]);
            ln = Integer.parseInt(s.split("/")[1]);
            ans = fn / ln;
        } 
        else 
            ans = Integer.parseInt(s);
        
        return ans;
    }
    
    
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                
                if (e.getSource() == b16)
                {
                    tf.setText(Integer.toString(parse(exp)));
                    answer = parse(exp);
                    exp = "";
                }
                else if (e.getSource() == b15)
                {
                    exp = "";
                    tf.setText(" ");
                }
                else if (e.getSource() == Ans)
                {
                    exp = exp + Integer.toString(answer);
                    tf.setText(exp);
                }
                else
                {
                    Button a = (Button) e.getSource();
                    exp = exp + a.getLabel();
                    tf.setText(exp);
                }
            }
            catch (Exception ex)
        {
            tf.setText("Error");
        }
        }
        
}


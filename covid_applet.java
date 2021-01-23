import java.sql.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class covid_applet extends Applet implements ActionListener,ItemListener
{
    Image picture;
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    Choice ch;
    Button b, c;
    Panel p;
    boolean flag = false;
    
    public void init()
    {
        setBackground(Color.GREEN);
        picture = Toolkit.getDefaultToolkit().getImage("C:/Users/Vavish Ram/Desktop/covid-plot.png");
        p = new Panel();
        GridLayout gl = new GridLayout(3,3);
        p.setLayout(gl);
        l1 = new Label("Confirmed cases");
        l2 = new Label("Deaths");
        l3 = new Label("Recoveries");
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);
        ch = new Choice();
        b = new Button("Graph");
        c = new Button("Clear");
        p.add(l1); p.add(tf1);
        p.add(l2); p.add(tf2);
        p.add(l3); p.add(tf3);
        ch.add("India");
        ch.add("US");
        ch.add("UK");
        ch.add("Germany");
        ch.add("Japan");
        ch.add("Russia");
        ch.add("South Korea");
        ch.add("Australia");
        ch.add("Italy");
        ch.add("France");
        ch.addItemListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
    }
    
    public void start()
    {
        add(ch);
        add(p);
        add(b);
        add(c);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b)
        {
            flag = true;
        }
        else if (ae.getSource() == c)
        {
            flag = false;
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
        repaint();
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        String country = ch.getSelectedItem();
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MyDatabase", "root", "subdic");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM COVID19 WHERE CountryRegion = '" + country + "'");
            while(rs.next())
            {
                tf1.setText(rs.getString(2));
                tf2.setText(rs.getString(3));
                tf3.setText(rs.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void paint(Graphics g)
    {
        if(flag)
        {
            g.drawImage(picture, 300, 300, this);
        }
    }
}

import java.applet.*;
import java.awt.*;

public class AppComponents extends Applet
{
    TextField tf;
    TextArea ta;
    Label l;
    Button b;
    CheckboxGroup cbg;
    Checkbox DNA, RNA, Protein, Others;
    Choice ch;
    List lst;
    Scrollbar sb;
    public void init()
    {
        sb = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 9);
        cbg = new CheckboxGroup();
        DNA = new Checkbox("DNA", cbg, false);
        RNA = new Checkbox("RNA", cbg, false);
        Protein = new Checkbox("Protein");
        Others = new Checkbox("Others",null,false);
        ch = new Choice();
        ch.add("Sequence");
        ch.add("Structure");
        ch.add("Function");
        lst = new List(4,false);
        lst.add("Keratin");
        lst.add("Collagen");
        lst.add("Actin");
        lst.add("Myosin");
        tf = new TextField(20);
        ta = new TextArea(20,20);
        l = new Label("Enter Protein Name");
        b = new Button("Submit Sequence");
    }
    public void start()
    {
        add(sb);
        add(l);
        add(tf);
        add(ta);
        add(DNA);
        add(RNA);
        add(Protein);
        add(Others);
        add(ch);
        add(lst);
    }
}

import org.biojava.bio.seq.*;
import org.biojava.bio.symbol.*;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BioJ extends Applet implements ActionListener,ItemListener
{
    Label l;
    Button b1;
    TextField tf;
    TextArea ta1, ta2;
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3, cb4, cb5;
    Panel p;
    
    public void init()
    {
        p = new Panel();
        GridLayout gl = new GridLayout(1,5);
        p.setLayout(gl);
        l = new  Label("Choose the Option");
        b1 = new Button("Clear");
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Transcribe DNA", cbg, false);
        cb2 = new Checkbox("Translate RNA", cbg ,false);
        cb3 = new Checkbox("Find Reverse Complement of DNA", cbg, false);
        cb4 = new Checkbox("Find GC content", cbg, false);
        cb5 = new Checkbox("Find base at position", cbg, false);
        cbg = new CheckboxGroup();
        tf = new TextField(20);
        ta1 = new TextArea("Input");
        ta2 = new TextArea("Output");
        b1.addActionListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        p.add(cb1); p.add(cb2); p.add(cb3); p.add(cb4); p.add(cb5);
    }
    
    public void start()
    {
        add(l);
        add(p);
        add(ta1);
        add(ta2);
        add(tf);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1)
        {
            tf.setText("");
            ta1.setText("");
            ta2.setText("");
            cb1.setState(false); cb2.setState(false); cb3.setState(false);
            cb4.setState(false); cb5.setState(false);
        }
        
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        try
        {
                if (cb1.getState() == true)
            {
                String seq = ta1.getText().replaceAll("\\s","").replace("\n","").toUpperCase();
                SymbolList s = DNATools.createDNA(seq);
                s = DNATools.toRNA(s);
                ta2.setText(s.seqString().toUpperCase());
            }
            else if (cb2.getState() == true)
            {
                String seq = ta1.getText().replaceAll("\\s","").replace("\n","").toUpperCase();
                SymbolList s = RNATools.createRNA(seq);
                s = RNATools.translate(s);
                ta2.setText(s.seqString().toUpperCase());
            }
            else if (cb3.getState() == true)
            {
                String seq = ta1.getText().replaceAll("\\s","").replace("\n","").toUpperCase();
                SymbolList s = DNATools.createDNA(seq);
                s = DNATools.reverseComplement(s);
                ta2.setText(s.seqString().toUpperCase());
            }
            else if (cb4.getState() == true)
            {
                int gc = 0;
                String seq = ta1.getText().replaceAll("\\s","").replace("\n","").toUpperCase();
                SymbolList s = DNATools.createDNA(seq);
                for (int pos = 1; pos <= s.length(); ++pos)
                {
                    if (s.symbolAt(pos) == DNATools.g() || s.symbolAt(pos) == DNATools.c())
                        ++gc;
                }
                ta2.setText("GC Content : " + ((gc * 100.f)/s.length()) + "%");
            }
            else if (cb5.getState() == true)
            {
                String seq = ta1.getText().replaceAll("\\s","").replace("\n","").toUpperCase();
                SymbolList s = DNATools.createDNA(seq);
                int pos = Integer.parseInt(tf.getText());
                ta2.setText(s.symbolAt(pos).getName());
            }
        }
        catch (Exception ex)
        {
            ta2.setText("Something went Wrong !!!");
        }
    }
}

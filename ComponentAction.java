import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ComponentAction extends Applet implements ItemListener
{
    CheckboxGroup cg;
    Checkbox c1,c2,c3,c4,c5;
    Label l1;
    Choice ch;
    TextField tf;
    
    public void init()
    {
        cg = new CheckboxGroup();
        c1 = new Checkbox("less than 8 residues", cg, false);
        c2 = new Checkbox("8 to 12 resudiues", cg, false);
        c3 = new Checkbox("greater than 12 residues", cg, false);
        c4 = new Checkbox("Fibrous Protein", null, false);
        c5 = new Checkbox("Globular Protein", null, false);
        l1 = new Label("Select an Option", Label.RIGHT);
        ch = new Choice();
        tf = new TextField(50);
        ch.add("DNA");
        ch.add("RNA");
        ch.add("Protein");
    }
    
    public void start()
    {
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        ch.addItemListener(this);
        add(ch);
        add(tf);
        add(c1);
        add(c2);
        add(c3);
        add(l1);
        add(c4);
        add(c5);
        setBackground(Color.cyan);    
    }
    
    public void itemStateChanged(ItemEvent e)
        {
            if (ch.getSelectedItem() == "DNA")
                tf.setText("The Heriditary molecule containing information for Protein synthesis");
            else if (ch.getSelectedItem() == "RNA")
                tf.setText("Translates Genes, Regulates gene expression, cellular differentiation");
            else if (ch.getSelectedItem() == "Protein")
                tf.setText("Versatile Molecule that performs variety of functions in cells");
            
            if(c1.getState() == true)
                l1.setText("Small Peptide");
            else if(c2.getState() == true)
                l1.setText("Peptide");
            else if(c3.getState() == true)
                l1.setText("Polypeptide");
        }
}


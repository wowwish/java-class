import org.biojava.bio.BioException;
import org.biojava.bio.proteomics.IsoelectricPointCalc;
import org.biojava.bio.proteomics.MassCalc;
import org.biojava.bio.seq.*;
import org.biojava.bio.symbol.*;

public class protein_calc
{
    public static void main(String args[]) throws Exception
            {
                protein_calc pc = new protein_calc();
                try
                {
                    SymbolList p = ProteinTools.createProtein("MALHKYSCVG");
                    MassCalc mc = new MassCalc(SymbolPropertyTable.AVG_MASS, true);
                    double mass = mc.getMass(p);
                    IsoelectricPointCalc ic = new IsoelectricPointCalc();
                    double pI = ic.getPI(p, true, true);
                    System.out.println("Sqeuence : " + p.seqString());
                    System.out.println("Mass : " + mass);
                    System.out.println("Isoelectric Point : " + pI);
                }
                catch (Exception e)
                {
                    System.out.println("Something went wrong.");
                }
                
            }
}
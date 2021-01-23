//import java.io.*;
import org.biojava.bio.symbol.*;
import org.biojava.bio.structure.*;
import org.biojava.bio.structure.io.*;




public class pdb
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            // filename = "C:/Users/Vavish Ram/Documents/NetBeansProjects/JavaApplication1/JavaApplication1/JavaApplication1/src/6dwq.pdb";
            // Structure s = reader.getStructure(filename);
            PDBFileReader reader = new PDBFileReader();
            reader.setPath("C:/Users/Vavish Ram/Documents/NetBeansProjects/JavaApplication1/JavaApplication1/JavaApplication1/src/");
            reader.setAutoFetch(true);
            reader.setAlignSeqRes(true);
            reader.setParseSecStruc(true);
            Structure s = reader.getStructureById("6dwq");
            System.out.println(s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
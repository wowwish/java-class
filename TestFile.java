import java.sql.*;
import java.io.*;
import java.util.*;

class TestFile
{
    public static void main(String args[])
    {
        String line;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MyDatabase", "root", "subdic");
            System.out.println("Connected to Database");
            Statement st = con.createStatement();
            st.executeUpdate("DROP TABLE IF EXISTS MyDatabase.COVID19");
            st.executeUpdate("CREATE TABLE COVID19(CountryRegion VARCHAR(50), Confirmed INT, Deaths INT, Recovered INT)");
            
            FileReader fr = new FileReader(new File("C:/Users/Vavish Ram/Desktop/covid.csv"));
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null)
            {
                StringTokenizer s = new StringTokenizer(line, ",");
                st.executeUpdate("INSERT into COVID19 VALUES(" + "'" + s.nextToken() + "', " + "'" + s.nextToken() + "', " + "'" + s.nextToken() + "', " + "'" + s.nextToken() + "')");
            }
            fr.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
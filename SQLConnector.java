import java.io.*;
import java.sql.*;

class ServerConnect
{
	public static void main (String args[])
	{
		try
		{	
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/MyDatabase", "root", "subdic");
			System.out.println("Connected");
			Statement st = conn.createStatement();
			st.executeUpdate("DROP TABLE IF EXISTS MyDatabase.GeneExp");
			st.executeUpdate("CREATE TABLE GeneExp(Id VARCHAR(10), Length INT, Count INT)");
			System.out.println("Table Created.");
			st.executeUpdate("INSERT into GeneExp VALUES('AUTS2', '1195032', '298882')");
			System.out.println("Row 1 created");
			st.executeUpdate("INSERT into GeneExp VALUES('NSD1', '168379', '2899')");
			System.out.println("Row 2 created");
			st.executeUpdate("INSERT into GeneExp VALUES('VPS13B', '864321', '984')");
			System.out.println("Row 3 created");
			ResultSet rs = st.executeQuery("SELECT * FROM GeneExp WHERE Count > 1000");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}


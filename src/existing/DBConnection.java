 
package existing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 
public class DBConnection 
{
    public Statement stt;
    public Connection con;
    public DBConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/keyaggpropose","root","");
            stt=con.createStatement();            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}



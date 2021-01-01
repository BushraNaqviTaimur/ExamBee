package examb;
import java.sql.*;

/**
 *
 * @author bushra
 */
public class DB_Connection 
{
    Statement statement = null;
    ResultSet rs = null;
    Connection connection = null;
    

 public void MakeConnection() throws SQLException
    {
        String user = "root";
        String pass = "rootroot";
 
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EXAMB", user, pass);        
    }
 public ResultSet RunSelectQuery(String query) throws SQLException
    {
        statement = connection.createStatement();
        rs = statement.executeQuery(query);
        
        return rs;
    }
    
    public boolean RunUpdateQuery(String query) throws SQLException
    {     
        statement = connection.createStatement();

        if(statement.executeUpdate(query) > 0)
                return true;
        else
                return false;    
    }
    
    public boolean RunDeleteQuery(String query) throws SQLException
    {     
        statement = connection.createStatement();

        if(statement.executeUpdate(query) > 0)
                return true;
        else
                return false;    
    }
    
    
    
    public boolean RunInsertQuery(String query) throws SQLException
    {     
        statement = connection.createStatement();

        if(statement.executeUpdate(query) > 0)
                return true;
        else
                return false;    
    }
    public void CloseConnection() throws SQLException
    {
        connection.close();
        statement.close();
        rs.close();        
    }    
}
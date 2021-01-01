
package examb;
import java.sql.*;
/**
 *
 * @author bushra
 */
public class Teacher 

{
    String userName;
    String password;
    String courseCode;
    
    public Teacher()
    {} //empty constructor for its use in btnsignup
    
    public Teacher (String userName, String password, String courseCode)
    {
        this.userName = userName;
        this.password = password;
        this.courseCode = courseCode;
    }
    public boolean TeacherLogin()
    {
        boolean result=false;

       DB_Connection  conn = new DB_Connection ();

        String query = "SELECT * FROM TeachersLogin WHERE Username='"+userName+"' AND Password='"+password+"' AND Course_code='"+courseCode+"'";
    
        try
        {
            conn.MakeConnection();
            
            ResultSet rs = conn.RunSelectQuery(query);
           
            int record = 0;
        
            while(rs.next())
            {
                record++;
            }

            if(record>0)
               result= true;
            else 
               result= false;
            
            
            
        }
        catch (Exception e)
        {
        
        }
        finally
        {
            try
            {
                conn.CloseConnection();
            }
            catch (Exception e)
            {
                        
            }
        }
       
        return result;
        
        
    }
    
    public void InsertData( Teacher data)
    
    {
        String query = "INSERT INTO TeachersLogin (Username,Password,Course_code)" + 
                "VALUES ('"+data.userName+"', '"+data.password+"', '"+data.courseCode+"')";
        DB_Connection  conn = new DB_Connection ();
     
        try
        {
           conn.MakeConnection();

           conn.RunInsertQuery(query);

           
        }
        catch (Exception e)
        {

        }
        finally
        {
            try
            {
                conn.CloseConnection();
            }
            catch (Exception e)
            {
                        
            }
        }
        
        
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

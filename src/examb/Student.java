
package examb;

import java.sql.ResultSet;

/**
 * @author bushra
 */

public class Student
    {

    String COURSE_ID;
    String Student_ID;
    String name;
    
    public Student(){}
    
        public Student (String COURSE_ID,String Student_ID,String name)
        {
              
         this.COURSE_ID=COURSE_ID;
         this.Student_ID=Student_ID;
         this.name=name;
         
         }
        
        public Student (String Student_ID)
        {
         this.Student_ID=Student_ID;         
        }
        
        public boolean StudentLogin(String tableName)
    {
        boolean result=false;
        

       DB_Connection  conn = new DB_Connection ();

        String query = "SELECT * FROM "+ tableName + " WHERE Student_ID='"+Student_ID+"'";//taking tablename as perimeter from studentloginpage.java's btnjoin method
    
        try
        {
            conn.MakeConnection();
            
            ResultSet rs = conn.RunSelectQuery(query);
           
            int record = 0;
        
            while(rs.next())
            {
               record++;//after record is found we extract following
               this.COURSE_ID = rs.getString("Course_ID"); //extracting column/row value from database resultset
               this.name = rs.getString("Student_Name"); //extracting column/row value from database resultset
            }

            if(record>0)
            {
               result= true;

            }
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
        public ResultSet ShowAllPSTResults()
        {
        
        String query="SELECT * FROM Result_PST";
        ResultSet rs=null;
        DB_Connection  conn = new DB_Connection ();
        
        try
        {
        
        
        conn.MakeConnection();
        
        rs = conn.RunSelectQuery(query);

     
        }
        catch (Exception e)
        {
                
        }
        

        
        return rs;
    }
        public ResultSet ShowAllMathsResults()
    {
        
        String query="SELECT * FROM Result_Maths";
        ResultSet rs=null;
        DB_Connection  conn = new DB_Connection ();
        
        try
        {
        
        
        conn.MakeConnection();
        
        rs = conn.RunSelectQuery(query);

     
        }
        catch (Exception e)
        {
                
        }
        

        
        return rs;
    }
        public ResultSet ShowAllENGResults()
    {
        
        String query="SELECT * FROM Result_English";
        ResultSet rs=null;
        DB_Connection  conn = new DB_Connection ();
        
        try
        {
        
        
        conn.MakeConnection();
        
        rs = conn.RunSelectQuery(query);

     
        }
        catch (Exception e)
        {
                
        }
        

        
        return rs;
    }
        public ResultSet SearchMathStudentsResult(String text)
    {
        String query = "SELECT * FROM  Result_Maths WHERE Name LIKE '%"+text+"%'";
        ResultSet rs=null;
        
        DB_Connection  conn = new DB_Connection ();
        
        try{            
          
            conn.MakeConnection();
            
            rs = conn.RunSelectQuery(query);

            }     
            catch (Exception e) 
            {
            
            } 
            
        return rs;
    }
        public ResultSet SearchPSTStudentsResult(String text)
    {
        String query = "SELECT * FROM  Result_PST WHERE Name LIKE '%"+text+"%'";
        ResultSet rs=null;
        
        DB_Connection  conn = new DB_Connection ();
        
        try{            
          
            conn.MakeConnection();
            
            rs = conn.RunSelectQuery(query);

            }     
            catch (Exception e) 
            {
            
            } 
            
        return rs;
    }
    public ResultSet SearchENGStudentsResult(String text)
    {
        String query = "SELECT * FROM  Result_English WHERE Name LIKE '%"+text+"%'";
        ResultSet rs=null;
        
        DB_Connection  conn = new DB_Connection ();
        
        try{            
          
            conn.MakeConnection();
            
            rs = conn.RunSelectQuery(query);

            }     
            catch (Exception e) 
            {
            
            } 
            
        return rs;
    }
    
        
      }
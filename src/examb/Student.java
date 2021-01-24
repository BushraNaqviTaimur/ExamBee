
package examb;

import java.sql.ResultSet;
import java.util.Random; //for generating random number

/**
 * @author bushra
 */

public class Student
    {

    String COURSE_ID;
    String Student_ID;
    String name;
    int Total_Marks = 50;
    int  Obtained_Marks;
    
    
    int QID[]= new int[11]; //because 10 questions are asked in exams
    public int questionNumber=1;
    
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
        
       
        public ResultSet GetNextQuestion(String tableName)
        {
            
            String query="";
            
            Random rand = new Random();
            int randomNumber=0;
            String myRandomNumber=null;
          
            DB_Connection  conn = new DB_Connection ();
            
            if(questionNumber < 12)
            {
                    
             //for saving randomnumber generated to array so that we can check next time
            //whether that same question has been asked to student or not
             for (int i=questionNumber;i<=questionNumber;i++)
             {
                 randomNumber = rand.nextInt(20);
                 
                 if(randomNumber==0)
                     randomNumber = rand.nextInt(20);
                 else
                    QID[i-1]=randomNumber;
        
             }
                         
             //for checking whether current random number generated exists in array or not
             for(int i=0;i<questionNumber;i++)
             {
                 if (QID[i]!=randomNumber)
                 {
                    myRandomNumber = String.valueOf(randomNumber);
                 }
                 else
                 {
                     randomNumber = rand.nextInt(20);
                     
                     if(randomNumber==0 || randomNumber==QID[i])
                     {       
                        randomNumber = rand.nextInt(20);
                        QID[questionNumber-1]=randomNumber;
                        myRandomNumber = String.valueOf(randomNumber);
                     }
                     else
                     {
                        myRandomNumber = String.valueOf(randomNumber);
                     }
                     
                 }
             }
             questionNumber++;
            }
              
             
            query="SELECT * FROM "+tableName+" WHERE QID="+myRandomNumber;
            ResultSet rs=null;
                    
        
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
    
    public void InsertData( Student data, String tableName)
    
    {
        String query = "INSERT INTO " +tableName+ " (Student_ID,Name,Total_Marks,Obtained_Marks)" + 
                "VALUES ('"+data.Student_ID+"', '"+data.name+"', '"+data.Total_Marks+"','"+data.Obtained_Marks+"')";
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
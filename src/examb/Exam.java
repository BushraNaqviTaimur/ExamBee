
package examb;

import java.sql.ResultSet;

/**
 *
 * @author bushra
 */
public class Exam 
{
    String QID;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String Result;
    Teacher teacher;
    
    
    
    public Exam (){}
    
    public Exam (String QID,String question,String optionA,String optionB,String optionC,String Result, Teacher t)
    {
       this.QID=QID;
       this.question=question;
       this.optionA= optionA;
       this.optionB= optionB;
       this.optionC= optionC;
       this.Result = Result;
       this.teacher = t;
       
      
    }
    public void InsertQuestions()
    
            
    {
        String query=null;
        
        if (teacher.courseCode.equals("English02"))
        {
        query = "INSERT INTO QuestionBankEnglish (QID,Question,A,B,C,Result)" + 
                "VALUES ('"+this.QID+"', '"+this.question+"', '"+this.optionA+"' , '"+this.optionB+"','"+this.optionC+"' , '"+this.Result+"')";
        
        }
        if (teacher.courseCode.equals("Math01"))
        {
        query = "INSERT INTO QuestionBankMaths (QID,Question,A,B,C,Result)" + 
                "VALUES ('"+this.QID+"', '"+this.question+"', '"+this.optionA+"' , '"+this.optionB+"','"+this.optionC+"' , '"+this.Result+"')";
        
        }
         if (teacher.courseCode.equals("PST03"))
        {
        query = "INSERT INTO QuestionBankPST (QID,Question,A,B,C,Result)" + 
                "VALUES ('"+this.QID+"', '"+this.question+"', '"+this.optionA+"' , '"+this.optionB+"','"+this.optionC+"' , '"+this.Result+"')";
        
        }
        
  
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

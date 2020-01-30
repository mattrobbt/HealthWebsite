package data;
import data.Procedure;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import data.TreatmentinProvider;
/**
 * Class to handle Database operations
 * @author Robert
 */

public class FilterByPrice {
 /**
 * @return a connection to the database if successful, otherwise will return null
 */
   public FilterByPrice() {
        
    }
    
    
    public Connection dbConnect() {
        Connection connect = null;
        String result = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager
                    .getConnection("jdbc:mysql://silva.computing.dundee.ac.uk:3306","19agileteam16","3244.at16.4423");
            System.out.println("got here");
        }
        catch (SQLException e) {
            System.out.println("connection failed " + e.getMessage());
    }
        catch (Exception e) {
            System.out.println("connection failed " + e);

        }
        return connect;
}
 /**
  * Aim for this method is to have a list of a new class type - eg Procedure
  * This would then allow for this to be iterated in the .jsp file and have the
  * desired attributes printed out/processed further.
 * @param query the desired DB query as a string
 * @return A list object of strings that are hospital names
 */
    public List<Procedure> runDbQuery() {
       String query="SELECT * FROM 19agileteam16db.Procedures";  
       List<Procedure> result = dbQuery(query);
       return result;
    }
    
    public List<Procedure> dbQuery(String query) {
        
        Connection connect = dbConnect();
        List<Procedure> result = new ArrayList<Procedure>();
                               
        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);  

            while (rs.next())
            {   
                Procedure Procedure=new Procedure();
                String newProcedureID=rs.getString("ProceduresID");   
                String newDescription=rs.getString("Description");
                Procedure.setProceduresID(newProcedureID);
                Procedure.setDescription(newDescription);
                result.add(Procedure);
                
            }
            rs.close();
            stmt.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }  
}   


    
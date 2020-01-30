package data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import data.Procedure;
/**
 * Class to handle Database operations
 * @author Robert
 */

public class SearchProcedure {
 /**
 * @return a connection to the database if successful, otherwise will return null
 */
    
    
    public Connection dbConnect() {
        Connection connect = null;
        String result = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://silva.computing.dundee.ac.uk:3306" + "user=19agileteam16&password=3244.at16.4423");
        }
        catch (Exception e) {
            
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
    public List<Procedure> dbQuery(String query) {
        List<Procedure> result = new ArrayList<Procedure>();
        Connection connect = dbConnect();
        
                                
        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            

            while (rs.next())
            {
                            
                Procedure Procedure = new Procedure();
                String ProceduresID = rs.getString("ProceduresID");
                String Description = rs.getString("Description");
                Procedure.setProceduresID(ProceduresID);
                Procedure.setDescription(Description);

                result.add(Procedure);
            }
            rs.close();
            stmt.close();

        }
        catch (Exception e) {
            
        }
        
        return result;
    }
}   



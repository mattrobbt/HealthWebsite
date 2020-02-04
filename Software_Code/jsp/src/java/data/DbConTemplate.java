package data;

import htmlgeneration.Treatment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import htmlgeneration.Treatment;
/**
 * Class to handle Database operations
 * @author Robert
 */

public class DbConTemplate {
 /**
 * @return a connection to the database if successful, otherwise will return null
 */
   public DbConTemplate() {
        
    }
    
    
    public Connection dbConnect() {
        Connection connect = null;
        String result = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager
                    .getConnection("jdbc:mysql://silva.computing.dundee.ac.uk:3306","19agileteam16","3244.at16.4423");
            
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
   public List<Treatment> dbQuery(String query) {
        
        Connection connect = dbConnect();
        List<Treatment> result = new ArrayList<Treatment>();
                               
        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);  

            while (rs.next())
            {   
                Treatment Treatment=new Treatment();
                String ProviderID=rs.getString("ProviderID");         
                String ProviderName=rs.getString("name");   
                String ProcedureName=rs.getString("Description");
                String Price=rs.getString("AveragePayments");
                String state=rs.getString("State");
                String city=rs.getString("City");
                String address=rs.getString("StreetAddress");
                String zipCode=rs.getString("ZipCode");
                String TotalDischarge=rs.getString("TotalDischarges");
                String hrr=rs.getString("HRR");
                Treatment.setProviderID(ProviderID);
                Treatment.setCity(city);
                Treatment.setState(state);
                Treatment.setZipCode(zipCode);
                Treatment.setTotalDischarge(TotalDischarge);
                Treatment.setAddress(address);
                Treatment.setPrice(Price);
                Treatment.setProcedureName(ProcedureName);
                Treatment.setProviderName(ProviderName);
                Treatment.setHRR(hrr);
                result.add(Treatment);
                
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


    
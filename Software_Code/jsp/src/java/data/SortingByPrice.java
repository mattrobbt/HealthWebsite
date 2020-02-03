/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import htmlgeneration.Treatment;
import htmlgeneration.TreatmentFake;
/**
 *
 * @author mengqijiang
 */
public class SortingByPrice {
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
    public List<TreatmentFake> sortingByPriceHightoLow(String newProcedureID) {
       
       String query= ; 
       
       List<TreatmentFake> result = dbQuery(query);
       return result;
    }
    public List<TreatmentFake> sortingByPriceHightoLow(String newProcedureName) {
       
       String query="select Provider.name,Procedures.Description,Treatment.AveragePayments,Provider.StreetAddress "
               + "from 19agileteam16db.provider,19agileteam16db.procedures,19agileteam16db.treatment "
               + "where treatment.providerID=provider.providerID and treatment.proceduresID=procedures.proceduresID and "
               + "Procedures.Description like '%"+newProcedureName+"%'";  
       System.out.print(query);
       List<TreatmentFake> result = dbQuery(query);
       return result;
    }
    public List<TreatmentFake> dbQuery(String query) {
        
        Connection connect = dbConnect();
        List<TreatmentFake> result = new ArrayList<TreatmentFake>();
                               
        try {
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(query);  

            while (rs.next())
            {   
                TreatmentFake Treatment=new TreatmentFake();
                String ProviderName=rs.getString("name");   
                String ProcedureName=rs.getString("Description");
                String Price=rs.getString("AveragePayments");
                String address=rs.getString("StreetAddress");
                Treatment.setAddress(address);
                Treatment.setPrice(Price);
                Treatment.setProcedureName(ProcedureName);
                Treatment.setProviderName(ProviderName);
                
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
    public static void main(String args[]){
        SearchSpecificTreatment item=new SearchSpecificTreatment();
        List<TreatmentFake> result=item.runDbQueryBySearchProcedureName("HEART");
        for(TreatmentFake obj:result){
            System.out.print("<td>"+obj.getProviderName()+"</td>");
            System.out.print("<td>"+obj.getProcedureName()+"</td>");
            System.out.print("<td>"+obj.getPrice()+"</td>");
            System.out.println("<td>"+obj.getAddress()+"</td><tr>");
        }
    }
}

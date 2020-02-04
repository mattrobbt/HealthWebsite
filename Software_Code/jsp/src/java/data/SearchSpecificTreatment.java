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
import data.DbConTemplate;
/**
 *
 * @author mengqijiang
 */
public class SearchSpecificTreatment {
    
    DbConTemplate item=new DbConTemplate();
    public List<Treatment> runDbQueryBySearchProcedure(String searchProcedure) {
        
       String query=
               "select * "
               + "from 19agileteam16db.treatment as treatment "
               + "inner join 19agileteam16db.provider as provider on treatment.providerID=provider.providerID "
               + "inner join 19agileteam16db.procedures as procedures on treatment.proceduresID=procedures.proceduresID "
               + "where procedures.proceduresID=\""+searchProcedure+"\" or procedures.description like '%"+searchProcedure+"%'";


       
       List<Treatment> result = item.dbQuery(query);
       return result;
    }
    public List<Treatment> runDbQueryBySearchProcedureName(String newProcedureName) {
       
       String query="select * "
               + "from 19agileteam16db.provider,19agileteam16db.procedures,19agileteam16db.treatment "
               + "where treatment.providerID=provider.providerID and treatment.proceduresID=procedures.proceduresID and "
               + "Procedures.Description like '%"+newProcedureName+"%'";  
       System.out.print(query);
       List<Treatment> result = item.dbQuery(query);
       return result;
    }
    public static void main(String args[]){
        SearchSpecificTreatment item=new SearchSpecificTreatment();
        List<Treatment> result=item.runDbQueryBySearchProcedure("HEART");
        for(Treatment obj:result){
            System.out.print("<td>"+obj.getProviderName()+"</td>");
            System.out.print("<td>"+obj.getProcedureName()+"</td>");
            System.out.print("<td>"+obj.getPrice()+"</td>");
            System.out.println("<td>"+obj.getAddress()+"</td><tr>");
        }
    }
}

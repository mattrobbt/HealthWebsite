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
public class SortingByPrice {
    
    DbConTemplate item=new DbConTemplate();  
    
    public List<Treatment> sortingByPriceHightoLow(String searchProcedure,int maxprice) {
       
       String query= "select * "
               + "from 19agileteam16db.treatment as treatment "
               + "inner join 19agileteam16db.provider as provider on treatment.providerID=provider.providerID "
               + "inner join 19agileteam16db.procedures as procedures on treatment.proceduresID=procedures.proceduresID "
               + "where (procedures.proceduresID=\""+searchProcedure+"\" or procedures.description like '%"+searchProcedure+"%') and "
               + "treatment.AveragePayments<"+maxprice
               + " order by treatment.AveragePayments desc"; 
       List<Treatment> result = item.dbQuery(query);
       return result;
    }
    
    public List<Treatment> sortingByPriceLowtoHigh(String searchProcedure,int maxprice) {
       
       String query= "select * "
               + "from 19agileteam16db.treatment as treatment "
               + "inner join 19agileteam16db.provider as provider on treatment.providerID=provider.providerID "
               + "inner join 19agileteam16db.procedures as procedures on treatment.proceduresID=procedures.proceduresID "
               + "where (procedures.proceduresID=\""+searchProcedure+"\" or procedures.description like '%"+searchProcedure+"%') and "
               + "treatment.AveragePayments<"+maxprice
               + " order by treatment.AveragePayments asc"; 
       List<Treatment> result = item.dbQuery(query);
       return result;
    }
    
    public List<Treatment> sortingByPriceHightoLowUsingName(String newProcedureName) {
       
       String query= "call 19agileteam16db.sortingByPriceHightoLowUsingID('"+newProcedureName+"');"; 
       List<Treatment> result = item.dbQuery(query);
       return result;
    }
    
    public List<Treatment> sortingByPriceLowtoHighUsingName(String newProcedureName) {
       
       String query="call 19agileteam16db.sortingByPriceLowtoHighUsingID('"+newProcedureName+"')";  
       System.out.print(query);
       List<Treatment> result = item.dbQuery(query);
       return result;
    }public static void main(String args[]){
        SortingByPrice item=new SortingByPrice();
        List<Treatment> result=item.sortingByPriceHightoLow("375",10000);
        List<Treatment> result1=item.sortingByPriceLowtoHigh("375",10000);
        List<Treatment> result2=item.sortingByPriceHightoLowUsingName("HEART");
        List<Treatment> result3=item.sortingByPriceLowtoHighUsingName("HEART");
        for(Treatment obj:result){
             System.out.print("<td>"+obj.getProceduresID()+"</td>");
           System.out.print("<td>"+obj.getProviderName()+"</td>");
            System.out.print("<td>"+obj.getProcedureName()+"</td>");
            System.out.print("<td>"+obj.getPrice()+"</td>");
            System.out.println("<td>"+obj.getAddress()+"</td><tr>");
        }
    }
}
 
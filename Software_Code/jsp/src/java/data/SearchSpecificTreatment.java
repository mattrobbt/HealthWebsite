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
}

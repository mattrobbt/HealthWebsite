/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item;
import java.io.*;
import java.lang.*;
/**
 *
 * @author mengqijiang
 */
class Procedure {
    public String ProceduresID = "";
    public String Description = "";
    
    public String getProceduresID(){
        return ProceduresID;
    }
    public void setProcedureID(String newProceduresID){
        this.ProceduresID=newProceduresID;
    }
    public String getDescription(){
        return Description;
    }
    public String setDescription(String newDescription){
        this.Description=newDescription;
    }
}

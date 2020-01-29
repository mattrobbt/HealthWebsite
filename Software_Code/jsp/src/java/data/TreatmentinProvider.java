/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import data.Procedure;
import data.Provider;
/**
 *
 * @author mengqijiang
 */
public class TreatmentinProvider {
    public String AveragePayments="";
    public String TotalDischarge="";
     public String getAveragePayments(){
        return AveragePayments;
    }
    public void setAveragePayments(String newAveragePayments){
        this.AveragePayments=newAveragePayments; 
    }
     public String getTotalDischarge(){
        return TotalDischarge;
    }
    public void setTotalDischarge(String newTotalDischarge){
        this.TotalDischarge=newTotalDischarge; 
    }
}

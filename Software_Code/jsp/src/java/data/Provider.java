/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author mengqijiang
 */
public class Provider {
    public String ProviderID = "";
    public String Name = "";
    public String SteetAddress = "";
    public String City = "";
    public String State = "";
    public String ZipCode = "";
    public String HRR = "";
    
    public String getProviderID(){
        return ProviderID;
    }
    public void setProviderID(String newProviderID){
        this.ProviderID=newProviderID; 
    } 
    public String getName(){
        return Name;
    }
    public void setName(String newName){
        this.Name=newName;
    } 
    public String getSteetAddress(){
        return SteetAddress;
    }
    public void setSteetAddress(String newSteetAddress){
        this.SteetAddress=newSteetAddress;
    } 
    public String getCity(){
        return City;
    }
    public void setCity(String newCity){
        this.City=newCity;
    } 
    public String getState(){
        return State;
    }
    public void setState(String newState){
        this.State=newState;
    } 
    public String getZipCode(){
        return ZipCode;
    }
    public void setZipCode(String newZipCode){
        this.ZipCode=newZipCode;
    } 
    public String getHRR(){
        return HRR;
    }
    public void setHRR(String newHRR){
        this.HRR=newHRR;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;

/**
 * Temporary Class -
 * @author charleshewitt
 */
public class Treatment{
    public String ProceduresID;
    private String providerName;
    private String procedureName;
    private String price;
    private String address;
    public String ProviderID;
    public String SteetAddress;
    public String City;
    public String State;
    public String ZipCode;
    public String HRR;
    public String TotalDischarge;
    public String provider_lat;
    public String provider_lng;
    
    public String getProviderID(){
        return ProviderID;
    }
    public void setProviderID(String newProviderID){
        this.ProviderID=newProviderID; 
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
    public String getProceduresID(){
        return ProceduresID;
    }
    public void setProceduresID(String newProceduresID){
        this.ProceduresID=newProceduresID;
    }
    

    /**
     * @return the providerName
     */
    public String getProviderName() {
        return providerName;
    }
    
    public void setProviderName(String newProviderName){
        this.providerName=newProviderName;
    }
    /**
     * @return the procedureName
     */
    public String getProcedureName() {
        return procedureName;
    }
    
    public void setProcedureName(String newprocedureName){
        this.procedureName=newprocedureName;
    }
    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    public void setPrice(String newPrice){
        this.price=newPrice;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    
    public void setAddress(String newAddress){
        this.address=newAddress;
    }
    public String getTotalDischarge() {
        return TotalDischarge;
    }
    
    
    public void setTotalDischarge(String newTotalDischarge){
        this.TotalDischarge=newTotalDischarge;
    }
    
    public String getProviderLat() {
        return provider_lat;
    }
    public void setProviderLat(String newProviderLat){
        this.provider_lat=newProviderLat;
    }
    
    public String getProviderLng() {
        return provider_lng;
    }
    public void setProviderLng(String newProviderLng){
        this.provider_lng=newProviderLng;
    }
 
}

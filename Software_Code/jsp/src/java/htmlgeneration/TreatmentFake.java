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
public class TreatmentFake implements Treatment {
    private String providerName;
    private String procedureName;
    private String price;
    private String address;
    
    

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
 
}

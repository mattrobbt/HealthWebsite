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
    
    public TreatmentFake(String provider, String procedure, String price, String address) {
        this.providerName = provider;
        this.procedureName = procedure;
        this.price = price;
        this.address = address;
    }

    /**
     * @return the providerName
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * @return the procedureName
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    
}

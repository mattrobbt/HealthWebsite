/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;

import data.Procedure;
import data.Provider;

/**
 * Temporary Interface to deal with Treatments - placeholder for now
 * @author charleshewitt
 */

public interface Treatment {
    public String getProviderName();
    public String getProcedureName();
    public String getPrice();
    public String getAddress();
    public void setProviderName(String newProviderName);
    public void setProcedureName(String newProcedureName);
    public void setPrice(String newPrice);
    public void setAddress(String newAddress);
}
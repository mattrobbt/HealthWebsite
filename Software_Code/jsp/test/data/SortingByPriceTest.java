/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import htmlgeneration.Treatment;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mengqijiang
 */
public class SortingByPriceTest {
    
    public SortingByPriceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sortingByPriceHightoLow method, of class SortingByPrice.
     */
    @Test
    public void testSortingByPriceHightoLow() {
        System.out.println("sortingByPriceHightoLow");
        String searchProcedure = "375";
        int maxprice = 10000;
        SortingByPrice instance = new SortingByPrice();
        DbConTemplate item=new DbConTemplate();
        String query= "select * "
               + "from 19agileteam16db.treatment as treatment "
               + "inner join 19agileteam16db.provider as provider on treatment.providerID=provider.providerID "
               + "inner join 19agileteam16db.procedures as procedures on treatment.proceduresID=procedures.proceduresID "
               + "where (procedures.proceduresID=\"375\" or procedures.description like '%375%') and "
               + "treatment.AveragePayments<10000 "
               + "order by treatment.AveragePayments desc"; 
        List<Treatment> expResult = item.dbQuery(query);
        List<Treatment> result = instance.sortingByPriceHightoLow(searchProcedure, maxprice);
        assertEquals(expResult.size(),result.size());
        for(int i=0;i<expResult.size();i++){
            assertEquals(expResult.get(0).ProceduresID,result.get(0).ProceduresID);//ProceduresID is the Primary Key of procedure table
            assertEquals(expResult.get(0).ProviderID,result.get(0).ProviderID);//ProviderID is the Primary Key of provider table
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sortingByPriceLowtoHigh method, of class SortingByPrice.
     */
    @Test
    public void testSortingByPriceLowtoHigh() {
        System.out.println("sortingByPriceHightoLow");
        String searchProcedure = "375";
        int maxprice = 10000;
        SortingByPrice instance = new SortingByPrice();
        DbConTemplate item=new DbConTemplate();
        String query= "select * "
               + "from 19agileteam16db.treatment as treatment "
               + "inner join 19agileteam16db.provider as provider on treatment.providerID=provider.providerID "
               + "inner join 19agileteam16db.procedures as procedures on treatment.proceduresID=procedures.proceduresID "
               + "where (procedures.proceduresID=\"375\" or procedures.description like '%375%') and "
               + "treatment.AveragePayments<10000 "
               + "order by treatment.AveragePayments asc"; 
        List<Treatment> expResult = item.dbQuery(query);
        List<Treatment> result = instance.sortingByPriceLowtoHigh(searchProcedure, maxprice);
        assertEquals(expResult.size(),result.size());
        for(int i=0;i<expResult.size();i++){
            assertEquals(expResult.get(0).ProceduresID,result.get(0).ProceduresID);//ProceduresID is the Primary Key of procedure table
            assertEquals(expResult.get(0).ProviderID,result.get(0).ProviderID);//ProviderID is the Primary Key of provider table
        }
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

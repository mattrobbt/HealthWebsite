/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;

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
public class TreatmentTest {
    
    public TreatmentTest() {
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
     * Test of getProviderID method, of class Treatment.
     */
    @Test
    public void testGetAndSetProviderID() {
        System.out.println("getandsetProviderID");
        Treatment instance = new Treatment();
        String expResult = "010001";
        instance.setProviderID(expResult);
        assertEquals(instance.getProviderID(), expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCity method, of class Treatment.
     */
    @Test
    public void testGetAndSetCity() {
        System.out.println("getandsetCity");
        Treatment instance = new Treatment();
        String expResult = "DOTHAN";
        instance.setCity(expResult);
        assertEquals(expResult,instance.getCity());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getState method, of class Treatment.
     */
    @Test
    public void testGetAndSetState() {
        System.out.println("getandsetState");
        Treatment instance = new Treatment();
        String expResult = "AL";
        instance.setState(expResult);
        assertEquals(expResult, instance.getState());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getZipCode method, of class Treatment.
     */
    @Test
    public void testGetAndSetZipCode() {
        System.out.println("getandsetZipCode");
        Treatment instance = new Treatment();
        String expResult = "36301";
        instance.setZipCode(expResult);
        assertEquals(expResult, instance.getZipCode());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHRR method, of class Treatment.
     */
    @Test
    public void testGetAndSetHRR() {
        System.out.println("getandsetHRR");
        Treatment instance = new Treatment();
        String expResult = "AL - Dothan";
        instance.setHRR(expResult);
        assertEquals(expResult, instance.getHRR());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getProceduresID method, of class Treatment.
     */
    @Test
    public void testGetAndSetProceduresID() {
        System.out.println("getandsetProceduresID");
        Treatment instance = new Treatment();
        String expResult = "375";
        instance.setProceduresID(expResult);
        assertEquals(expResult, instance.getProceduresID());
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getProviderName method, of class Treatment.
     */
    @Test
    public void testGetAndSetProviderName() {
        System.out.println("getandsetProviderName");
        Treatment instance = new Treatment();
        String expResult = "SOUTHEAST ALABAMA MEDICAL CENTER";
        instance.setProviderName(expResult);
        assertEquals(expResult, instance.getProviderName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getProcedureName method, of class Treatment.
     */
    @Test
    public void testGetAndSetProcedureName() {
        System.out.println("getandsetProcedureName");
        Treatment instance = new Treatment();
        String expResult = "SEIZURES W MCC";
        instance.setProcedureName(expResult);
        assertEquals(expResult, instance.getProcedureName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAddress method, of class Treatment.
     */
    @Test
    public void testGetAndSetAddress() {
        System.out.println("getandsetAddress");
        Treatment instance = new Treatment();
        String expResult = "1108 ROSS CLARK CIRCLE";
        instance.setAddress(expResult);
        String result = instance.getAddress();
        assertEquals(expResult, instance.getAddress());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTotalDischarge method, of class Treatment.
     */
    @Test
    public void testGetAndSetTotalDischarge() {
        System.out.println("getandsetTotalDischarge");
        Treatment instance = new Treatment();
        String expResult = "13";
        instance.setTotalDischarge(expResult);
        String result = instance.getTotalDischarge();
        assertEquals(expResult, instance.getTotalDischarge());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getProviderLat method, of class Treatment.
     */
    @Test
    public void testGetAndSetProviderLat() {
        System.out.println("getandsetProviderLat");
        Treatment instance = new Treatment();
        String expResult = "31.140065";
        instance.setProviderLat(expResult);
        String result = instance.getProviderLat();
        assertEquals(expResult, instance.getProviderLat());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of getProviderLng method, of class Treatment.
     */
    @Test
    public void testGetProviderLng() {
        System.out.println("getandsetProviderLng");
        Treatment instance = new Treatment();
        String expResult = "-85.398289";
        instance.setProviderLng(expResult);
        String result = instance.getProviderLng();
        assertEquals(expResult, instance.getProviderLng());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

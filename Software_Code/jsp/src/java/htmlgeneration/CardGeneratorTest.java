/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;
import htmlgeneration.Treatment;
import data.DbConTemplate;
import data.SearchSpecificTreatment;
/**
 *  Update to use JUnit!!!
 * @author charleshewitt
 */
public class CardGeneratorTest {
    private Treatment treatment = new Treatment();
    private TreatmentCardGenerator generator = new TreatmentCardGenerator(treatment);
    private String expectedResult = ""; // todo  
    
    public void test() {
        
        
        for (int i = 0; i < 5; i++) {
           generator.generateCard();
           

        }
    
        
    }

    public static void main(String[] args) {
        CardGeneratorTest test = new CardGeneratorTest();
        test.test();
    }
   
}

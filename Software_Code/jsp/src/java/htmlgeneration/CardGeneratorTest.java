/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;

import htmlgeneration.TreatmentCardGenerator;
import htmlgeneration.TreatmentFake;

/**
 *  Update to use JUnit!!!
 * @author charleshewitt
 */
public class CardGeneratorTest {
//    private TreatmentFake treatment = new TreatmentFake("Royal Alabama Hospital", "Heart Surgery", "$46524","1470 S Washington St </br> North Attleboro </br>AL </br>276023");
    private TreatmentCardGenerator generator = new TreatmentCardGenerator(treatment);
    private String expectedResult = ""; // todo  
    
    public void test() {
        String result = "";
        
        for (int i = 0; i < 5; i++) {
           result += generator.generateCard(i);
           
           result += "\n\n\n";

        }
    
        System.out.println(result);
    }

    public static void main(String[] args) {
        CardGeneratorTest test = new CardGeneratorTest();
        test.test();
    }
   
}

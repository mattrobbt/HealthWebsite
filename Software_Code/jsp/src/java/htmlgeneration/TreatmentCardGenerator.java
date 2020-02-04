/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgeneration;



/**
 *
 * @author charleshewitt
 */
public class TreatmentCardGenerator {
    private Treatment treatment;
    
    public TreatmentCardGenerator(Treatment treatment){
     this.treatment = treatment;
    }
    
    /** 
     * Todo: split up into smaller sections & use actual data classes
     */
    public String generateCard(int index) {
        String providerName = treatment.getProviderName();
        String procedureName = treatment.getProcedureName();
        String price = treatment.getPrice();
        String address = treatment.getAddress();
        
        String html = "<div class=\"card col-lg-10 col\">\n";
        html += "<div class=\"card-body\" id=\"card" + index + "\">\n";
        html += "     <a class=\"col-lg-10 col offset-11\" data-toggle=\"modal\" data-target=\"#myModal\"><img  id=\"map\" src=\"images/map.png\" style=\"max-width: 10%;\" ></a>\n";
        html += "     <h6 class=\"card-title offset-10\">6.0 mi</h6>\n";
        html += "    <h4 class=\"card-title\">" + providerName + "</h4>\n";
        html += "     <h6 class=\"card-subtitle\">" + procedureName + "</h6>\n";
        html += "     <h6 class=\"\">$" + price + "</h6>\n";  
        html += "     <span class=\"fa fa-star checked\"></span>\n";
        html += "     <span class=\"fa fa-star checked\"></span>\n";
        html += "     <span class=\"fa fa-star checked\"></span>\n";
        html += "   <span class=\"fa fa-star\"></span>\n";
        html += "    <span class=\"fa fa-star\"></span>\n";
        html += "    <div class=\"showing-hidden\">\n";
        html += "      <button class=\"btn btn-primary btn-block\" onclick=\"onClickShow(document.getElementById('card" + index + "'))\">Show more</button>\n";
        html += "   </div>\n";
        html += "   <div class=\"hide\">\n";
        html += "\n";
        html += "    " + address + "\n";
        html += "    <button class=\"btn btn-outline-primary btn-block\" onclick=\"onClickShow(document.getElementById('card" + index + "'))\">Show less</button>\n";
        html += "  </div>\n";
        html += " </div>\n";
        html += "</div>";
        
        return html;
    }
    
}

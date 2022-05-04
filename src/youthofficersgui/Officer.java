/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youthofficersgui;

/**
 *
 * @author martin.atanasov
 */
public class Officer {
     private String nameOfOfficer;
    private String contactOfOfficer;
    
    public void setNameOfOfficer(String name){
        this.nameOfOfficer = name;
    }
    public void setContactOfOfficer(String name){
        this.contactOfOfficer = name;
    }
    public String getNameOfOfficer(){
        return nameOfOfficer;
    }
    public String getContactOfOfficer(){
        return contactOfOfficer;
    }
}

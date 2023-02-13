/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

/**
 *
 * @author OEM
 */
public class ConsumersModel {
    private int consumerID ;
    private String name;
    private String surname;
    private String adress;
    private String city;
    private int postcode;
    private String email;
    private int telephone;
    
    
    public ConsumersModel(Integer consumerID, String name, String surname, String adress, String city, int postcode, String email, int telephone) {
        this.consumerID = consumerID;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.city = city;
        this.postcode = postcode;
        this.email = email;
        this.telephone = telephone;
    }

    public int getConsumerID() {
        return consumerID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getCity() {
        return city;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }
    
    
}

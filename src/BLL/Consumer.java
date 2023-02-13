/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author OEM
 */
@Entity
@Table(name = "Consumer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consumer.findAll", query = "SELECT c FROM Consumer c")
    , @NamedQuery(name = "Consumer.findByConsumerID", query = "SELECT c FROM Consumer c WHERE c.consumerID = :consumerID")
    , @NamedQuery(name = "Consumer.findByName", query = "SELECT c FROM Consumer c WHERE c.name = :name")
    , @NamedQuery(name = "Consumer.findBySurname", query = "SELECT c FROM Consumer c WHERE c.surname = :surname")
    , @NamedQuery(name = "Consumer.findByAdress", query = "SELECT c FROM Consumer c WHERE c.adress = :adress")
    , @NamedQuery(name = "Consumer.findByCity", query = "SELECT c FROM Consumer c WHERE c.city = :city")
    , @NamedQuery(name = "Consumer.findByPostCode", query = "SELECT c FROM Consumer c WHERE c.postCode = :postCode")
    , @NamedQuery(name = "Consumer.findByEmail", query = "SELECT c FROM Consumer c WHERE c.email = :email")
    , @NamedQuery(name = "Consumer.findByTelephone", query = "SELECT c FROM Consumer c WHERE c.telephone = :telephone")})
public class Consumer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ConsumerID")
     @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer consumerID;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "Adress")
    private String adress;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "PostCode")
    private int postCode;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Telephone")
    private int telephone;
    @OneToMany(mappedBy = "consumerID")
    private Collection<Delivery> deliveryCollection;

    public Consumer() {
    }

    public Consumer(Integer consumerID) {
        this.consumerID = consumerID;
    }

    public Consumer(Integer consumerID, String name, String surname, String adress, String city, int postCode, String email, int telephone) {
        this.consumerID = consumerID;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.city = city;
        this.postCode = postCode;
        this.email = email;
        this.telephone = telephone;
    }

    public Integer getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(Integer consumerID) {
        this.consumerID = consumerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @XmlTransient
    public Collection<Delivery> getDeliveryCollection() {
        return deliveryCollection;
    }

    public void setDeliveryCollection(Collection<Delivery> deliveryCollection) {
        this.deliveryCollection = deliveryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumerID != null ? consumerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumer)) {
            return false;
        }
        Consumer other = (Consumer) object;
        if ((this.consumerID == null && other.consumerID != null) || (this.consumerID != null && !this.consumerID.equals(other.consumerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name+" "+surname+ " : "+telephone;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OEM
 */
@Entity
@Table(name = "Delivery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d")
    , @NamedQuery(name = "Delivery.findByDeliveryID", query = "SELECT d FROM Delivery d WHERE d.deliveryID = :deliveryID")
    , @NamedQuery(name = "Delivery.findByTicketNr", query = "SELECT d FROM Delivery d WHERE d.ticketNr = :ticketNr")
    , @NamedQuery(name = "Delivery.findByPrice", query = "SELECT d FROM Delivery d WHERE d.price = :price")
    , @NamedQuery(name = "Delivery.findByPaymentMethod", query = "SELECT d FROM Delivery d WHERE d.paymentMethod = :paymentMethod")})
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DeliveryID")
     @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer deliveryID;
    @Basic(optional = false)
    @Column(name = "TicketNr")
    private int ticketNr;
    @Basic(optional = false)
    @Column(name = "Price")
    private double price;
    @Column(name = "PaymentMethod")
    private String paymentMethod;
    @JoinColumn(name = "ConsumerID", referencedColumnName = "ConsumerID")
    @ManyToOne
    private Consumer consumerID;

    public Delivery() {
    }

    public Delivery(Integer deliveryID) {
        this.deliveryID = deliveryID;
    }

    public Delivery(Integer deliveryID, int ticketNr, double price) {
        this.deliveryID = deliveryID;
        this.ticketNr = ticketNr;
        this.price = price;
    }

    public Integer getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(Integer deliveryID) {
        this.deliveryID = deliveryID;
    }

    public int getTicketNr() {
        return ticketNr;
    }

    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Consumer getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(Consumer consumerID) {
        this.consumerID = consumerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryID != null ? deliveryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryID == null && other.deliveryID != null) || (this.deliveryID != null && !this.deliveryID.equals(other.deliveryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Delivery[ deliveryID=" + deliveryID + " ]";
    }
    
}

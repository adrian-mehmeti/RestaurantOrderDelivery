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
@Table(name = "Ordery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordery.findAll", query = "SELECT o FROM Ordery o")
    , @NamedQuery(name = "Ordery.findByOrderyID", query = "SELECT o FROM Ordery o WHERE o.orderyID = :orderyID")
    , @NamedQuery(name = "Ordery.findByTicketNr", query = "SELECT o FROM Ordery o WHERE o.ticketNr = :ticketNr")
    , @NamedQuery(name = "Ordery.findByPrice", query = "SELECT o FROM Ordery o WHERE o.price = :price")})
public class Ordery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OrderyID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer orderyID;
    @Basic(optional = false)
    @Column(name = "TicketNr")
    private int ticketNr;
    @Basic(optional = false)
    @Column(name = "Price")
    private double price;

    public Ordery() {
    }

    public Ordery(Integer orderyID) {
        this.orderyID = orderyID;
    }

    public Ordery(Integer orderyID, int ticketNr, double price) {
        this.orderyID = orderyID;
        this.ticketNr = ticketNr;
        this.price = price;
    }

    public Integer getOrderyID() {
        return orderyID;
    }

    public void setOrderyID(Integer orderyID) {
        this.orderyID = orderyID;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderyID != null ? orderyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordery)) {
            return false;
        }
        Ordery other = (Ordery) object;
        if ((this.orderyID == null && other.orderyID != null) || (this.orderyID != null && !this.orderyID.equals(other.orderyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Ordery[ orderyID=" + orderyID + " ]";
    }
    
}

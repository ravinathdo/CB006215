/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ravi
 */
@Entity
@Table(name = "paymentcb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paymentcb006215.findAll", query = "SELECT p FROM Paymentcb006215 p")
    , @NamedQuery(name = "Paymentcb006215.findById", query = "SELECT p FROM Paymentcb006215 p WHERE p.id = :id")
    , @NamedQuery(name = "Paymentcb006215.findByBcn", query = "SELECT p FROM Paymentcb006215 p WHERE p.bcn = :bcn")
    , @NamedQuery(name = "Paymentcb006215.findByAmount", query = "SELECT p FROM Paymentcb006215 p WHERE p.amount = :amount")
    , @NamedQuery(name = "Paymentcb006215.findByPlace", query = "SELECT p FROM Paymentcb006215 p WHERE p.place = :place")
    , @NamedQuery(name = "Paymentcb006215.findByEvent", query = "SELECT p FROM Paymentcb006215 p WHERE p.event = :event")
    , @NamedQuery(name = "Paymentcb006215.findByAction", query = "SELECT p FROM Paymentcb006215 p WHERE p.action = :action")
    , @NamedQuery(name = "Paymentcb006215.findByDescription", query = "SELECT p FROM Paymentcb006215 p WHERE p.description = :description")})
public class Paymentcb006215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "bcn")
    private String bcn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private BigDecimal amount;
    @Size(max = 50)
    @Column(name = "place")
    private String place;
    @Size(max = 50)
    @Column(name = "event")
    private String event;
    @Size(max = 100)
    @Column(name = "action")
    private String action;
    @Size(max = 100)
    @Column(name = "description")
    private String description;

    public Paymentcb006215() {
    }

    public Paymentcb006215(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBcn() {
        return bcn;
    }

    public void setBcn(String bcn) {
        this.bcn = bcn;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paymentcb006215)) {
            return false;
        }
        Paymentcb006215 other = (Paymentcb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Paymentcb006215[ id=" + id + " ]";
    }
    
}

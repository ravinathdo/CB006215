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
@Table(name = "topupcb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Topupcb006215.findAll", query = "SELECT t FROM Topupcb006215 t")
    , @NamedQuery(name = "Topupcb006215.findById", query = "SELECT t FROM Topupcb006215 t WHERE t.id = :id")
    , @NamedQuery(name = "Topupcb006215.findByBcn", query = "SELECT t FROM Topupcb006215 t WHERE t.bcn = :bcn")
    , @NamedQuery(name = "Topupcb006215.findByAmount", query = "SELECT t FROM Topupcb006215 t WHERE t.amount = :amount")})
public class Topupcb006215 implements Serializable {

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

    public Topupcb006215() {
    }

    public Topupcb006215(Integer id) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Topupcb006215)) {
            return false;
        }
        Topupcb006215 other = (Topupcb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Topupcb006215[ id=" + id + " ]";
    }
    
}

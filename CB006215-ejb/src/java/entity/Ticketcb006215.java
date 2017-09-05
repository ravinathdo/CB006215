/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ravi
 */
@Entity
@Table(name = "ticketcb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticketcb006215.findAll", query = "SELECT t FROM Ticketcb006215 t")
    , @NamedQuery(name = "Ticketcb006215.findById", query = "SELECT t FROM Ticketcb006215 t WHERE t.id = :id")
    , @NamedQuery(name = "Ticketcb006215.findByFname", query = "SELECT t FROM Ticketcb006215 t WHERE t.fname = :fname")
    , @NamedQuery(name = "Ticketcb006215.findByLname", query = "SELECT t FROM Ticketcb006215 t WHERE t.lname = :lname")
    , @NamedQuery(name = "Ticketcb006215.findByTictype", query = "SELECT t FROM Ticketcb006215 t WHERE t.tictype = :tictype")
    , @NamedQuery(name = "Ticketcb006215.findByAmount", query = "SELECT t FROM Ticketcb006215 t WHERE t.amount = :amount")
    , @NamedQuery(name = "Ticketcb006215.findByBcn", query = "SELECT t FROM Ticketcb006215 t WHERE t.bcn = :bcn")
    , @NamedQuery(name = "Ticketcb006215.findByBalance", query = "SELECT t FROM Ticketcb006215 t WHERE t.balance = :balance")
    , @NamedQuery(name = "Ticketcb006215.findByStatus", query = "SELECT t FROM Ticketcb006215 t WHERE t.status = :status")
    , @NamedQuery(name = "Ticketcb006215.findByReimburse", query = "SELECT t FROM Ticketcb006215 t WHERE t.reimburse = :reimburse")
    , @NamedQuery(name = "Ticketcb006215.findByTimecreated", query = "SELECT t FROM Ticketcb006215 t WHERE t.timecreated = :timecreated")
    , @NamedQuery(name = "Ticketcb006215.findByUsercreated", query = "SELECT t FROM Ticketcb006215 t WHERE t.usercreated = :usercreated")})
public class Ticketcb006215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "fname")
    private String fname;
    @Size(max = 50)
    @Column(name = "lname")
    private String lname;
    @Size(max = 10)
    @Column(name = "tictype")
    private String tictype;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private BigDecimal amount;
    @Size(max = 150)
    @Column(name = "bcn")
    private String bcn;
    @Column(name = "balance")
    private BigDecimal balance;
    @Size(max = 10)
    @Column(name = "status")
    private String status;
    @Size(max = 10)
    @Column(name = "reimburse")
    private String reimburse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timecreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timecreated;
    @Column(name = "usercreated")
    private Integer usercreated;

    public Ticketcb006215() {
    }

    public Ticketcb006215(Integer id) {
        this.id = id;
    }

    public Ticketcb006215(Integer id, Date timecreated) {
        this.id = id;
        this.timecreated = timecreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTictype() {
        return tictype;
    }

    public void setTictype(String tictype) {
        this.tictype = tictype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBcn() {
        return bcn;
    }

    public void setBcn(String bcn) {
        this.bcn = bcn;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReimburse() {
        return reimburse;
    }

    public void setReimburse(String reimburse) {
        this.reimburse = reimburse;
    }

    public Date getTimecreated() {
        return timecreated;
    }

    public void setTimecreated(Date timecreated) {
        this.timecreated = timecreated;
    }

    public Integer getUsercreated() {
        return usercreated;
    }

    public void setUsercreated(Integer usercreated) {
        this.usercreated = usercreated;
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
        if (!(object instanceof Ticketcb006215)) {
            return false;
        }
        Ticketcb006215 other = (Ticketcb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ticketcb006215[ id=" + id + " ]";
    }
    
}

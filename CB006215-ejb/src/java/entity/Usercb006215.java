/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "usercb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usercb006215.findAll", query = "SELECT u FROM Usercb006215 u")
    , @NamedQuery(name = "Usercb006215.findById", query = "SELECT u FROM Usercb006215 u WHERE u.id = :id")
    , @NamedQuery(name = "Usercb006215.findByFname", query = "SELECT u FROM Usercb006215 u WHERE u.fname = :fname")
    , @NamedQuery(name = "Usercb006215.findByLname", query = "SELECT u FROM Usercb006215 u WHERE u.lname = :lname")
    , @NamedQuery(name = "Usercb006215.findByUsername", query = "SELECT u FROM Usercb006215 u WHERE u.username = :username")
    , @NamedQuery(name = "Usercb006215.findByType", query = "SELECT u FROM Usercb006215 u WHERE u.type = :type")})
public class Usercb006215 implements Serializable {

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
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Size(max = 10)
    @Column(name = "type")
    private String type;
    @Lob
    @Size(max = 65535)
    @Column(name = "pword")
    private String pword;

    public Usercb006215() {
    }

    public Usercb006215(Integer id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
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
        if (!(object instanceof Usercb006215)) {
            return false;
        }
        Usercb006215 other = (Usercb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usercb006215[ id=" + id + " ]";
    }
    
}

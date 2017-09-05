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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ravi
 */
@Entity
@Table(name = "placecb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Placecb006215.findAll", query = "SELECT p FROM Placecb006215 p")
    , @NamedQuery(name = "Placecb006215.findByPlacename", query = "SELECT p FROM Placecb006215 p WHERE p.placename = :placename")})
public class Placecb006215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "placename")
    private String placename;

    public Placecb006215() {
    }

    public Placecb006215(String placename) {
        this.placename = placename;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placename != null ? placename.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Placecb006215)) {
            return false;
        }
        Placecb006215 other = (Placecb006215) object;
        if ((this.placename == null && other.placename != null) || (this.placename != null && !this.placename.equals(other.placename))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Placecb006215[ placename=" + placename + " ]";
    }
    
}

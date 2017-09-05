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
@Table(name = "attractioncb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attractioncb006215.findAll", query = "SELECT a FROM Attractioncb006215 a")
    , @NamedQuery(name = "Attractioncb006215.findById", query = "SELECT a FROM Attractioncb006215 a WHERE a.id = :id")
    , @NamedQuery(name = "Attractioncb006215.findByPlace", query = "SELECT a FROM Attractioncb006215 a WHERE a.place = :place")
    , @NamedQuery(name = "Attractioncb006215.findByEvent", query = "SELECT a FROM Attractioncb006215 a WHERE a.event = :event")
    , @NamedQuery(name = "Attractioncb006215.findByShowtime", query = "SELECT a FROM Attractioncb006215 a WHERE a.showtime = :showtime")})
public class Attractioncb006215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "place")
    private String place;
    @Size(max = 50)
    @Column(name = "event")
    private String event;
    @Size(max = 50)
    @Column(name = "showtime")
    private String showtime;

    public Attractioncb006215() {
    }

    public Attractioncb006215(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
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
        if (!(object instanceof Attractioncb006215)) {
            return false;
        }
        Attractioncb006215 other = (Attractioncb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Attractioncb006215[ id=" + id + " ]";
    }
    
}

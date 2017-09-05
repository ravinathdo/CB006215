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
@Table(name = "photocb006215")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Photocb006215.findAll", query = "SELECT p FROM Photocb006215 p")
    , @NamedQuery(name = "Photocb006215.findById", query = "SELECT p FROM Photocb006215 p WHERE p.id = :id")
    , @NamedQuery(name = "Photocb006215.findByBcn", query = "SELECT p FROM Photocb006215 p WHERE p.bcn = :bcn")
    , @NamedQuery(name = "Photocb006215.findByPhotopath", query = "SELECT p FROM Photocb006215 p WHERE p.photopath = :photopath")
    , @NamedQuery(name = "Photocb006215.findByStatus", query = "SELECT p FROM Photocb006215 p WHERE p.status = :status")})
public class Photocb006215 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "bcn")
    private String bcn;
    @Size(max = 100)
    @Column(name = "photopath")
    private String photopath;
    @Size(max = 10)
    @Column(name = "status")
    private String status;

    public Photocb006215() {
    }

    public Photocb006215(Integer id) {
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

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Photocb006215)) {
            return false;
        }
        Photocb006215 other = (Photocb006215) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Photocb006215[ id=" + id + " ]";
    }
    
}

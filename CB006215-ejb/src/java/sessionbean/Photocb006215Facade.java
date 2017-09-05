/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Photocb006215;
import entity.Ticketcb006215;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ravi
 */
@Stateless
public class Photocb006215Facade extends AbstractFacade<Photocb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Photocb006215Facade() {
        super(Photocb006215.class);
    }

    public List<Photocb006215> getPhotoList(String bcn) {
        Query createNamedQuery = em.createQuery("SELECT p FROM Photocb006215 p WHERE p.bcn=:bcno AND p.status=:status");
        createNamedQuery.setParameter("bcno", bcn);
        createNamedQuery.setParameter("status", "ACT");
        List<Photocb006215> resultList = createNamedQuery.getResultList();
        return resultList;
    }
    
    public void updatePhotoStatus(String bcn){
            Query createNamedQuery = em.createQuery("UPDATE Photocb006215 p SET p.status=:s  WHERE p.bcn=:bcno ");
            createNamedQuery.setParameter("s", "PAY");
            createNamedQuery.setParameter("bcno", bcn);
            createNamedQuery.executeUpdate();
    }
}

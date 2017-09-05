/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Custlockercb006215;
import java.math.BigDecimal;
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
public class Custlockercb006215Facade extends AbstractFacade<Custlockercb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Custlockercb006215Facade() {
        super(Custlockercb006215.class);
    }
    
    public void setLocker(String type, String bcn, BigDecimal amount) {
        Custlockercb006215 custlockercb006215 = new Custlockercb006215();
        custlockercb006215.setBcn(bcn);
        custlockercb006215.setAmount(amount);
        custlockercb006215.setLockertype(type);
        em.persist(custlockercb006215);
        em.flush();
    }

    public List<Custlockercb006215> getLockerList(String bcn) {
        Query createNamedQuery = em.createQuery("SELECT t FROM Custlockercb006215 t WHERE t.bcn=:bcno");
        createNamedQuery.setParameter("bcno", bcn);
        List<Custlockercb006215> resultList = createNamedQuery.getResultList();
        return resultList;
    }
   
}

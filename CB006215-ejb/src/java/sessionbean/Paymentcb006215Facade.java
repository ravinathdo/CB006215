/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Paymentcb006215;
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
public class Paymentcb006215Facade extends AbstractFacade<Paymentcb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Paymentcb006215Facade() {
        super(Paymentcb006215.class);
    }
    
     public List<Paymentcb006215> getPaymentList(String bcn) {
        Query createNamedQuery = em.createQuery("SELECT p FROM Paymentcb006215 p WHERE p.bcn=:bcno");
        createNamedQuery.setParameter("bcno", bcn);
        List<Paymentcb006215> resultList = createNamedQuery.getResultList();
        return resultList;
    }
    
    public void setPayment(String bcn,BigDecimal amount,String place,String event,String action,String des){
        Paymentcb006215 paymentcb006215 = new Paymentcb006215();
        paymentcb006215.setBcn(bcn);
        paymentcb006215.setAmount(amount);
        paymentcb006215.setPlace(place);
        paymentcb006215.setEvent(event);
        paymentcb006215.setAction(action);
        paymentcb006215.setDescription(action);
        em.persist(paymentcb006215);
        em.flush();
    }
    
}

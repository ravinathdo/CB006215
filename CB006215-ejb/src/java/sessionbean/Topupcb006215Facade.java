/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Topupcb006215;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ravi
 */
@Stateless
public class Topupcb006215Facade extends AbstractFacade<Topupcb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Topupcb006215Facade() {
        super(Topupcb006215.class);
    }
    
    public void setTopup(String bcn,BigDecimal amount){
        Topupcb006215 topupcb006215 = new Topupcb006215();
        topupcb006215.setBcn(bcn);
        topupcb006215.setAmount(amount);
        em.persist(topupcb006215);
        em.flush();
    }
    
}

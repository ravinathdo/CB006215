/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Extremeparkcb006215;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ravi
 */
@Stateless
public class Extremeparkcb006215Facade extends AbstractFacade<Extremeparkcb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Extremeparkcb006215Facade() {
        super(Extremeparkcb006215.class);
    }

    public List<Extremeparkcb006215> getExtremeGames() {
        List<Extremeparkcb006215> resultList = em.createNamedQuery("Extremeparkcb006215.findAll").getResultList();
        return resultList;
    }

}

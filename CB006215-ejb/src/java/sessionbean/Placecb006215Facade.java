/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Placecb006215;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ravi
 */
@Stateless
public class Placecb006215Facade extends AbstractFacade<Placecb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Placecb006215Facade() {
        super(Placecb006215.class);
    }
    
}

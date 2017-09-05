/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Usercb006215;
import java.util.ArrayList;
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
public class Usercb006215Facade extends AbstractFacade<Usercb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Usercb006215Facade() {
        super(Usercb006215.class);
    }
    
    
        public Usercb006215 doLogin(String username, String password) {
        System.out.println("ejb->doLogin");
        List<Usercb006215> userList = new ArrayList<>();
        try {
            String query = "SELECT u FROM Usercb006215 u WHERE u.username = :username AND u.pword = :password ";
            Query createQuery = em.createQuery(query);

            createQuery.setParameter("username", username);
            createQuery.setParameter("password", password);
            userList = createQuery.getResultList();
            System.out.println("userList size:"+userList.size());
            if(userList.size()>0){
            return userList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}

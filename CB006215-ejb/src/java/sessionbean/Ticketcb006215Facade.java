/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entity.Ticketcb006215;
import java.math.BigDecimal;
import java.sql.Timestamp;
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
public class Ticketcb006215Facade extends AbstractFacade<Ticketcb006215> {

    @PersistenceContext(unitName = "CB006215-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Ticketcb006215Facade() {
        super(Ticketcb006215.class);
    }
    
    
    public Ticketcb006215 setTicket(String fname, String lname, String type, String amount) {
        System.out.println("ejb->setTicket");
        Ticketcb006215 ticketcb006215 = new Ticketcb006215();
        try {
            ticketcb006215.setFname(fname);
            ticketcb006215.setLname(lname);
            ticketcb006215.setTictype(type);
            ticketcb006215.setAmount(new BigDecimal(amount));
            ticketcb006215.setBcn("123");
            ticketcb006215.setBalance(new BigDecimal(amount));
            ticketcb006215.setStatus("ACT");
            ticketcb006215.setReimburse("150");
            ticketcb006215.setUsercreated(1);

            Timestamp time = new Timestamp(System.currentTimeMillis());
            ticketcb006215.setTimecreated(time);

            em.persist(ticketcb006215);
            em.flush();
            System.out.println("ticket id:" + ticketcb006215.getId());

            //set BCN
            Ticketcb006215 find = em.find(Ticketcb006215.class, ticketcb006215.getId());
            find.setBcn("CB0006215-" + ticketcb006215.getId());
            em.merge(find);
            em.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketcb006215;
    }

    public void setBarcode(int tid) {

    }

    public List<Ticketcb006215> getTickets() {
        List<Ticketcb006215> resultList = em.createNamedQuery("Ticketcb006215.findAll").getResultList();
        return resultList;
    }

    public Ticketcb006215 getTicketFromBCN(String bcn) {
        Query createNamedQuery = em.createQuery("SELECT t FROM Ticketcb006215 t WHERE t.bcn=:bcno");
        createNamedQuery.setParameter("bcno", bcn);
        List<Ticketcb006215> resultList = createNamedQuery.getResultList();
        if (resultList.size() > 0) {
            return resultList.get(0);
        } else {
            return null;
        }
    }

    public boolean setReimbers(int id, String amount) {

        boolean flag = false;

        Ticketcb006215 find = em.find(Ticketcb006215.class, id);
        find.setReimburse(amount);
        find.setStatus("CLOSE");
        em.merge(find);
        em.flush();

        flag = true;
        return flag;
    }

    public void updateBalance(int tid,BigDecimal balance) {
        Ticketcb006215 find = em.find(Ticketcb006215.class, tid);
        find.setBalance(balance);
        em.merge(find);
        em.flush();
    }
}

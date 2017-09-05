/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cb006215.servlet.locker;

import entity.Custlockercb006215;
import entity.Ticketcb006215;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.Custlockercb006215Facade;
import sessionbean.Paymentcb006215Facade;
import sessionbean.Ticketcb006215Facade;

/**
 *
 * @author ravi
 */
public class LockerReuseServlet extends HttpServlet {

    @EJB
    private Ticketcb006215Facade ticketcb006215Facade;

    @EJB
    private Paymentcb006215Facade paymentcb006215Facade;
    
    
    @EJB
    private Custlockercb006215Facade custlockercb006215Facade;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            System.out.println("servlet->LockerReuseServlet");
            RequestDispatcher rd = null;

            HttpSession session = request.getSession();
            Ticketcb006215 ticket = (Ticketcb006215) session.getAttribute("ticket");

            String amount = request.getParameter("amount");

            BigDecimal deAmount = new BigDecimal(amount);

            //CHECK BALANCE
            if (deAmount.compareTo(ticket.getBalance()) < 0) {
                System.out.println("proceed");

                //----update ticket.balance
                BigDecimal sub = ticket.getBalance().subtract(deAmount);
                ticketcb006215Facade.updateBalance(ticket.getId(), sub);
                //sesion ticket updated
                ticket.setBalance(sub);
                session.setAttribute("ticket", ticket);
                //---//update ticket.balance

                //--add payment record
                paymentcb006215Facade.setPayment(ticket.getBcn(),
                        deAmount, "E-Locker", "Locker Re-Use", "", "");
                //--//add payment record

                request.setAttribute("msg", "<p class=\"bg-success\">Locker reuse successfully</p>");

            } else {
                System.err.println("Insufficient balance please topup ");
                request.setAttribute("msg", "<p class=\"bg-danger\">Insufficient balance please topup </p>");

            }

            
            
             //get locker list on ticket
            List<Custlockercb006215> lockerList = custlockercb006215Facade.getLockerList(ticket.getBcn());
            request.setAttribute("lockerList", lockerList);
            
            
            rd = request.getRequestDispatcher("/elaocker-reservation.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

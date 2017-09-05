/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cb006215.servlet.topup;

import entity.Ticketcb006215;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.Ticketcb006215Facade;
import sessionbean.Topupcb006215Facade;

/**
 *
 * @author ravi
 */
public class TopUpServlet extends HttpServlet {

    
    @EJB
    private Ticketcb006215Facade ticketcb006215Facade;

    @EJB
    private Topupcb006215Facade topupcb006215Facade;
    
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
             System.out.println("Servlet->TopUpServlet");
            /* TODO output your page here. You may use following sample code. */
            RequestDispatcher rd = null;

            HttpSession session = request.getSession();
            Ticketcb006215 ticket = (Ticketcb006215) session.getAttribute("ticket");
            //session getticejt
            
            String bcn = request.getParameter("bcn");
            String amount = request.getParameter("amount");
            BigDecimal bigDecimal = new BigDecimal(amount);
            //add to topup
            topupcb006215Facade.setTopup(bcn, bigDecimal);

            
            
            
            //update ticket.balance
            BigDecimal add = bigDecimal.add(ticket.getBalance());
            ticketcb006215Facade.updateBalance(ticket.getId(), add);
            //sesion ticket updated
            ticket.setBalance(add);
            
            
            session.setAttribute("ticket", ticket);
            
            
            
            
            request.setAttribute("msg", "<p class=\"bg-success\">Topup successful and balance updated</p>");
            
            rd = request.getRequestDispatcher("/reload.jsp");
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

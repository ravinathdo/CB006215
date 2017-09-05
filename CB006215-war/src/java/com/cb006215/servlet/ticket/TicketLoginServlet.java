/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cb006215.servlet.ticket;

import entity.Paymentcb006215;
import entity.Ticketcb006215;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionbean.Paymentcb006215Facade;
import sessionbean.Ticketcb006215Facade;

/**
 *
 * @author ravi
 */
public class TicketLoginServlet extends HttpServlet {

    @EJB
    private Paymentcb006215Facade paymentcb006215Facade;

    @EJB
    private Ticketcb006215Facade ticketcb006215Facade;
    
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
            System.out.println("Servlet->TicketLoginServlet");
            /* TODO output your page here. You may use following sample code. */
            RequestDispatcher rd = null;

            HttpSession session = request.getSession();
            
            String bcn = request.getParameter("bcn");
            Ticketcb006215 ticketFromBCN = ticketcb006215Facade.getTicketFromBCN(bcn);
            request.setAttribute("ticket", ticketFromBCN);
            if (ticketFromBCN.getStatus().equalsIgnoreCase("ACT")) {
                
                //get ticket summary list
                List<Paymentcb006215> paymentList = paymentcb006215Facade.getPaymentList(ticketFromBCN.getBcn());
                session.setAttribute("paymentList", paymentList);
                session.setAttribute("ticket", ticketFromBCN);
                //get new attractions list
                
                rd = request.getRequestDispatcher("/home.jsp");
            } else {
                request.setAttribute("msg", "<p class=\"bg-danger\">Ticket Closed</p>");
                rd = request.getRequestDispatcher("/index.jsp");
            }
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

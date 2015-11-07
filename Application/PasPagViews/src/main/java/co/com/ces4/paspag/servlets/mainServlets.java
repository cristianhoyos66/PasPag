/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ces4.paspag.servlets;

import co.com.ces4.paspagcontrollers.CuentaJpaController;
import co.com.ces4.paspagcontrollers.TipoCuentaJpaController;
import co.com.ces4.paspagentities.Cuenta;
import co.com.ces4.paspagentities.TipoCuenta;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cristian
 */
@WebServlet(name = "mainServlets", urlPatterns = {"/mainServlets"})
public class mainServlets extends HttpServlet {

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
            /*TipoCuentaJpaController controller = (TipoCuentaJpaController)getServletContext().getAttribute("tipoCuentajpa");
            controller.create(new TipoCuenta("otro tipo de cuenta"));*/
            try {
                Date fechaActual = new Date();
                Cuenta entidadCuenta = new Cuenta("122", fechaActual, fechaActual);
                CuentaJpaController controllerCuenta = (CuentaJpaController)getServletContext().getAttribute("cuentajpa");
                controllerCuenta.create(entidadCuenta);
            } catch (Exception ex) {
                Logger.getLogger(mainServlets.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");            
            out.println("<title>Servlet mainServlets</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet mainServlets at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
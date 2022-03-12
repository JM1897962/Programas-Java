/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Contacto;

/**
 *
 * @author famtz
 */
public class IA extends HttpServlet {

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
        ConexionBD con = new ConexionBD();
        Connection cn = (Connection) con.conexion();
        
        Contacto c = new Contacto();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Confirmacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <center><h1>Datos almacenado con exito.</h1> </center>"); 

            c.setFname(request.getParameter("fname"));
            c.setLname(request.getParameter("lname"));
            c.setCorreo(request.getParameter("correo"));
            c.setTelefono(request.getParameter("telefono"));
            c.setDireccion(request.getParameter("direccion"));
            
            out.println("<h2>Nombres: " + c.getFname() + "</h2>");
            out.println("<h2>Apellidos: " + c.getLname() + "</h2>");
            out.println("<h2>Correo: " + c.getCorreo() + "</h2>");
            out.println("<h2>Telefono: " + c.getTelefono() + "</h2>");
            out.println("<h2>Direccion: " + c.getDireccion() + "</h2>");

            try{
                PreparedStatement ps = cn.prepareStatement("INSERT INTO contactos (nombre, apellido, correo, telefono, direccion)VALUES(?,?,?,?,?)");
                ps.setString(1, request.getParameter("fname"));
                ps.setString(2, request.getParameter("lname"));
                ps.setString(3, request.getParameter("correo"));
                ps.setString(4, request.getParameter("telefono"));
                ps.setString(5, request.getParameter("direccion"));
                ps.executeUpdate();
            
            } catch (Exception e) {
                System.err.println(e);
            }
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

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

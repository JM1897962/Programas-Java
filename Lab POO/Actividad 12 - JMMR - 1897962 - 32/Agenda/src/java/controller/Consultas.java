/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author famtz
 */
public class Consultas extends HttpServlet {

    
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
   
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Muestras</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<center><h1>Consulta de Contactos.</h1> </center><br>");
            
            out.println("<h3>|| NOMBRE  ||  APELLIDO  ||  CORREO  ||  TELEFONO  ||  DIRECCION ||</h3>");
            out.println("---------------------------------------------------------------------------------------------------------------");
            Statement st;
            ResultSet rs;
            try{
                st=cn.createStatement();
                rs=st.executeQuery("SELECT * FROM contactos");
                while(rs.next()){
                    out.println("<h4>"+ " || " + rs.getInt("id") + " || " +rs.getString("nombre") + " || " + rs.getString("apellido") + " || " + rs.getString("correo") + " || " + rs.getString("telefono") + " || "+ rs.getString("direccion") + " || " + "<br></h4>");
                    out.println("---------------------------------------------------------------------------------------------------------------");
                }
                cn.close();
            }catch(Exception e){
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import sun.applet.Main;

/**
 *
 * @author famtz
 */
public class ListarDatos extends HttpServlet {

   public static void main(String[] args) {
        // TODO code application logic here
        crearXML();

    }
     
    
    
    private static void crearXML(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            List <Registro> registro = new ArrayList();
            Registro reg = new Registro();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarDatos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos Personales</h1>");
            out.println("<h1>Tu nombre es: " + request.getParameter("fname") + "</h1>");
            
            reg.setNombre(request.getParameter("fname"));
            
            out.println("<h1>Tu apellido es: " + request.getParameter("lname") + "</h1>");
            
            reg.setApellido(request.getParameter("lname"));
            
            out.println("<h1>Tu telefono es: " + request.getParameter("tel") + "</h1>");
            
            reg.setTelefono(request.getParameter("tel"));
            
            out.println("<h1>Tu direccion es: " + request.getParameter("dir") + "</h1>");
            
            reg.setDireccion(request.getParameter("dir"));
            
            out.println("</body>");
            out.println("</html>");
            
            registro.add(reg);
            Datos data = new Datos();
            data.setRegistro(registro);
            
            JAXBContext ctx = JAXBContext.newInstance(Datos.class);
            
            Marshaller ms = ctx.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            ms.marshal(data, new File("E:\\Archivos\\Poo\\ACTIVIDAD 7 - JMMR - 032 - 1897962\\Datos\\depto.xml"));
        }catch(JAXBException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    private static void crearXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        crearXML(request, response);
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
        crearXML(request, response);
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

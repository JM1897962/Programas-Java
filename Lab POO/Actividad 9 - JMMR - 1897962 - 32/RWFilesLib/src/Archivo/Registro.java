/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import sun.applet.Main;

/**
 *
 * @author famtz
 */
public abstract class Registro {
    
    public static void crearXML(String x, String y, String z, String w) {
        Scanner entrada = new Scanner(System.in);
        
        try{
            List<Contactos> contactos = new ArrayList<>();
            Contactos cont = new Contactos();
            
            cont = new Contactos();
            
            cont.setNombre(x);  
            cont.setNumero(y);
            cont.setCorreo(z);                   
            cont.setDireccion(w);
            
            contactos.add(cont);
            
            Datos data = new Datos();
            data.setContactos(contactos);
            
            JAXBContext ctx = JAXBContext.newInstance(Datos.class);
            
            Marshaller ms = ctx.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            ms.marshal(data, new File("E:\\Archivos\\Lab POO\\Actividad 9 - JMMR - 1897962 - 32\\datos\\depto.xml"));
        }catch(JAXBException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    private static void leerXML(){
        try{
            JAXBContext ctx = JAXBContext.newInstance(Datos.class);
            Unmarshaller ums = ctx.createUnmarshaller();
            
            Datos data = (Datos)ums.unmarshal(new File ("E:\\Archivos\\Lab POO\\Actividad 8 - JMMR - 1897962 - 32\\Datos\\depto.xml"));
            
            System.out.println("Los contactos son.\n ");
            for(Contactos cont : data.getContactos()){
                System.out.println("Nombre: " + cont.getNombre() + "\nCorreo: " + cont.getCorreo() + "\nDireccion: " + cont.getDireccion() + "\nNumeros: " + cont.getNumero() + "\n\n");
            }
        }catch(JAXBException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}

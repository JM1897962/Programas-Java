/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import sun.applet.Main;
import java.util.Scanner;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author famtz
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crearXML();
        leerXML();
    }

    private static void crearXML() {
        int i;
        Scanner entrada = new Scanner(System.in);
        
        try{
            
            List<Contactos> contactos = new ArrayList<>();
            
            Contactos cont[] = new Contactos[5];
            System.out.println("A continuacion, ingresaras a 5 contactos en el XML.");
            
            for(i=0; i<5; i++)
                {
                    cont[i] = new Contactos();
                    System.out.println("Contacto #" + (i+1));
                    System.out.print("Ingresa el nombre del contacto: ");
                    cont[i].setNombre(entrada.nextLine());
                    System.out.print("Ingresa el correo del contacto: ");
                    cont[i].setCorreo(entrada.nextLine());
                    System.out.print("Ingresa la direccion del contacto: ");
                    cont[i].setDireccion(entrada.nextLine());
                    System.out.print("Ingresa el numero del contacto: ");
                    cont[i].setNumero(entrada.nextLine());
                    System.out.println("");
                    contactos.add(cont[i]);
                }
            
            Datos data = new Datos();
            data.setContactos(contactos);
            
            JAXBContext ctx = JAXBContext.newInstance(Datos.class);
            
            Marshaller ms = ctx.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            ms.marshal(data, new File("E:\\Archivos\\Lab POO\\Actividad 8 - JMMR - 1897962 - 32\\Datos\\depto.xml"));
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

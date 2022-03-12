/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 *
 * @author famtz
 */
public class Datos {
    private List<Contactos> contactos;
    
    public Datos(){
        
    }
    
    public List<Contactos> getContactos(){
        return contactos;
    }
    
    @XmlElement(name="contacto")
    public void setContactos(List<Contactos>contactos){
        this.contactos = contactos;
    }
}

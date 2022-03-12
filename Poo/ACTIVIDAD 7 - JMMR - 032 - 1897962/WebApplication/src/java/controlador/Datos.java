/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
/**
 *
 * @author famtz
 */
public class Datos {
    private List<Registro> registro;
    
    public Datos(){
        
    }
    
    public List<Registro> getRegistro(){
        return registro;
    }
    
    @XmlElement(name="registros")
    public void setRegistro(List<Registro>registro){
        this.registro = registro;
    }
}

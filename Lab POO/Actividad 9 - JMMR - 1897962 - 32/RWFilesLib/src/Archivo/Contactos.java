/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author famtz
 */

@XmlType(propOrder = {"nombre", "numero", "correo", "direccion"})
public class Contactos{

    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public String getCorreo() {
        return correo;
    }

 
    public void setCorreo(String correo) {
        this.correo = correo;
    }

  
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    private String nombre;
    private String numero;
    private String correo;
    private String direccion;
    
   /* public static void nombre(String x){
        System.out.println(x);
    } 
    
    public static void numero(String y){
        System.out.println(y);
    } 
    
    public static void correo(String z){
        System.out.println(z);
    } 
    
    public static void direccion(String w){
        System.out.println(w);
    } */
    
}

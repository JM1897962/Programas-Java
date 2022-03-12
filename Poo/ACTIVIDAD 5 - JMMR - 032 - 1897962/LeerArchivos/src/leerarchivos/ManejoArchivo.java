/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;
import java.io.*;
/**
 *
 * @author famtz
 */
public class ManejoArchivo {

    public String leerinfo(String direccion) throws FileNotFoundException, IOException{
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null)
            {
                temp = temp +bfRead;
            }
                texto = temp;
        }
        
        catch(Exception ex){
            System.out.println("No se encontro nada");
        }
        
        finally{
            System.out.println("Fin del programa");
        }
        
        return texto;
    }
    
}

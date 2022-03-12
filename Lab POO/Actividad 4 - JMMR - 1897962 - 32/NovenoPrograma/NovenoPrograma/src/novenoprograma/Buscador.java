/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novenoprograma;

/**
 *
 * @author famtz
 */
public class Buscador {
    
    public String getTexto() {
        return texto;
    }

   
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSubcad() {
        return Subcad;
    }

    
    public void setSubcad(String Subcad) {
        this.Subcad = Subcad;
    }
   private String texto;
   private String Subcad;
   
   
   public  boolean Buscarsub(String texto, String Subcad){
       int t, cont;
       for(int i=0; i<texto.length() - Subcad.length(); i++){
           cont = 0;
           t = i;
           for (int k = 0; k < Subcad.length(); k++){
               if (texto.charAt(t)== Subcad.charAt(k)){
                   cont++;
               }
               t++;
           }
           if(cont == Subcad.length()){
               System.out.println("Ha sido encontrado");
               return true;
           }
       }
       System.out.println("NO ha sido encontrado");
   return false;
   }
    
}

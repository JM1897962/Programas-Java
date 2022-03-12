/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package septimoprograma;

/**
 *
 * @author famtz
 */
public class Buscador {
    
    public String getCar1() {
        return Car1;
    }

    public void setCar1(String Car1) {
        this.Car1 = Car1;
    }

    public String getCar2() {
        return Car2;
    }

    public void setCar2(String Car2) {
        this.Car2 = Car2;
    }
     public String getTexto() {
        return texto;
    }

   
    public void setTexto(String texto) {
        this.texto = texto;
    }

   
   private String texto;
   private String Car1;
   private String Car2;
   
   public  boolean Buscarsub(String texto, String Car1, String Car2){
       int t, cont;
       for(int i=0; i<texto.length() - Car1.length(); i++){
           cont = 0;
           t = i;
           for (int k = 0; k < Car1.length(); k++){
               if (texto.charAt(t)== Car1.charAt(k)){
                   cont++;
                   
               }
               t++;
           }
           if(cont == Car1.length()){
               System.out.println("Ha sido encontrado");
               return true;
           }
       }
       System.out.println("NO ha sido encontrado");
   return false;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimoprograma;

/**
 *
 * @author famtz
 */
public class Palindromo {
    
    private void palin(String palabra){
    
        int num, i, asegurar = 0;
        
        num = palabra.length();
        
        for(i=0; i<num; i++)
        {
            if(palabra.charAt(i) != palabra.charAt((num-1)-i))
            {
                asegurar = 1;
            }
        }
        
        if(asegurar == 0)
        {
             System.out.println("La palabra " + palabra + " es un palindromo."); 
        }
        
        else
        {
            System.out.println("La palabra " + palabra + " no es un palindromo."); 
        }
       
        
}
    
    public Palindromo(String palabra){
        this.palin(palabra);
    }
    
}

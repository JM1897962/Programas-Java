/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

/**
 *
 * @author famtz
 */
public class FuncionString {
    
    private void guion(String palabra){
        int i, num;
        
        num = palabra.length();
        
        System.out.print("La palabra que se imprimira es: ");
        
        for(i=0; i<num; i++)
        {
            if(i != num-1)
            {
                System.out.print(palabra.charAt(i)+"-");
            }
            else
            {
                System.out.print(palabra.charAt(i));
            }
        }
        
        System.out.println("");
 
    }
    
    public FuncionString(String palabra){
        this.guion(palabra);
    }
}

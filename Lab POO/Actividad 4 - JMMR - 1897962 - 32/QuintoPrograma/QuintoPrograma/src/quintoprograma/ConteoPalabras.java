/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quintoprograma;
import java.util.StringTokenizer;

/**
 *
 * @author famtz
 */
public class ConteoPalabras {
    
    private void con(String frase){
        
        StringTokenizer st = new StringTokenizer(frase);
        
        System.out.println("El numero de palabras es: "+ st.countTokens());
    }
    
    public ConteoPalabras(String frase){
        this.con(frase);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author famtz
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PastorAleman pa = new PastorAleman();
        
        System.out.println(pa.ladrar());
        System.out.println(pa.comer());
        System.out.println(pa.beber());
        System.out.println(pa.dormir());
        System.out.println(pa.respirar());
        System.out.println(pa.correr());
        System.out.println(pa.caminar());
        System.out.println("");
        
        
        Chihuahua pa1 = new Chihuahua();
        
        System.out.println(pa1.ladrar());
        System.out.println(pa1.comer());
        System.out.println(pa1.beber());
        System.out.println(pa1.dormir());
        System.out.println(pa1.respirar());
        System.out.println(pa1.correr());
        System.out.println(pa.caminar());
        System.out.println("");
        
        
        Canario pa2 = new Canario();
        
        System.out.println(pa2.volar());
        System.out.println(pa2.comer());
        System.out.println(pa2.beber());
        System.out.println(pa2.dormir());
        System.out.println(pa2.respirar());        
        System.out.println(pa2.aletear());
        System.out.println(pa2.caminar());
        System.out.println("");
        
        
        Perico pa3 = new Perico();
        
        System.out.println(pa3.volar());
        System.out.println(pa3.comer());
        System.out.println(pa3.beber());
        System.out.println(pa3.dormir());
        System.out.println(pa3.respirar());        
        System.out.println(pa3.aletear());
        System.out.println(pa3.caminar());
        System.out.println("");
        
        
        Perso pa4 = new Perso();
        
        System.out.println(pa4.maulla());
        System.out.println(pa4.comer());
        System.out.println(pa4.beber());
        System.out.println(pa4.dormir());
        System.out.println(pa4.respirar());        
        System.out.println(pa4.brincar());
        System.out.println(pa4.ronronear());
        System.out.println("");
        
        
        Siames pa5 = new Siames();
        
        System.out.println(pa5.maulla());
        System.out.println(pa5.comer());
        System.out.println(pa5.beber());
        System.out.println(pa5.dormir());
        System.out.println(pa5.respirar());        
        System.out.println(pa5.brincar());
        System.out.println(pa5.ronronear());
        System.out.println("");
    }
    
}

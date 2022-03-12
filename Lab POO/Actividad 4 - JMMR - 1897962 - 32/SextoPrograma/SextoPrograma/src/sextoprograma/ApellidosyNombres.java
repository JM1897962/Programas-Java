/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sextoprograma;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author famtz
 */
public class ApellidosyNombres {
    
    private void bre(String nom){
        int num, i;
        num = nom.length();
        
        char[] nom2 = nom.toCharArray();
        
        for(i=0; i<num; i++)
        {
            if(nom.charAt(i) == ' ' || i == 0)
            {
                if(i == 0)
                    {
                        nom2[i] = Character.toUpperCase(nom2[i]);
                    }
                else
                {
                    nom2[i + 1] = Character.toUpperCase(nom2[i + 1]);
                }
                
            }
        }
        
        System.out.print(nom2);
        System.out.println("\n");
    }
    
    
   
    public ApellidosyNombres(String nom){
        this.bre(nom);
    }
    
}

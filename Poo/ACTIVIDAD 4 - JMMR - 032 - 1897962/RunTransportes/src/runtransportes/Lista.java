/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtransportes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author famtz
 */
class Lista {
    int i;
    
     ArrayList<Transporte> lista = new ArrayList();
    
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }
    
    public void addTransporte(){
        String marca = Input("Ingresa la marca del vehiculo: ");
        String modelo = Input("Ingresa el modelo del vehiculo: ");
        String matricula = Input("Ingresa el numero de matricula del vehiculo: ");
        Transporte transporte = new Transporte() {};
        transporte.setMarca(marca);
        transporte.setModelo(modelo);
        transporte.setMatricula(matricula);
        lista.add(transporte);
        i++;
    }
    
    public void getTransporte(){
        String string = "";
        for(int i=0; i<lista.size(); i++)
        {
            System.out.println("Enciende Vehiculo.");
            string +="Marca: " + lista.get(i).getMarca() +"\n";
            string +="Modelo: " + lista.get(i).getModelo() +"\n";
            string +="Matricula: " + lista.get(i).getMatricula() +"\n";
            System.out.println("Apaga Vehiculo.");
        }
        JOptionPane.showMessageDialog(null, string);
    }
}

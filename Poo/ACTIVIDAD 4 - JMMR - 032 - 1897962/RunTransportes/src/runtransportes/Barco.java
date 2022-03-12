/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtransportes;

/**
 *
 * @author famtz
 */
public class Barco implements SistemaMecanico, SistemaMaritimo{

    public void flota() {
        System.out.println("Este vehiculo flota");
    }

    @Override
    public void avanzar() {
        System.out.println("Barco Avanza");
    }

    @Override
    public void frenos() {
        System.out.println("Frena Barco");
    }

    @Override
    public void zarpar() {
        System.out.println("Barco Zarpa");
    }

    @Override
    public void arribar() {
        System.out.println("Barco Avanza");
    }
    
}

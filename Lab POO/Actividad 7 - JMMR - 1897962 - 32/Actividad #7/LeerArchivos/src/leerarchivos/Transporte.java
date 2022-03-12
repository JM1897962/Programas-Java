/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivos;

/**
 *
 * @author famtz
 */
public abstract class Transporte {

    /**
     * @return the gasolina
     */
    public String getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the movimiento
     */
    public String getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    
    public void encender(){
        System.out.println("Transporte enciende.");
    }
    
    public void apagar(){
        System.out.println("Transporte apagate.");
    }
    
    private String marca;
    private String modelo;
    private String precio;
    private String movimiento;
    private String gasolina;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

/**
 *
 * @author famtz
 */
public class Automovil extends Transporte implements Avanzar{

    /**
     * @return the vuelta
     */
    public String getVuelta() {
        return vuelta;
    }

    /**
     * @param vuelta the vuelta to set
     */
    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

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



    public Automovil()
    {
        
    }
    
    public Automovil(String marca, String modelo, String serie, String color, String gasolina, String vuelta)
    {
        this.marca = marca;
        this.color = color;
        this.serie = serie;
        this.modelo = modelo;
        this.gasolina = gasolina;
        this.vuelta = vuelta;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    private String marca;
    private String modelo;
    private String color;
    private String serie;
    private String vuelta; 
    private String gasolina;

    @Override
    public void encender() {
        System.out.println("Encender vehiculo.");
    }

    @Override
    public void frenar() {
        System.out.println("Vehiculo frena.");
    }
    
}

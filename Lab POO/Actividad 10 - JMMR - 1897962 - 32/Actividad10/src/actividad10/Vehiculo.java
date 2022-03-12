/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;

/**
 *
 * @author famtz
 */

enum MarcadeVehiculo{
    FORD, TOYOTA, SUZUKI, RENAULT, SEAT;
}

public class Vehiculo {

    /**
     * @return the marca
     */
    public MarcadeVehiculo getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(MarcadeVehiculo marca) {
        this.marca = marca;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
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
    
    private MarcadeVehiculo marca;
    private String matricula;
    private String precio;
    private String anio;
    private String color;
}

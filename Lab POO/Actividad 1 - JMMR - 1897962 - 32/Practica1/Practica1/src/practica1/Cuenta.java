/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author famtz
 */
public class Cuenta {
    
    private String nomCliente;
    private double numCuenta;
    private double tipinter;
    private double saldo;
    
    
    // Creacion de diversos metodos para su utilizacion en el programa //
    
    public Cuenta(){
 
    }
    
    public Cuenta(String nomCliente, double numCuenta, double tipinter, double saldo){
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.tipinter = tipinter;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta objCuenta){
        this.nomCliente = objCuenta.nomCliente;
        this.numCuenta = objCuenta.numCuenta;
        this.tipinter = objCuenta.tipinter;
        this.saldo = objCuenta.saldo;
    }

    /**
     * @return the nomCliente
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * @param nomCliente the nomCliente to set
     */
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    /**
     * @return the numCuenta
     */
    public double getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(double numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the tipinter
     */
    public double getTipinter() {
        return tipinter;
    }

    /**
     * @param tipinter the tipinter to set
     */
    public void setTipinter(double tipinter) {
        this.tipinter = tipinter;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean deposito(double cnt){
        boolean depositoDone = true;
        if (cnt < 0){
            depositoDone = false;
        }
        
        else{
            this.saldo = this.saldo + cnt;
        }
        return depositoDone;
    }
    
    public boolean retiro(double cnt){
        boolean retiroDone = true;
        if (cnt < 0){
            retiroDone = false;
        }
        
        else{
            this.saldo = this.saldo - cnt;
        }
        return retiroDone;
    }
    
    public boolean transferir(Cuenta c, double cnt){
        boolean si = true;
        if(cnt<0){
            si = false;
        }
        else if(saldo >= cnt){
            retiro(cnt);
            c.deposito(cnt);
        }
        else{
            si = false;
        }
        return si;
    }
    
}

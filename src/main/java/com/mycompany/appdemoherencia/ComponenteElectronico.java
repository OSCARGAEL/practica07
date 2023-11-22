/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author oscar
 */
public class ComponenteElectronico {
    private DispositivoElectronico esParteDe;

    
    
    public DispositivoElectronico getEsParteDe(){
        return esParteDe;
    }
    public void setEsParteDe(DispositivoElectronico esParteDe){
    this.esParteDe=esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" + "esParteDe=" + esParteDe + '}';
    }
    
    

    
}

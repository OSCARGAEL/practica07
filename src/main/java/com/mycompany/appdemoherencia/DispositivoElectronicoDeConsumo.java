/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico {
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie,
            String marca, String nombre, float costo,
            ArrayList<ComponenteElectronico> componentes) {
        
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.encendido=false;
    }
    
    public boolean getIsEncendido(){
        return encendido;
    }
   public void encender(){
   this.encendido=true;
   }
   public void apagar(){
   this.encendido=false;
   }

    @Override
    public String toString() {
        return super.toString()+"DispositivoElectronicoDeConsumo{" + "encendido="
                + encendido + '}';
    }
    
}

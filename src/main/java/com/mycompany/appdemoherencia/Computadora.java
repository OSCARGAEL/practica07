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
public class Computadora extends DispositivoElectronico{
    private final Microprocesador cpu;
    private final long ramMB;
    
    public Computadora(Microprocesador cpu, long ramMB, String fabricante, 
            String numeroSerie, String marca, String nombre, float costo, 
            ArrayList<ComponenteElectronico> componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        
        this.cpu = cpu;
        this.ramMB = ramMB;
    }
    
    public Microprocesador getCpu(){
    return cpu;
    }
    
    public long getRamMB(){
    return ramMB;
    }

    @Override
    public String toString() {
        return super.toString()+ "Computadora{" + "cpu=" + cpu + ", ramMB=" + ramMB + '}';
    }
   
}

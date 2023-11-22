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
public class Smartphone extends DispositivoElectronico {
    private final Sensor sensorDeHuella;
    private final Pantalla pantalla;
    

    public Smartphone(Sensor sensorDeHuella, Pantalla pantalla,String fabricante,
            String numeroSerie, String marca, String nombre, float costo, 
            ArrayList<ComponenteElectronico> componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        
        this.sensorDeHuella = sensorDeHuella;
        this.pantalla=pantalla;
        
    }

    public Sensor getSensorDeHuella() {
        return sensorDeHuella;
    }
    public Pantalla getPantalla(){
        return pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "sensorDeHuella=" + sensorDeHuella + ", pantalla=" + pantalla + '}';
    }
    
}


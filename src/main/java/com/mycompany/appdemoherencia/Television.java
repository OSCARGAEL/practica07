/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Television extends DispositivoElectronicoDeConsumo{

    public static Field[] getDeclaredFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String getSimpleName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final Pantalla pantalla;

    public Television(Pantalla pantalla, String fabricante, String numeroSerie, 
            String marca, String nombre, float costo, 
            ArrayList<ComponenteElectronico> componentes) {
        
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.pantalla = pantalla;
    }
    
    public Pantalla getPantalla(){
    return pantalla;
    }
    
    @Override
    public String toString(){
    return super.toString()+"Pantalla="+pantalla;
    }

    public Method[] getMethods() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

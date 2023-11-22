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
public class DispositivoElectronico {
    
    private String fabricante;
    private String numeroSerie;
    private String marca;
    private String nombre;
    private float costo;
    private ArrayList<ComponenteElectronico> componentes;
    
    public DispositivoElectronico() {
        fabricante = "samsung";
        numeroSerie = "123";
        marca = "logitech";
        nombre = "chip";
        costo = 99999;
        
    }

    public DispositivoElectronico(String fabricante, String numeroSerie, 
            String marca, String nombre, float costo, 
            ArrayList<ComponenteElectronico> componentes) {
        
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }
    
    public String getFabricante(){
        return fabricante;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public String getMarca(){
        return marca;
    }
    public String getNombre(){
        return nombre;
    }
    public float getCosto(){
        return costo;
    }
    public void setCosto(float costo){
    this.costo=costo;
    }
    
    public ArrayList<ComponenteElectronico> getComponentes(){
        return componentes;
    }
    
    public void setComponentes(ArrayList<ComponenteElectronico> componentes){
    this.componentes=componentes;
    }
    public void agregarComponente(ComponenteElectronico componente){
    componentes.add(componente);
    }
    public void quitarComponente(ComponenteElectronico componente){
    componentes.remove(componente);
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "fabricante=" + fabricante + ","
                + " numeroSerie=" + numeroSerie + ", marca=" + marca + ", "
                + "nombre=" + nombre + ", costo=" + costo + ", componentes=" + componentes + '}';
    }
   
}

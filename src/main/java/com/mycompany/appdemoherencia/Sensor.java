/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author oscar
 */
public class Sensor {
    private final String tipo;
    private final String unidadDeMedida;
    private final int valor;
    
    public Sensor(String tipo,String unidadDeMedida,int valor){
    this.tipo=tipo;
    this.unidadDeMedida=unidadDeMedida;
    this.valor=valor;
    }
    
    public String getTipo(){
    return tipo;
    }
    
    public String getUnidadDeMedida(){
    return unidadDeMedida;
    }
    
    public int getValor(){
    return valor;
    }
    
    @Override
    public String toString(){
    return "Sensor{"+"tipo="+tipo+"unidadDeMedida="+unidadDeMedida+"valor="+valor+"}";
    }
    
}

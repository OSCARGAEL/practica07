/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author oscar
 */
public class Microprocesador {
    private final int cacheRAM;
    private final long velocidadHz;
    
    public Microprocesador(int cacheRAM,long velocidadHz){
    this.cacheRAM=cacheRAM;
    this.velocidadHz=velocidadHz;
    
    }
    
    public int getCacheRAM(){
    return cacheRAM;
    }
    public long getVelocidadHz(){
    return velocidadHz;
    }
    
    @Override
    public String toString(){
    return "Microprocesador{"+"cacheRAM="+cacheRAM+"velocidadHz="+velocidadHz+"}";
    }
    
}

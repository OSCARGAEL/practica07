/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appdemoherencia;

/**
 *
 * @author oscar
 */
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class AppDemoHerencia {
       
   public static void main(String[] args) {
        Pantalla pantallaTV = new Pantalla(1920, 1080);
        Pantalla pantallaSmartphone = new Pantalla(2560, 1440);
        Microprocesador cpu = new Microprocesador(8, 3000000000L);
        Sensor sensorHuella = new Sensor("Huella Digital", "N/A", 1);

        Television tv1 = new Television(pantallaTV, "Sony",
                "123456", "Bravia", "TV1", 699.99f, null);
        Television tv2 = new Television(pantallaTV, "Samsung", "789012",
                "QLED", "TV2", 899.99f, null);

        Smartphone phone1 = new Smartphone(sensorHuella, pantallaSmartphone,
                "Apple", "456789", "iPhone", "Phone1", 999.99f, null);
        Smartphone phone2 = new Smartphone(sensorHuella, pantallaSmartphone,
                "Samsung", "12345", "Samsung", "samsung", 499.99f, null);

        // Crear listas
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(phone1);
        listaDeSmartphones.add(phone2);

        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);

        System.out.println("---- Lista de Smartphones ----");
        for (Smartphone phone : listaDeSmartphones) {
            System.out.println(phone);
        }

        System.out.println("\n---- Lista de TVs ----");
        for (Television tv : listaDeTVs) {
            System.out.println(tv);
        }
            IUComputadora iuComputadora = new IUComputadora("computadora.png",
                    new Computadora(cpu, 8192, "Apple", "123",
                            "MacBook", "Laptop", 1299.99f, new ArrayList<>()));
            
            IUTelevision iuTelevision = new IUTelevision("tv.png",
                    new Television(new Pantalla(1920, 1080), "Sony",
                            "123456", "Bravia", "TV1", 699.99f, new ArrayList<>()));
            
            IUSmartphone iuSmartphone = new IUSmartphone("smartphone.png",
                    new Smartphone(new Sensor("Huella Digital", "N/A", 1),
                            new Pantalla(2560, 1440), "Apple",
                            "456789", "iPhone", "Phone1", 999.99f, new ArrayList<>()));

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(1, 3));

            frame.add(iuComputadora);
            frame.add(iuTelevision);
            frame.add(iuSmartphone);
            frame.setSize(900, 300);
            frame.setVisible(true);
    }
}
    
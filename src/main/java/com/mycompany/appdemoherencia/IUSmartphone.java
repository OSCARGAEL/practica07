/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

/**
 *
 * @author oscar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class IUSmartphone extends JPanel {
    private final Smartphone smartphone;
    private BufferedImage image;

    public IUSmartphone(String imagePath, Smartphone smartphone) {
        this.smartphone = smartphone;
        try {
            // Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File("smartphone.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Agregar un listener de clics del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Responde a clics del mouse
                System.out.println("Smartphone: "+ smartphone.toString());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen en el objeto JPanel
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}


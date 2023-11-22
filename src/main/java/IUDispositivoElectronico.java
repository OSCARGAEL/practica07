/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import com.mycompany.appdemoherencia.Computadora;
import com.mycompany.appdemoherencia.Smartphone;
import com.mycompany.appdemoherencia.Television;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.imageio.ImageIO;
/*
public class IUDispositivoElectronico {

    private BufferedImage image;
    

    public IUDispositivoElectronico(JPanel p,IUDispositivoElectronico e) {
      
        try {
            // Cargar la imagen desde el archivo PNG
            image = ImageIO.read(new File("tv.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Agregar un listener de clics del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Responde a clics del mouse con reflexión
                printClassInfo(television.getClass());
            }
        });
    }

    private void printClassInfo(Class<?> television) {
        // Imprimir información sobre los métodos
        System.out.println("Métodos de la clase " + television.getSimpleName() + ":");
        Method[] methods = television.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Imprimir información sobre los campos
        System.out.println("Campos de la clase " + Television.getSimpleName() + ":");
        Field[] fields = Television.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen en el objeto JPanel
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }

 
    }


*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp.logistica.fioriusen;

import com.mycompany.tp.logistica.fioriusen.entidades.Producto;
import com.mycompany.tp.logistica.fioriusen.entidades.Sucursal;
import com.mycompany.tp.logistica.fioriusen.enums.Estado;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Vulturius
 */
public class TP2023LogisticaFioRiuSen {

   //QUE PAJA LOCO ESTE TP DEL ORTO :/
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setSize(500, 400);
        ventana.setContentPane(new Menu(ventana,null));
        ventana.setVisible(true);
        //QUE PAJA LOCO ESTE TP DEL ORTO :/
        //QUE PAJA LOCO ESTE TP DEL ORTO :/
        //HOLAAAAAAAAAAAAAAAAAAA: /
        System.out.println("UN COMENTARIO LO QUE SEA");
        
   
   
   
   SessionFactory sessionFactory  = HibernateManager.Configure();

    try (Session session = sessionFactory.openSession()) {
            // Aquí puedes realizar operaciones con la base de datos usando la sesión

         //TU PRODUCTO
          
          Sucursal s = new Sucursal();
          s.setNombre("Sucursal1");
          s.setHorarioApertura(LocalTime.now());
          s.setHorarioCierre(LocalTime.MIDNIGHT);
          s.setEstado(Estado.OPERATIVA);
     
            session.beginTransaction();
            session.save(s);
           
            session.getTransaction().commit();
            System.out.println("En teoría está pasa el commit");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   
   
   
    }
   
    
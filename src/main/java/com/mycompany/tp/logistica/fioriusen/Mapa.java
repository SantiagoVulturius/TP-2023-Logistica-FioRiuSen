/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp.logistica.fioriusen;

import com.mycompany.tp.logistica.fioriusen.dtos.CaminoDTO;
import com.mycompany.tp.logistica.fioriusen.dtos.SucursalDTO;
import com.mycompany.tp.logistica.fioriusen.gestores.GestorCamino;
import com.mycompany.tp.logistica.fioriusen.gestores.GestorSucursal;
import com.mycompany.tp.logistica.fioriusen.grafo.Lienzo;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author zapam
 */
public class Mapa extends javax.swing.JPanel {

    /**
     * Creates new form Mapa
     */
    private JFrame ventana;
    private JPanel padre;

    public Mapa(JFrame ventana, JPanel padre) {
        this.ventana = ventana;
        this.padre = padre;

        ventana.setTitle("Mapa de rutas?");
        
        Lienzo prueba = new Lienzo();
        GestorCamino gc = new GestorCamino();
        List<CaminoDTO> caminos = new ArrayList<CaminoDTO>();
        GestorSucursal gs = new GestorSucursal();
        List<SucursalDTO> sucursal = new ArrayList<SucursalDTO>();
        caminos = gc.obtenerParaGrafo();
        sucursal= gs.obtenerParaGrafo();
        prueba.generarGrafo(caminos, sucursal);
        ventana.setSize(570, 700);
        initComponents();
        ventana.setVisible(true);
        
        JFrame ventana2 = new JFrame();
        ventana2.setTitle("Mapa caminos");
        ventana2.getContentPane().add(prueba);
        ventana2.setVisible(true);
        
       /* 
        JFrame ventana2 = new JFrame();
        ventana2.setTitle("Mapa caminos");

        GrafoCanvas canvas = new GrafoCanvas();
        ventana2.getContentPane().add(canvas);
        ventana2.setVisible(true);
        */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
/* 
class Nodo {

    int x, y, w, h;
    private String nombre;

    public Nodo(int x, int y, int w, int h, String n) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.nombre = n;

    }

    public Ellipse2D.Float getShape() {
        return new Ellipse2D.Float(this.x, this.y, this.w, this.h);
    }
}

class Arista {

    int x, y, x2, y2;
    private String peso;

    public Arista(Nodo n1, Nodo n2, String p) {
        this.x = n1.x;
        this.y = n1.y;
        this.x2 = n2.x;
        this.y2 = n2.y;
        this.peso = p;
    }

    public Line2D.Float getShape() {
        return new Line2D.Float(this.x, this.y, this.x2, this.y2);
    }

    public String getPeso() {
        return peso;
    }
}

class GrafoCanvas extends Canvas {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        GestorCamino gc = new GestorCamino();
        List<CaminoDTO> caminos = new ArrayList<CaminoDTO>();
        caminos = gc.obtenerParaGrafo();

        //Supongo q voy a necesitar decir quien es nodo inicio y final, son aquellos con nombre Puero y Centro
        Graphics2D g2 = (Graphics2D) g;
        
        for (CaminoDTO c : caminos) {
            Nodo nodo1 = new Nodo(50, 50, 30, 30, c.getOrigen());
            Nodo nodo2 = new Nodo(200, 100, 30, 30, c.getDestino());

            g2.setColor(Color.BLUE);
            g2.fill(nodo1.getShape());
            g2.fill(nodo2.getShape());

            Arista arista1 = new Arista(nodo1, nodo2, caminos.get(0).getCapacidadMaxima());

            g2.setColor(Color.RED);
            g2.draw(arista1.getShape());

            g2.setColor(Color.BLACK);
            g2.drawString(arista1.getPeso(), getMedio(arista1.x,arista1.x2), getMedio(arista1.y,arista1.y2));
            
        }
       

    }
    
    public int getMedio(int a, int b){
        return (a+b)/2;
    }
}

*/
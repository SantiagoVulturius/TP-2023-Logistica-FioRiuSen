/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp.logistica.fioriusen;

import com.mycompany.tp.logistica.fioriusen.dtos.CaminoDTO;
import com.mycompany.tp.logistica.fioriusen.entidades.Camino;
import com.mycompany.tp.logistica.fioriusen.enums.Estado;
import com.mycompany.tp.logistica.fioriusen.gestores.GestorCamino;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zapam
 */
public class GestionarCamino extends javax.swing.JPanel {

    /**
     * Creates new form GestionarCamino
     */
    private JFrame ventana;
    private JPanel padre;
    public GestionarCamino(JFrame ventana, JPanel padre) {
        this.ventana = ventana;
        this.padre = padre;
        ventana.setTitle("Gestionar caminos");
        ventana.setSize(800, 700);
       
        initComponents();
         ventana.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        textOrigen = new javax.swing.JTextField();
        textDestino = new javax.swing.JTextField();
        textid = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        carga = new javax.swing.JLabel();
        textCarga = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de caminos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setText("Origen:");

        destino.setText("Destino:");

        id.setText("Codigo:");

        textOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOrigenActionPerformed(evt);
            }
        });
        textOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textOrigenKeyTyped(evt);
            }
        });

        textDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDestinoActionPerformed(evt);
            }
        });
        textDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDestinoKeyTyped(evt);
            }
        });

        textid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidActionPerformed(evt);
            }
        });
        textid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textidKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        estado.setBackground(new java.awt.Color(255, 255, 255));
        estado.setText("Estado:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OPERATIVA", "NO OPERATIVA", " " }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        carga.setBackground(new java.awt.Color(255, 255, 255));
        carga.setText("Carga Máxima:");

        textCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCargaActionPerformed(evt);
            }
        });
        textCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCargaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(carga)
                        .addGap(18, 18, 18)
                        .addComponent(textCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codigo)
                            .addComponent(id))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textid, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(textOrigen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destino, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estado, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(btnBuscar)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id)
                    .addComponent(estado)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(destino)
                    .addComponent(textDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carga)
                            .addComponent(textCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado de búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tablaResultado.setAutoCreateRowSorter(true);
        tablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Codigo", "Origen", "Destino", "Estado", "Carga Máxima", "Tiempo de transito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResultado.setDragEnabled(true);
        tablaResultado.setShowGrid(true);
        jScrollPane37.setViewportView(tablaResultado);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane37)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnEditar.setText("Modificar camino");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo camino");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar camino");

        btnVolver.setText("Cancelar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap())
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOrigenActionPerformed

    
    }//GEN-LAST:event_textOrigenActionPerformed

    private void textOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textOrigenKeyTyped

    }//GEN-LAST:event_textOrigenKeyTyped

    private void textDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDestinoActionPerformed

    private void textDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDestinoKeyTyped

    }//GEN-LAST:event_textDestinoKeyTyped

    private void textidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidActionPerformed

    private void textidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textidKeyTyped

    }//GEN-LAST:event_textidKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
  GestorCamino gc =  new GestorCamino();
       Boolean control = true;
  Estado estado = Estado.valueOf(comboEstado.getSelectedItem().toString());
        CaminoDTO dto = new CaminoDTO(textid.getText(), textDestino.getText(), textOrigen.getText(),"0", textCarga.getText(),estado);
         
         int[] mensaje = gc.validarDatos(dto);
         if(textid.getText().isEmpty() && textDestino.getText().isEmpty() && textOrigen.getText().isEmpty() && textCarga.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, complete al menos un criterio de búsqueda.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control=false;
            Toolkit.getDefaultToolkit().beep();
           
        }
        if(mensaje[1] == 1){
             JOptionPane.showMessageDialog(this, "El campo Código debe ser numérico.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control=false;
             Toolkit.getDefaultToolkit().beep();
        }
        if(mensaje[2] == 1){
            JOptionPane.showMessageDialog(this, "Los campo Origen y Destino deben ser alfabéticos.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control=false;
             Toolkit.getDefaultToolkit().beep();
        }
        if(mensaje[3] == 1){
              JOptionPane.showMessageDialog(this, "El campo carga debe ser numérico.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            control=false;
             Toolkit.getDefaultToolkit().beep();
        }
        
           /*     if(control == true){
            //ACA VA LA BÚSQUEDA
             List<Camino> caminosDTO =  gc.buscarCaminoSegunCriterio(dto);
            DefaultTableModel model = (DefaultTableModel) tablaResultado.getModel();
            int filas = model.getRowCount();
                if(filas > 0)
                for(int i = model.getRowCount()-1; i>=0; i--){
                     model.removeRow(i);
                }
            if(caminosDTO.isEmpty()){
                 JOptionPane.showMessageDialog(this, "No se han encontrado sucursales con los criterios seleccionados.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                control=false;
                Toolkit.getDefaultToolkit().beep();
            }else{
                
                
            for (int i=0; i<caminosDTO.size(); i++){
            model.addRow(new Object[]{sucursalesDTO.get(i).getId(),sucursalesDTO.get(i).getCodigo(), sucursalesDTO.get(i).getNombre(),  sucursalesDTO.get(i).getHorarioApertura(), sucursalesDTO.get(i).getHorarioCierre(), sucursalesDTO.get(i).getEstado().toString()});
    }}
        }*/
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void textCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCargaActionPerformed

    private void textCargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCargaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textCargaKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        DefaultTableModel model = (DefaultTableModel)tablaResultado.getModel();
        int fila = tablaResultado.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Por favor seleccione un camino de la tabla.", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Estado estado = Estado.valueOf(comboEstado.getSelectedItem().toString());
            String id = model.getValueAt(fila, 0).toString();
           /* CaminoDTO dto = new CaminoDTO(model.getValueAt(fila, 1).toString(),
            model.getValueAt(fila, 2).toString(),
            model.getValueAt(fila,3).toString(),
            model.getValueAt(fila, 4).toString(),
            estado);
            System.out.println("Valores: "+ model.getValueAt(fila, 1).toString()+" "+model.getValueAt(fila,2).toString()+" "+ model.getValueAt(fila, 3).toString() );
            
            ventana.setContentPane(new ModificarCamino(ventana, this, dto, id));
            ventana.revalidate();*/
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ventana.setContentPane(new AltaCamino(ventana, this));
         ventana.revalidate();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       int result = JOptionPane.showConfirmDialog(this,"¿Desea regresar al Menú principal?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        switch (result){
            case JOptionPane.YES_OPTION:
            ventana.setContentPane(new Menu(ventana, this));
            ventana.revalidate(); break;
            case JOptionPane.NO_OPTION:
            break;
        }
       
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel carga;
    private javax.swing.JLabel codigo;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JTable tablaResultado;
    private javax.swing.JTextField textCarga;
    private javax.swing.JTextField textDestino;
    private javax.swing.JTextField textOrigen;
    private javax.swing.JTextField textid;
    // End of variables declaration//GEN-END:variables
}

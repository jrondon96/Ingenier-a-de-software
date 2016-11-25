/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlPuntoDeInteres;
import Controlador.CtrlTourVirtual;
import Modelo.PuntoDeInteres;
import Modelo.TourVirtual;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Antonio
 */
public class IEliminarTV extends javax.swing.JFrame {

    private final Iterator<TourVirtual> it = CtrlTourVirtual.getInstancia().getToursVirtualesArray().iterator();
    private TourVirtual aux;
  
    public IEliminarTV() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Eliminar Tour Virtual"); 
        
        /* Se cargan los tours existentes en el combobox.*/
        
        while(it.hasNext()){
            aux=it.next();
            ComboBoxTV.addItem(aux.getIdentificador()+" "+aux.getNombre()); 
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelSeleccion = new javax.swing.JLabel();
        botonFinalizar = new javax.swing.JButton();
        ComboBoxTV = new javax.swing.JComboBox();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UCV - Tour Virtual - Comite");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelTitulo.setText("Eliminar Tour Virtual");

        labelSeleccion.setText("Seleccionar Tour virtual a eliminar:");

        botonFinalizar.setBackground(new java.awt.Color(246, 246, 246));
        botonFinalizar.setText("Finalizar");
        botonFinalizar.setFocusPainted(false);
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        ComboBoxTV.setFocusable(false);

        botonEliminar.setBackground(new java.awt.Color(246, 246, 246));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusPainted(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSeleccion)
                            .addComponent(labelTitulo))
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxTV, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(71, 71, 71)
                .addComponent(labelSeleccion)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonFinalizar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        IAdministracionTV administracion = new IAdministracionTV();
        administracion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        try{
            /* Se obtiene del ComboBox el tour  a eliminar*/
            
            String TVElim =(String) ComboBoxTV.getSelectedItem();
            ComboBoxTV.removeItem(ComboBoxTV.getSelectedItem());
            StringTokenizer id = new StringTokenizer(TVElim," ");
            String token =  id.nextToken();

            for (int i=0;i< CtrlTourVirtual.getInstancia().getToursVirtualesArray().size();i++){
                
                aux =  CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i);
                String IdPI= aux.getIdentificador();
                if( token == null ? IdPI == null : token.equals(IdPI) ){
                    CtrlTourVirtual.getInstancia().getToursVirtualesArray().remove(aux); /* Se elimina el tour del arreglo de tours.*/
                }
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No hay tours a eliminar.", "Ha ocurrido un error.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxTV;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSeleccion;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}

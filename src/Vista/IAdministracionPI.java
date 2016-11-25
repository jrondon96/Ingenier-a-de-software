
package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlObras;
import Controlador.CtrlPuntoDeInteres;


public class IAdministracionPI extends javax.swing.JFrame {

    CtrlControlador controlador; 
    public IAdministracionPI() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrar Puntos de Interes"); 
        
        if(CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size() <= 0){
           botonEliminarPuntoInteres.setEnabled(false); /* Se deshabilita la eliminación de puntos de interes en caso de que no existan. */
           botonModificarPuntoInteres.setEnabled(false); /* Se deshabilita la modificación de puntos de interes en caso de que no existan. */
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonModificarPuntoInteres = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonEliminarPuntoInteres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Administración de Puntos de interés");

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        jButton1.setText("Crear punto de interés");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonModificarPuntoInteres.setBackground(new java.awt.Color(246, 246, 246));
        botonModificarPuntoInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_md.png"))); // NOI18N
        botonModificarPuntoInteres.setText("Modificar punto de interés");
        botonModificarPuntoInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarPuntoInteres.setFocusPainted(false);
        botonModificarPuntoInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPuntoInteresActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(246, 246, 246));
        jButton3.setText("Finalizar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonEliminarPuntoInteres.setBackground(new java.awt.Color(246, 246, 246));
        botonEliminarPuntoInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        botonEliminarPuntoInteres.setText("Eliminar punto de interés");
        botonEliminarPuntoInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarPuntoInteres.setFocusPainted(false);
        botonEliminarPuntoInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPuntoInteresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonModificarPuntoInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEliminarPuntoInteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(botonModificarPuntoInteres)
                .addGap(30, 30, 30)
                .addComponent(botonEliminarPuntoInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlador.getInstancia().opcionSeleccionada("CrearPI",this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonModificarPuntoInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPuntoInteresActionPerformed
        controlador.getInstancia().opcionSeleccionada("ModificarPI",this);
    }//GEN-LAST:event_botonModificarPuntoInteresActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       IAdministracion administracion = new IAdministracion();
       administracion.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonEliminarPuntoInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPuntoInteresActionPerformed
        controlador.getInstancia().opcionSeleccionada("EliminarPI", this);
    }//GEN-LAST:event_botonEliminarPuntoInteresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarPuntoInteres;
    private javax.swing.JButton botonModificarPuntoInteres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlTourVirtual;


public class IAdministracionTV extends javax.swing.JFrame { 
    
    CtrlControlador controlador; 
    
    public IAdministracionTV() {
        initComponents(); /* Se inicializan la interfaz y los componentes de IAdministracionTV */
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrar Tours Virtuales");
        
        if(CtrlTourVirtual.getInstancia().getToursVirtualesArray().size() <= 0){
           botonEliminarTour.setEnabled(false); /* Se deshabilita la eliminación de tours en caso de que no existan tours cargados. */
           botonModificarTour.setEnabled(false); /* Se deshabilita la modificación de tours en caso de que no existan tours cargados. */
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonModificarTour = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonEliminarTour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Administracion de Tours Virtuales");

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        jButton1.setText("Crear Tour Virtual");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonModificarTour.setBackground(new java.awt.Color(246, 246, 246));
        botonModificarTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_md.png"))); // NOI18N
        botonModificarTour.setText("Modificar Tour Virtual");
        botonModificarTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarTour.setFocusPainted(false);
        botonModificarTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarTourActionPerformed(evt);
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

        botonEliminarTour.setBackground(new java.awt.Color(246, 246, 246));
        botonEliminarTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        botonEliminarTour.setText("Eliminar Tour Virtual");
        botonEliminarTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarTour.setFocusPainted(false);
        botonEliminarTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminarTour, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarTour, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(botonModificarTour)
                .addGap(30, 30, 30)
                .addComponent(botonEliminarTour)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(23, Short.MAX_VALUE))
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
        controlador.getInstancia().opcionSeleccionada("CrearTV",this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonModificarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarTourActionPerformed
        controlador.getInstancia().opcionSeleccionada("ModificarTV",this);
    }//GEN-LAST:event_botonModificarTourActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       IAdministracion administracion = new IAdministracion();
       administracion.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonEliminarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTourActionPerformed
        controlador.getInstancia().opcionSeleccionada("EliminarTV",this);
    }//GEN-LAST:event_botonEliminarTourActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarTour;
    private javax.swing.JButton botonModificarTour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

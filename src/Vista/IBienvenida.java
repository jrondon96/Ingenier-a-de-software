package Vista;

import Controlador.CtrlControlador;



public class IBienvenida extends javax.swing.JFrame {

    CtrlControlador controlador; 
    
    
    public IBienvenida() { 
            initComponents(); 
            setLocationRelativeTo(null);
            setResizable(false);
            setTitle("Tour Virtual UCV"); 
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelRol = new javax.swing.JLabel();
        seleccionComite = new javax.swing.JButton();
        seleccionVisitante = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tours Virtuales UCV");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelRol.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelRol.setText("Seleccione Rol:");

        seleccionComite.setBackground(new java.awt.Color(246, 246, 246));
        seleccionComite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comite_md.png"))); // NOI18N
        seleccionComite.setText("Comité");
        seleccionComite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionComite.setFocusPainted(false);
        seleccionComite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionComiteActionPerformed(evt);
            }
        });

        seleccionVisitante.setBackground(new java.awt.Color(246, 246, 246));
        seleccionVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_md.png"))); // NOI18N
        seleccionVisitante.setText("Visitante");
        seleccionVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccionVisitante.setFocusPainted(false);
        seleccionVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionVisitanteActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(246, 246, 246));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_md.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusPainted(false);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelTitulo.setText("Tours Virtuales UCV");

        labelBienvenida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelBienvenida.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelRol)
                    .addComponent(labelBienvenida))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(seleccionVisitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seleccionComite, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelBienvenida)
                .addGap(18, 18, 18)
                .addComponent(labelRol)
                .addGap(18, 18, 18)
                .addComponent(seleccionVisitante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccionComite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionVisitanteActionPerformed
        controlador.getInstancia().opcionSeleccionada("Visitante",this); 
       
    }//GEN-LAST:event_seleccionVisitanteActionPerformed

    private void seleccionComiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionComiteActionPerformed
        controlador.getInstancia().opcionSeleccionada("Administracion",this);
    }//GEN-LAST:event_seleccionComiteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        controlador.getInstancia().finalizar(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelRol;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JButton seleccionComite;
    private javax.swing.JButton seleccionVisitante;
    // End of variables declaration//GEN-END:variables
}

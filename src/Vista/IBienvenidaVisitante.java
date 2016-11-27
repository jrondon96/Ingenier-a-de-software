package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlTourVirtual;

import Modelo.TourVirtual;
import java.util.Iterator;

public class IBienvenidaVisitante extends javax.swing.JFrame {

   private CtrlControlador controlador; 
   private CtrlTourVirtual controladorTourVirtual;
   private TourVirtual auxtour;
   private Iterator <TourVirtual> it = controladorTourVirtual.getInstancia().getToursVirtualesArray().iterator(); 
   
   
   public IBienvenidaVisitante() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Bienvenida");   
        
        ComboBoxtour.setEnabled(false);
        botonVisitar.setEnabled(false);
        
        while(it.hasNext()){
            auxtour=it.next(); 
            
            
                if (auxtour.getDisponibilidad().equals("Disponible")){ 
                    if(auxtour.getTourspuntoDeInteresArray().size()>0){
                    if (auxtour.getTourspuntoDeInteresArray().get(0).getDisponibilidad()=="Disponible" && auxtour.getTourspuntoDeInteresArray().get(auxtour.getTourspuntoDeInteresArray().size()-1).getDisponibilidad()=="Disponible") { 
                    ComboBoxtour.addItem(auxtour.getNombre());
                    ComboBoxtour.setEnabled(true);
                    botonVisitar.setEnabled(true);  
                    }
                    }
                    
                }
            
        }  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoImagen = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxtour = new javax.swing.JComboBox<>();
        botonVisitar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ucv_120px.png"))); // NOI18N

        campoTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        campoTitulo.setText("Tours Virtuales UCV");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Seleccionar Tour Virtual:");

        botonVisitar.setBackground(new java.awt.Color(246, 246, 246));
        botonVisitar.setText("Visitar");
        botonVisitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVisitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisitarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(246, 246, 246));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_md.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTitulo)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonVisitar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBoxtour, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(163, 163, 163))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(campoTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(ComboBoxtour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVisitar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(19, 19, 19))
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

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        IBienvenida bienvenida = new IBienvenida();
        bienvenida.setVisible(true); 
        this.setVisible(false);    
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonVisitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisitarActionPerformed
        for (int i=0; i < controladorTourVirtual.getInstancia().getToursVirtualesArray().size();i++){
            if( ComboBoxtour.getSelectedItem().toString() == null ? controladorTourVirtual.getInstancia().getToursVirtualesArray().get(i).getNombre() == null : ComboBoxtour.getSelectedItem().toString().equals(controladorTourVirtual.getInstancia().getToursVirtualesArray().get(i).getNombre()) ){
                auxtour = controladorTourVirtual.getInstancia().getToursVirtualesArray().get(i);
                IRecorrido recorrido = new IRecorrido(auxtour);                 
                recorrido.setVisible(true); 
                this.setVisible(false);
                break;
            }   
        }  
    }//GEN-LAST:event_botonVisitarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxtour;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVisitar;
    private javax.swing.JLabel campoImagen;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

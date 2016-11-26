package Vista;

import Modelo.PuntoDeInteres;
import Modelo.TourVirtual;

public class IRecorrido extends javax.swing.JFrame {
 
private TourVirtual auxTourVirtual; 
private PuntoDeInteres auxPuntoDeInteres; 
private int i=0, j=0; 


    public IRecorrido(TourVirtual TourVirtual) {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Recorrido"); 
        this.auxTourVirtual = TourVirtual;   
        
        campoTitulo.setText(null); 
        campoAño.setText(null); 
        campoAutor.setText(null); 
        campoUbicacion.setText(null); 
        campo_descripcion.setText(null); 
        campoImagen.setText(null); 
        nombretourpunto.setText(null); 
        
       campoTitulo.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getTituloObra());
       campoAño.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getAñoCreacionObra());
       campoAutor.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getAutorObra());
       campoUbicacion.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getUbicacionObra());
       campo_descripcion.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getDescripcionObra());
       campoImagen.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getIdObra());
       nombretourpunto.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getIdObra()); 
       j++;  
       if (auxTourVirtual.getTourspuntoDeInteresArray().size() == i){ 
           botonAvanzar.setEnabled(false);
       }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoTitulo2 = new javax.swing.JLabel();
        nombretourpunto = new javax.swing.JLabel();
        textoAnnoCreacion = new javax.swing.JLabel();
        textoDescripcion = new javax.swing.JLabel();
        ImagenO = new javax.swing.JLabel();
        textoCategoria = new javax.swing.JLabel();
        botonAvanzar = new javax.swing.JButton();
        botonAbandonar = new javax.swing.JButton();
        textoEncabezado = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JLabel();
        campoAutor = new javax.swing.JLabel();
        campo_descripcion = new javax.swing.JLabel();
        campoImagen = new javax.swing.JLabel();
        campoAño = new javax.swing.JLabel();
        campoUbicacion = new javax.swing.JLabel();
        textoAutor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textoTitulo2.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        textoTitulo2.setText("Titulo:");

        nombretourpunto.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        nombretourpunto.setText("Nombre Tour Virtual, Nombre Punto de interes");

        textoAnnoCreacion.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        textoAnnoCreacion.setText("Año de creación:");

        textoDescripcion.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        textoDescripcion.setText("Descripción:");

        ImagenO.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        ImagenO.setText("Imagen:");

        textoCategoria.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        textoCategoria.setText("Ubicación:");

        botonAvanzar.setBackground(new java.awt.Color(246, 246, 246));
        botonAvanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguiente_md.png"))); // NOI18N
        botonAvanzar.setText("Avanzar");
        botonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzarActionPerformed(evt);
            }
        });

        botonAbandonar.setBackground(new java.awt.Color(246, 246, 246));
        botonAbandonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_md.png"))); // NOI18N
        botonAbandonar.setText("Abandonar");
        botonAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbandonarActionPerformed(evt);
            }
        });

        campoTitulo.setText("jLabel1");

        campoAutor.setText("jLabel2");

        campo_descripcion.setText("jLabel3");

        campoImagen.setText("jLabel4");

        campoAño.setText("jLabel5");

        campoUbicacion.setText("jLabel6");

        textoAutor1.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        textoAutor1.setText("Autor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nombretourpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ImagenO)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoAnnoCreacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textoCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botonAvanzar)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonAbandonar))
                                            .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(textoDescripcion)
                            .addComponent(campo_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoTitulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombretourpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTitulo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoAnnoCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoAño))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoAutor)))
                .addGap(18, 18, 18)
                .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(campo_descripcion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImagenO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUbicacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAbandonar)))
                    .addComponent(campoImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbandonarActionPerformed
        IBienvenidaVisitante bienvenida = new IBienvenidaVisitante();
        bienvenida.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_botonAbandonarActionPerformed
    
    
    private void botonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzarActionPerformed
        if (auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().size()>j){ 
            campoTitulo.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getTituloObra());
            campoAño.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getAñoCreacionObra());
            campoAutor.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getAutorObra());
            campoUbicacion.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getUbicacionObra());
            campo_descripcion.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getDescripcionObra());
            campoImagen.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getIdObra());
            nombretourpunto.setText(auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().get(j).getIdObra()); 
           j++;
           }  
           if (auxTourVirtual.getTourspuntoDeInteresArray().get(i).getObrasPuntoDeInteresArray().size() <= j){
               j=0; 
               i++; 
               
               if (auxTourVirtual.getTourspuntoDeInteresArray().size()==i){
                   botonAvanzar.setEnabled(false);
               }
           }  
    }//GEN-LAST:event_botonAvanzarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenO;
    private javax.swing.JButton botonAbandonar;
    private javax.swing.JButton botonAvanzar;
    private javax.swing.JLabel campoAutor;
    private javax.swing.JLabel campoAño;
    private javax.swing.JLabel campoImagen;
    private javax.swing.JLabel campoTitulo;
    private javax.swing.JLabel campoUbicacion;
    private javax.swing.JLabel campo_descripcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombretourpunto;
    private javax.swing.JLabel textoAnnoCreacion;
    private javax.swing.JLabel textoAutor1;
    private javax.swing.JLabel textoCategoria;
    private javax.swing.JLabel textoDescripcion;
    private javax.swing.JLabel textoEncabezado;
    private javax.swing.JLabel textoTitulo2;
    // End of variables declaration//GEN-END:variables
}

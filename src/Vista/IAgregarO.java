/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlObras;
import Modelo.Obra;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jesus Antonio
 */
public class IAgregarO extends javax.swing.JFrame {
CtrlObras controladorObra;  

    
    public IAgregarO() {
        initComponents(); /* Se inicializan la interfaz y los componentes de IAgregarO */
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Crear Obra de arte");  

        DefaultTableModel modelo = (DefaultTableModel) obrasExistentes.getModel(); 
       
        for (int i = 0; i < controladorObra.getInstancia().getObrasArray().size(); i++){ 
            modelo.addRow(new Object[]{controladorObra.getInstancia().getObrasArray().get(i).getIdObra(),
                controladorObra.getInstancia().getObrasArray().get(i).getTituloObra(), 
                controladorObra.getInstancia().getObrasArray().get(i).getAutorObra()}); /* Se cargan en la tabla obrasExistentes las obras existentes en el arreglo de obras. */
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        idO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obrasExistentes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tituloVentana = new javax.swing.JLabel();
        labelIdentificador = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        tituloO = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        autorO = new javax.swing.JTextField();
        labelACreacion = new javax.swing.JLabel();
        añoO = new javax.swing.JTextField();
        labelUbicacion = new javax.swing.JLabel();
        ubicacionO = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionO = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(436, 630));

        jLabel3.setText("Ingrese propiedades de la obra de arte a crear: ");

        obrasExistentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_OBRA", "Nombre", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        obrasExistentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obrasExistentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(obrasExistentes);

        jLabel2.setText("Obras De Arte Existentes:");

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloVentana.setText("Agregar Obra de Arte");

        labelIdentificador.setText("Identificador:");

        jButton4.setBackground(new java.awt.Color(246, 246, 246));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        jButton4.setText("Agregar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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

        labelTitulo.setText("Titulo:");

        labelAutor.setText("Autor:");

        labelACreacion.setText("Año de creación:");

        labelUbicacion.setText("Ubicación");

        labelDescripcion.setText("Descripción: ");

        descripcionO.setColumns(20);
        descripcionO.setLineWrap(true);
        descripcionO.setRows(5);
        descripcionO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(descripcionO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 161, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(tituloVentana))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(labelAutor)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelACreacion)
                                .addComponent(labelUbicacion)
                                .addComponent(labelIdentificador)
                                .addComponent(labelDescripcion))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idO)
                                .addComponent(añoO)
                                .addComponent(ubicacionO)
                                .addComponent(autorO, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tituloO)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(168, 168, 168))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloVentana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdentificador)
                    .addComponent(idO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(tituloO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAutor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelACreacion)
                    .addComponent(añoO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUbicacion)
                    .addComponent(ubicacionO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IAdministracionO administraciono = new IAdministracionO();
        administraciono.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        boolean mark_zuckerberg = false; /* flag para controlar que no se repitan los identificadores de las obras. */
        
        if ((idO.getText().length()!=0) && (autorO.getText().length()!=0) && (tituloO.getText().length()!=0) &&(añoO.getText().length()!=0) && (ubicacionO.getText().length()!=0)&&(descripcionO.getText().length()!=0)){

            for(int i = 0; i < CtrlObras.getInstancia().getObrasArray().size(); i++){ /* Se recorre el arreglo de obras. */
        
            String IdEntrada = idO.getText();
            String IdObra = CtrlObras.getInstancia().getObrasArray().get(i).getIdObra();

                if(IdObra == null ? IdEntrada == null : IdObra.equals(IdEntrada)){   /* Se compara el id actual con el existente para asegurarse de que no se repitan obras por identificador. */                
                    mark_zuckerberg = true;
                    break; /* Fin del ciclo con flag marcada. */
                }   
            }
            
            if(mark_zuckerberg == true){
                idO.setText(null);
                autorO.setText(null);
                tituloO.setText(null);
                añoO.setText(null);
                ubicacionO.setText(null);
                descripcionO.setText(null);
                JOptionPane.showMessageDialog(null, "Error, la obra ya existe.", "Error", JOptionPane.WARNING_MESSAGE); /* Las obras tienen un identificador único y no deben repetirse.*/
            }else{
                Obra obra = new Obra(idO.getText(),autorO.getText(),tituloO.getText(),añoO.getText(),ubicacionO.getText(),descripcionO.getText());
                DefaultTableModel modelo = (DefaultTableModel) obrasExistentes.getModel();
                
                controladorObra.getInstancia().getObrasArray().add(obra); /* Se carga la obra en el arreglo de obras. */
                modelo.addRow(new Object[]{obra.getIdObra(),obra.getTituloObra(),obra.getAutorObra()}); /* Se cargan los datos en la tabla de obrasExistentes.*/
                
                /* REINICIO DE CAMPOS DE AGREGAR OBRA.*/
               
                idO.setText(null); 
                autorO.setText(null);
                tituloO.setText(null);
                añoO.setText(null);
                ubicacionO.setText(null);
                descripcionO.setText(null);
                
                /* Mensaje de respuesta al cargar la obra.*/
                
                JOptionPane.showMessageDialog(null, "Obra agregada correctamente");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Error, se deben rellenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorO;
    private javax.swing.JTextField añoO;
    private javax.swing.JTextArea descripcionO;
    private javax.swing.JTextField idO;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelACreacion;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelIdentificador;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JTable obrasExistentes;
    private javax.swing.JTextField tituloO;
    private javax.swing.JLabel tituloVentana;
    private javax.swing.JTextField ubicacionO;
    // End of variables declaration//GEN-END:variables
}

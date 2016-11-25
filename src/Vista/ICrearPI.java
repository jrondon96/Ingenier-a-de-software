package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlObras;
import Controlador.CtrlPuntoDeInteres;
import Modelo.Obra;
import Modelo.PuntoDeInteres;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ICrearPI extends javax.swing.JFrame {
private CtrlObras controladorObras;  
private CtrlPuntoDeInteres controladorPi; 
private Iterator<Obra> it = controladorObras.getInstancia().getObrasArray().iterator();   
private Obra aux;
private ArrayList <Obra> ObrasAux= new ArrayList <Obra> (); 
private PuntoDeInteres PI;
    public ICrearPI() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Crear Punto de Interes");  
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel(); 
        
        for (int i=0; i < controladorPi.getInstancia().getPuntoDeInteresArray().size(); i++){
            modelo.insertRow(0, new Object[]{controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador(),
            controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getNombre(), 
            controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getDisponibilidad()});
        }
            
        while(it.hasNext()){
            aux=it.next();
            ComboBoxObra.addItem(aux.getIdObra()+" "+aux.getTituloObra());   
        }  
        
        if(CtrlObras.getInstancia().getObrasArray().size() <=0){
            agregarObra.setEnabled(false);
            eliminarObra.setEnabled(false);
        }
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponibilidadpi = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombrepi = new javax.swing.JTextField();
        idpi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxObra = new javax.swing.JComboBox();
        agregarObra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        eliminarObra = new javax.swing.JButton();
        crearPuntoInteres = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombrepi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        idpi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Identificador: ");

        jLabel3.setText("Ingrese propiedades del tour virtual a crear: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PuntoInteres", "Nombre", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("Puntos de interes Existentes:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Crear punto De Interés");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Disponibilidad:");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadpi.add(jRadioButton1);
        jRadioButton1.setText("Disponible");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadpi.add(jRadioButton2);
        jRadioButton2.setText("No Disponible");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Agregar Obras: ");

        ComboBoxObra.setFocusable(false);
        ComboBoxObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxObraActionPerformed(evt);
            }
        });

        agregarObra.setBackground(new java.awt.Color(246, 246, 246));
        agregarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        agregarObra.setText("Agregar Obra");
        agregarObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarObraActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Obra", "Titulo Obra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        eliminarObra.setBackground(new java.awt.Color(246, 246, 246));
        eliminarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        eliminarObra.setText("Eliminar Obra");
        eliminarObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarObra.setFocusPainted(false);
        eliminarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarObraActionPerformed(evt);
            }
        });

        crearPuntoInteres.setBackground(new java.awt.Color(246, 246, 246));
        crearPuntoInteres.setText("Crear");
        crearPuntoInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearPuntoInteres.setFocusPainted(false);
        crearPuntoInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPuntoInteresActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxObra, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(133, 133, 133)
                                        .addComponent(jRadioButton2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idpi, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(nombrepi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)))
                        .addGap(11, 11, 11)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(eliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(agregarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(crearPuntoInteres)
                        .addGap(183, 183, 183))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombrepi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(agregarObra)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarObra)
                .addGap(18, 18, 18)
                .addComponent(crearPuntoInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       IAdministracionPI administracionpi = new IAdministracionPI();
       administracionpi.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agregarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarObraActionPerformed
  
        String O =(String) ComboBoxObra.getSelectedItem(); 
        StringTokenizer id = new StringTokenizer(O," ");
        String token =  id.nextToken();
            
        for (int i=0;i<CtrlObras.getInstancia().getObrasArray().size();i++){

            String IdObra = CtrlObras.getInstancia().getObrasArray().get(i).getIdObra();

            if( token == null ? IdObra == null : token.equals(IdObra) ){
                ObrasAux.add(CtrlObras.getInstancia().getObrasArray().get(i));
                    
                DefaultTableModel modelo2 = (DefaultTableModel) jTable2.getModel();
                    
                modelo2.insertRow(0, new Object[]{CtrlObras.getInstancia().getObrasArray().get(i).getIdObra(),
                CtrlObras.getInstancia().getObrasArray().get(i).getTituloObra()});
            }     
        }                                      
    }//GEN-LAST:event_agregarObraActionPerformed

    private void crearPuntoInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPuntoInteresActionPerformed
        
        String disp = "No Disponible";
        boolean mark_zuckerberg = false;

        if ((idpi.getText().length()!=0) && (nombrepi.getText().length()!=0)) {
            
            for(int i = 0; i < CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size(); i++){
        
            String IdEntrada = idpi.getText();
            String IdPI = CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador();

                if(IdPI == null ? IdEntrada == null : IdPI.equals(IdEntrada)){                   
                    mark_zuckerberg = true;
                    break;
                }   
            }
            
            if(mark_zuckerberg == true){
                
                idpi.setText(null);
                nombrepi.setText(null);
                disponibilidadpi.clearSelection(); 
                DefaultTableModel modelo2 = (DefaultTableModel) jTable2.getModel();
                int filas= jTable2.getRowCount();
                
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }
                
                JOptionPane.showMessageDialog(null, "Error, el punto de interés ya existe.", "Error", JOptionPane.WARNING_MESSAGE);
            }else{
                
                if(disponibilidadpi.getSelection().equals(jRadioButton1.getModel())) {
                    disp = "Disponible";
                }    

                PuntoDeInteres pi = new PuntoDeInteres(idpi.getText(),nombrepi.getText(),disp, ObrasAux);
                CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().add(pi);

                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.insertRow(0, new Object[]{pi.getIdentificador(),pi.getNombre(),pi.getDisponibilidad()});

                idpi.setText(null);
                nombrepi.setText(null);
                disponibilidadpi.clearSelection(); 
                ObrasAux = new ArrayList <Obra> (); 

                DefaultTableModel modelo2 = (DefaultTableModel) jTable2.getModel();
                int filas= jTable2.getRowCount();
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }

                try{
                    String Obra =(String) ComboBoxObra.getSelectedItem();

                }catch(NullPointerException e){
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una obra.", "Ha ocurrido un error.", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            

        }else{
            JOptionPane.showMessageDialog(null,"Error, faltan campos por rellenar", "Error", JOptionPane.ERROR_MESSAGE); 
        }

    }//GEN-LAST:event_crearPuntoInteresActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
               
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void ComboBoxObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxObraActionPerformed

    private void eliminarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarObraActionPerformed

        try{
            String Id = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString();
            for(int i = 0; i<ObrasAux.size(); i++){
                if( Id == null ? ObrasAux.get(i).getIdObra() == null : Id.equals(ObrasAux.get(i).getIdObra())){    
                    ObrasAux.remove(i);
                    ((DefaultTableModel)jTable2.getModel()).removeRow(jTable2.getSelectedRow());
                }
            }
        }catch(ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog(null, "Error, no hay obras a eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_eliminarObraActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxObra;
    private javax.swing.JButton agregarObra;
    private javax.swing.JButton crearPuntoInteres;
    private javax.swing.ButtonGroup disponibilidadpi;
    private javax.swing.JButton eliminarObra;
    private javax.swing.JTextField idpi;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombrepi;
    // End of variables declaration//GEN-END:variables
}

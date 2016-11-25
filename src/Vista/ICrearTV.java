
package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlObras;
import Controlador.CtrlPuntoDeInteres;
import Controlador.CtrlTourVirtual;
import Modelo.PuntoDeInteres;
import Modelo.TourVirtual;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ICrearTV extends javax.swing.JFrame {

private CtrlTourVirtual controladorTv;  
private CtrlPuntoDeInteres controladorPi; 
private Iterator<PuntoDeInteres> it = controladorPi.getInstancia().getPuntoDeInteresArray().iterator();   
private PuntoDeInteres aux;
private ArrayList <PuntoDeInteres> puntoDeInteresAux= new ArrayList <PuntoDeInteres> (); 
private PuntoDeInteres PI;
    
public ICrearTV() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Crear Tour Virtual");  
        
        DefaultTableModel modelo = (DefaultTableModel) tablaTours.getModel(); 
        
        for (int i=0; i < controladorTv.getInstancia().getToursVirtualesArray().size(); i++){
            modelo.insertRow(0, new Object[]{controladorTv.getInstancia().getToursVirtualesArray().get(i).getIdentificador(),
            controladorTv.getInstancia().getToursVirtualesArray().get(i).getNombre(), 
            controladorTv.getInstancia().getToursVirtualesArray().get(i).getDisponibilidad()});
        }
            
        while(it.hasNext()){
            aux=it.next();
            ComboBoxPI.addItem(aux.getIdentificador()+" "+aux.getNombre());   
        }
        
        if(CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size() <=0){
            agregarPuntoDeInteres.setEnabled(false);
            eliminarPuntoDeInteres.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponibilidadtv = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombretv = new javax.swing.JTextField();
        idtv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxPI = new javax.swing.JComboBox();
        agregarPuntoDeInteres = new javax.swing.JButton();
        eliminarPuntoDeInteres = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTours = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nombretv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretvActionPerformed(evt);
            }
        });

        idtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtvActionPerformed(evt);
            }
        });

        jLabel4.setText("Identificador: ");

        jLabel3.setText("Ingrese propiedades del tour virtual a crear: ");

        jLabel2.setText("Tours Virtuales Existentes:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Crear Tour Virtual");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Disponibilidad:");

        jLabel7.setText("Agregar Puntos de interes: ");

        ComboBoxPI.setFocusable(false);

        agregarPuntoDeInteres.setBackground(new java.awt.Color(246, 246, 246));
        agregarPuntoDeInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        agregarPuntoDeInteres.setText("Agregar Punto de interes");
        agregarPuntoDeInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarPuntoDeInteres.setFocusPainted(false);
        agregarPuntoDeInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPuntoDeInteresActionPerformed(evt);
            }
        });

        eliminarPuntoDeInteres.setBackground(new java.awt.Color(246, 246, 246));
        eliminarPuntoDeInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        eliminarPuntoDeInteres.setText("Eliminar Punto de interes");
        eliminarPuntoDeInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarPuntoDeInteres.setFocusPainted(false);
        eliminarPuntoDeInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPuntoDeInteresActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(246, 246, 246));
        jButton4.setText("Crear");
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

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtv.add(jRadioButton1);
        jRadioButton1.setText("Disponible");
        jRadioButton1.setFocusPainted(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtv.add(jRadioButton2);
        jRadioButton2.setText("No Disponible");
        jRadioButton2.setFocusPainted(false);

        tablaPuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PI", "Nombre P_I", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPuntos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaPuntos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaPuntos);

        tablaTours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Tour", "Nombre Tour", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTours.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaTours.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tablaTours);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombretv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(idtv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComboBoxPI, 0, 213, Short.MAX_VALUE)
                            .addComponent(agregarPuntoDeInteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(eliminarPuntoDeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(185, 185, 185))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregarPuntoDeInteres)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarPuntoDeInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IAdministracionTV administraciontv = new IAdministracionTV();
        administraciontv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String disp = "No Disponible";
        boolean mark_zuckerberg = false;
        
        if ((idtv.getText().length()!=0) && (nombretv.getText().length()!=0)) {

            for(int i = 0; i < CtrlTourVirtual.getInstancia().getToursVirtualesArray().size(); i++){
        
            String IdEntrada = idtv.getText();
            String IdTour = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getIdentificador();

                if(IdTour == null ? IdEntrada == null : IdTour.equals(IdEntrada)){                   
                    mark_zuckerberg = true;
                    break;
                }   
            }
            
            if(mark_zuckerberg == true){
            
                idtv.setText(null);
                nombretv.setText(null);
                disponibilidadtv.clearSelection();
                
                DefaultTableModel modelo2 = (DefaultTableModel) tablaPuntos.getModel();
                int filas = tablaPuntos.getRowCount();
                
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }
                
                JOptionPane.showMessageDialog(null, "Error, el tour virtual ya existe.", "Error", JOptionPane.WARNING_MESSAGE);
            }else{
                if(disponibilidadtv.getSelection().equals(jRadioButton1.getModel())) {
                    disp = "Disponible";
                }

                TourVirtual tv = new TourVirtual(idtv.getText(),nombretv.getText(),disp,puntoDeInteresAux);
                CtrlTourVirtual.getInstancia().getToursVirtualesArray().add(tv);

                DefaultTableModel modelo = (DefaultTableModel) tablaTours.getModel();
                modelo.insertRow(0, new Object[]{tv.getIdentificador(),tv.getNombre(),tv.getDisponibilidad()});

                idtv.setText(null);
                nombretv.setText(null);
                disponibilidadtv.clearSelection();
                puntoDeInteresAux = new ArrayList <PuntoDeInteres> ();

                DefaultTableModel modelo2 = (DefaultTableModel) tablaPuntos.getModel();

                int filas= tablaPuntos.getRowCount();
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }
            }

            try{
                String Obra =(String) ComboBoxPI.getSelectedItem();

            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un punto de interes.", "Ha ocurrido un error.", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(null,"Error, faltan campos por rellenar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void eliminarPuntoDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPuntoDeInteresActionPerformed
        try{
            
            String Id = tablaPuntos.getValueAt(tablaPuntos.getSelectedRow(), 0).toString();
            for(int i = 0; i<puntoDeInteresAux.size(); i++)
            if( Id == null ? puntoDeInteresAux.get(i).getIdentificador() == null : Id.equals(puntoDeInteresAux.get(i).getIdentificador())){
                puntoDeInteresAux.remove(i);
                ((DefaultTableModel)tablaPuntos.getModel()).removeRow(tablaPuntos.getSelectedRow());
            }
        }catch(ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog(null, "Error, no hay puntos de interés a eliminar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarPuntoDeInteresActionPerformed

    private void agregarPuntoDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPuntoDeInteresActionPerformed
        String O =(String) ComboBoxPI.getSelectedItem();
        StringTokenizer id = new StringTokenizer(O," ");
        String token =  id.nextToken();

        for (int i=0;i<controladorPi.getInstancia().getPuntoDeInteresArray().size();i++){

            String IdPI = controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador();

            if( token == null ? IdPI == null : token.equals(IdPI) ){
                puntoDeInteresAux.add(controladorPi.getInstancia().getPuntoDeInteresArray().get(i));

                DefaultTableModel modelo2 = (DefaultTableModel) tablaPuntos.getModel();

                modelo2.insertRow(0, new Object[]{controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador(),
                    controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getNombre(),controladorPi.getInstancia().getPuntoDeInteresArray().get(i).getDisponibilidad()});
        }
        }
    }//GEN-LAST:event_agregarPuntoDeInteresActionPerformed

    private void idtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtvActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_idtvActionPerformed

    private void nombretvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretvActionPerformed
        // TODO add your handling code here:
        String nombre;
        nombre = nombretv.getText();
        System.out.println(nombre);
    }//GEN-LAST:event_nombretvActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPI;
    private javax.swing.JButton agregarPuntoDeInteres;
    private javax.swing.ButtonGroup disponibilidadtv;
    private javax.swing.JButton eliminarPuntoDeInteres;
    private javax.swing.JTextField idtv;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nombretv;
    private javax.swing.JTable tablaPuntos;
    private javax.swing.JTable tablaTours;
    // End of variables declaration//GEN-END:variables
}

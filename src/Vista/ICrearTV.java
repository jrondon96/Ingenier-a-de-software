
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
        
        /* Se cargan los tours existentes a la tabla correspondiente. */
        
        for (int i=0; i < controladorTv.getInstancia().getToursVirtualesArray().size(); i++){
            modelo.insertRow(0, new Object[]{controladorTv.getInstancia().getToursVirtualesArray().get(i).getIdentificador(),
            controladorTv.getInstancia().getToursVirtualesArray().get(i).getNombre(), 
            controladorTv.getInstancia().getToursVirtualesArray().get(i).getDisponibilidad()});
        }
        
        /* Se cargan los puntos de interes existentes en el combobox correspondiente. */
        
        while(it.hasNext()){
            aux=it.next();
            ComboBoxPI.addItem(aux.getIdentificador()+" "+aux.getNombre());   
        }
        
        /* Si no existen puntos de interes se deshabilitan las opciones de agregar o eliminar puntos de interes al momento de crear un tour virtual.  */
        
        if(CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size() <= 0){
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
        labelIdentificador = new javax.swing.JLabel();
        labelPropiedades = new javax.swing.JLabel();
        labelTExistentes = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDisponibilidad = new javax.swing.JLabel();
        labelAgregar = new javax.swing.JLabel();
        ComboBoxPI = new javax.swing.JComboBox();
        agregarPuntoDeInteres = new javax.swing.JButton();
        eliminarPuntoDeInteres = new javax.swing.JButton();
        botonCrearTour = new javax.swing.JButton();
        botonFinalizar = new javax.swing.JButton();
        DButton = new javax.swing.JRadioButton();
        NDButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTours = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelIdentificador.setText("Identificador: ");

        labelPropiedades.setText("Ingrese propiedades del tour virtual a crear: ");

        labelTExistentes.setText("Tours Virtuales Existentes:");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTitulo.setText("Crear Tour Virtual");

        labelNombre.setText("Nombre:");

        labelDisponibilidad.setText("Disponibilidad:");

        labelAgregar.setText("Agregar Puntos de interes: ");

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

        botonCrearTour.setBackground(new java.awt.Color(246, 246, 246));
        botonCrearTour.setText("Crear");
        botonCrearTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearTour.setFocusPainted(false);
        botonCrearTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearTourActionPerformed(evt);
            }
        });

        botonFinalizar.setBackground(new java.awt.Color(246, 246, 246));
        botonFinalizar.setText("Finalizar");
        botonFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFinalizar.setFocusPainted(false);
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });

        DButton.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtv.add(DButton);
        DButton.setText("Disponible");
        DButton.setFocusPainted(false);
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });

        NDButton.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtv.add(NDButton);
        NDButton.setText("No Disponible");
        NDButton.setFocusPainted(false);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDisponibilidad)
                        .addGap(18, 18, 18)
                        .addComponent(DButton)
                        .addGap(18, 18, 18)
                        .addComponent(NDButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelPropiedades)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombretv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelIdentificador)
                                .addGap(18, 18, 18)
                                .addComponent(idtv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(labelTExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAgregar)
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
                        .addComponent(botonCrearTour)
                        .addGap(185, 185, 185))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTExistentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPropiedades)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdentificador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisponibilidad)
                    .addComponent(DButton)
                    .addComponent(NDButton))
                .addGap(18, 18, 18)
                .addComponent(labelAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(agregarPuntoDeInteres)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarPuntoDeInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCrearTour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonFinalizar)
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

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DButtonActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        IAdministracionTV administraciontv = new IAdministracionTV();
        administraciontv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonFinalizarActionPerformed

    private void botonCrearTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearTourActionPerformed

        String disp = "No Disponible";
        boolean mark_zuckerberg = false;
        
        if ((idtv.getText().length()!=0) && (nombretv.getText().length()!=0 && (DButton.isSelected() || NDButton.isSelected()))) { /* Los campos no pueden estar vacíos.*/
            
            /* Se verifica que no exista un tour virtual con identificador igual.*/
            
            for(int i = 0; i < CtrlTourVirtual.getInstancia().getToursVirtualesArray().size(); i++){
        
            String IdEntrada = idtv.getText();
            String IdTour = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getIdentificador();

                if(IdTour == null ? IdEntrada == null : IdTour.equals(IdEntrada)){                   
                    mark_zuckerberg = true; /* Si existe un tour con identificador repetido se marca la bandera. */
                    break;
                }   
            }
            
            if(mark_zuckerberg == true){
            
                /* Se reinician los campos de ICrearTV*/
                
                idtv.setText(null);
                nombretv.setText(null);
                disponibilidadtv.clearSelection();
                
                /* Se reinicia la tabla de puntos de interes. */
                
                DefaultTableModel modelo2 = (DefaultTableModel) tablaPuntos.getModel();
                int filas = tablaPuntos.getRowCount();
                
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }
                
                JOptionPane.showMessageDialog(null, "El tour virtual ya existe.", "Ha ocurrido un error.", JOptionPane.WARNING_MESSAGE); /* No pueden haber tours con un mismo identificador. */
            }else{
                
                if(disponibilidadtv.getSelection().equals(DButton.getModel())) {
                    disp = "Disponible";
                }

                TourVirtual tv = new TourVirtual(idtv.getText(),nombretv.getText(),disp,puntoDeInteresAux);
                CtrlTourVirtual.getInstancia().getToursVirtualesArray().add(tv); /* Se agrega el nuevo tour al arreglo de tours. */

                /* Se carga el nuevo tour a la tabla de tours existentes. */
                
                DefaultTableModel modelo = (DefaultTableModel) tablaTours.getModel();
                modelo.insertRow(0, new Object[]{tv.getIdentificador(),tv.getNombre(),tv.getDisponibilidad()}); 

                /* Se reinician los campos de ICrearTV*/
                
                idtv.setText(null);
                nombretv.setText(null);
                disponibilidadtv.clearSelection();
                puntoDeInteresAux = new ArrayList <PuntoDeInteres> ();

                /*Se limpia la tabla de puntos de interes. */
                
                DefaultTableModel modelo2 = (DefaultTableModel) tablaPuntos.getModel();
                int filas= tablaPuntos.getRowCount();
                
                for (int i = 0; filas>i; i++) {
                    modelo2.removeRow(0);
                }
            }

            try{
                String Obra = (String) ComboBoxPI.getSelectedItem();

            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un punto de interes.", "Ha ocurrido un error.", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(null,"Faltan campos por rellenar.", "Ha ocurrido un error.", JOptionPane.ERROR_MESSAGE); /* Si algún campo está vacío.*/
        }
    }//GEN-LAST:event_botonCrearTourActionPerformed

    private void eliminarPuntoDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPuntoDeInteresActionPerformed
        try{
            
            String Id = tablaPuntos.getValueAt(tablaPuntos.getSelectedRow(), 0).toString();
            for(int i = 0; i < puntoDeInteresAux.size(); i++)
            if( Id == null ? puntoDeInteresAux.get(i).getIdentificador() == null : Id.equals(puntoDeInteresAux.get(i).getIdentificador())){
                puntoDeInteresAux.remove(i); /* Se elimina el punto de interes seleccionado en la tabla de puntos de interes. */
                ((DefaultTableModel)tablaPuntos.getModel()).removeRow(tablaPuntos.getSelectedRow());
            }
        }catch(ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog(null, "No hay puntos de interés a eliminar.", "Ha ocurrido un error.", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarPuntoDeInteresActionPerformed

    private void agregarPuntoDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPuntoDeInteresActionPerformed
        
        /* Se agregan puntos de interes al tour que se está creando. */
        
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPI;
    private javax.swing.JRadioButton DButton;
    private javax.swing.JRadioButton NDButton;
    private javax.swing.JButton agregarPuntoDeInteres;
    private javax.swing.JButton botonCrearTour;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.ButtonGroup disponibilidadtv;
    private javax.swing.JButton eliminarPuntoDeInteres;
    private javax.swing.JTextField idtv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JLabel labelDisponibilidad;
    private javax.swing.JLabel labelIdentificador;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPropiedades;
    private javax.swing.JLabel labelTExistentes;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField nombretv;
    private javax.swing.JTable tablaPuntos;
    private javax.swing.JTable tablaTours;
    // End of variables declaration//GEN-END:variables
}

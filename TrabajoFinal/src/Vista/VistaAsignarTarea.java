package Vista;

import AccesoADatos.EquipoData;
import AccesoADatos.TareaData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.ProyectoData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class VistaAsignarTarea extends javax.swing.JInternalFrame {

    public VistaAsignarTarea() {
        initComponents();
        llenarComboEquipo();
        jcbEquipo.setSelectedItem(null);
        txtProyecto.setEditable(false);
        jdcFechaCreacion.setDate(Calendar.getInstance().getTime());
        //jdcFechaCreacion.setEnabled(false);
        //jdcFechaCreacion.getComponent(1).setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jdcFechaCreacion = new com.toedter.calendar.JDateChooser();
        jcbMiembro = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbEquipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtProyecto = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NUEVA TAREA");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha creación:");

        jLabel6.setText("Proyecto:");

        jcbMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMiembroActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel7.setText("Equipo:");

        jcbEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquipoActionPerformed(evt);
            }
        });

        jLabel8.setText("Miembro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAsignar)
                                .addGap(80, 80, 80)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtProyecto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcbMiembro, javax.swing.GroupLayout.Alignment.LEADING, 0, 194, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAsignar)
                            .addComponent(btnSalir)
                            .addComponent(btnLimpiar))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        jdcFechaCreacion.setCalendar(null);
        jcbEquipo.setSelectedItem(null);
        txtProyecto.setText("");
        jcbMiembro.setSelectedItem(null);        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try {
        Tarea tarea = new Tarea();
        TareaData td = new TareaData();
        EquipoMiembrosData emd = new EquipoMiembrosData();
        List<EquiposMiembros> miembros = emd.listarEquipoMiembros(jcbEquipo.getSelectedIndex());
        tarea.setNombre(txtNombre.getText());
        tarea.setFechaCreacion(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        tarea.setFechaCierre(jdcFechaCreacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        tarea.setMiembroEq(miembros.get(jcbMiembro.getSelectedIndex()));
        tarea.setEstado(1);
        td.guardarTarea(tarea);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. Debe llenar todos los campos. " + e.getMessage());
        }      
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jcbMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMiembroActionPerformed
        
    }//GEN-LAST:event_jcbMiembroActionPerformed

    private void jcbEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquipoActionPerformed
        jcbMiembro.removeAllItems();
        txtProyecto.setText("");
        llenarComboMiembro();
        llenarTxtProyecto();
    }//GEN-LAST:event_jcbEquipoActionPerformed
    
    public void llenarComboEquipo(){
        EquipoData ed = new EquipoData();
        List<Equipo> equipos= ed.recuperarEquipos();        
        for(Equipo e: equipos){
            jcbEquipo.addItem(e);
        }
    }
    
    public void llenarComboMiembro(){
        EquipoMiembrosData emd = new EquipoMiembrosData();
        List<EquiposMiembros> miembros = emd.listarEquipoMiembros(jcbEquipo.getSelectedIndex());
        for(EquiposMiembros m: miembros){
            jcbMiembro.addItem(m.getMiembro());
        }
    }
    public void llenarTxtProyecto(){
        ProyectoData pd = new ProyectoData();
        Equipo equipo = (Equipo) jcbEquipo.getSelectedItem();
        if (jcbEquipo.getSelectedItem()!=null) {
            txtProyecto.setText(pd.buscarProyecto(equipo.getProyecto().getIdProyecto()).getNombre());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<Equipo> jcbEquipo;
    private javax.swing.JComboBox<Miembro> jcbMiembro;
    private com.toedter.calendar.JDateChooser jdcFechaCreacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProyecto;
    // End of variables declaration//GEN-END:variables
}
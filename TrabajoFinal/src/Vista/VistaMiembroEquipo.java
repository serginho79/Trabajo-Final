/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoADatos.EquipoData;
import AccesoADatos.EquipoMiembrosData;
import AccesoADatos.MiembroData;
import Modelo.Equipo;
import Modelo.EquiposMiembros;
import Modelo.Miembro;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VistaMiembroEquipo extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaMiembroEquipo
     */
    
    Equipo equipo= new Equipo();
    EquipoData equiData= new EquipoData();
    Miembro miembro= new Miembro();
    MiembroData miData= new MiembroData();
    
    
    public VistaMiembroEquipo() {
        initComponents();
        
        //Llenamos el jcbEquipo con los equipos
        List<Equipo> listaEquipos= equiData.recuperarEquipos();
        if(listaEquipos.size()>0){
         for(Equipo e: listaEquipos){
          jcbEquipo.addItem(e);
         }
        }
        
        //Llenamos el jcbMiembro con los miembros
        List<Miembro> listaMiembro= miData.recuperarMiembros();
        if(listaMiembro.size()>0){
         for(Miembro m: listaMiembro){
          jcbMiembro.addItem(m);
         }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbEquipo = new javax.swing.JComboBox<>();
        jcbMiembro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbAgregarMiembroEquipo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaIncorporacion = new com.toedter.calendar.JDateChooser();
        jtfRol = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Miembros - Equipos");

        jLabel2.setText("Equipo");

        jLabel3.setText("Miembro");

        jbAgregarMiembroEquipo.setText("Agregar al Equipo");
        jbAgregarMiembroEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMiembroEquipoActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Incorporacion");

        jLabel5.setText("Rol");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jbLimpiar)
                .addGap(39, 39, 39)
                .addComponent(jbAgregarMiembroEquipo)
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbMiembro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfRol, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addComponent(jdcFechaIncorporacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarMiembroEquipo)
                    .addComponent(jButton2)
                    .addComponent(jbLimpiar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarMiembroEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMiembroEquipoActionPerformed
        // TODO add your handling code here:
        
        equipo= (Equipo) jcbEquipo.getSelectedItem();
        miembro= (Miembro) jcbMiembro.getSelectedItem();
        EquiposMiembros em= new EquiposMiembros();
        EquipoMiembrosData emd= new EquipoMiembrosData();
        em.setEquipo(equipo);
        em.setMiembro(miembro);
        if(jdcFechaIncorporacion.getDate()!= null){
        em.setFechaIncorporacion(jdcFechaIncorporacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
        else{
         JOptionPane.showMessageDialog(null, "Ingrese una Fecha");
         jdcFechaIncorporacion.requestFocus();
        }
        if(jtfRol.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Ingrese un Rol");
         jtfRol.requestFocus();
        }
        else{        
        em.setRol(jtfRol.getText());
        }
        emd.guardarEquipoMiembros(em);
        
    }//GEN-LAST:event_jbAgregarMiembroEquipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jdcFechaIncorporacion.setDate(null);
        jtfRol.setText(" ");
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAgregarMiembroEquipo;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<Equipo> jcbEquipo;
    private javax.swing.JComboBox<Miembro> jcbMiembro;
    private com.toedter.calendar.JDateChooser jdcFechaIncorporacion;
    private javax.swing.JTextField jtfRol;
    // End of variables declaration//GEN-END:variables
}
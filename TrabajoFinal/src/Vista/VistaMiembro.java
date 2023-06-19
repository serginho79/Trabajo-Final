/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoADatos.MiembroData;
import Modelo.Miembro;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VistaMiembro extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewEquipo
     * 
     */
    Miembro miembro=new Miembro();
    MiembroData miData= new MiembroData();
    
    public VistaMiembro() {
        initComponents();
        jrbAlta.setSelected(false); 
        jrbModificar.setSelected(false);
        jtfNombre.setEnabled(false);
        jtfApellido.setEnabled(false);
        jtfDni.setEnabled(false);
        jrbActivo.setEnabled(false);
        jrbInactivo.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbBuscar.setEnabled(false);
        
        
    }
    
    public boolean verificar(){
     int campos=0, validar;
     
     try{
     if(jrbAlta.isSelected()){
       
         validar= Integer.parseInt(jtfDni.getText());
         campos++; //1
         if(!jtfApellido.getText().isEmpty()){
             campos++; //2
         }
         if(!jtfNombre.getText().isEmpty()){
          campos++; //3
         }
         if(campos==3){
          return true;
         }
       }
     else{
       return false;
     }
     } catch(NumberFormatException num){
         JOptionPane.showMessageDialog(null, "El valor ingresado no es un número"+num.getMessage());
       }
       catch(Exception e){
        JOptionPane.showMessageDialog(null, "Debe completar todos los campos"+e.getMessage());
       }
        return false;
     }

    public void darAltaMiembro(){
    if(verificar()){
         miembro.setDni(Integer.parseInt(jtfDni.getText()));
         miembro.setApellido(jtfApellido.getText());
         miembro.setNombre(jtfNombre.getText());
         miembro.setEstado(1); // siempre se da de alta un miembro como activo
         miData.guardarMiembro(miembro);
        }
//        else{
//          JOptionPane.showMessageDialog(null, "Verifique los campos");
////          
//        }
    }
    
    public void modificarMiembro(){
    
        if(verificar()){
         miembro.setDni(Integer.parseInt(jtfDni.getText()));
         miembro.setApellido(jtfApellido.getText());
         miembro.setNombre(jtfNombre.getText());
         if(jrbActivo.isSelected()){
         miembro.setEstado(1); // si
         }
         else{
          miembro.setEstado(0);
         }
         //miData. // siempre se da de alta un miembro como activo
         if(miData.modificarMiembro(miembro)){
          JOptionPane.showMessageDialog(null, "Miembro Actualizado");
         }
         else{
          JOptionPane.showMessageDialog(null, "No se pudo actualizar la información del miembro");
         }
        }
        //else{
        //  JOptionPane.showMessageDialog(null, "Verifique los campos");
        //}
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jrbAlta = new javax.swing.JRadioButton();
        jrbModificar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jrbActivo = new javax.swing.JRadioButton();
        jrbInactivo = new javax.swing.JRadioButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MIEMBRO");

        jrbAlta.setText("Alta");
        jrbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAltaActionPerformed(evt);
            }
        });

        jrbModificar.setText("Modificar");
        jrbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        jLabel5.setText("Estado");

        jrbActivo.setText("Activo");
        jrbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivoActionPerformed(evt);
            }
        });

        jrbInactivo.setText("Inactivo");
        jrbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivoActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jtfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 35, Short.MAX_VALUE)
                                .addComponent(jbLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jrbAlta)
                                        .addGap(32, 32, 32)
                                        .addComponent(jrbModificar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jrbActivo)
                                        .addGap(27, 27, 27)
                                        .addComponent(jrbInactivo)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jtfNombre))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAlta)
                    .addComponent(jrbModificar))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbActivo)
                    .addComponent(jrbInactivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar)
                    .addComponent(jbCancelar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivoActionPerformed
        // TODO add your handling code here:
        jrbInactivo.setSelected(false);
        
        
    }//GEN-LAST:event_jrbActivoActionPerformed

    private void jrbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivoActionPerformed
        // TODO add your handling code here:
        jrbActivo.setSelected(false);
    }//GEN-LAST:event_jrbInactivoActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        // TODO add your handling code here:
        jrbModificar.setSelected(false);
        jtfNombre.setEnabled(true);
        jtfApellido.setEnabled(true);
        jtfDni.setEnabled(true);
        jrbActivo.setSelected(true);
        jrbActivo.setEnabled(true);
        jbGuardar.setEnabled(true);
    }//GEN-LAST:event_jrbAltaActionPerformed

    
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        if(jrbAlta.isSelected()){
         darAltaMiembro();
        }
        else{
         modificarMiembro();
         
        }
        
        
//        if(verificar() && jrbAlta.isSelected()){
//         miembro.setDni(Integer.parseInt(jtfDni.getText()));
//         miembro.setApellido(jtfApellido.getText());
//         miembro.setNombre(jtfNombre.getText());
//         miembro.setEstado(1); // siempre se da de alta un miembro como activo
//         miData.guardarMiembro(miembro);
//        }
//        else{
//          JOptionPane.showMessageDialog(null, "Verifique los campos");
//
//        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniActionPerformed
        // TODO add your handling code here:
        try{
        int nro= Integer.parseInt(jtfDni.getText());
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico"+e.getMessage());
        }
    }//GEN-LAST:event_jtfDniActionPerformed

    private void jrbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbModificarActionPerformed
        // TODO add your handling code here:
        //int nro;
        
        jrbAlta.setSelected(false);
        jrbAlta.setEnabled(false);
        jbBuscar.setEnabled(true);
        jtfDni.setEnabled(true);
        jtfApellido.setEnabled(false);
        jtfNombre.setEnabled(false);
        jrbActivo.setEnabled(false);
        jrbInactivo.setEnabled(false);
        jbGuardar.setEnabled(false);
        
    }//GEN-LAST:event_jrbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
//       Miembro miembro=new Miembro();
//       MiembroData miData= new MiembroData();
       jbGuardar.setEnabled(true);
       jtfApellido.setEnabled(true);
       jtfNombre.setEnabled(true);
       jrbActivo.setEnabled(true);
       jrbInactivo.setEnabled(true);
        try{
        if(!jtfDni.getText().isEmpty()){   
        int nro= Integer.parseInt(jtfDni.getText());
        //System.out.println("Numero de documento: "+ nro);
        miembro= miData.buscarMiembroDNI(nro);
        jtfApellido.setText(miembro.getApellido());
        jtfNombre.setText(miembro.getNombre());
        if(miembro.getEstado()==1){
         jrbActivo.setSelected(true);
         jrbInactivo.setSelected(false);
        }
        
        else{
          jrbActivo.setSelected(false);
          jrbInactivo.setSelected(true);
        }
        
        }
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico"+e.getMessage());
        }
       
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrbInactivo;
    private javax.swing.JRadioButton jrbModificar;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC.Vistas;

import SIC.Entidades.Cuenta;
import SIC.Entidades.CuentaSaldada;
import SIC.Entidades.Movimiento;
import SIC.Entidades.Periodo;
import SIC.Service.SICService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author dannier
 */
public class AdministrarPeriodo extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarPeriodo
     */
    public AdministrarPeriodo() {
        initComponents();
        cargarPeriodoActual();
    }

    private void cargarPeriodoActual() {
        Periodo actual = SICService.getServPeriodo().getActivo();
        if (actual != null) {

            DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            inicioPeriodoActual.setText(formatoFecha.format(actual.getFechaInicio()));
            finPeriodoActual.setText(formatoFecha.format(actual.getFechaInicio()));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicioPeriodoActual = new javax.swing.JTextField();
        finPeriodoActual = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        finalizarPeriodoActual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar periodo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Periodo actual")));

        jLabel1.setText("Inicio");

        jLabel2.setText("Fin");

        inicioPeriodoActual.setEditable(false);

        finPeriodoActual.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inicioPeriodoActual, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(finPeriodoActual))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inicioPeriodoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(finPeriodoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        finalizarPeriodoActual.setText("Finalizar");
        finalizarPeriodoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarPeriodoActualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(guardar)
                .addGap(18, 18, 18)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(finalizarPeriodoActual)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(nuevo)
                    .addComponent(finalizarPeriodoActual))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarPeriodoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarPeriodoActualActionPerformed
        // TODO add your handling code here:

        Periodo actual = SICService.getServPeriodo().getActivo();

        if (actual != null) {
 
            //Saldar cuentas
            for (Cuenta cuenta : (List<Cuenta>) SICService.getServCuenta().getListado(Cuenta.class)) {
                if (cuenta.getMovimientoList().isEmpty()) {
                    continue;
                }

                double saldo = 0;
                for (Movimiento movimiento : cuenta.getMovimientoList()) {
                    
                    if(movimiento.getFecha().before(actual.getFechaInicio()) || movimiento.getFecha().after(actual.getFechaFin()))
                        continue;

                    if (movimiento.getTipo().equals("D")) {
                        saldo += movimiento.getCantidad();
                    } else {
                        saldo -= movimiento.getCantidad();
                    }
                }
//Almacena las cuentas
                if (saldo != 0) {
                    CuentaSaldada cuentaSaldada = new CuentaSaldada();
                    cuentaSaldada.setCuenta(cuenta);
                    cuentaSaldada.setPeriodo(SICService.getServPeriodo().getActivo());
                    cuentaSaldada.setSaldo(saldo);
                    SICService.getServCuentaSaldada().guardar(cuentaSaldada);
                }
                
            actual.setActivo("0");
            SICService.getServPeriodo().guardar(actual);

            }

            inicioPeriodoActual.setText("");
            finPeriodoActual.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay periodo activo", "Cerrar periodo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_finalizarPeriodoActualActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        if (SICService.getServPeriodo().getActivo() == null) {
            inicioPeriodoActual.setText("");
            finPeriodoActual.setText("");
            inicioPeriodoActual.setEditable(true);
            finPeriodoActual.setEditable(true);
            guardar.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "NO ha cerrado el periodo anterior", "Iniciar Periodo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:

        if (inicioPeriodoActual.getText().isEmpty() || finPeriodoActual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede guardar, hay campos vacios");
        } else if (validarFecha(inicioPeriodoActual) && validarFecha(finPeriodoActual)) {
            Periodo nuevo = new Periodo();
            nuevo.setFechaInicio(new Date(inicioPeriodoActual.getText()));
            nuevo.setFechaFin(new Date(finPeriodoActual.getText()));
            nuevo.setActivo("1");
            SICService.getServPeriodo().guardar(nuevo);

            
            for(CuentaSaldada cuentaSaldada:(List<CuentaSaldada>) SICService.getServCuentaSaldada().getSaldosAnteriores())
            {
                Movimiento m= new Movimiento();
                m.setCuenta(cuentaSaldada.getCuenta());
                m.setFecha(new Date());
                
                if(cuentaSaldada.getSaldo() > 0)
                    m.setTipo("D");
                else
                    m.setTipo("H");
                
                m.setCantidad(cuentaSaldada.getSaldo());
                
                SICService.getServMovimiento().guardar(m);
            }
            JOptionPane.showMessageDialog(null, "Guardado y activado como periodo actual");
            guardar.setVisible(false);
            
        }
    }//GEN-LAST:event_guardarActionPerformed

    private boolean validarFecha(JTextField fecha) {
        if (fecha.getText().isEmpty()) {
            return false;
        }
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministrarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarPeriodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarPeriodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField finPeriodoActual;
    private javax.swing.JButton finalizarPeriodoActual;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField inicioPeriodoActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
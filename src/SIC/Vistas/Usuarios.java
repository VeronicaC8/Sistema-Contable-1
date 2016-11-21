/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC.Vistas;

import SIC.Entidades.Empleado;
import SIC.Entidades.Usuario;
import SIC.Service.SICService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dannier
 */
public class Usuarios extends javax.swing.JDialog {
    
    List<Usuario> usuarios = new ArrayList<>();
        
    Empleado empleadoSelected;
    Usuario usuarioSelected;


    /**
     * Creates new form Usuario
     */
    public Usuarios(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        cargarDatos();
        this.setLocationRelativeTo(null);
    }

    public void cargarDatos() {
      usuarios = SICService.getServUsuario().getListado(Usuario.class);
       DefaultTableModel defaultTableModel = (DefaultTableModel) tablaUsuarios.getModel();
       
       while (defaultTableModel.getRowCount() > 0) {
           defaultTableModel.removeRow(0);
       }
       for (Usuario usuario1 : usuarios) {
           Object[] linea = {usuario1.getCodigoEmpleado(),
               usuario1.getEmpleado().getNombres(),
               usuario1.getClave()
           };
           defaultTableModel.addRow(linea);
       }
    }


    private void actualizarTextos(boolean llenar) {
        if (llenar) {
            nombreEmpleado.setText(empleadoSelected.getNombres() + " " + empleadoSelected.getApellidos());
            clave.setText(usuarioSelected.getClave());
            usuario.setText(usuarioSelected.getUsuario());
        } else {
            nombreEmpleado.setText("");
            clave.setText("");
            usuario.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        nombreEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 369, 87, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 369, 82, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos"));

        jLabel1.setText("Codigo Empleado");

        codigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEmpleadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario");

        jLabel3.setText("Clave");

        nombreEmpleado.setEnabled(false);

        jLabel5.setText("Nombre empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(codigoEmpleado)
                    .addComponent(usuario)
                    .addComponent(clave))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, -1, 170));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de usuarios"));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Clave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 207, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEmpleadoActionPerformed
        // TODO add your handling code here:
        usuarioSelected = SICService.getServUsuario().getUsuarioByCodigoEmpleado(codigoEmpleado.getText());
        ///Si ya existe se prepara para editarlo
        if (usuarioSelected != null) {
            empleadoSelected = usuarioSelected.getEmpleado();
            codigoEmpleado.setEnabled(false);
            usuario.setEnabled(true);
            clave.setEnabled(true);
            actualizarTextos(true);
        } else {//Sino existe se prepara para agregarlo
            actualizarTextos(false);
            empleadoSelected = (Empleado) SICService.getServEmpleado().getByPK(Empleado.class,codigoEmpleado.getText());
            if (empleadoSelected != null) {
                nombreEmpleado.setText(empleadoSelected.getNombres() + " " + empleadoSelected.getApellidos());
                usuario.setEnabled(true);
                clave.setEnabled(true);
            } else {
                nombreEmpleado.setText("Empleado no encontrado");
                usuario.setEnabled(false);
                clave.setEnabled(false);
            }
        }
    }//GEN-LAST:event_codigoEmpleadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (usuarioSelected != null) {
            SICService.getServUsuario().eliminar(usuarioSelected);
            codigoEmpleado.setEnabled(true);
            actualizarTextos(false);
            cargarDatos();
            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuario seleccionado");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        // TODO add your handling code here:
        empleadoSelected=null;
        usuarioSelected=null;
        
        if (evt.getClickCount() == 2 && tablaUsuarios.getSelectedRow() != -1) {
            usuarioSelected = usuarios.get(tablaUsuarios.getSelectedRow());
            empleadoSelected = usuarioSelected.getEmpleado();
            codigoEmpleado.setText(empleadoSelected.getCodigoEmpleado());
            codigoEmpleado.setEnabled(false);
            actualizarTextos(true);    
        }
        
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (empleadoSelected == null || usuario.getText().isEmpty() || clave.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete los datos");
        } else {
            if (usuarioSelected==null && empleadoSelected!=null) {
                usuarioSelected = new Usuario(empleadoSelected.getCodigoEmpleado());                
            }

            usuarioSelected.setUsuario(usuario.getText());
            usuarioSelected.setClave(clave.getText());
            usuarioSelected.setEmpleado(empleadoSelected);
            SICService.getServUsuario().guardar(usuarioSelected);
            actualizarTextos(false);
            JOptionPane.showMessageDialog(null, "Datos guardados");
        }
        cargarDatos();
        codigoEmpleado.setText("");
        codigoEmpleado.setEnabled(true);
        usuarioSelected = null;
        empleadoSelected = null;
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField clave;
    private javax.swing.JTextField codigoEmpleado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

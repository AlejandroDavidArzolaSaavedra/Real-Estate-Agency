package gui;

import file.AgenciaFile;
import model.Administrador;
import model.Cliente;
import model.Inmobiliaria;

public class ModificarClienteForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public AgenciaFile file;
    public Cliente cliente;
    public Administrador administrador;

    public ModificarClienteForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblFormularioRegistro = new javax.swing.JLabel();
        pFormulario = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtApellidos = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        btnActualizarUsuario = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(53, 121, 56));
        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver atras");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblFormularioRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFormularioRegistro.setText("Datos del Usuario:");

        pFormulario.setBackground(new java.awt.Color(53, 121, 56));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo electronico:");

        lblPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña nueva:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos:");

        btnActualizarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(53, 121, 56));
        btnActualizarUsuario.setText("Actualizar Usuario");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFormularioLayout = new javax.swing.GroupLayout(pFormulario);
        pFormulario.setLayout(pFormularioLayout);
        pFormularioLayout.setHorizontalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtCorreo)
                    .addComponent(txtPassword)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pFormularioLayout.setVerticalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        lblError.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblFormularioRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblFormularioRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AdminForm adminForm = new AdminForm();
        adminForm.inmobiliaria = inmobiliaria;
        adminForm.file = file;
        adminForm.administrador = administrador;
        adminForm.setLocationRelativeTo(null);
        adminForm.setVisible(true);
        adminForm.setTextSesion();
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        boolean realizado = true;
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            if (inmobiliaria.getClientes().get(i).getCorreo().equals(cliente.getCorreo())) {
                if (txtCorreo.getText().contains("#") || txtApellidos.getText().contains("#") || txtPassword.getText().contains("#")) {
                    lblError.setText("Hay un caracter no permitido");
                } else {
                    if (txtNombre.getText() != "" && txtNombre.getText().length() != 0) {
                        inmobiliaria.getClientes().get(i).setNombre(txtNombre.getText());
                    } else {
                        lblError.setText("El nombre no puede estar vacío");
                        realizado = false;
                    }
                    if (txtApellidos.getText() != "" && txtApellidos.getText().length() != 0) {
                        inmobiliaria.getClientes().get(i).setApellido(txtApellidos.getText());
                    } else {
                        lblError.setText("Los apellidos no pueden estar vacíos");
                        realizado = false;
                    }
                    if (txtPassword.getText() != "" && txtPassword.getText().length() != 0) {
                        inmobiliaria.getClientes().get(i).setPassword(txtPassword.getText());
                    } else {
                        lblError.setText("La contraseña no puede estar vacía");
                        realizado = false;
                    }
                    if (txtCorreo.getText().contains("@")) {
                        if (txtCorreo.getText() != "" && txtCorreo.getText().length() != 0) {
                            inmobiliaria.getClientes().get(i).setCorreo(txtCorreo.getText());
                        } else {
                            lblError.setText("El correo no puede estar vacío");
                            realizado = false;
                        }
                    } else {
                        lblError.setText("El correo no es correcto.");
                        realizado = false;
                    }
                    if (realizado) {
                        lblError.setText("Se han realizado los cambios correctamente.");
                    }
                }
            }
        }

        file.saveToFileClientes(inmobiliaria);
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    public void establecerDatos() {
        txtNombre.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellido());
        txtCorreo.setText(cliente.getCorreo());
        txtPassword.setText(cliente.getPassword());
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFormularioRegistro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}

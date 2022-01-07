package gui;

import file.AgenciaFile;
import model.Cliente;
import model.Inmobiliaria;

public class RegistrarseForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public AgenciaFile file;

    public RegistrarseForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        lblFormularioRegistro = new javax.swing.JLabel();
        pFormulario = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRepetirPassword = new javax.swing.JLabel();
        txtRepetirPassword = new javax.swing.JPasswordField();
        txtApellidos = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(53, 121, 56));
        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a la ventana inicial");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblFormularioRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFormularioRegistro.setText("Formulario de registro:");

        pFormulario.setBackground(new java.awt.Color(53, 121, 56));

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Ingresa los datos requeridos para registrarte");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo electronico:");

        lblPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña:");

        lblRepetirPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRepetirPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblRepetirPassword.setText("Repite la contraseña:");

        lblApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos:");

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(53, 121, 56));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFormularioLayout = new javax.swing.GroupLayout(pFormulario);
        pFormulario.setLayout(pFormularioLayout);
        pFormularioLayout.setHorizontalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                            .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                    .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPassword)
                                        .addComponent(lblCorreo))
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                                    .addComponent(lblRepetirPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtRepetirPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtApellidos)
                                .addComponent(txtCorreo)
                                .addComponent(txtPassword)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioLayout.createSequentialGroup()
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)))))
        );
        pFormularioLayout.setVerticalGroup(
            pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInfo)
                .addGap(29, 29, 29)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRepetirPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        lblError.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));

        btnSalir.setBackground(new java.awt.Color(0, 51, 102));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblFormularioRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(lblFormularioRegistro)
                .addGap(18, 18, 18)
                .addComponent(pFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AgenciaForm agenciaForm = new AgenciaForm();
        agenciaForm.inmobiliaria = inmobiliaria;
        agenciaForm.file = file;
        agenciaForm.setLocationRelativeTo(null);
        agenciaForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        // Tratamiento excepcion no mismas contraseñas
        if (!txtPassword.getText().equals(txtRepetirPassword.getText())) {
            lblError.setText("Las contraseñas no coinciden.");
        } else {
            Cliente client = new Cliente(txtNombre.getText(), txtApellidos.getText(), txtCorreo.getText(), txtPassword.getText());
            // Tratamiento excepcion  caracter "/" no valido
            if (txtNombre.getText().contains("/") || txtApellidos.getText().contains("/") || txtCorreo.getText().contains("/") || txtPassword.getText().contains("|")) {
                lblError.setText("Hay un caracter no permitido");
                // Tratamiento excepcion no introducir nigun valor    
            } else if (txtPassword.getText().equals("") || txtCorreo.getText().equals("")
                    ^ txtRepetirPassword.getText().equals("")
                    || txtNombre.getText().equals("") || txtApellidos.getText().equals("")) {
                lblError.setText("Faltan campos por introducir, Vuelva a intentarlo");
                // Tratamiento excepcion  caracter "@" no introducido en el correo
            } else if (!txtCorreo.getText().contains("@") || txtCorreo.getText().contains(" ")
                    || !txtCorreo.getText().matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}")) {
                lblError.setText("El correo electrónico no es un correo válido.");
            } else {
                // Tratamiento excepcion  cliente registrado previvamente
                if (!inmobiliaria.getClientes().contains(client)) { // si el cliente no está registrado se registra
                    // Añadirlo al documento de texto
                    inmobiliaria.addCliente(client); // añado el nuevo usuario
                    file.saveToFile(inmobiliaria); // guardo en el fichero los clientes registrados
                    file.saveToFileMensaje(inmobiliaria);
                    lblError.setText("Registro correcto");
                } else {
                    lblError.setText("Ese correo electrónico ya está registrado.");
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFormularioRegistro;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRepetirPassword;
    private javax.swing.JPanel pFormulario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepetirPassword;
    // End of variables declaration//GEN-END:variables
}

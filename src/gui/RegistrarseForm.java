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
        jPanel2 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(53, 121, 56));
        btnVolver.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a la ventana inicial");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblFormularioRegistro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFormularioRegistro.setText("Formulario de registro:");

        jPanel2.setBackground(new java.awt.Color(53, 121, 56));

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Ingresa los datos requeridos para registrarte en la aplicacion.");

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
        lblRepetirPassword.setText("Repite la contraseña");

        lblApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos:");

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(53, 121, 56));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRepetirPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRepetirPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidos))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInfo)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRepetirPassword)
                    .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(25, 25, 25))
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
                        .addGap(120, 120, 120)
                        .addComponent(lblFormularioRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnVolver)
                .addGap(51, 51, 51)
                .addComponent(lblFormularioRegistro)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (!txtPassword.getText().equals(txtRepetirPassword.getText())) {
            lblError.setText("Las contraseñas no coinciden.");
        } else {
            Cliente client = new Cliente(txtNombre.getText(), txtApellidos.getText(), txtCorreo.getText(), txtPassword.getText());
            if (txtNombre.getText().contains("/") || txtApellidos.getText().contains("/") || txtCorreo.getText().contains("/") || txtPassword.getText().contains("|")) {
                lblError.setText("Hay un caracter no permitido"); // el caracter "|" se usa como separador de datos en el fichero de texto
            } else if (!txtCorreo.getText().contains("@") || txtCorreo.getText().contains(" ")) {
                lblError.setText("El correo electrónico no es un correo válido.");
            } else {
                if (!inmobiliaria.getClientes().contains(client)) { // si el cliente no está registrado se registra
                    inmobiliaria.addCliente(client); // añado el nuevo usuario
                    file.saveToFile(inmobiliaria); // guardo en el fichero los clientes registrados
                    lblError.setText("Registro correcto");
                } else {
                    lblError.setText("Ese correo electrónico ya está registrado.");
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFormularioRegistro;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRepetirPassword;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepetirPassword;
    // End of variables declaration//GEN-END:variables
}

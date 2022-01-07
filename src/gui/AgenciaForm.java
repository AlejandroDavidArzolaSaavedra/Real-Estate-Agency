package gui;

import file.AgenciaFile;
import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.Anuncio;
import model.Cliente;
import model.Inmobiliaria;

public class AgenciaForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public AgenciaFile file;

    public AgenciaForm() {
        initComponents();
        
        txtCorreo.setText("ana@gmail.com");
        txtPassword.setText("123");
        carruselImagenes();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/github.png"));
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(lblGitAlejandro.getWidth(), lblGitAlejandro.getHeight(), Image.SCALE_DEFAULT));
        lblGitAlejandro.setIcon(fondo);
        Icon fondoJuan = new ImageIcon(imagen.getImage().getScaledInstance(lblGitJuan.getWidth(), lblGitJuan.getHeight(), Image.SCALE_DEFAULT));
        lblGitJuan.setIcon(fondoJuan);
        this.repaint();
        //inmobiliaria.getCatalogo().getAnuncios();
     }
    
    
    
    public void metodo(){
        int contadorNumClientes;
        int contador = 0;
        int contadorTopeAnuncionesCliente=10;// Cantidad de anuncios que  tiene el cliente
        while(contador < contadorTopeAnuncionesCliente){
            String nombreCliente="";
            ImageIcon imagenes = new ImageIcon(getClass().getResource("/imagenes/clientes/inmueble_" + nombreCliente + contador + ".png"));
            Icon fondo = new ImageIcon(imagenes.getImage().getScaledInstance(lblFotos.getWidth(), lblFotos.getHeight(), Image.SCALE_DEFAULT));
            lblFotos.setIcon(fondo);
            this.repaint();
        }
            contador = 0;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        panelAnuncios = new javax.swing.JScrollPane();
        btnIzquierda = new javax.swing.JButton();
        lblAgencia = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblAnunciosRecomendados = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBienvenidosAplicacion = new javax.swing.JLabel();
        lblAunNoTienesCuenta = new javax.swing.JLabel();
        panelContraYCorreo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        lblIniciarSesion = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblGitJuan = new javax.swing.JLabel();
        lblFollow = new javax.swing.JLabel();
        lblGitAlejandro = new javax.swing.JLabel();
        btnderecha = new javax.swing.JButton();
        lblFotos = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(963, 575));

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setMaximumSize(new java.awt.Dimension(963, 575));

        btnIzquierda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnIzquierda.setText("<");
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        panelAnuncios.setViewportView(btnIzquierda);

        lblAgencia.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblAgencia.setForeground(new java.awt.Color(53, 121, 56));
        lblAgencia.setText("AGENCIA INMOBILIARIA GC");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        lblAnunciosRecomendados.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblAnunciosRecomendados.setText("Anuncios publicados");

        jPanel1.setBackground(new java.awt.Color(53, 121, 56));

        lblBienvenidosAplicacion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBienvenidosAplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenidosAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenidosAplicacion.setText("Bienvenido/a a la aplicación");

        lblAunNoTienesCuenta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAunNoTienesCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblAunNoTienesCuenta.setText("¿Aún no tienes una cuenta?");

        panelContraYCorreo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Contraseña:");

        btnIniciarSesion.setBackground(new java.awt.Color(53, 121, 56));
        btnIniciarSesion.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContraYCorreoLayout = new javax.swing.GroupLayout(panelContraYCorreo);
        panelContraYCorreo.setLayout(panelContraYCorreoLayout);
        panelContraYCorreoLayout.setHorizontalGroup(
            panelContraYCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContraYCorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContraYCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContraYCorreoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(panelContraYCorreoLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContraYCorreoLayout.createSequentialGroup()
                        .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContraYCorreoLayout.createSequentialGroup()
                        .addGroup(panelContraYCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelContraYCorreoLayout.setVerticalGroup(
            panelContraYCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContraYCorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblIniciarSesion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Inicie sesión para poder continuar");

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(53, 121, 56));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblGitJuan.setText("   ");
        lblGitJuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitJuanMouseClicked(evt);
            }
        });
        lblGitJuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblGitJuanKeyPressed(evt);
            }
        });

        lblFollow.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFollow.setForeground(new java.awt.Color(51, 51, 51));
        lblFollow.setText("Siguenos en");

        lblGitAlejandro.setText("   ");
        lblGitAlejandro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitAlejandroMouseClicked(evt);
            }
        });
        lblGitAlejandro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblGitAlejandroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblGitJuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFollow)
                .addGap(12, 12, 12)
                .addComponent(lblGitAlejandro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGitJuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFollow)
                    .addComponent(lblGitAlejandro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAunNoTienesCuenta)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblError)
                        .addComponent(panelContraYCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBienvenidosAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblBienvenidosAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContraYCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addGap(19, 19, 19)
                .addComponent(lblAunNoTienesCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnderecha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnderecha.setText(">");
        btnderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderechaActionPerformed(evt);
            }
        });

        lblFotos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnSalir.setBackground(new java.awt.Color(0, 51, 102));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblAgencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(panelAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnderecha, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(lblAnunciosRecomendados)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblLogo))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgencia)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnunciosRecomendados)
                .addGap(18, 18, 18)
                .addComponent(lblFotos, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnderecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(283, 283, 283))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(panelAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int contador = 0;
    int contador_tope = 0;
    
    public void longitud(){
        contador_tope = 0;
        inmobiliaria.getClientes().forEach((clientes) -> {
            clientes.getAnuncios().getAnunciosList().forEach((_item) -> {
                contador_tope++;});
        });
    }
    
    
    public void carruselImagenes(){
        ImageIcon imagenes = new ImageIcon(getClass().getResource("/imagenes/clientes/inmueble_cliente_"+ contador + ".png"));
        Icon fondo = new ImageIcon(imagenes.getImage().getScaledInstance(lblFotos.getWidth(), lblFotos.getHeight(), Image.SCALE_DEFAULT));
        lblFotos.setIcon(fondo);   
        this.repaint();
    }
    
    
    private void btnderechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderechaActionPerformed
        longitud();
        if(contador >= contador_tope){
            contador = 0;
        }else{
            contador++;
        }
        carruselImagenes();
    }//GEN-LAST:event_btnderechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        longitud();
        if(contador <= 0){
            contador = contador_tope;
        }else{
            contador--;
        }
        carruselImagenes();
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lblGitAlejandroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblGitAlejandroKeyPressed

    }//GEN-LAST:event_lblGitAlejandroKeyPressed

    private void lblGitAlejandroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitAlejandroMouseClicked
        Desktop desktop = Desktop.getDesktop();
        if(desktop.isSupported(Desktop.Action.BROWSE)){
            try{
                java.net.URI url = new java.net.URI("https://github.com/AlejandroDavidArzolaSaavedra");
                desktop.browse(url);

            } catch (URISyntaxException ex) {
                Logger.getLogger(AgenciaForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AgenciaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblGitAlejandroMouseClicked

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        //abre el formulario de registro
        RegistrarseForm registrarseForm = new RegistrarseForm();
        registrarseForm.setLocationRelativeTo(null);
        registrarseForm.setVisible(true);
        //pasa el fichero y la inmobiliaria al formulario de registro
        registrarseForm.file = file;
        registrarseForm.inmobiliaria = inmobiliaria;
  
        //cierra la ventana actual
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        boolean encontrado = false;
        
        //busco el usuario que tenga ese correo y contraseña
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            
            
            //si el correo y la contraseña es correcto ingresa en la aplicación del cliente
            if (inmobiliaria.getClientes().get(i).getCorreo().equals(txtCorreo.getText()) && inmobiliaria.getClientes().get(i).getPassword().equals(txtPassword.getText())) {
                encontrado = true;
                ClienteForm clienteForm = new ClienteForm();
                clienteForm.setLocationRelativeTo(null);
                clienteForm.setVisible(true);
                this.setVisible(false);
                //pasa el fichero y la inmobiliaria al formulario de registro
                clienteForm.file = file;
                clienteForm.inmobiliaria = inmobiliaria;
                clienteForm.cliente = inmobiliaria.getClientes().get(i);
                clienteForm.establecerDatos();
            }
            if (!encontrado) {
                lblError.setText("No se puede iniciar sesión con esos datos.");
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void lblGitJuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitJuanMouseClicked
        Desktop desktop = Desktop.getDesktop();
        if(desktop.isSupported(Desktop.Action.BROWSE)){
            try{
                java.net.URI url = new java.net.URI("https://github.com/juancad");
                desktop.browse(url);

            } catch (URISyntaxException ex) {
                Logger.getLogger(AgenciaForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AgenciaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblGitJuanMouseClicked

    private void lblGitJuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblGitJuanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGitJuanKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgenciaForm().setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnderecha;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblAnunciosRecomendados;
    private javax.swing.JLabel lblAunNoTienesCuenta;
    private javax.swing.JLabel lblBienvenidosAplicacion;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFollow;
    private javax.swing.JLabel lblFotos;
    private javax.swing.JLabel lblGitAlejandro;
    private javax.swing.JLabel lblGitJuan;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JScrollPane panelAnuncios;
    private javax.swing.JPanel panelContraYCorreo;
    private java.awt.TextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}

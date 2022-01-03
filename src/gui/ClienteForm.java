package gui;

import file.AgenciaFile;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.Cliente;
import model.Inmobiliaria;

public class ClienteForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public Cliente cliente;
    public AgenciaFile file;

    public ClienteForm() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/iconoSALIR.png"));
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(salirIIcon.getWidth(), salirIIcon.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon imagenSesion = new ImageIcon(getClass().getResource("/imagenes/iconoSESION.PNG"));
        Icon fondoSesion = new ImageIcon(imagenSesion.getImage().getScaledInstance(sesionIcon.getWidth(), sesionIcon.getHeight(),Image.SCALE_DEFAULT ));
        salirIIcon.setIcon(fondo);
        sesionIcon.setIcon(fondoSesion);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel17 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        inmuebleParaButtonGroup = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        lblAgencia = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        tabEditarPerfil = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        buscarInmueblePanel = new javax.swing.JPanel();
        municipioRadioButton = new javax.swing.JRadioButton();
        filtrosBusquedaLabel = new javax.swing.JLabel();
        inmueblesEncontradosScrollPane = new javax.swing.JScrollPane();
        inmueblesEncontradosList = new javax.swing.JList<>();
        InmueblesEncontradosLabel = new javax.swing.JLabel();
        infoInmuebleScrollPane = new javax.swing.JScrollPane();
        infoInmuebleTextArea = new javax.swing.JTextArea();
        precioRadioButton = new javax.swing.JRadioButton();
        precioDesdeLabel = new javax.swing.JLabel();
        precioHastaLabel = new javax.swing.JLabel();
        municipiosTextField = new javax.swing.JTextField();
        precioHastaTextField = new javax.swing.JTextField();
        municipioLabel = new javax.swing.JLabel();
        precioDesdeTextField = new javax.swing.JTextField();
        compraRadioButton = new javax.swing.JRadioButton();
        ventaRadioButton = new javax.swing.JRadioButton();
        inmuebleparaLabel = new javax.swing.JLabel();
        fotoInmuebleScrollPane = new javax.swing.JScrollPane();
        fotoInmuebleTextArea = new javax.swing.JTextArea();
        realizarBusquedaToogleButton = new javax.swing.JToggleButton();
        contactarToogleButton = new javax.swing.JToggleButton();
        infoBuscarInmuebleLabel = new javax.swing.JLabel();
        informacionDelInmuebleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        tipoInmuebleLabel = new javax.swing.JLabel();
        calleLabel = new javax.swing.JLabel();
        numeroHabitacionesLabel = new javax.swing.JLabel();
        ubicacionLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tipoInmuebleComboBox = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        anuncioParaVentaRadioButton = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();
        publicarAnuncioToggleButton = new javax.swing.JToggleButton();
        numeroInmuebleLabel = new javax.swing.JLabel();
        pIsoLabel = new javax.swing.JLabel();
        codigoPostalLabel = new javax.swing.JLabel();
        añadirAnuncioSeparador = new javax.swing.JSeparator();
        superficieTextField = new javax.swing.JTextField();
        txtCorreo4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        numeroInmuebleTextField = new javax.swing.JTextField();
        infoAñadirInmuebleLabel = new javax.swing.JLabel();
        LocalizacionLabel = new javax.swing.JLabel();
        municipioAñadirAnuncioTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        editarPerfilPanel = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        apellidosLabel = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        contraseñaNuevaLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        repetirContraseñaLabel = new javax.swing.JLabel();
        txtRepetirPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        infoEditarPerfilLabel = new javax.swing.JLabel();
        btnRealizarCambios = new javax.swing.JButton();
        infoIngreseContraseñaLabel = new javax.swing.JLabel();
        txtPasswordActual = new javax.swing.JPasswordField();
        lblError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        contratarToggleButton = new javax.swing.JToggleButton();
        cvvLabel = new javax.swing.JLabel();
        nombreTarjetaTextField = new javax.swing.JTextField();
        caducidadLabel = new javax.swing.JLabel();
        caducidadTextField = new javax.swing.JTextField();
        tipoTarjetaLabel = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        numeroTarjetaLabel = new javax.swing.JLabel();
        numeroTarjetaTextField = new javax.swing.JTextField();
        nombreTarjetaLabel = new javax.swing.JLabel();
        cvvTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        historialMensajesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoContactoTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        historialMensajesTextArea = new javax.swing.JTextArea();
        cargarHistorialToggleButton = new javax.swing.JToggleButton();
        infoHistorialLabel = new javax.swing.JLabel();
        personasInteresadasLabel = new javax.swing.JLabel();
        datosContactoLabel = new javax.swing.JLabel();
        correoSesionLabel = new javax.swing.JLabel();
        salirSesionLabel = new javax.swing.JLabel();
        salirIIcon = new javax.swing.JLabel();
        sesionIcon = new javax.swing.JLabel();
        salirButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Superficie m2:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Piso :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setMaximumSize(new java.awt.Dimension(963, 575));
        jPanel.setPreferredSize(new java.awt.Dimension(963, 575));

        lblAgencia.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblAgencia.setForeground(new java.awt.Color(53, 121, 56));
        lblAgencia.setText("AGENCIA INMOBILIARIA");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        buscarInmueblePanel.setBackground(new java.awt.Color(53, 121, 56));
        buscarInmueblePanel.setForeground(new java.awt.Color(255, 255, 255));

        municipioRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        municipioRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        municipioRadioButton.setText("Municipio");
        municipioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioRadioButtonActionPerformed(evt);
            }
        });

        filtrosBusquedaLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        filtrosBusquedaLabel.setForeground(new java.awt.Color(255, 255, 255));
        filtrosBusquedaLabel.setText("Filtros de busquedad");

        inmueblesEncontradosScrollPane.setViewportView(inmueblesEncontradosList);

        InmueblesEncontradosLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        InmueblesEncontradosLabel.setForeground(new java.awt.Color(255, 255, 255));
        InmueblesEncontradosLabel.setText("Inmuebles Encontrados");

        infoInmuebleTextArea.setColumns(20);
        infoInmuebleTextArea.setRows(5);
        infoInmuebleScrollPane.setViewportView(infoInmuebleTextArea);

        precioRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        precioRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        precioRadioButton.setText("Precio");

        precioDesdeLabel.setForeground(new java.awt.Color(255, 255, 255));
        precioDesdeLabel.setText("Precio desde :");

        precioHastaLabel.setForeground(new java.awt.Color(255, 255, 255));
        precioHastaLabel.setText("Precio hasta :");

        municipioLabel.setForeground(new java.awt.Color(255, 255, 255));
        municipioLabel.setText("Municipios : ");

        compraRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        inmuebleParaButtonGroup.add(compraRadioButton);
        compraRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        compraRadioButton.setText("Compra");
        compraRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraRadioButtonActionPerformed(evt);
            }
        });

        ventaRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        inmuebleParaButtonGroup.add(ventaRadioButton);
        ventaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ventaRadioButton.setText("Alquiler");
        ventaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaRadioButtonActionPerformed(evt);
            }
        });

        inmuebleparaLabel.setForeground(new java.awt.Color(255, 255, 255));
        inmuebleparaLabel.setText("Inmueble para :");

        fotoInmuebleTextArea.setColumns(20);
        fotoInmuebleTextArea.setRows(5);
        fotoInmuebleScrollPane.setViewportView(fotoInmuebleTextArea);

        realizarBusquedaToogleButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        realizarBusquedaToogleButton.setText("Realizar busqueda");

        contactarToogleButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactarToogleButton.setText("Contactar");

        javax.swing.GroupLayout buscarInmueblePanelLayout = new javax.swing.GroupLayout(buscarInmueblePanel);
        buscarInmueblePanel.setLayout(buscarInmueblePanelLayout);
        buscarInmueblePanelLayout.setHorizontalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(precioHastaLabel)
                                    .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                            .addComponent(municipioRadioButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(municipioLabel))
                                        .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                            .addComponent(precioRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(precioDesdeLabel))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inmuebleparaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(compraRadioButton)
                                .addGap(18, 18, 18)))
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ventaRadioButton)
                            .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(municipiosTextField)
                                .addComponent(precioDesdeTextField)
                                .addComponent(precioHastaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(filtrosBusquedaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(realizarBusquedaToogleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contactarToogleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inmueblesEncontradosScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InmueblesEncontradosLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoInmuebleScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoInmuebleScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        buscarInmueblePanelLayout.setVerticalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(InmueblesEncontradosLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addComponent(infoInmuebleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoInmuebleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inmueblesEncontradosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(filtrosBusquedaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(municipioRadioButton)
                            .addComponent(municipioLabel)
                            .addComponent(municipiosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioRadioButton)
                            .addComponent(precioDesdeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioDesdeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioHastaLabel)
                            .addComponent(precioHastaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compraRadioButton)
                            .addComponent(ventaRadioButton)
                            .addComponent(inmuebleparaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(realizarBusquedaToogleButton)
                            .addComponent(contactarToogleButton))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        infoBuscarInmuebleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoBuscarInmuebleLabel.setText("Ingrese todos los filtros para realizar busquedas de los inmuebles que ofertamos!!");

        informacionDelInmuebleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        informacionDelInmuebleLabel.setForeground(new java.awt.Color(255, 255, 255));
        informacionDelInmuebleLabel.setText("Informacion del inmueble");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(infoBuscarInmuebleLabel)
                .addContainerGap(355, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informacionDelInmuebleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(infoBuscarInmuebleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(informacionDelInmuebleLabel)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        tabEditarPerfil.addTab("Buscar Inmueble", jPanel2);

        jPanel10.setBackground(new java.awt.Color(53, 121, 56));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        tipoInmuebleLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tipoInmuebleLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoInmuebleLabel.setText("Tipo de Inmueble : ");

        calleLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        calleLabel.setForeground(new java.awt.Color(255, 255, 255));
        calleLabel.setText("Calle :");

        numeroHabitacionesLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroHabitacionesLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroHabitacionesLabel.setText("numero Habitaciones : ");

        ubicacionLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ubicacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        ubicacionLabel.setText("Ubicacion :");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Superficie m2 :");

        tipoInmuebleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Piso", "Casa", "Chalet", "Apartamento" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        anuncioParaVentaRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        buttonGroup2.add(anuncioParaVentaRadioButton);
        anuncioParaVentaRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        anuncioParaVentaRadioButton.setText("Anuncio para Venta");
        anuncioParaVentaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuncioParaVentaRadioButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio :");

        publicarAnuncioToggleButton.setText("PUBLICAR ANUNCIO");
        publicarAnuncioToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicarAnuncioToggleButtonActionPerformed(evt);
            }
        });

        numeroInmuebleLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numeroInmuebleLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroInmuebleLabel.setText("Numero : ");

        pIsoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pIsoLabel.setForeground(new java.awt.Color(255, 255, 255));
        pIsoLabel.setText("Piso :");

        codigoPostalLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codigoPostalLabel.setForeground(new java.awt.Color(255, 255, 255));
        codigoPostalLabel.setText("Codigo Postal:");

        añadirAnuncioSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        superficieTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superficieTextFieldActionPerformed(evt);
            }
        });

        txtCorreo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipoInmuebleLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(numeroHabitacionesLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ubicacionLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoInmuebleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superficieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(añadirAnuncioSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anuncioParaVentaRadioButton)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(publicarAnuncioToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pIsoLabel)
                            .addComponent(codigoPostalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calleLabel)
                            .addComponent(numeroInmuebleLabel))
                        .addContainerGap(192, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoInmuebleLabel)
                            .addComponent(tipoInmuebleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(superficieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calleLabel)
                                    .addComponent(pIsoLabel)
                                    .addComponent(txtCorreo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroHabitacionesLabel)
                            .addComponent(codigoPostalLabel)
                            .addComponent(numeroInmuebleLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anuncioParaVentaRadioButton)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(ubicacionLabel)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(publicarAnuncioToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(añadirAnuncioSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jRadioButton1.setBackground(new java.awt.Color(53, 121, 56));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Anuncio para Alquiler");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Municipio :");

        infoAñadirInmuebleLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoAñadirInmuebleLabel.setText("Ingrese todos los datos para poder publicar un anuncio: ");

        LocalizacionLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LocalizacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocalizacionLabel.setText("Localizacion");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Foto del Inmueble : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LocalizacionLabel)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroInmuebleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1))
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(infoAñadirInmuebleLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(municipioAñadirAnuncioTextField))))
                .addContainerGap(524, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(infoAñadirInmuebleLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LocalizacionLabel)
                        .addGap(20, 20, 20)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroInmuebleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(municipioAñadirAnuncioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        tabEditarPerfil.addTab("Añadir Anuncio", jPanel1);

        editarPerfilPanel.setBackground(new java.awt.Color(53, 121, 56));
        editarPerfilPanel.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre:");

        apellidosLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        apellidosLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidosLabel.setText("Apellidos:");

        contraseñaNuevaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contraseñaNuevaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaNuevaLabel.setText("Contraseña nueva:");

        repetirContraseñaLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        repetirContraseñaLabel.setForeground(new java.awt.Color(255, 255, 255));
        repetirContraseñaLabel.setText("Repetir contraseña:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo electrónico:");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editarPerfilPanelLayout = new javax.swing.GroupLayout(editarPerfilPanel);
        editarPerfilPanel.setLayout(editarPerfilPanelLayout);
        editarPerfilPanelLayout.setHorizontalGroup(
            editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarPerfilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editarPerfilPanelLayout.createSequentialGroup()
                        .addComponent(repetirContraseñaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepetirPassword))
                    .addGroup(editarPerfilPanelLayout.createSequentialGroup()
                        .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaNuevaLabel)
                            .addComponent(jLabel8)
                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))))
                .addGap(12, 12, 12)
                .addComponent(apellidosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        editarPerfilPanelLayout.setVerticalGroup(
            editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editarPerfilPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidosLabel))
                .addGap(18, 18, 18)
                .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaNuevaLabel))
                .addGap(18, 18, 18)
                .addGroup(editarPerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repetirContraseñaLabel))
                .addGap(22, 22, 22))
        );

        infoEditarPerfilLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoEditarPerfilLabel.setText("Ingrese los datos que deseas modificar a continuación:");

        btnRealizarCambios.setBackground(new java.awt.Color(153, 153, 153));
        btnRealizarCambios.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnRealizarCambios.setText("Realizar cambios");
        btnRealizarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCambiosActionPerformed(evt);
            }
        });

        infoIngreseContraseñaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        infoIngreseContraseñaLabel.setText("Ingrese la contraseña actual para poder realizar los cambios:");

        lblError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarPerfilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infoEditarPerfilLabel)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(infoIngreseContraseñaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPasswordActual, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(infoEditarPerfilLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarPerfilPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoIngreseContraseñaLabel)
                    .addComponent(txtPasswordActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblError)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnRealizarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Editar perfil", jPanel3);

        jPanel9.setBackground(new java.awt.Color(53, 121, 56));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        contratarToggleButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contratarToggleButton.setText("CONTRATAR");

        cvvLabel.setForeground(new java.awt.Color(255, 255, 255));
        cvvLabel.setText("CVV:");

        caducidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        caducidadLabel.setText("Caducidad:");

        tipoTarjetaLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoTarjetaLabel.setText("Tipo de tarjeta :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        numeroTarjetaLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroTarjetaLabel.setText("Numero de la tarjeta");

        nombreTarjetaLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreTarjetaLabel.setText("Nombre asociado a la tarjeta");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cvvLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caducidadLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTarjetaLabel)
                                .addGap(147, 147, 147))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(238, 238, 238)
                                        .addComponent(nombreTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(caducidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numeroTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(tipoTarjetaLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(contratarToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nombreTarjetaLabel)
                .addGap(364, 364, 364))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(nombreTarjetaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoTarjetaLabel)
                            .addComponent(nombreTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cvvLabel)
                            .addComponent(numeroTarjetaLabel)
                            .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(contratarToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caducidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caducidadLabel)
                    .addComponent(numeroTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        tabEditarPerfil.addTab("Contratar Recomendacion", jPanel6);

        historialMensajesPanel.setBackground(new java.awt.Color(53, 121, 56));
        historialMensajesPanel.setForeground(new java.awt.Color(255, 255, 255));

        infoContactoTextArea.setColumns(20);
        infoContactoTextArea.setRows(5);
        jScrollPane2.setViewportView(infoContactoTextArea);

        historialMensajesTextArea.setColumns(20);
        historialMensajesTextArea.setRows(5);
        jScrollPane3.setViewportView(historialMensajesTextArea);

        cargarHistorialToggleButton.setText("Cargar Historial");

        javax.swing.GroupLayout historialMensajesPanelLayout = new javax.swing.GroupLayout(historialMensajesPanel);
        historialMensajesPanel.setLayout(historialMensajesPanelLayout);
        historialMensajesPanelLayout.setHorizontalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cargarHistorialToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        historialMensajesPanelLayout.setVerticalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargarHistorialToggleButton)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        infoHistorialLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoHistorialLabel.setText("Publique algun anuncio para poder recibir mensajes de otros clientes interesados :");

        personasInteresadasLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        personasInteresadasLabel.setForeground(new java.awt.Color(255, 255, 255));
        personasInteresadasLabel.setText("Personas Interesadas");

        datosContactoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        datosContactoLabel.setForeground(new java.awt.Color(255, 255, 255));
        datosContactoLabel.setText("Datos del contacto");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoHistorialLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(personasInteresadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(datosContactoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(historialMensajesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(infoHistorialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personasInteresadasLabel)
                    .addComponent(datosContactoLabel))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(historialMensajesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        tabEditarPerfil.addTab("Historial de Mensajes", jPanel7);

        correoSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        correoSesionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        correoSesionLabel.setForeground(new java.awt.Color(102, 204, 255));
        correoSesionLabel.setText("user@gmail.com");

        salirSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        salirSesionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salirSesionLabel.setForeground(new java.awt.Color(102, 102, 102));
        salirSesionLabel.setText("Salir Sesion");

        salirIIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoSALIR.png"))); // NOI18N

        sesionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoSESION.PNG"))); // NOI18N

        salirButton.setBackground(new java.awt.Color(0, 51, 102));
        salirButton.setForeground(new java.awt.Color(255, 255, 255));
        salirButton.setText("SALIR");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(salirButton)
                        .addGap(26, 26, 26)
                        .addComponent(sesionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salirIIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(lblAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLogo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabEditarPerfil)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salirIIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAgencia)
                                .addComponent(salirSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correoSesionLabel))
                            .addComponent(sesionIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salirButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(tabEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCambiosActionPerformed
        boolean realizado = true;
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            if (inmobiliaria.getClientes().get(i).getCorreo().equals(cliente.getCorreo())) {
                if (txtNombre.getText().contains("/") || txtApellidos.getText().contains("/") || txtCorreo.getText().contains("/") || txtPassword.getText().contains("/")) {
                    lblError.setText("Hay un caracter no permitido");
                } else {
                    if (!inmobiliaria.getClientes().get(i).getPassword().equals(txtPasswordActual.getText())) {
                        lblError.setText("La contraseña no es correcta");
                    } else {
                        //modifico los datos del cliente
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
                        if (txtPassword.getText().equals(txtRepetirPassword.getText())) {
                            if (txtPassword.getText() != "" && txtPassword.getText().length() != 0) {
                                inmobiliaria.getClientes().get(i).setPassword(txtPassword.getText());
                            } else {
                                lblError.setText("La contraseña nueva no puede estar vacía.");
                                realizado = false;
                            }
                        } else {
                            lblError.setText("Las contraseñas no coinciden.");
                            realizado = false;
                        }
                        if (realizado) {
                            lblError.setText("Se han realizado los cambios correctamente.");
                        }
                    }
                }
            }
        }
        file.saveToFile(inmobiliaria);
    }//GEN-LAST:event_btnRealizarCambiosActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void anuncioParaVentaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuncioParaVentaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anuncioParaVentaRadioButtonActionPerformed

    private void compraRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compraRadioButtonActionPerformed

    private void ventaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaRadioButtonActionPerformed

    private void publicarAnuncioToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicarAnuncioToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicarAnuncioToggleButtonActionPerformed

    private void municipioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioRadioButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    private void superficieTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superficieTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superficieTextFieldActionPerformed

    private void txtCorreo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteForm().setVisible(true);
            }
        });
    }

    public void establecerDatos() {
        txtNombre.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellido());
        txtCorreo.setText(cliente.getCorreo());
        txtPassword.setText(cliente.getPassword());
        txtRepetirPassword.setText(cliente.getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InmueblesEncontradosLabel;
    private javax.swing.JLabel LocalizacionLabel;
    private javax.swing.JRadioButton anuncioParaVentaRadioButton;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JSeparator añadirAnuncioSeparador;
    private javax.swing.JButton btnRealizarCambios;
    private javax.swing.JPanel buscarInmueblePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel caducidadLabel;
    private javax.swing.JTextField caducidadTextField;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JToggleButton cargarHistorialToggleButton;
    private javax.swing.JLabel codigoPostalLabel;
    private javax.swing.JRadioButton compraRadioButton;
    private javax.swing.JToggleButton contactarToogleButton;
    private javax.swing.JLabel contraseñaNuevaLabel;
    private javax.swing.JToggleButton contratarToggleButton;
    private javax.swing.JLabel correoSesionLabel;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel datosContactoLabel;
    private javax.swing.JPanel editarPerfilPanel;
    private javax.swing.JLabel filtrosBusquedaLabel;
    private javax.swing.JScrollPane fotoInmuebleScrollPane;
    private javax.swing.JTextArea fotoInmuebleTextArea;
    private javax.swing.JPanel historialMensajesPanel;
    private javax.swing.JTextArea historialMensajesTextArea;
    private javax.swing.JLabel infoAñadirInmuebleLabel;
    private javax.swing.JLabel infoBuscarInmuebleLabel;
    private javax.swing.JTextArea infoContactoTextArea;
    private javax.swing.JLabel infoEditarPerfilLabel;
    private javax.swing.JLabel infoHistorialLabel;
    private javax.swing.JLabel infoIngreseContraseñaLabel;
    private javax.swing.JScrollPane infoInmuebleScrollPane;
    private javax.swing.JTextArea infoInmuebleTextArea;
    private javax.swing.JLabel informacionDelInmuebleLabel;
    private javax.swing.ButtonGroup inmuebleParaButtonGroup;
    private javax.swing.JLabel inmuebleparaLabel;
    private javax.swing.JList<String> inmueblesEncontradosList;
    private javax.swing.JScrollPane inmueblesEncontradosScrollPane;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField municipioAñadirAnuncioTextField;
    private javax.swing.JLabel municipioLabel;
    private javax.swing.JRadioButton municipioRadioButton;
    private javax.swing.JTextField municipiosTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreTarjetaLabel;
    private javax.swing.JTextField nombreTarjetaTextField;
    private javax.swing.JLabel numeroHabitacionesLabel;
    private javax.swing.JLabel numeroInmuebleLabel;
    private javax.swing.JTextField numeroInmuebleTextField;
    private javax.swing.JLabel numeroTarjetaLabel;
    private javax.swing.JTextField numeroTarjetaTextField;
    private javax.swing.JLabel pIsoLabel;
    private javax.swing.JLabel personasInteresadasLabel;
    private javax.swing.JLabel precioDesdeLabel;
    private javax.swing.JTextField precioDesdeTextField;
    private javax.swing.JLabel precioHastaLabel;
    private javax.swing.JTextField precioHastaTextField;
    private javax.swing.JRadioButton precioRadioButton;
    private javax.swing.JTextField precioTextField;
    private javax.swing.JToggleButton publicarAnuncioToggleButton;
    private javax.swing.JToggleButton realizarBusquedaToogleButton;
    private javax.swing.JLabel repetirContraseñaLabel;
    private javax.swing.JButton salirButton;
    private javax.swing.JLabel salirIIcon;
    private javax.swing.JLabel salirSesionLabel;
    private javax.swing.JLabel sesionIcon;
    private javax.swing.JTextField superficieTextField;
    private javax.swing.JTabbedPane tabEditarPerfil;
    private javax.swing.JComboBox<String> tipoInmuebleComboBox;
    private javax.swing.JLabel tipoInmuebleLabel;
    private javax.swing.JLabel tipoTarjetaLabel;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreo4;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordActual;
    private javax.swing.JPasswordField txtRepetirPassword;
    private javax.swing.JLabel ubicacionLabel;
    private javax.swing.JRadioButton ventaRadioButton;
    // End of variables declaration//GEN-END:variables
}

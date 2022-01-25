package gui;

import file.AgenciaFile;
import java.awt.Color;
import java.awt.Image;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Anuncio;
import model.CatalogoAnuncios;
import model.Cliente;
import model.Inmobiliaria;

public class AdminForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public Cliente cliente;
    public AgenciaFile file;

    public AdminForm() {
        initComponents();

        //file.loadFromFile(inmobiliaria);
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/iconoSALIR.png"));
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(salirIIcon.getWidth(), salirIIcon.getHeight(), Image.SCALE_DEFAULT));
        salirIIcon.setIcon(fondo);
        this.repaint();
        
    }

    private String fechaUsuario() {
        Calendar fecha = new GregorianCalendar();
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        inmuebleParaButtonGroup = new javax.swing.ButtonGroup();
        filtrosButtonGroup = new javax.swing.ButtonGroup();
        precioButtonGroup = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jSlider1 = new javax.swing.JSlider();
        jButton16 = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        lblAgencia = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        tabEditarPerfil = new javax.swing.JTabbedPane();
        panelBuscarInmueble = new javax.swing.JPanel();
        buscarInmueblePanel = new javax.swing.JPanel();
        btnMirarUsuarios = new javax.swing.JButton();
        lblAnuncioUsuario = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtInmuebleInformacion = new javax.swing.JTextArea();
        lblInformacionInmueble = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblBuscarInmueble = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstAnunciosUsuarios = new javax.swing.JList<>();
        lblListadoUsuarios = new javax.swing.JLabel();
        panelHistorial = new javax.swing.JPanel();
        historialMensajesPanel = new javax.swing.JPanel();
        btnAnunciosPendientes = new javax.swing.JButton();
        btnAceptarAnuncio = new javax.swing.JButton();
        btnDenegarAnuncio = new javax.swing.JButton();
        btnAnunciosPublicados = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstAnunciosPublicados = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstAnunciosPendientes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lblListadoAnunciosPendientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelAñadirAnuncio = new javax.swing.JPanel();
        btnUsuariosRegistrados = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnInformacionUsuario = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnBuscarUsuarios = new javax.swing.JButton();
        lblBuscarNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfoUsuario = new javax.swing.JTextArea();
        btnModificarUsuario = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        lstUsuariosRegistrados = new javax.swing.JList<>();
        infoBuscarFotoErorr = new javax.swing.JLabel();
        lblErrorAñadirAnuncio = new javax.swing.JLabel();
        lblOperarUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelEditarPerfil = new javax.swing.JPanel();
        btnMirarAnuncio = new javax.swing.JButton();
        lblBuscarMunicipio = new javax.swing.JLabel();
        btnEliminarAnuncio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInfoAnuncio = new javax.swing.JTextArea();
        btnInformacionAnuncio = new javax.swing.JButton();
        btnBuscarMunicipio = new javax.swing.JButton();
        lstBuscarMunicipio = new javax.swing.JComboBox<>();
        btnModificarAnuncio = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstAnuncios = new javax.swing.JList<>();
        lblOperarAnuncio = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        correoSesionLabel = new javax.swing.JLabel();
        salirSesionLabel = new javax.swing.JLabel();
        salirIIcon = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Superficie m2:");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Piso :");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton16.setText("Modificar Usuario");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel.setMaximumSize(new java.awt.Dimension(963, 575));
        jPanel.setPreferredSize(new java.awt.Dimension(963, 575));

        lblAgencia.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblAgencia.setForeground(new java.awt.Color(53, 121, 56));
        lblAgencia.setText("AGENCIA INMOBILIARIA GC");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        buscarInmueblePanel.setBackground(new java.awt.Color(53, 121, 56));
        buscarInmueblePanel.setForeground(new java.awt.Color(255, 255, 255));

        btnMirarUsuarios.setText("Mirar Usuarios");
        btnMirarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMirarUsuariosActionPerformed(evt);
            }
        });

        lblAnuncioUsuario.setText("Anuncios del Usuario");

        txtInmuebleInformacion.setColumns(20);
        txtInmuebleInformacion.setRows(5);
        jScrollPane10.setViewportView(txtInmuebleInformacion);

        lblInformacionInmueble.setText("Informacion Inmueble");

        btnBuscar.setText("Buscar");

        lblBuscarInmueble.setText("Buscar por nombre: ");

        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(lstUsuarios);

        jScrollPane6.setViewportView(lstAnunciosUsuarios);

        javax.swing.GroupLayout buscarInmueblePanelLayout = new javax.swing.GroupLayout(buscarInmueblePanel);
        buscarInmueblePanel.setLayout(buscarInmueblePanelLayout);
        buscarInmueblePanelLayout.setHorizontalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(594, 594, 594)
                        .addComponent(lblAnuncioUsuario)
                        .addGap(125, 125, 125)
                        .addComponent(lblInformacionInmueble))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnMirarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblBuscarInmueble)
                        .addGap(27, 27, 27)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        buscarInmueblePanelLayout.setVerticalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(lblBuscarInmueble)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMirarUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnuncioUsuario)
                    .addComponent(lblInformacionInmueble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );

        lblListadoUsuarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblListadoUsuarios.setText("Listado de usuarios registrados");

        javax.swing.GroupLayout panelBuscarInmuebleLayout = new javax.swing.GroupLayout(panelBuscarInmueble);
        panelBuscarInmueble.setLayout(panelBuscarInmuebleLayout);
        panelBuscarInmuebleLayout.setHorizontalGroup(
            panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                .addGroup(panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(lblListadoUsuarios)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelBuscarInmuebleLayout.setVerticalGroup(
            panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblListadoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Usuarios Registrados", panelBuscarInmueble);

        historialMensajesPanel.setBackground(new java.awt.Color(53, 121, 56));
        historialMensajesPanel.setForeground(new java.awt.Color(255, 255, 255));

        btnAnunciosPendientes.setText("Mirar Publicaciones pendientes");
        btnAnunciosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnunciosPendientesActionPerformed(evt);
            }
        });

        btnAceptarAnuncio.setText("Aceptar Publicacion");

        btnDenegarAnuncio.setText("Denegar Publicacion");
        btnDenegarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenegarAnuncioActionPerformed(evt);
            }
        });

        btnAnunciosPublicados.setText("Mirar Anuncios Publicados");
        btnAnunciosPublicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnunciosPublicadosActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(lstAnunciosPublicados);

        jScrollPane8.setViewportView(lstAnunciosPendientes);

        javax.swing.GroupLayout historialMensajesPanelLayout = new javax.swing.GroupLayout(historialMensajesPanel);
        historialMensajesPanel.setLayout(historialMensajesPanelLayout);
        historialMensajesPanelLayout.setHorizontalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                        .addComponent(btnAnunciosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDenegarAnuncio)
                    .addComponent(btnAceptarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAnunciosPublicados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        historialMensajesPanelLayout.setVerticalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                        .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnunciosPublicados)
                            .addComponent(btnAceptarAnuncio))
                        .addGap(18, 18, 18)
                        .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDenegarAnuncio)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                        .addComponent(btnAnunciosPendientes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        lblListadoAnunciosPendientes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblListadoAnunciosPendientes.setForeground(new java.awt.Color(255, 255, 255));
        lblListadoAnunciosPendientes.setText("Listado de Anuncios Pendientes");

        javax.swing.GroupLayout panelHistorialLayout = new javax.swing.GroupLayout(panelHistorial);
        panelHistorial.setLayout(panelHistorialLayout);
        panelHistorialLayout.setHorizontalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(historialMensajesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(lblListadoAnunciosPendientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHistorialLayout.setVerticalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblListadoAnunciosPendientes)
                        .addGap(18, 18, 18)
                        .addComponent(historialMensajesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Publicaciones Pendientes", panelHistorial);

        panelAñadirAnuncio.setBackground(new java.awt.Color(53, 121, 56));
        panelAñadirAnuncio.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuariosRegistrados.setText("Mirar Usuarios");
        btnUsuariosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosRegistradosActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar Usuario");

        btnInformacionUsuario.setText("Informacion del usuario");

        btnBuscarUsuarios.setText("Buscar");

        lblBuscarNombre.setText("Buscar por nombre: ");

        txtInfoUsuario.setColumns(20);
        txtInfoUsuario.setRows(5);
        jScrollPane2.setViewportView(txtInfoUsuario);

        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        jScrollPane12.setViewportView(lstUsuariosRegistrados);

        javax.swing.GroupLayout panelAñadirAnuncioLayout = new javax.swing.GroupLayout(panelAñadirAnuncio);
        panelAñadirAnuncio.setLayout(panelAñadirAnuncioLayout);
        panelAñadirAnuncioLayout.setHorizontalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInformacionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblBuscarNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnUsuariosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelAñadirAnuncioLayout.setVerticalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirAnuncioLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btnUsuariosRegistrados)
                .addGap(18, 18, 18)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarUsuarios)
                            .addComponent(lblBuscarNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnEliminarUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btnInformacionUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarUsuario))))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(63, 63, 63))
        );

        infoBuscarFotoErorr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblErrorAñadirAnuncio.setForeground(new java.awt.Color(255, 51, 0));

        lblOperarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblOperarUsuario.setText("Elimine o modifique los usuarios registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(lblOperarUsuario)
                .addGap(356, 356, 356)
                .addComponent(lblErrorAñadirAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(infoBuscarFotoErorr, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(panelAñadirAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblErrorAñadirAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAñadirAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(infoBuscarFotoErorr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Operar con Usuarios", jPanel1);

        panelEditarPerfil.setBackground(new java.awt.Color(53, 121, 56));
        panelEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));

        btnMirarAnuncio.setText("Mirar Anucios");
        btnMirarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMirarAnuncioActionPerformed(evt);
            }
        });

        lblBuscarMunicipio.setText("Buscar por municipio: ");

        btnEliminarAnuncio.setText("Eliminar Anuncio");
        btnEliminarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnuncioActionPerformed(evt);
            }
        });

        txtInfoAnuncio.setColumns(20);
        txtInfoAnuncio.setRows(5);
        jScrollPane3.setViewportView(txtInfoAnuncio);

        btnInformacionAnuncio.setText("Informacion del Anuncio");
        btnInformacionAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionAnuncioActionPerformed(evt);
            }
        });

        btnBuscarMunicipio.setText("Buscar");

        lstBuscarMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Las Palmas de Gran Canaria", "Telde", "Agaete", "Aguimes", "Artenara", "Arucas", "Firgas", "Galdar", "Ingenio", "La Aldea de San Nicolas", "Mogán", "Moya", "San Bartolomé de Tirajana", "Santa Brigida", "Santa Lucía de Tirajana", "Santa Maria de Guía", "Tejeda", "Teror", "Valleseco", "Valsequillo de Gran Canaria", "Vega San Mateo" }));

        btnModificarAnuncio.setText("Modificar Anuncio");
        btnModificarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAnuncioActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(lstAnuncios);

        javax.swing.GroupLayout panelEditarPerfilLayout = new javax.swing.GroupLayout(panelEditarPerfil);
        panelEditarPerfil.setLayout(panelEditarPerfilLayout);
        panelEditarPerfilLayout.setHorizontalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnInformacionAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblBuscarMunicipio))
                        .addGap(18, 18, 18)
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addComponent(lstBuscarMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)))
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnMirarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelEditarPerfilLayout.setVerticalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarMunicipio)
                            .addComponent(lblBuscarMunicipio)
                            .addComponent(lstBuscarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarAnuncio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInformacionAnuncio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificarAnuncio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                        .addComponent(btnMirarAnuncio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        lblOperarAnuncio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOperarAnuncio.setText("Elimine o modifique los anuncios publicados por los clientes");

        lblError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(1108, 1108, 1108)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(lblOperarAnuncio)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblOperarAnuncio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Operar con Anuncios", jPanel3);

        correoSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        correoSesionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        correoSesionLabel.setForeground(new java.awt.Color(102, 204, 255));
        correoSesionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        correoSesionLabel.setText("user@gmail.com");

        salirSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        salirSesionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salirSesionLabel.setForeground(new java.awt.Color(53, 121, 56));
        salirSesionLabel.setText("Salir Sesion");
        salirSesionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirSesionLabelMouseClicked(evt);
            }
        });

        salirIIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoSALIR.png"))); // NOI18N
        salirIIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirIIconMouseClicked(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 51, 102));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(51, 204, 255));
        lblFecha.setText("Hora de conexion:");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(salirIIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correoSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(salirSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAgencia)))
                .addGap(18, 18, 18)
                .addComponent(lblLogo)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salirIIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAgencia)
                                .addComponent(salirSesionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoSesionLabel)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    public Cliente busquedadCliente(String cadena) {
        Cliente clienteBuscado = null;
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios().getAnunciosList()) {
                if (anuncios.toString().equals(cadena)) {
                    clienteBuscado = clientes;
                }
            }
        }
        return clienteBuscado;
    }

    private void salirSesionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirSesionLabelMouseClicked
        AgenciaForm agenciaForm = new AgenciaForm();
        agenciaForm.inmobiliaria = inmobiliaria;
        agenciaForm.file = file;
        agenciaForm.setLocationRelativeTo(null);
        agenciaForm.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_salirSesionLabelMouseClicked

    private void salirIIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirIIconMouseClicked
        AgenciaForm agenciaForm = new AgenciaForm();
        agenciaForm.inmobiliaria = inmobiliaria;
        agenciaForm.file = file;
        agenciaForm.setLocationRelativeTo(null);
        agenciaForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirIIconMouseClicked

    public String obtenerCantidadImagenesCliente() {
        int i = 0;// La cantidad de anuncios que tengo como cliente
        for (int j = 0; j < inmobiliaria.getClientes().size(); j++) {
            if (inmobiliaria.getClientes().get(j).getCorreo().equals(cliente.getCorreo())) {
                i = inmobiliaria.getClientes().get(j).getAnuncios().getAnunciosList().size();
            }

        }
        return String.valueOf(i);
    }

    int contador_tope = 0;

    public void longitud() {
        contador_tope = 0;
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios().getAnunciosList()) {
                contador_tope++;
            }
        }
        //contador_tope++;
    }

    public boolean comprobar(Anuncio anuncioNuevo) {
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios().getAnunciosList()) {
                if (anuncios.getDireccion().getCalle().equals(anuncioNuevo.getDireccion().getCalle())
                        & anuncios.getDireccion().getNumero() == anuncioNuevo.getDireccion().getNumero()
                        & anuncios.getDireccion().getZipCode() == anuncioNuevo.getDireccion().getZipCode()
                        & anuncios.getDireccion().getMunicipio().equals(anuncioNuevo.getDireccion().getMunicipio())) {
                    return false;
                }
            }
        }
        return true;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMirarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMirarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMirarUsuariosActionPerformed

    private void btnUsuariosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosRegistradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosRegistradosActionPerformed

    private void btnAnunciosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnunciosPendientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnunciosPendientesActionPerformed

    private void btnDenegarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenegarAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDenegarAnuncioActionPerformed

    private void btnAnunciosPublicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnunciosPublicadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnunciosPublicadosActionPerformed

    private void btnMirarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMirarAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMirarAnuncioActionPerformed

    private void btnEliminarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAnuncioActionPerformed

    private void btnInformacionAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformacionAnuncioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnModificarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAnuncioActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    public void establecerDatos() {
    }

    public void habilitarBotonRealizarBusqueda() {
      
    }

    public void habilitarBotonContratarRecomendacion() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarAnuncio;
    private javax.swing.JButton btnAnunciosPendientes;
    private javax.swing.JButton btnAnunciosPublicados;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarMunicipio;
    private javax.swing.JButton btnBuscarUsuarios;
    private javax.swing.JButton btnDenegarAnuncio;
    private javax.swing.JButton btnEliminarAnuncio;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnInformacionAnuncio;
    private javax.swing.JButton btnInformacionUsuario;
    private javax.swing.JButton btnMirarAnuncio;
    private javax.swing.JButton btnMirarUsuarios;
    private javax.swing.JButton btnModificarAnuncio;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuariosRegistrados;
    private javax.swing.JPanel buscarInmueblePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel correoSesionLabel;
    private javax.swing.ButtonGroup filtrosButtonGroup;
    private javax.swing.JPanel historialMensajesPanel;
    private javax.swing.JLabel infoBuscarFotoErorr;
    private javax.swing.ButtonGroup inmuebleParaButtonGroup;
    private javax.swing.JButton jButton16;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblAnuncioUsuario;
    private javax.swing.JLabel lblBuscarInmueble;
    private javax.swing.JLabel lblBuscarMunicipio;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorAñadirAnuncio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblInformacionInmueble;
    private javax.swing.JLabel lblListadoAnunciosPendientes;
    private javax.swing.JLabel lblListadoUsuarios;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblOperarAnuncio;
    private javax.swing.JLabel lblOperarUsuario;
    private javax.swing.JList<String> lstAnuncios;
    private javax.swing.JList<String> lstAnunciosPendientes;
    private javax.swing.JList<String> lstAnunciosPublicados;
    private javax.swing.JList<String> lstAnunciosUsuarios;
    private javax.swing.JComboBox<String> lstBuscarMunicipio;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JList<String> lstUsuariosRegistrados;
    private javax.swing.JPanel panelAñadirAnuncio;
    private javax.swing.JPanel panelBuscarInmueble;
    private javax.swing.JPanel panelEditarPerfil;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.ButtonGroup precioButtonGroup;
    private javax.swing.JLabel salirIIcon;
    private javax.swing.JLabel salirSesionLabel;
    private javax.swing.JTabbedPane tabEditarPerfil;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextArea txtInfoAnuncio;
    private javax.swing.JTextArea txtInfoUsuario;
    private javax.swing.JTextArea txtInmuebleInformacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

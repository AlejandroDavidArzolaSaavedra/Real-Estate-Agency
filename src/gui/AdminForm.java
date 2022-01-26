package gui;

import file.AgenciaFile;
import java.awt.Color;
import java.awt.Image;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Anuncio;
import model.CatalogoAnuncios;
import model.Administrador;
import model.Cliente;
import model.Inmobiliaria;
import model.TipoCatalogo;

public class AdminForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public Administrador administrador;
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

    public void actualizarAnunciosPendientes() {
        lstPublicacionesPendientes.removeAll();
        for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
            if (catalogo.getTipoCatalogo().equals(TipoCatalogo.PENDIENTES)) {
                for (Anuncio a : catalogo.getAnuncios()) {
                    lstPublicacionesPendientes.add(a.toString());
                }
            }
        }
    }

    public void actualizarAnunciosPublicados() {
        lstAnunciosPublicados.removeAll();
        for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
            if (catalogo.getTipoCatalogo().equals(TipoCatalogo.PUBLICADOS)) {
                for (Anuncio a : catalogo.getAnuncios()) {
                    lstAnunciosPublicados.add(a.toString());
                }
            }
        }
    }

    public void actualizarCoordinadorAnuncioCliente(Anuncio a) {
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            for (int j = 0; j < inmobiliaria.getClientes().get(i).getAnuncios().size(); j++) {
                if (inmobiliaria.getClientes().get(i).getAnuncios().get(j).equals(a)) {
                    inmobiliaria.getClientes().get(i).getAnuncios().get(j).setCoordinador(administrador);
                }
            }
        }
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
        lstUsuarios = new java.awt.List();
        lstAnunciosUsuario = new java.awt.List();
        lblListadoUsuarios = new javax.swing.JLabel();
        panelHistorial = new javax.swing.JPanel();
        historialMensajesPanel = new javax.swing.JPanel();
        btnAnunciosPendientes = new javax.swing.JButton();
        btnAceptarAnuncio = new javax.swing.JButton();
        btnDenegarAnuncio = new javax.swing.JButton();
        btnAnunciosPublicados = new javax.swing.JButton();
        lstPublicacionesPendientes = new java.awt.List();
        lstAnunciosPublicados = new java.awt.List();
        jScrollPane4 = new javax.swing.JScrollPane();
        lblListadoAnunciosPendientes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelAñadirAnuncio = new javax.swing.JPanel();
        btnUsuariosRegistrados = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnBuscarUsuarios = new javax.swing.JButton();
        lblBuscarNombre = new javax.swing.JLabel();
        btnModificarUsuario = new javax.swing.JButton();
        lstUsuariosRegistrados = new java.awt.List();
        infoBuscarFotoErorr = new javax.swing.JLabel();
        lblErrorAñadirAnuncio = new javax.swing.JLabel();
        lblOperarUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelEditarPerfil = new javax.swing.JPanel();
        btnMirarAnuncio = new javax.swing.JButton();
        btnEliminarAnuncio = new javax.swing.JButton();
        btnBuscarMunicipio = new javax.swing.JButton();
        btnModificarAnuncio = new javax.swing.JButton();
        lstAnuncios = new java.awt.List();
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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblBuscarInmueble.setText("Buscar por nombre: ");

        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        lstUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        lstUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstUsuariosActionPerformed(evt);
            }
        });

        lstAnunciosUsuario.setForeground(new java.awt.Color(51, 51, 51));
        lstAnunciosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstAnunciosUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buscarInmueblePanelLayout = new javax.swing.GroupLayout(buscarInmueblePanel);
        buscarInmueblePanel.setLayout(buscarInmueblePanelLayout);
        buscarInmueblePanelLayout.setHorizontalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addComponent(btnMirarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblBuscarInmueble))
                    .addComponent(lstUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnuncioUsuario)
                            .addComponent(lstAnunciosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInformacionInmueble)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107))))
        );
        buscarInmueblePanelLayout.setVerticalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(lblBuscarInmueble)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMirarUsuarios))
                .addGap(18, 18, 18)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnuncioUsuario)
                    .addComponent(lblInformacionInmueble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lstUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(lstAnunciosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
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
                        .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(lblListadoUsuarios)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panelBuscarInmuebleLayout.setVerticalGroup(
            panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblListadoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Usuarios Registrados", panelBuscarInmueble);

        historialMensajesPanel.setBackground(new java.awt.Color(53, 121, 56));
        historialMensajesPanel.setForeground(new java.awt.Color(255, 255, 255));

        btnAnunciosPendientes.setText("Mostrar Publicaciones pendientes");
        btnAnunciosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnunciosPendientesActionPerformed(evt);
            }
        });

        btnAceptarAnuncio.setText("Aceptar Publicacion");
        btnAceptarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAnuncioActionPerformed(evt);
            }
        });

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

        lstPublicacionesPendientes.setForeground(new java.awt.Color(51, 51, 51));
        lstPublicacionesPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstPublicacionesPendientesActionPerformed(evt);
            }
        });

        lstAnunciosPublicados.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout historialMensajesPanelLayout = new javax.swing.GroupLayout(historialMensajesPanel);
        historialMensajesPanel.setLayout(historialMensajesPanelLayout);
        historialMensajesPanelLayout.setHorizontalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                        .addComponent(btnAnunciosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                        .addComponent(lstPublicacionesPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptarAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btnDenegarAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAnunciosPublicados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lstAnunciosPublicados, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        historialMensajesPanelLayout.setVerticalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnunciosPublicados)
                        .addComponent(btnAceptarAnuncio))
                    .addComponent(btnAnunciosPendientes))
                .addGap(18, 18, 18)
                .addGroup(historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lstPublicacionesPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(btnDenegarAnuncio)
                    .addComponent(lstAnunciosPublicados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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
                .addContainerGap(37, Short.MAX_VALUE))
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
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuarios.setText("Buscar");
        btnBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuariosActionPerformed(evt);
            }
        });

        lblBuscarNombre.setText("Buscar por nombre: ");

        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        lstUsuariosRegistrados.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelAñadirAnuncioLayout = new javax.swing.GroupLayout(panelAñadirAnuncio);
        panelAñadirAnuncio.setLayout(panelAñadirAnuncioLayout);
        panelAñadirAnuncioLayout.setHorizontalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnUsuariosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lstUsuariosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lblBuscarNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelAñadirAnuncioLayout.setVerticalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirAnuncioLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btnUsuariosRegistrados)
                .addGap(21, 21, 21)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarUsuarios)
                            .addComponent(lblBuscarNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnEliminarUsuario)
                        .addGap(23, 23, 23)
                        .addComponent(btnModificarUsuario))
                    .addComponent(lstUsuariosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
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

        btnMirarAnuncio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMirarAnuncio.setText("Mirar Anucios");
        btnMirarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMirarAnuncioActionPerformed(evt);
            }
        });

        btnEliminarAnuncio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarAnuncio.setText("Eliminar Anuncio");
        btnEliminarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAnuncioActionPerformed(evt);
            }
        });

        btnBuscarMunicipio.setText("Buscar");

        btnModificarAnuncio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificarAnuncio.setText("Modificar Anuncio");
        btnModificarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAnuncioActionPerformed(evt);
            }
        });

        lstAnuncios.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout panelEditarPerfilLayout = new javax.swing.GroupLayout(panelEditarPerfil);
        panelEditarPerfil.setLayout(panelEditarPerfilLayout);
        panelEditarPerfilLayout.setHorizontalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lstAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(btnBuscarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnMirarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEditarPerfilLayout.setVerticalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addComponent(lstAnuncios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarMunicipio)
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnModificarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(btnMirarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
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
                            .addComponent(panelEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
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

    public Cliente busquedaCliente(String cadena) {
        Cliente clienteBuscado = null;
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios()) {
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

    public void showAnuncio(Cliente c) {
        lstAnunciosUsuario.removeAll();
        for (Anuncio anuncio : c.getAnuncios()) {
            lstAnunciosUsuario.add(anuncio.toString());
        }
    }

    public void showInfoInmueble(Anuncio i) {
        txtInmuebleInformacion.removeAll();
        txtInmuebleInformacion.setText("Nombre: " + i.getTitulo()
                + "\n" + "Descripción: " + i.getDescripcion()
                + "\n" + "Precio: " + i.getPrecio()
                + "\n" + "Tipo: " + i.getInmueble().getTipoInmueble().toString()
                + "\n" + "Superficie: " + i.getInmueble().getSuperficie().toString()
                + "\n" + "Numero habitaciones: " + Integer.toString(i.getInmueble().getNumeroHabitaciones())
                + "\n" + "Número de cuartos de baño: " + i.getInmueble().getNumeroDeWc()
                + "\n" + "Estado inmueble: " + i.getInmueble().getTipoEstadoInmueble().toString()
                + "\n" + "Direccion: " + i.getInmueble().getDireccion().toString());
    }

    int contador_tope = 0;

    public void longitud() {
        contador_tope = 0;
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios()) {
                contador_tope++;
            }
        }
        //contador_tope++;
    }

    public boolean comprobar(Anuncio anuncioNuevo) {
        for (Cliente clientes : inmobiliaria.getClientes()) {
            for (Anuncio anuncios : clientes.getAnuncios()) {
                if (anuncios.getInmueble().getDireccion().getCalle().equals(anuncioNuevo.getInmueble().getDireccion().getCalle())
                        & anuncios.getInmueble().getDireccion().getNumero() == anuncioNuevo.getInmueble().getDireccion().getNumero()
                        & anuncios.getInmueble().getDireccion().getZipCode() == anuncioNuevo.getInmueble().getDireccion().getZipCode()
                        & anuncios.getInmueble().getDireccion().getMunicipio().equals(anuncioNuevo.getInmueble().getDireccion().getMunicipio())) {
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
        lstUsuarios.removeAll();
        for (Cliente cliente : inmobiliaria.getClientes())
            lstUsuarios.add(cliente.toString());
    }//GEN-LAST:event_btnMirarUsuariosActionPerformed

    private void btnUsuariosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosRegistradosActionPerformed
        lstUsuariosRegistrados.removeAll();
        for (Cliente cliente : inmobiliaria.getClientes())
            lstUsuariosRegistrados.add(cliente.toString());
    }//GEN-LAST:event_btnUsuariosRegistradosActionPerformed

    private void btnAnunciosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnunciosPendientesActionPerformed
        actualizarAnunciosPendientes();
    }//GEN-LAST:event_btnAnunciosPendientesActionPerformed

    private void btnDenegarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenegarAnuncioActionPerformed
        if (lstPublicacionesPendientes.getSelectedIndex() >= 0) {
            boolean encontrado = false;
            int index = lstPublicacionesPendientes.getSelectedIndex();
            Anuncio aux = null;

            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                if (catalogo.getTipoCatalogo().equals(TipoCatalogo.PENDIENTES)) {
                    for (int i = 0; i < catalogo.getAnuncios().size(); i++) {
                        if (i == index) {
                            aux = catalogo.getAnuncios().get(i);
                            catalogo.removeAnuncios(aux);
                        }
                    }
                }
            }

            //veo si existe el catálogo de PUBLICADOS y si no existe lo creo
            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                if (catalogo.getTipoCatalogo().equals(TipoCatalogo.ELIMINADOS)) {
                    encontrado = true;
                    catalogo.addAnuncios(aux);
                }
            }
            if (!encontrado) {
                CatalogoAnuncios ca = new CatalogoAnuncios(TipoCatalogo.ELIMINADOS);
                ca.addAnuncios(aux);
                inmobiliaria.addCatalogo(ca);
            }
            actualizarAnunciosPendientes();
            actualizarAnunciosPublicados();
            file.saveToFileCatalogo(inmobiliaria);
        }
    }//GEN-LAST:event_btnDenegarAnuncioActionPerformed

    private void btnAnunciosPublicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnunciosPublicadosActionPerformed
        actualizarAnunciosPublicados();
    }//GEN-LAST:event_btnAnunciosPublicadosActionPerformed

    private void btnMirarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMirarAnuncioActionPerformed
        establecerAnuncios();
    }//GEN-LAST:event_btnMirarAnuncioActionPerformed

    private void establecerAnuncios() {
        lstAnuncios.removeAll();
        for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
            for (Anuncio a : catalogo.getAnuncios()) {
                lstAnuncios.add(a.toString());
            }
        }
    }

    private void btnEliminarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAnuncioActionPerformed
        if (lstAnuncios.getSelectedIndex() >= 0) {
            Anuncio aux = null;
            //elimino el anuncio del catalogo
            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                for (Anuncio anuncio : catalogo.getAnuncios()) {
                    if (anuncio.toString().equals(lstAnuncios.getSelectedItem())) {
                        aux = anuncio;
                    }
                }
                catalogo.getAnuncios().remove(aux);
            }

            //elimino el anuncio del cliente
            for (Cliente c : inmobiliaria.getClientes()) {
                for (Anuncio anuncio : c.getAnuncios()) {
                    if (anuncio.toString().equals(lstAnuncios.getSelectedItem())) {
                        aux = anuncio;
                    }
                }
                c.getAnuncios().remove(aux);
            }

            establecerAnuncios();
            file.saveToFileClientes(inmobiliaria);
            file.saveToFileCatalogo(inmobiliaria);
        }
    }//GEN-LAST:event_btnEliminarAnuncioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        if (lstUsuariosRegistrados.getSelectedIndex() >= 0) {
            ModificarClienteForm modificarClienteForm = new ModificarClienteForm();
            modificarClienteForm.setLocationRelativeTo(null);
            modificarClienteForm.setVisible(true);

            modificarClienteForm.file = file;
            modificarClienteForm.inmobiliaria = inmobiliaria;
            modificarClienteForm.administrador = administrador;

            Cliente c = null;
            for (Cliente cliente : inmobiliaria.getClientes()) {
                if (cliente.toString().equals(lstUsuariosRegistrados.getSelectedItem())) {
                    c = cliente;
                }
            }

            modificarClienteForm.cliente = c;
            modificarClienteForm.establecerDatos();

            //cierra la ventana actual
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnModificarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAnuncioActionPerformed
        if (lstAnuncios.getSelectedIndex() >= 0) {
            ModificarAnuncioForm modificarAnuncioForm = new ModificarAnuncioForm();
            modificarAnuncioForm.setLocationRelativeTo(null);
            modificarAnuncioForm.setVisible(true);

            modificarAnuncioForm.file = file;
            modificarAnuncioForm.inmobiliaria = inmobiliaria;
            modificarAnuncioForm.administrador = administrador;

            //busco el anuncio del catálogo
            Anuncio aux = null;
            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                for (Anuncio anuncio : catalogo.getAnuncios()) {
                    if (anuncio.toString().equals(lstAnuncios.getSelectedItem())) {
                        aux = anuncio;
                    }
                }
            }

            modificarAnuncioForm.anuncio = aux;
            modificarAnuncioForm.establecerDatos();
        }
    }//GEN-LAST:event_btnModificarAnuncioActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        lstUsuarios.removeAll();
        lstAnunciosUsuario.removeAll();
        txtInmuebleInformacion.setText("");

        for (Cliente cliente : inmobiliaria.getClientes())
            if (cliente.getNombre().equals(txtBuscarNombre.getText()))
                lstUsuarios.add(cliente.toString());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lstUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstUsuariosActionPerformed
        Cliente c = null;
        for (Cliente cliente : inmobiliaria.getClientes()) {
            if (lstUsuarios.getSelectedItem().equals(cliente.toString())) {
                c = cliente;
            }
        }
        if (c != null)
            showAnuncio(c);
    }//GEN-LAST:event_lstUsuariosActionPerformed

    private void lstAnunciosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstAnunciosUsuarioActionPerformed
        Cliente c = null;
        for (Cliente cliente : inmobiliaria.getClientes()) {
            if (lstUsuarios.getSelectedItem().equals(cliente.toString())) {
                c = cliente;
            }
        }
        showInfoInmueble(c.getAnuncios().get(lstAnunciosUsuario.getSelectedIndex()));

    }//GEN-LAST:event_lstAnunciosUsuarioActionPerformed

    private void lstPublicacionesPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstPublicacionesPendientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPublicacionesPendientesActionPerformed

    private void btnAceptarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAnuncioActionPerformed
        if (lstPublicacionesPendientes.getSelectedIndex() >= 0) {
            boolean encontrado = false;
            int index = lstPublicacionesPendientes.getSelectedIndex();
            Anuncio aux = null;

            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                if (catalogo.getTipoCatalogo().equals(TipoCatalogo.PENDIENTES)) {
                    for (int i = 0; i < catalogo.getAnuncios().size(); i++) {
                        if (i == index) {
                            aux = catalogo.getAnuncios().get(i);
                            catalogo.removeAnuncios(aux);
                            actualizarCoordinadorAnuncioCliente(aux);
                            aux.setCoordinador(administrador);
                        }
                    }
                }
            }

            //veo si existe el catálogo de PUBLICADOS y si no existe lo creo
            for (CatalogoAnuncios catalogo : inmobiliaria.getCatalogo()) {
                if (catalogo.getTipoCatalogo().equals(TipoCatalogo.PUBLICADOS)) {
                    encontrado = true;
                    catalogo.addAnuncios(aux);
                }
            }
            if (!encontrado) {
                CatalogoAnuncios ca = new CatalogoAnuncios(TipoCatalogo.PUBLICADOS);
                ca.addAnuncios(aux);
                inmobiliaria.addCatalogo(ca);
            }

            actualizarAnunciosPendientes();
            actualizarAnunciosPublicados();
            file.saveToFileCatalogo(inmobiliaria);
            file.saveToFileClientes(inmobiliaria);
        }
    }//GEN-LAST:event_btnAceptarAnuncioActionPerformed

    private void btnBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuariosActionPerformed
        lstUsuariosRegistrados.removeAll();

        for (Cliente cliente : inmobiliaria.getClientes())
            if (cliente.getNombre().equals(txtNombre.getText()))
                lstUsuariosRegistrados.add(cliente.toString());
    }//GEN-LAST:event_btnBuscarUsuariosActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if (lstUsuariosRegistrados.getSelectedIndex() >= 0) {
//Elimino sus anuncios del catálogo
            Anuncio a = null;
            for (int i = 0; i < inmobiliaria.getClientes().get(lstUsuariosRegistrados.getSelectedIndex()).getAnuncios().size(); i++) {
                for (CatalogoAnuncios catalogos : inmobiliaria.getCatalogo()) {
                    for (int j = 0; j < catalogos.getAnuncios().size(); j++) {
                        if (catalogos.getAnuncios().get(j).equals(inmobiliaria.getClientes().get(lstUsuariosRegistrados.getSelectedIndex()).getAnuncios().get(i))) {
                            catalogos.removeAnuncio(j);
                        }
                    }
                }
            }

            inmobiliaria.getClientes().remove(lstUsuariosRegistrados.getSelectedIndex());
            lstUsuariosRegistrados.removeAll();
            for (Cliente cliente : inmobiliaria.getClientes()) {
                lstUsuariosRegistrados.add(cliente.toString());
            }
            file.saveToFileClientes(inmobiliaria);
            file.saveToFileCatalogo(inmobiliaria);
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    public void habilitarBotonRealizarBusqueda() {

    }

    public void habilitarBotonContratarRecomendacion() {
    }

    public void setTextSesion() {
        correoSesionLabel.setText(administrador.getCodigo());
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblAnuncioUsuario;
    private javax.swing.JLabel lblBuscarInmueble;
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
    private java.awt.List lstAnuncios;
    private java.awt.List lstAnunciosPublicados;
    private java.awt.List lstAnunciosUsuario;
    private java.awt.List lstPublicacionesPendientes;
    private java.awt.List lstUsuarios;
    private java.awt.List lstUsuariosRegistrados;
    private javax.swing.JPanel panelAñadirAnuncio;
    private javax.swing.JPanel panelBuscarInmueble;
    private javax.swing.JPanel panelEditarPerfil;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.ButtonGroup precioButtonGroup;
    private javax.swing.JLabel salirIIcon;
    private javax.swing.JLabel salirSesionLabel;
    private javax.swing.JTabbedPane tabEditarPerfil;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextArea txtInmuebleInformacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

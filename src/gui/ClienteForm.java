package gui;

import file.AgenciaFile;
import java.awt.Image;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.AnuncioFacade.Anuncio;
import model.CatalogoAnunciosComposite.CatalogoAnunciosComposite;
import model.Cliente;
import model.Inmobiliaria;
import model.Inmueble;
import model.TipologiaInmueble;
import model.Direccion;
import model.Precio;
import model.PrecioAlquiler;
import model.PrecioVenta;
import model.Mensajeria;

public class ClienteForm extends javax.swing.JFrame {

    public Inmobiliaria inmobiliaria;
    public Cliente cliente;
    public AgenciaFile file;

    public ClienteForm() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/iconoSALIR.png"));
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(salirIIcon.getWidth(), salirIIcon.getHeight(), Image.SCALE_DEFAULT));
        salirIIcon.setIcon(fondo);
        this.repaint();
        contratarButton.setEnabled(false);
        realizarBusquedaButton.setEnabled(false);
        contactarButton.setEnabled(false);
        txtFotoInmueble.setEditable(false);
        btnRealizarCambios.setEnabled(false);
        btnPublicarAnuncio.setEnabled(false);
        lblFecha.setText("Inicio de Sesion: " + fechaUsuario());

    }

    void showInmuebleDetails(Inmueble i) {
        inmueblesEncontradosList.removeAll();
        inmueblesEncontradosList.add(i.getTipoInmueble().toString());
        inmueblesEncontradosList.add(i.getSuperficie().toString());
        inmueblesEncontradosList.add(Integer.toString(i.getNumeroHabitaciones()));
    }

    void showAnunciosList() {
        int i;
        inmueblesEncontradosList.removeAll();
        //for (i = 0; i < anuncios.getAnunciosList().size(); i++) {}
        // inmueblesEncontradosList.add(anuncios.getAnunciosList().get(i).getInmueble());
    }

    void comprobarPublicarAnuncio() {

        if (txCodigoPostal.getText().equals("") ^ txtNumero.getText().equals("")) {
            btnPublicarAnuncio.setEnabled(false);
        } else {
            if (txCodigoPostal.getText().matches("\\d{5,}") & txtNumero.getText().matches("\\d*")
                    & txtPiso.getText().matches("\\d*") & txtSuperficie.getText().matches("\\d*")
                    & cbNumHabitaciones.getSelectedItem().toString().matches("\\d")) {
                btnPublicarAnuncio.setEnabled(true);
            } else {
                realizarBusquedaButton.setEnabled(false);
            }

        }

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
        jPanel = new javax.swing.JPanel();
        lblAgencia = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        tabEditarPerfil = new javax.swing.JTabbedPane();
        panelBuscarInmueble = new javax.swing.JPanel();
        buscarInmueblePanel = new javax.swing.JPanel();
        municipioRadioButton = new javax.swing.JRadioButton();
        filtrosBusquedaLabel = new javax.swing.JLabel();
        InmueblesEncontradosLabel = new javax.swing.JLabel();
        precioRadioButton = new javax.swing.JRadioButton();
        precioDesdeLabel = new javax.swing.JLabel();
        precioHastaLabel = new javax.swing.JLabel();
        municipiosTextField = new javax.swing.JTextField();
        precioHastaTextField = new javax.swing.JTextField();
        municipioLabel = new javax.swing.JLabel();
        precioDesdeTextField = new javax.swing.JTextField();
        compraRadioButton = new javax.swing.JRadioButton();
        alquilerRadioButton = new javax.swing.JRadioButton();
        inmuebleparaLabel = new javax.swing.JLabel();
        fotoInmuebleScrollPane = new javax.swing.JScrollPane();
        fotoInmuebleTextArea = new javax.swing.JTextArea();
        realizarBusquedaButton = new javax.swing.JButton();
        contactarButton = new javax.swing.JButton();
        inmueblesEncontradosList = new java.awt.List();
        infoInmuebleList1 = new java.awt.List();
        lblPreferencias = new javax.swing.JLabel();
        informacionDelInmuebleLabel = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        infoBuscarInmuebleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelAñadirAnuncio = new javax.swing.JPanel();
        lblTipoInmueble = new javax.swing.JLabel();
        lblNumeroHabitaciones = new javax.swing.JLabel();
        lblSuperficie = new javax.swing.JLabel();
        cbtipoInmueble = new javax.swing.JComboBox<>();
        cbNumHabitaciones = new javax.swing.JComboBox<>();
        lblPrecio = new javax.swing.JLabel();
        btnAdjuntarImagen = new javax.swing.JButton();
        txtSuperficie = new java.awt.TextField();
        txtPrecio = new java.awt.TextField();
        lblFoto = new javax.swing.JLabel();
        lblFotoInmueble = new javax.swing.JLabel();
        txtFotoInmueble = new javax.swing.JTextField();
        btnPublicarAnuncio = new javax.swing.JButton();
        panelAñadir = new javax.swing.JPanel();
        lblMunicipio = new javax.swing.JLabel();
        cbMunicipio = new javax.swing.JComboBox<>();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txCodigoPostal = new javax.swing.JTextField();
        lblNumeroInmueble = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        pIsoLabel = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        rbPrecioMensual = new javax.swing.JRadioButton();
        rbPrecioTotal = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lblInfoDireccion = new javax.swing.JLabel();
        lblInfoDelInmu = new javax.swing.JLabel();
        infoBuscarFotoErorr = new javax.swing.JLabel();
        infoAñadirInmuebleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelEditarPerfil = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        apellidosLabel = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        contraseñaNuevaLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        repetirContraseñaLabel = new javax.swing.JLabel();
        txtRepetirPassword = new javax.swing.JPasswordField();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtPasswordActual = new javax.swing.JPasswordField();
        infoIngreseContraseñaLabel = new javax.swing.JLabel();
        btnRealizarCambios = new javax.swing.JButton();
        infoEditarPerfilLabel = new javax.swing.JLabel();
        panelContratar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        errorTarjetaLabel = new javax.swing.JLabel();
        cvvLabel = new javax.swing.JLabel();
        nombreTarjetaTextField = new javax.swing.JTextField();
        caducidadLabel = new javax.swing.JLabel();
        caducidadTextField = new javax.swing.JTextField();
        numeroTarjetaLabel = new javax.swing.JLabel();
        numeroTarjetaTextField = new javax.swing.JTextField();
        nombreTarjetaLabel = new javax.swing.JLabel();
        cvvTextField = new javax.swing.JTextField();
        contratarButton = new javax.swing.JButton();
        tipoTarjetaLabel = new javax.swing.JLabel();
        panelHistorial = new javax.swing.JPanel();
        historialMensajesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoContactoTextArea = new javax.swing.JTextArea();
        infoHistorialLabel = new javax.swing.JLabel();
        personasInteresadasLabel = new javax.swing.JLabel();
        datosContactoLabel = new javax.swing.JLabel();
        cargarHistorialButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        historialMensajesTextArea = new javax.swing.JTextArea();
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

        municipioRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        filtrosButtonGroup.add(municipioRadioButton);
        municipioRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        municipioRadioButton.setText("Municipio");
        municipioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioRadioButtonActionPerformed(evt);
            }
        });

        filtrosBusquedaLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        filtrosBusquedaLabel.setForeground(new java.awt.Color(255, 255, 255));
        filtrosBusquedaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtrosBusquedaLabel.setText("Filtros de busqueda");

        InmueblesEncontradosLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        InmueblesEncontradosLabel.setForeground(new java.awt.Color(255, 255, 255));
        InmueblesEncontradosLabel.setText("Inmuebles Encontrados");

        precioRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        filtrosButtonGroup.add(precioRadioButton);
        precioRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        precioRadioButton.setText("Precio");
        precioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioRadioButtonActionPerformed(evt);
            }
        });

        precioDesdeLabel.setForeground(new java.awt.Color(255, 255, 255));
        precioDesdeLabel.setText("Precio desde :");

        precioHastaLabel.setForeground(new java.awt.Color(255, 255, 255));
        precioHastaLabel.setText("Precio hasta :");

        municipiosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipiosTextFieldActionPerformed(evt);
            }
        });
        municipiosTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                municipiosTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                municipiosTextFieldKeyReleased(evt);
            }
        });

        precioHastaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioHastaTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioHastaTextFieldKeyReleased(evt);
            }
        });

        municipioLabel.setForeground(new java.awt.Color(255, 255, 255));
        municipioLabel.setText("Municipios : ");

        precioDesdeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioDesdeTextFieldActionPerformed(evt);
            }
        });
        precioDesdeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioDesdeTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioDesdeTextFieldKeyReleased(evt);
            }
        });

        compraRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        inmuebleParaButtonGroup.add(compraRadioButton);
        compraRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        compraRadioButton.setText("Compra");
        compraRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraRadioButtonActionPerformed(evt);
            }
        });

        alquilerRadioButton.setBackground(new java.awt.Color(53, 121, 56));
        inmuebleParaButtonGroup.add(alquilerRadioButton);
        alquilerRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        alquilerRadioButton.setText("Alquiler");
        alquilerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerRadioButtonActionPerformed(evt);
            }
        });

        inmuebleparaLabel.setForeground(new java.awt.Color(255, 255, 255));
        inmuebleparaLabel.setText("Inmueble para :");

        fotoInmuebleTextArea.setColumns(20);
        fotoInmuebleTextArea.setRows(5);
        fotoInmuebleScrollPane.setViewportView(fotoInmuebleTextArea);

        realizarBusquedaButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        realizarBusquedaButton.setText("Realizar busqueda");
        realizarBusquedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarBusquedaButtonActionPerformed(evt);
            }
        });

        contactarButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contactarButton.setText("Contactar");
        contactarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactarButtonActionPerformed(evt);
            }
        });

        inmueblesEncontradosList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmueblesEncontradosListActionPerformed(evt);
            }
        });

        lblPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        lblPreferencias.setText("Preferencias");

        informacionDelInmuebleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        informacionDelInmuebleLabel.setForeground(new java.awt.Color(255, 255, 255));
        informacionDelInmuebleLabel.setText("Informacion del inmueble");

        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Mensaje:");

        jButton1.setText("Enviar mensaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buscarInmueblePanelLayout = new javax.swing.GroupLayout(buscarInmueblePanel);
        buscarInmueblePanel.setLayout(buscarInmueblePanelLayout);
        buscarInmueblePanelLayout.setHorizontalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(precioHastaLabel)
                                                .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                                    .addComponent(precioRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(precioDesdeLabel)))
                                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                                .addComponent(municipioRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(municipioLabel))))
                                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(lblPreferencias)))
                                .addGap(18, 18, 18)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(precioHastaTextField)
                                    .addComponent(municipiosTextField)
                                    .addComponent(precioDesdeTextField)
                                    .addComponent(filtrosBusquedaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(realizarBusquedaButton)
                                .addGap(18, 18, 18)
                                .addComponent(contactarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMensaje)
                        .addGap(18, 18, 18)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inmuebleparaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(compraRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(alquilerRadioButton)
                        .addGap(98, 98, 98)))
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addComponent(inmueblesEncontradosList, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoInmuebleList1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fotoInmuebleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addComponent(InmueblesEncontradosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(informacionDelInmuebleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        buscarInmueblePanelLayout.setVerticalGroup(
            buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createSequentialGroup()
                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(filtrosBusquedaLabel)
                                    .addComponent(InmueblesEncontradosLabel)
                                    .addComponent(informacionDelInmuebleLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblPreferencias)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inmueblesEncontradosList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(municipioRadioButton)
                                    .addComponent(municipioLabel)
                                    .addComponent(municipiosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precioRadioButton)
                                    .addComponent(precioDesdeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioDesdeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precioHastaLabel)
                                    .addComponent(precioHastaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alquilerRadioButton)
                                    .addComponent(compraRadioButton)
                                    .addComponent(inmuebleparaLabel))
                                .addGap(18, 18, 18)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createSequentialGroup()
                                        .addComponent(lblMensaje)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addGroup(buscarInmueblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contactarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(realizarBusquedaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(buscarInmueblePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(infoInmuebleList1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(fotoInmuebleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        infoBuscarInmuebleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infoBuscarInmuebleLabel.setText("Ingrese todos los filtros para realizar busquedas de los inmuebles que ofertamos!!");

        javax.swing.GroupLayout panelBuscarInmuebleLayout = new javax.swing.GroupLayout(panelBuscarInmueble);
        panelBuscarInmueble.setLayout(panelBuscarInmuebleLayout);
        panelBuscarInmuebleLayout.setHorizontalGroup(
            panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoBuscarInmuebleLabel)
                    .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelBuscarInmuebleLayout.setVerticalGroup(
            panelBuscarInmuebleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarInmuebleLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(infoBuscarInmuebleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarInmueblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Buscar Inmueble", panelBuscarInmueble);

        panelAñadirAnuncio.setBackground(new java.awt.Color(53, 121, 56));
        panelAñadirAnuncio.setForeground(new java.awt.Color(255, 255, 255));

        lblTipoInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTipoInmueble.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoInmueble.setText("Tipo de Inmueble : ");

        lblNumeroHabitaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNumeroHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroHabitaciones.setText("Número de habitaciones : ");

        lblSuperficie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSuperficie.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperficie.setText("Superficie m2 :");

        cbtipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Piso", "Casa", "Chalet", "Apartamento" }));

        cbNumHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        lblPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio :");

        btnAdjuntarImagen.setText("adjuntar imagen");
        btnAdjuntarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarImagenActionPerformed(evt);
            }
        });

        txtSuperficie.setForeground(new java.awt.Color(102, 102, 102));
        txtSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperficieActionPerformed(evt);
            }
        });
        txtSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSuperficieKeyReleased(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        lblFoto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFoto.setText(" ");

        lblFotoInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFotoInmueble.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoInmueble.setText("Foto del Inmueble : ");

        btnPublicarAnuncio.setBackground(new java.awt.Color(255, 255, 255));
        btnPublicarAnuncio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPublicarAnuncio.setForeground(new java.awt.Color(53, 121, 56));
        btnPublicarAnuncio.setText("Publicar anuncio");
        btnPublicarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarAnuncioActionPerformed(evt);
            }
        });

        lblMunicipio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblMunicipio.setText("Municipio:");

        cbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Las Palmas de Gran Canaria", "Telde", "Agaete", "Aguimes", "Artenara", "Arucas", "Firgas", "Galdar", "Ingenio", "La Aldea de San Nicolas", "Mogán", "Moya", "San Bartolomé de Tirajana", "Santa Brigida", "Santa Lucía de Tirajana", "Santa Maria de Guía", "Tejeda", "Teror", "Valleseco", "Valsequillo de Gran Canaria", "Vega San Mateo" }));

        lblCalle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCalle.setText("Calle :");

        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCalleKeyReleased(evt);
            }
        });

        lblCodigoPostal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCodigoPostal.setText("Codigo Postal:");

        txCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txCodigoPostalKeyReleased(evt);
            }
        });

        lblNumeroInmueble.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNumeroInmueble.setText("Numero : ");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
        });

        pIsoLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pIsoLabel.setText("Piso :");

        txtPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPisoActionPerformed(evt);
            }
        });
        txtPiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPisoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirLayout = new javax.swing.GroupLayout(panelAñadir);
        panelAñadir.setLayout(panelAñadirLayout);
        panelAñadirLayout.setHorizontalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAñadirLayout.createSequentialGroup()
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCalle)
                            .addComponent(lblMunicipio))
                        .addGap(18, 18, 18)
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAñadirLayout.createSequentialGroup()
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigoPostal)
                            .addComponent(lblNumeroInmueble)
                            .addComponent(pIsoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txCodigoPostal)
                            .addComponent(txtNumero))))
                .addGap(44, 44, 44))
        );
        panelAñadirLayout.setVerticalGroup(
            panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalle)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoPostal)
                    .addComponent(txCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroInmueble)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIsoLabel))
                .addGap(32, 32, 32))
        );

        rbPrecioMensual.setBackground(new java.awt.Color(53, 121, 56));
        precioButtonGroup.add(rbPrecioMensual);
        rbPrecioMensual.setForeground(new java.awt.Color(255, 255, 255));
        rbPrecioMensual.setText("Mensual");
        rbPrecioMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrecioMensualActionPerformed(evt);
            }
        });
        rbPrecioMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbPrecioMensualKeyPressed(evt);
            }
        });

        rbPrecioTotal.setBackground(new java.awt.Color(53, 121, 56));
        precioButtonGroup.add(rbPrecioTotal);
        rbPrecioTotal.setForeground(new java.awt.Color(255, 255, 255));
        rbPrecioTotal.setText("Total");
        rbPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrecioTotalActionPerformed(evt);
            }
        });
        rbPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbPrecioTotalKeyPressed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione el tipo de precio");

        lblInfoDireccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInfoDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoDireccion.setText("Informacion de la direccion");

        lblInfoDelInmu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInfoDelInmu.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoDelInmu.setText("Informacion del Inmueble");

        javax.swing.GroupLayout panelAñadirAnuncioLayout = new javax.swing.GroupLayout(panelAñadirAnuncio);
        panelAñadirAnuncio.setLayout(panelAñadirAnuncioLayout);
        panelAñadirAnuncioLayout.setHorizontalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSuperficie)
                            .addComponent(lblNumeroHabitaciones)
                            .addComponent(lblTipoInmueble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInfoDelInmu, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(cbNumHabitaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbtipoInmueble, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFotoInmueble)
                                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                        .addComponent(lblFotoInmueble)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdjuntarImagen)))))
                        .addGap(12, 12, 12)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirAnuncioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPrecioMensual)
                                .addGap(18, 18, 18)
                                .addComponent(rbPrecioTotal)
                                .addGap(69, 69, 69))
                            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                                .addComponent(panelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblInfoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirAnuncioLayout.createSequentialGroup()
                        .addComponent(btnPublicarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        panelAñadirAnuncioLayout.setVerticalGroup(
            panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblInfoDelInmu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoInmueble)
                    .addComponent(cbtipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSuperficie))
                .addGap(9, 9, 9)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroHabitaciones)
                    .addComponent(cbNumHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFotoInmueble)
                            .addComponent(btnAdjuntarImagen))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFotoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(panelAñadirAnuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInfoDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAñadirAnuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPrecioMensual)
                    .addComponent(rbPrecioTotal)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPublicarAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        infoBuscarFotoErorr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        infoAñadirInmuebleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infoAñadirInmuebleLabel.setText("Ingrese todos los datos para poder publicar un anuncio ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(infoBuscarFotoErorr, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoAñadirInmuebleLabel)
                            .addComponent(panelAñadirAnuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(infoAñadirInmuebleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAñadirAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(infoBuscarFotoErorr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Añadir Anuncio", jPanel1);

        panelEditarPerfil.setBackground(new java.awt.Color(53, 121, 56));
        panelEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));

        lblError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(53, 121, 56));

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

        txtRepetirPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepetirPasswordActionPerformed(evt);
            }
        });

        lblCorreoElectronico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoElectronico.setText("Correo electrónico:");

        txtPasswordActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActualActionPerformed(evt);
            }
        });
        txtPasswordActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordActualKeyReleased(evt);
            }
        });

        infoIngreseContraseñaLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        infoIngreseContraseñaLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoIngreseContraseñaLabel.setText("Ingrese la nueva contraseña para realizar los cambios:");

        btnRealizarCambios.setBackground(new java.awt.Color(255, 255, 255));
        btnRealizarCambios.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnRealizarCambios.setForeground(new java.awt.Color(53, 121, 56));
        btnRealizarCambios.setText("Realizar cambios");
        btnRealizarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditarPerfilLayout = new javax.swing.GroupLayout(panelEditarPerfil);
        panelEditarPerfil.setLayout(panelEditarPerfilLayout);
        panelEditarPerfilLayout.setHorizontalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellidosLabel)
                    .addComponent(nombreLabel)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(contraseñaNuevaLabel)
                    .addComponent(repetirContraseñaLabel)
                    .addComponent(infoIngreseContraseñaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRealizarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo)
                    .addComponent(txtPassword)
                    .addComponent(txtRepetirPassword)
                    .addComponent(txtPasswordActual))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(525, Short.MAX_VALUE)))
        );
        panelEditarPerfilLayout.setVerticalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarPerfilLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosLabel)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaNuevaLabel)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repetirContraseñaLabel)
                    .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoIngreseContraseñaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRealizarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                    .addGap(266, 266, 266)
                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        infoEditarPerfilLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infoEditarPerfilLabel.setText("Ingrese los datos que deseas modificar a continuación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoEditarPerfilLabel)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(panelEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(infoEditarPerfilLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Editar perfil", jPanel3);

        jPanel9.setBackground(new java.awt.Color(53, 121, 56));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        errorTarjetaLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        errorTarjetaLabel.setForeground(new java.awt.Color(255, 0, 0));

        cvvLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cvvLabel.setForeground(new java.awt.Color(255, 255, 255));
        cvvLabel.setText("CVV");

        nombreTarjetaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTarjetaTextFieldKeyReleased(evt);
            }
        });

        caducidadLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        caducidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        caducidadLabel.setText("Caducidad");

        caducidadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caducidadTextFieldActionPerformed(evt);
            }
        });
        caducidadTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caducidadTextFieldKeyReleased(evt);
            }
        });

        numeroTarjetaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numeroTarjetaLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroTarjetaLabel.setText("Numero de la tarjeta");

        numeroTarjetaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTarjetaTextFieldActionPerformed(evt);
            }
        });
        numeroTarjetaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTarjetaTextFieldKeyReleased(evt);
            }
        });

        nombreTarjetaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombreTarjetaLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreTarjetaLabel.setText("Nombre asociado a la tarjeta");

        cvvTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvTextFieldActionPerformed(evt);
            }
        });
        cvvTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cvvTextFieldKeyReleased(evt);
            }
        });

        contratarButton.setBackground(new java.awt.Color(255, 255, 255));
        contratarButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        contratarButton.setForeground(new java.awt.Color(53, 121, 56));
        contratarButton.setText("CONTRATAR");
        contratarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 188, Short.MAX_VALUE)
                .addComponent(errorTarjetaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(cvvLabel))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(caducidadLabel))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(numeroTarjetaLabel))
                    .addComponent(nombreTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTarjetaLabel)
                    .addComponent(caducidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contratarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreTarjetaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caducidadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caducidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroTarjetaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroTarjetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvvLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(contratarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTarjetaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        tipoTarjetaLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tipoTarjetaLabel.setText("Ingrese la informacion de su  tarjeta");

        javax.swing.GroupLayout panelContratarLayout = new javax.swing.GroupLayout(panelContratar);
        panelContratar.setLayout(panelContratarLayout);
        panelContratarLayout.setHorizontalGroup(
            panelContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContratarLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panelContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoTarjetaLabel)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        panelContratarLayout.setVerticalGroup(
            panelContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContratarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tipoTarjetaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabEditarPerfil.addTab("Contratar Recomendacion", panelContratar);

        historialMensajesPanel.setBackground(new java.awt.Color(53, 121, 56));
        historialMensajesPanel.setForeground(new java.awt.Color(255, 255, 255));

        infoContactoTextArea.setColumns(20);
        infoContactoTextArea.setRows(5);
        jScrollPane2.setViewportView(infoContactoTextArea);

        javax.swing.GroupLayout historialMensajesPanelLayout = new javax.swing.GroupLayout(historialMensajesPanel);
        historialMensajesPanel.setLayout(historialMensajesPanelLayout);
        historialMensajesPanelLayout.setHorizontalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historialMensajesPanelLayout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        historialMensajesPanelLayout.setVerticalGroup(
            historialMensajesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historialMensajesPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        infoHistorialLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        infoHistorialLabel.setText("Publique algun anuncio para recibir mensajes de otros clientes:");

        personasInteresadasLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        personasInteresadasLabel.setForeground(new java.awt.Color(255, 255, 255));
        personasInteresadasLabel.setText("Personas Interesadas");

        datosContactoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        datosContactoLabel.setForeground(new java.awt.Color(255, 255, 255));
        datosContactoLabel.setText("Datos del contacto");

        cargarHistorialButton.setBackground(new java.awt.Color(255, 255, 255));
        cargarHistorialButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cargarHistorialButton.setForeground(new java.awt.Color(53, 121, 56));
        cargarHistorialButton.setText("Cargar Historial");
        cargarHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarHistorialButtonActionPerformed(evt);
            }
        });

        historialMensajesTextArea.setColumns(20);
        historialMensajesTextArea.setRows(5);
        jScrollPane3.setViewportView(historialMensajesTextArea);

        javax.swing.GroupLayout panelHistorialLayout = new javax.swing.GroupLayout(panelHistorial);
        panelHistorial.setLayout(panelHistorialLayout);
        panelHistorialLayout.setHorizontalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                        .addComponent(personasInteresadasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(datosContactoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                        .addComponent(cargarHistorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))))
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHistorialLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(infoHistorialLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistorialLayout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(historialMensajesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)))
        );
        panelHistorialLayout.setVerticalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(infoHistorialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datosContactoLabel)
                    .addComponent(personasInteresadasLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cargarHistorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHistorialLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(historialMensajesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        tabEditarPerfil.addTab("Historial de Mensajes", panelHistorial);

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
            .addComponent(tabEditarPerfil)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(lblLogo)))
                .addGap(11, 11, 11)
                .addComponent(tabEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCambiosActionPerformed
        boolean realizado = true;
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            if (inmobiliaria.getClientes().get(i).getCorreo().equals(cliente.getCorreo())) {
                if (txtCorreo.getText().contains("/") || txtApellidos.getText().contains("/") || txtCorreo.getText().contains("/") || txtPasswordActual.getText().contains("/")) {
                    lblError.setText("Hay un caracter no permitido");
                } else {
                    if (!inmobiliaria.getClientes().get(i).getPassword().equals(txtRepetirPassword.getText())) {
                        lblError.setText("La contraseña no es correcta");
                    } else {
                        //modifico los datos del cliente
                        if (txtCorreo.getText() != "" && txtCorreo.getText().length() != 0) {
                            inmobiliaria.getClientes().get(i).setNombre(txtCorreo.getText());
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
                        if (txtPasswordActual.getText().equals(txtPasswordActual.getText())) {
                            if (txtPasswordActual.getText() != "" && txtPasswordActual.getText().length() != 0) {
                                inmobiliaria.getClientes().get(i).setPassword(txtPasswordActual.getText());
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

    private void compraRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraRadioButtonActionPerformed

    }//GEN-LAST:event_compraRadioButtonActionPerformed

    private void alquilerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerRadioButtonActionPerformed

    }//GEN-LAST:event_alquilerRadioButtonActionPerformed

    private void municipioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioRadioButtonActionPerformed
        precioDesdeTextField.setEnabled(false);
        precioHastaTextField.setEnabled(false);
        precioDesdeTextField.setText("");
        precioHastaTextField.setText("");
        municipiosTextField.setEnabled(true);

    }//GEN-LAST:event_municipioRadioButtonActionPerformed

    private void precioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioRadioButtonActionPerformed
        precioDesdeTextField.setEnabled(true);
        precioHastaTextField.setEnabled(true);
        municipiosTextField.setEnabled(false);
        municipiosTextField.setText("");

    }//GEN-LAST:event_precioRadioButtonActionPerformed

    private void realizarBusquedaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarBusquedaButtonActionPerformed
        if (compraRadioButton.isSelected() || alquilerRadioButton.isSelected()) {
            System.out.println();
            if (municipioRadioButton.isSelected() || precioRadioButton.isSelected()) {

            }
        }
    }//GEN-LAST:event_realizarBusquedaButtonActionPerformed

    private void contactarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactarButtonActionPerformed

    private void inmueblesEncontradosListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmueblesEncontradosListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmueblesEncontradosListActionPerformed

    private void txtPasswordActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActualActionPerformed

    private void contratarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarButtonActionPerformed
        int contadorErorres = 0;
        if (!cvvTextField.getText().matches("\\d\\d\\d")) {
            contadorErorres++;
            errorTarjetaLabel.setText("Debes introducir cvv valido, Vuelva a intentarlo");
        }
        if (!nombreTarjetaTextField.getText().matches("[a-zA-Z]+\\.?")) {
            contadorErorres++;
            errorTarjetaLabel.setText("Debes introducir un nombre valido, Vuelva a intentarlo");
        }
        if (!numeroTarjetaTextField.getText().matches("\\d{16}")) {
            contadorErorres++;
            errorTarjetaLabel.setText("Debes introducir un numero de tarjeta valido, Vuelva a intentarlo");
        }
        if (contadorErorres > 1) {
            errorTarjetaLabel.setText("Varios errores en los campos necesarios, Vuelva a intentarlo");
        }
    }//GEN-LAST:event_contratarButtonActionPerformed

    private void cvvTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvTextFieldKeyReleased
        habilitarBotonContratarRecomendacion();
    }//GEN-LAST:event_cvvTextFieldKeyReleased

    private void caducidadTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caducidadTextFieldKeyReleased
        habilitarBotonContratarRecomendacion();
    }//GEN-LAST:event_caducidadTextFieldKeyReleased

    private void nombreTarjetaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTarjetaTextFieldKeyReleased
        habilitarBotonContratarRecomendacion();
    }//GEN-LAST:event_nombreTarjetaTextFieldKeyReleased

    private void numeroTarjetaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTarjetaTextFieldKeyReleased
        habilitarBotonContratarRecomendacion();
    }//GEN-LAST:event_numeroTarjetaTextFieldKeyReleased

    private void cvvTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvTextFieldActionPerformed

    private void numeroTarjetaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTarjetaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTarjetaTextFieldActionPerformed

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

    private void municipiosTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_municipiosTextFieldKeyReleased
        if (municipiosTextField.getText().matches("[a-z].*")) {
            habilitarBotonRealizarBusqueda();
        } else {
            realizarBusquedaButton.setEnabled(false);
        }

    }//GEN-LAST:event_municipiosTextFieldKeyReleased

    private void precioDesdeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioDesdeTextFieldKeyReleased
        if (precioDesdeTextField.getText().equals("")) {
            realizarBusquedaButton.setEnabled(false);
        } else {
            if (precioDesdeTextField.getText().matches("\\d*") & precioHastaTextField.getText().matches("\\d*")) {
                habilitarBotonRealizarBusqueda();
            } else {
                realizarBusquedaButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_precioDesdeTextFieldKeyReleased

    private void precioHastaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioHastaTextFieldKeyReleased
        if (precioDesdeTextField.getText().equals("")) {
            realizarBusquedaButton.setEnabled(false);
        } else {
            if (precioHastaTextField.getText().matches("\\d*") & precioDesdeTextField.getText().matches("\\d*")) {
                habilitarBotonRealizarBusqueda();
            } else {
                realizarBusquedaButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_precioHastaTextFieldKeyReleased

    private void municipiosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipiosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipiosTextFieldActionPerformed

    private void precioDesdeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioDesdeTextFieldActionPerformed

    }//GEN-LAST:event_precioDesdeTextFieldActionPerformed

    private void municipiosTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_municipiosTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipiosTextFieldKeyPressed

    private void precioHastaTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioHastaTextFieldKeyPressed
        if (precioDesdeTextField.getText().equals("")) {
            realizarBusquedaButton.setEnabled(false);
        }
    }//GEN-LAST:event_precioHastaTextFieldKeyPressed

    private void precioDesdeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioDesdeTextFieldKeyPressed
        if (precioDesdeTextField.getText().equals("")) {
            realizarBusquedaButton.setEnabled(false);
        }
    }//GEN-LAST:event_precioDesdeTextFieldKeyPressed

    private void txtSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperficieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperficieActionPerformed

    private void btnAdjuntarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarImagenActionPerformed

        JFileChooser jf = new JFileChooser();
        jf.setMultiSelectionEnabled(false);
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            if (!jf.getSelectedFile().toString().substring(jf.getSelectedFile().toString().length() - 4).equals(".png")) {
                rsdragdropfiles.RSDragDropFiles.setCopiar(jf.getSelectedFile().toString(), "src/imagenes/clientes/inmueble_trabajador2.png");
                txtFotoInmueble.setText("imagenes/clientes/inmueble_trabajador2.png");
                ImageIcon imagen = new ImageIcon(jf.getSelectedFile().toString());
                Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
                lblFoto.setIcon(fondo);
                this.repaint();
                infoBuscarFotoErorr.setText("");
            } else {
                infoBuscarFotoErorr.setText("La foto debe ser formato .png");
            }
        }
    }//GEN-LAST:event_btnAdjuntarImagenActionPerformed

    private void btnPublicarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarAnuncioActionPerformed
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            if (inmobiliaria.getClientes().get(i).getCorreo().equals(cliente.getCorreo())) {
                Inmueble inmueble = null;
                if (cbtipoInmueble.getSelectedItem().toString().equals("Piso")) {
                    inmueble = new Inmueble(TipologiaInmueble.PISO, Double.parseDouble(txtSuperficie.getText()), Integer.parseInt(cbNumHabitaciones.getSelectedItem().toString()));
                } else if (cbtipoInmueble.getSelectedItem().toString().equals("Casa")) {
                    inmueble = new Inmueble(TipologiaInmueble.CASA, Double.parseDouble(txtSuperficie.getText()), Integer.parseInt(cbNumHabitaciones.getSelectedItem().toString()));
                } else if (cbtipoInmueble.getSelectedItem().toString().equals("Chalet")) {
                    inmueble = new Inmueble(TipologiaInmueble.CHALET, Double.parseDouble(txtSuperficie.getText()), Integer.parseInt(cbNumHabitaciones.getSelectedItem().toString()));
                } else if (cbtipoInmueble.getSelectedItem().toString().equals("Apartamento")) {
                    inmueble = new Inmueble(TipologiaInmueble.APARTAMENTO, Double.parseDouble(txtSuperficie.getText()), Integer.parseInt(cbNumHabitaciones.getSelectedItem().toString()));
                }

                Direccion d = new Direccion(txtCalle.getText(), txtPiso.getText(), cbMunicipio.getSelectedItem().toString(), Integer.parseInt(txtNumero.getText()), Integer.parseInt(txCodigoPostal.getText()));

                Precio p = null;
                if (rbPrecioMensual.isSelected()) {
                    p = new PrecioAlquiler(Integer.parseInt(txtPrecio.getText()));
                } else {
                    p = new PrecioVenta(Integer.parseInt(txtPrecio.getText()));
                }

                inmobiliaria.getClientes().get(i).getAnuncios().addAnuncios(inmueble, d, p, txtFotoInmueble.getText());

                file.saveToFile(inmobiliaria);
            }
        }
    }//GEN-LAST:event_btnPublicarAnuncioActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPisoActionPerformed

    private void rbPrecioMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrecioMensualActionPerformed
        comprobarPublicarAnuncio();
    }//GEN-LAST:event_rbPrecioMensualActionPerformed

    private void rbPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrecioTotalActionPerformed
        comprobarPublicarAnuncio();
    }//GEN-LAST:event_rbPrecioTotalActionPerformed

    private void txtRepetirPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepetirPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirPasswordActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void caducidadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caducidadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caducidadTextFieldActionPerformed

    private void txtPasswordActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordActualKeyReleased
        btnRealizarCambios.setEnabled(true);
    }//GEN-LAST:event_txtPasswordActualKeyReleased

    private void cargarHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarHistorialButtonActionPerformed
        String clientesInteresados = "";
        for (int i = 0; i < cliente.getFrom().size(); i++) {
            clientesInteresados += cliente.getFrom().get(i).getFrom().getCorreo() + "\n";
        }
        historialMensajesTextArea.setText(clientesInteresados);
    }//GEN-LAST:event_cargarHistorialButtonActionPerformed

    private void txtCalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleKeyReleased

    private void txCodigoPostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCodigoPostalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodigoPostalKeyReleased

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyReleased

    private void txtPisoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPisoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPisoKeyReleased

    private void txtSuperficieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuperficieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuperficieKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void rbPrecioMensualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbPrecioMensualKeyPressed
        comprobarPublicarAnuncio();
    }//GEN-LAST:event_rbPrecioMensualKeyPressed

    private void rbPrecioTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbPrecioTotalKeyPressed
        comprobarPublicarAnuncio();
    }//GEN-LAST:event_rbPrecioTotalKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mensajeria m = new Mensajeria(cliente, txtMensaje.getText());
        // añadir mensaje al destinatario
        for (int i = 0; i < inmobiliaria.getClientes().size(); i++) {
            if (inmobiliaria.getClientes().get(i).getCorreo().equals("ana@gmail.com")) {
                inmobiliaria.getClientes().get(i).enviarMensaje(m);
                file.saveToFileMensaje(inmobiliaria);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        correoSesionLabel.setText(cliente.getCorreo());
    }

    public void habilitarBotonRealizarBusqueda() {
        if (municipioRadioButton.isSelected() ^ precioRadioButton.isSelected()) {
            if (compraRadioButton.isSelected() ^ alquilerRadioButton.isSelected()) {
                if (precioDesdeTextField.getText().matches("\\d*") & precioHastaTextField.getText().matches("\\d*")
                        & precioDesdeTextField.getText().length() != 0 & precioHastaTextField.getText().length() != 0) {
                    realizarBusquedaButton.setEnabled(true);
                } else {
                    realizarBusquedaButton.setEnabled(false);
                }
            } else {
                realizarBusquedaButton.setEnabled(false);
            }
        } else {
            realizarBusquedaButton.setEnabled(false);
        }
    }

    public void habilitarBotonContratarRecomendacion() {
        if (!cvvTextField.getText().isEmpty() & !caducidadTextField.getText().isEmpty()
                & !nombreTarjetaTextField.getText().isEmpty() & !numeroTarjetaTextField.getText().isEmpty()) {
            contratarButton.setEnabled(true);
        } else {
            contratarButton.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InmueblesEncontradosLabel;
    private javax.swing.JRadioButton alquilerRadioButton;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JButton btnAdjuntarImagen;
    private javax.swing.JButton btnPublicarAnuncio;
    private javax.swing.JButton btnRealizarCambios;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel buscarInmueblePanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caducidadLabel;
    private javax.swing.JTextField caducidadTextField;
    private javax.swing.JButton cargarHistorialButton;
    private javax.swing.JComboBox<String> cbMunicipio;
    private javax.swing.JComboBox<String> cbNumHabitaciones;
    private javax.swing.JComboBox<String> cbtipoInmueble;
    private javax.swing.JRadioButton compraRadioButton;
    private javax.swing.JButton contactarButton;
    private javax.swing.JLabel contraseñaNuevaLabel;
    private javax.swing.JButton contratarButton;
    private javax.swing.JLabel correoSesionLabel;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel datosContactoLabel;
    private javax.swing.JLabel errorTarjetaLabel;
    private javax.swing.JLabel filtrosBusquedaLabel;
    private javax.swing.ButtonGroup filtrosButtonGroup;
    private javax.swing.JScrollPane fotoInmuebleScrollPane;
    private javax.swing.JTextArea fotoInmuebleTextArea;
    private javax.swing.JPanel historialMensajesPanel;
    private javax.swing.JTextArea historialMensajesTextArea;
    private javax.swing.JLabel infoAñadirInmuebleLabel;
    private javax.swing.JLabel infoBuscarFotoErorr;
    private javax.swing.JLabel infoBuscarInmuebleLabel;
    private javax.swing.JTextArea infoContactoTextArea;
    private javax.swing.JLabel infoEditarPerfilLabel;
    private javax.swing.JLabel infoHistorialLabel;
    private javax.swing.JLabel infoIngreseContraseñaLabel;
    private java.awt.List infoInmuebleList1;
    private javax.swing.JLabel informacionDelInmuebleLabel;
    private javax.swing.ButtonGroup inmuebleParaButtonGroup;
    private javax.swing.JLabel inmuebleparaLabel;
    private java.awt.List inmueblesEncontradosList;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFotoInmueble;
    private javax.swing.JLabel lblInfoDelInmu;
    private javax.swing.JLabel lblInfoDireccion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNumeroHabitaciones;
    private javax.swing.JLabel lblNumeroInmueble;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPreferencias;
    private javax.swing.JLabel lblSuperficie;
    private javax.swing.JLabel lblTipoInmueble;
    private javax.swing.JLabel municipioLabel;
    private javax.swing.JRadioButton municipioRadioButton;
    private javax.swing.JTextField municipiosTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreTarjetaLabel;
    private javax.swing.JTextField nombreTarjetaTextField;
    private javax.swing.JLabel numeroTarjetaLabel;
    private javax.swing.JTextField numeroTarjetaTextField;
    private javax.swing.JLabel pIsoLabel;
    private javax.swing.JPanel panelAñadir;
    private javax.swing.JPanel panelAñadirAnuncio;
    private javax.swing.JPanel panelBuscarInmueble;
    private javax.swing.JPanel panelContratar;
    private javax.swing.JPanel panelEditarPerfil;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.JLabel personasInteresadasLabel;
    private javax.swing.ButtonGroup precioButtonGroup;
    private javax.swing.JLabel precioDesdeLabel;
    private javax.swing.JTextField precioDesdeTextField;
    private javax.swing.JLabel precioHastaLabel;
    private javax.swing.JTextField precioHastaTextField;
    private javax.swing.JRadioButton precioRadioButton;
    private javax.swing.JRadioButton rbPrecioMensual;
    private javax.swing.JRadioButton rbPrecioTotal;
    private javax.swing.JButton realizarBusquedaButton;
    private javax.swing.JLabel repetirContraseñaLabel;
    private javax.swing.JLabel salirIIcon;
    private javax.swing.JLabel salirSesionLabel;
    private javax.swing.JTabbedPane tabEditarPerfil;
    private javax.swing.JLabel tipoTarjetaLabel;
    private javax.swing.JTextField txCodigoPostal;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFotoInmueble;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordActual;
    private javax.swing.JTextField txtPiso;
    private java.awt.TextField txtPrecio;
    private javax.swing.JPasswordField txtRepetirPassword;
    private java.awt.TextField txtSuperficie;
    // End of variables declaration//GEN-END:variables
}

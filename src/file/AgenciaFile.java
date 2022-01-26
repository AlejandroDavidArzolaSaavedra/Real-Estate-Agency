package file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import model.*;

public class AgenciaFile {

    String clientes = "Clientes.txt";
    String catalogo = "Catalogo.txt";
    String administradores = "Administradores.txt";
    String mensajes = "Mensajes.txt";

    public void saveToFileClientes(Inmobiliaria inmobiliaria) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(clientes);
            pw = new PrintWriter(fichero);
            int j, k;
            pw.write(inmobiliaria.getClientes().size() + "\n");
            Cliente client = null;

            for (j = 0; j < inmobiliaria.getClientes().size(); j++) {
                if (inmobiliaria.getClientes().get(j) instanceof Cliente) {
                    client = (Cliente) inmobiliaria.getClientes().get(j);
                    // se utilzará como separador el carácter / para cada dato del fichero
                    pw.write(client.getNombre() + "/" + client.getApellido() + "/" + client.getCorreo() + "/" + client.getPassword() + "/\n");
                    //guardo los anuncios de los clientes
                    Anuncio anuncio = null;
                    pw.write(inmobiliaria.getClientes().get(j).getAnuncios().size() + "\n");

                    for (k = 0; k < inmobiliaria.getClientes().get(j).getAnuncios().size(); k++) {
                        if (inmobiliaria.getClientes().get(j).getAnuncios().get(k) instanceof Anuncio) {
                            anuncio = (Anuncio) inmobiliaria.getClientes().get(j).getAnuncios().get(k);
                            pw.write(anuncio.getTitulo() + "/" + anuncio.getDescripcion() + "/" + anuncio.getFoto() + "/" + anuncio.getPrecio() + anuncio.getTipoOperacion() + "/" + anuncio.getInmueble().getTipoInmueble() + "/" + anuncio.getInmueble().getSuperficie() + "/" + anuncio.getInmueble().getTipoEstadoInmueble() + "/" + anuncio.getInmueble().getNumeroHabitaciones() + "/" + anuncio.getInmueble().getNumeroDeWc()
                                    + "/" + anuncio.getInmueble().getDireccion().getCalle() + "/" + anuncio.getInmueble().getDireccion().getPiso() + "/" + anuncio.getInmueble().getDireccion().getMunicipio() + "/" + anuncio.getInmueble().getDireccion().getNumero() + "/" + anuncio.getInmueble().getDireccion().getZipCode()
                                    + "/" + anuncio.getCoordinador().getCodigo() + "/" + anuncio.getCoordinador().getPassword() + "/\n");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void saveToFileMensaje(Inmobiliaria inmobiliaria) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(mensajes);
            pw = new PrintWriter(fichero);
            int j, k;
            Cliente client = null;
            for (j = 0; j < inmobiliaria.getClientes().size(); j++) {
                client = inmobiliaria.getClientes().get(j);
                pw.write(client.getCorreo() + "\n");
                List<Mensaje> mensajes = client.getFrom();
                pw.write(mensajes.size() + "\n");
                for (k = 0; k < mensajes.size(); k++) {
                    Mensaje mensaje = mensajes.get(k);
                    pw.write(mensaje.getFrom().getNombre() + "/" + mensaje.getFrom().getApellido() + "/" + mensaje.getFrom().getCorreo() + "/" + mensaje.getMensaje() + "/\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void saveToFileAdministradores(Inmobiliaria inmobiliaria) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(administradores);
            pw = new PrintWriter(fichero);
            int j, k;
            pw.write(inmobiliaria.getAdministradores().size() + "\n");
            Administrador admin = null;
            for (j = 0; j < inmobiliaria.getAdministradores().size(); j++) {
                admin = inmobiliaria.getAdministradores().get(j);
                pw.write(admin.getCodigo() + "/" + admin.getPassword() + "/\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void loadFromFile(Inmobiliaria inmobiliaria) {
        try {
            //cargo la información de los clientes y sus anuncios
            Scanner s = new Scanner(new File("Clientes.txt"));
            int i, k, c, n = s.nextInt();
            for (i = 0; i < n; i++) {
                s.nextLine();
                s.useDelimiter("/");
                Cliente cliente = new Cliente(s.next(), s.next(), s.next(), s.next());

                s.nextLine();
                s.useDelimiter("");
                int j, m = s.nextInt();
                for (j = 0; j < m; j++) {
                    s.nextLine();
                    s.useDelimiter("/");
                    String titulo = s.next();
                    String descripcion = s.next();
                    String foto = s.next();
                    int precio = Integer.parseInt(s.next());
                    String tipoOp = s.next();
                    String tipoInm = s.next();
                    Double superficie = Double.parseDouble(s.next());
                    String tipoEstadoInm = s.next();
                    int numeroHabitaciones = Integer.parseInt(s.next());
                    int numeroDeWc = Integer.parseInt(s.next());
                    Direccion direccion = new Direccion(s.next(), s.next(), s.next(), Integer.parseInt(s.next()), Integer.parseInt(s.next()));
                    Administrador coordinador = new Administrador(s.next(), s.next());

                    //cargo los enumerados
                    TipoEstadoInmueble tipoEstadoInmueble = null;
                    if (tipoEstadoInm.equals("NUEVAOBRA")) {
                        tipoEstadoInmueble = TipoEstadoInmueble.NUEVAOBRA;
                    } else if (tipoEstadoInm.equals("BUENESTADO")) {
                        tipoEstadoInmueble = TipoEstadoInmueble.BUENESTADO;
                    } else if (tipoEstadoInm.equals("PENDIENTEREFORMAR")) {
                        tipoEstadoInmueble = TipoEstadoInmueble.PENDIENTEREFORMAR;
                    }

                    TipoInmueble tipoInmueble = null;
                    if (tipoInm.equals("PISO")) {
                        tipoInmueble = TipoInmueble.PISO;
                    } else if (tipoInm.equals("CASA")) {
                        tipoInmueble = TipoInmueble.CASA;
                    } else if (tipoInm.equals("CHALET")) {
                        tipoInmueble = TipoInmueble.CHALET;
                    } else if (tipoInm.equals("APARTAMENTO")) {
                        tipoInmueble = TipoInmueble.APARTAMENTO;
                    }
                    TipoOperacion tipoOperacion = null;
                    if (tipoOp.equals("VENTA")) {
                        tipoOperacion = TipoOperacion.VENTA;
                    } else {
                        tipoOperacion = TipoOperacion.ALQUILER;
                    }

                    Inmueble inmueble = new Inmueble(tipoInmueble, superficie, numeroHabitaciones, numeroDeWc, tipoEstadoInmueble, direccion);

                    cliente.getAnuncios().add(new Anuncio(inmueble, precio, foto, titulo, descripcion, tipoOperacion, coordinador));
                    s.useDelimiter("");
                }
                //añado los clientes a la lista
                inmobiliaria.addCliente(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //cargo los administradores
        try {
              //cargo la información de los clientes y sus anuncios
            Scanner s = new Scanner(new File("Administradores.txt"));
            int i, n = s.nextInt();
            for (i = 0; i < n; i++) {
                s.nextLine();
                s.useDelimiter("/");
                Administrador administrador = new Administrador(s.next(), s.next());
                s.nextLine();
                s.useDelimiter("");
                inmobiliaria.addAdministrador(administrador);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //cargo los mensajes
        try {
            Scanner t = new Scanner(new File("Mensajes.txt"));
            int i, j;

            for (i = 0; i < inmobiliaria.getClientes().size(); i++) {
                Cliente cliente = inmobiliaria.getClientes().get(i);
                t.useDelimiter("");
                if (cliente.getCorreo().equals(t.nextLine())) {
                    int n = t.nextInt();
                    t.nextLine();
                    for (j = 0; j < n; j++) {
                        t.useDelimiter("/");
                        Cliente c = new Cliente(t.next(), t.next(), t.next());
                        Mensaje m = new Mensaje(c, t.next());
                        cliente.enviarMensaje(m);
                        t.nextLine();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

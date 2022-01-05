package file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import model.AnuncioFacade.Anuncio;
import model.CatalogoAnunciosComposite.CatalogoAnunciosComposite;
import model.Cliente;
import model.Inmobiliaria;
import model.Inmueble;
import model.TipologiaInmueble;
import model.Direccion;
import model.Mensajeria;
import model.Precio;
import model.PrecioAlquiler;
import model.PrecioVenta;

public class AgenciaFile {

    String name = "Agencia.txt";
    String mensajes = "Mensajes.txt";

    public void saveToFile(Inmobiliaria inmobiliaria) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(name);
            pw = new PrintWriter(fichero);
            int j, k;
            pw.write(inmobiliaria.getClientes().size() + "\n");
            Cliente client = null;

            for (j = 0; j < inmobiliaria.getClientes().size(); j++) {
                if (inmobiliaria.getClientes().get(j) instanceof Cliente) {
                    client = (Cliente) inmobiliaria.getClientes().get(j);
                    // se utilzará como separador el carácter / para cada dato del fichero
                    pw.write(client.getNombre() + "/" + client.getApellido() + "/" + client.getCorreo() + "/" + client.getPassword() + "/\n");

                    Anuncio anuncio = null;
                    pw.write(inmobiliaria.getClientes().get(j).getAnuncios().getAnunciosList().size() + "\n");

                    for (k = 0; k < inmobiliaria.getClientes().get(j).getAnuncios().getAnunciosList().size(); k++) {
                        if (inmobiliaria.getClientes().get(j).getAnuncios().getAnunciosList().get(k) instanceof Anuncio) {
                            anuncio = (Anuncio) inmobiliaria.getClientes().get(j).getAnuncios().getAnunciosList().get(k);
                            pw.write(anuncio.getInmueble().getTipoInmueble() + "/" + anuncio.getInmueble().getSuperficie() + "/" + anuncio.getInmueble().getNumeroHabitaciones()
                                    + "/" + anuncio.getDireccion().getCalle() + "/" + anuncio.getDireccion().getPiso() + "/" + anuncio.getDireccion().getMunicipio() + "/" + anuncio.getDireccion().getNumero() + "/" + anuncio.getDireccion().getZipCode()
                                    + "/" + anuncio.getPrecio().getTipo() + "/" + anuncio.getPrecio().getPrecio() + "/" + anuncio.getFoto() + "/\n");
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
                List<Mensajeria> mensajes = client.getFrom();
                pw.write(mensajes.size() + "\n");
                for (k = 0; k < mensajes.size(); k++) {
                    Mensajeria mensaje = mensajes.get(k);
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

    public void loadFromFile(Inmobiliaria inmobiliaria) {
        try {
            CatalogoAnunciosComposite catalogo = new CatalogoAnunciosComposite();
            Scanner s = new Scanner(new File("Agencia.txt"));
            int i, k, c, n = s.nextInt();
            for (i = 0; i < n; i++) {
                s.nextLine();
                s.useDelimiter("/");
                Cliente cliente = new Cliente(s.next(), s.next(), s.next(), s.next());

                s.nextLine();
                s.useDelimiter("");
                int j, m = s.nextInt();
                Inmueble inmueble = null;
                for (j = 0; j < m; j++) {
                    s.nextLine();
                    s.useDelimiter("/");
                    String tipo = s.next();
                    if (tipo.equals("PISO")) {
                        inmueble = new Inmueble(TipologiaInmueble.PISO, Double.parseDouble(s.next()), Integer.parseInt(s.next()));
                    } else if (tipo.equals("CASA")) {
                        inmueble = new Inmueble(TipologiaInmueble.CASA, Double.parseDouble(s.next()), Integer.parseInt(s.next()));
                    } else if (tipo.equals("CHALET")) {
                        inmueble = new Inmueble(TipologiaInmueble.CHALET, Double.parseDouble(s.next()), Integer.parseInt(s.next()));
                    } else if (tipo.equals("APARTAMENTO")) {
                        inmueble = new Inmueble(TipologiaInmueble.APARTAMENTO, Double.parseDouble(s.next()), Integer.parseInt(s.next()));
                    }
                    Direccion direccion = new Direccion(s.next(), s.next(), s.next(), Integer.parseInt(s.next()), Integer.parseInt(s.next()));
                    Precio precio = null;
                    if (s.next().equals("Alquiler")) {
                        precio = new PrecioAlquiler(Integer.parseInt(s.next()));

                    } else {
                        precio = new PrecioVenta(Integer.parseInt(s.next()));
                    }
                    cliente.getAnuncios().addAnuncios(inmueble, direccion, precio, s.next());
                    s.useDelimiter("");
                }
                inmobiliaria.addCliente(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Scanner t = new Scanner(new File("Mensajes.txt"));
            int i, j;

            for (i = 0; i < inmobiliaria.getClientes().size(); i++) {
                Cliente cliente = inmobiliaria.getClientes().get(i);
                t.useDelimiter("");
                if (cliente.getCorreo().equals(t.nextLine())) {
                    System.out.println(cliente.getCorreo());
                    int n = t.nextInt();
                    t.nextLine();
                    for (j = 0; j < n; j++) {
                        t.useDelimiter("/");
                        Cliente c = new Cliente(t.next(), t.next(), t.next());
                        Mensajeria m = new Mensajeria(c, t.next());
                        cliente.enviarMensaje(m);
                        t.nextLine();
                        System.out.println(m);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

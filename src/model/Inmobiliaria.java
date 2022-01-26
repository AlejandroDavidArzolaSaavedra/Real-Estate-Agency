package model;

import java.util.ArrayList;

/**
 * Clase para representar la inmobiliaria
 */
public class Inmobiliaria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Administrador> administradores;
    //private final CatalogoAnuncios catalogo;
    private ArrayList<CatalogoAnuncios> catalogo;

    /**
     * Constructor vacio de la inimobiliaria
     */
    public Inmobiliaria() {
        this.clientes = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    /**
     * Getter del catalogo
     *
     * @return catalogo de anuncios del cliente
     */
    public ArrayList<CatalogoAnuncios> getCatalogo() {
        return catalogo;
    }

    /**
     * Getter del los clientes de la inmobiliaria
     *
     * @return lista de clientes de la inmobiliaria
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Setter del los clientes de la inmobiliaria
     *
     * @param clientes lista de clientes de la inmobiliaria
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    public void addCliente(String nombre, String apellido, String correo, String password) {
        Cliente newCliente = new Cliente(nombre, apellido, correo, password);
        clientes.add(newCliente);
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void addAdministrador(String password, String codigo) {
        Administrador newAdmin = new Administrador(password, codigo);
        administradores.add(newAdmin);
    }

    public void addAdministrador(Administrador c) {
        administradores.add(c);
    }

    public void removeCliente(Cliente c) {
        clientes.remove(c);
    }

}

package model;

import java.util.ArrayList;
/**
 * Clase para representar la inmobiliaria
 */
public class Inmobiliaria {

    private ArrayList<Cliente> clientes;
    private final CatalogoAnuncios catalogo;
    
    /**
     * Constructor vacio de la inimobiliaria
     */
    public Inmobiliaria() {
        this.clientes = new ArrayList<>();
        this.catalogo = new CatalogoAnuncios();
    }
    
    /**
     * Getter del catalogo
     * @return catalogo de anuncios del cliente
     */
    public CatalogoAnuncios getCatalogo() {
        return catalogo;
    }
    
    /**
     * Getter del los clientes de la inmobiliaria
     * @return lista de clientes de la inmobiliaria
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Setter del los clientes de la inmobiliaria
     * @param clientes lista de clientes de la inmobiliaria
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(String nombre, String apellido, String correo, String password) {
        Cliente newCliente = new Cliente(nombre, apellido, correo, password);
        clientes.add(newCliente);
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }
}

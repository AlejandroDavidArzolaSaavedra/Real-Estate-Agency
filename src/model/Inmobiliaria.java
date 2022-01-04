package model;

import java.util.ArrayList;
import model.CatalogoAnunciosComposite.CatalogoAnuncios;
import model.CatalogoAnunciosComposite.CatalogoAnunciosComposite;

public class Inmobiliaria {

    private ArrayList<Cliente> clientes;
    private CatalogoAnunciosComposite catalogo;

    public Inmobiliaria() {
        this.clientes = new ArrayList<Cliente>();
        this.catalogo = new CatalogoAnunciosComposite();
    }
    
    public CatalogoAnunciosComposite getCatalogo() {
        return catalogo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

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

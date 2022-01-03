<<<<<<< Upstream, based on origin/master
package model;

import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Cliente> clientes;

    public Inmobiliaria() {
        clientes = new ArrayList<Cliente>();
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
=======

package model;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {
   
    private ArrayList<Cliente> clientes;

    public Inmobiliaria() {
        clientes = new ArrayList<Cliente>();
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
    
>>>>>>> 5491f10 veersion 2.0
}

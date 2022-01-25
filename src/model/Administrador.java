package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar los administradores de la inmobiliaria
 */
public class Administrador {
    private final String password;
    private final String codigo;
    // Asociacion
    private List<Anuncio> anuncios = new ArrayList<>();
    private Cliente cliente;
    
    public Administrador(String password, String codigo) {
        this.password = password;
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public String getCodigo() {
        return codigo;
    }
}

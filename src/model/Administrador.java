package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar los administradores de la inmobiliaria
 */
public class Administrador {

    private final String codigo;
    private final String password;
    // Asociacion
    private List<Anuncio> anuncios = new ArrayList<>();

    public Administrador(String codigo, String password) {
        this.codigo = codigo;
        this.password = password;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPassword() {
        return password;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }
}

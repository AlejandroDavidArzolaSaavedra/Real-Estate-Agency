package model.AnuncioFacade;

import model.CatalogoAnunciosComposite.CatalogoAnuncios;
import model.Direccion;
import model.Inmueble;
import model.Precio;

public class Anuncio {

    private String nombre;
    private String Descripcion;
    private String foto;

    // Relaciones
    Inmueble inmueble;
    Direccion direccion;
    Precio precio;
    CatalogoAnuncios catalogoAnuncio;

    // Facade
    AnuncioArrendador anuncioArrendador = new AnuncioArrendador();
    AnuncioArrendatario anuncioArrendatario;
    AnuncioComprador anuncioComprador;
    AnuncioVendedor anuncioVendedor;

    public Anuncio(Inmueble inmueble, Direccion direccion, Precio precio) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.direccion = direccion;
    }

    public Anuncio(Inmueble inmueble, Direccion direccion, Precio precio, String foto) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.direccion = direccion;
        this.foto = foto;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setDireccion(String calle, String piso, String municipio, int numero) {
        this.direccion.calle = calle;
        this.direccion.piso = piso;
        this.direccion.municipio = municipio;
        this.direccion.numero = numero;
    }

    @Override
    public String toString() {
        return "Tipo de Inmueble : " + inmueble.getTipoInmueble() + ", en "
                + direccion.getMunicipio() + " con precio " + precio.getPrecio();
    }

    public void verificar() {
        this.anuncioArrendador.mirar();
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}

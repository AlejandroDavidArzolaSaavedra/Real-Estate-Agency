package model;
/**
 * Clase para representar los anuncios del inmueble
 */
public class Anuncio {

    private String foto;
    Inmueble inmueble;
    Direccion direccion;
    Precio precio;
    CatalogoAnuncios catalogoAnuncio;

    /**
     * Constructor del anuncio
     * @param inmueble tipo del inmueble del anuncio
     * @param direccion Direccion del inmueble
     * @param precio precio del anuncio
     * @param foto direccion url de la foto del anuncio
     */
    public Anuncio(Inmueble inmueble, Direccion direccion, Precio precio, String foto) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.direccion = direccion;
        this.foto = foto;
    }
    
    /**
     * Getter del tipo del inmueble
     * @return el tipo del inmueble
     */
    public Inmueble getInmueble() {
        return inmueble;
    }
    
    /**
     * Getter del precio del inmueble
     * @return el precio del inmueble
     */
    public Precio getPrecio() {
        return precio;
    }
    
    /**
     * Getter de la direccion del inmueble
     * @return la direccion del inmueble
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Getter de la foto de inmueble
     * @return la foto de inmueble
     */
    public String getFoto() {
        return foto;
    }
    
    /**
     * Setter de la direccion entera
     * @param calle calle del inmueble
     * @param piso piso del inmueble
     * @param municipio municipio del inmueble
     * @param numero numero del inmueble 
     */
    public void setDireccion(String calle, String piso, String municipio, int numero) {
        this.direccion.calle = calle;
        this.direccion.piso = piso;
        this.direccion.municipio = municipio;
        this.direccion.numero = numero;
    }
    
    /**
     * Setter de la foto
     * @param foto direccion de la foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    /**
     * toString() del anuncio
     * @return la direccion del anuncio
     */
    @Override
    public String toString() {
        return " Direccion: "+getDireccion();
    }
}

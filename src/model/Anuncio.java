package model;
/**
 * Clase para representar los anuncios del inmueble
 */
public class Anuncio {
    private String titulo;
    private String descripcion;
    private String foto;
    private  final Inmueble inmueble;
    private  final Direccion direccion;
    private int precio;
    private CatalogoAnuncios catalogoAnuncio;
    private TipoOperacion tipoOperacion;

    /**
     * Constructor del anuncio
     * @param inmueble tipo del inmueble del anuncio
     * @param direccion Direccion del inmueble
     * @param precio precio del anuncio
     * @param foto direccion url de la foto del anuncio
     */
    public Anuncio(Inmueble inmueble, Direccion direccion, int precio, String foto, String titulo,String descripcion, TipoOperacion tipoOperacion) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.direccion = direccion;
        this.foto = foto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoOperacion = tipoOperacion;
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
    public int getPrecio() {
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
     * Getter del titulo del anuncio
     * @return el titulo del anuncio
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Getter de la descripcion del anuncio
     * @return la descripcion del anuncio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Getter del tipo de operacion del inmueble
     * @return el tipo de operacion del inmueble
     */
    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
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
     * Setter del titulo del anuncio
     * @param titulo titulo del anuncio
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Setter de la descripcion del anuncio
     * @param descripcion descripcion del anuncio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Setter del precio del anuncio
     * @param precio precio del anuncio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /**
     * Setter del tipo de operacion del anuncio
     * @param tipoOperacion tipo de operacion del anuncio
     */
    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    
    /**
     * toString() del anuncio
     * @return la direccion del anuncio
     */
    @Override
    public String toString() {
        return " Direccion: " + getDireccion();
    }
}

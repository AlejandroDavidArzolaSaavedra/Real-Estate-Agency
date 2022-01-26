package model;

/**
 * Clase para representar los anuncios del inmueble
 */
public class Anuncio {

    private String titulo;
    private String descripcion;
    private String foto;
    private int precio;
    private TipoOperacion tipoOperacion;
    private Inmueble inmueble;
    private Administrador coordinador;

    /**
     * Constructor del anuncio sin coordinador
     *
     * @param inmueble
     * @param precio
     * @param foto
     * @param titulo
     * @param descripcion
     * @param tipoOperacion
     */
    public Anuncio(Inmueble inmueble, int precio, String foto, String titulo, String descripcion, TipoOperacion tipoOperacion) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.foto = foto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoOperacion = tipoOperacion;
        this.coordinador = new Administrador("Sin coordinador", "");
    }

    /**
     * Constructor de anuncio con coordinador
     *
     * @param inmueble
     * @param precio
     * @param foto
     * @param titulo
     * @param descripcion
     * @param tipoOperacion
     * @param coordinador
     */
    public Anuncio(Inmueble inmueble, int precio, String foto, String titulo, String descripcion, TipoOperacion tipoOperacion, Administrador coordinador) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.foto = foto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoOperacion = tipoOperacion;
        this.coordinador = new Administrador("Sin coordinador", "");
    }

    /**
     * Getter del tipo del inmueble
     *
     * @return el tipo del inmueble
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    /**
     * Getter del precio del inmueble
     *
     * @return el precio del inmueble
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Getter de la foto de inmueble
     *
     * @return la foto de inmueble
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Getter del titulo del anuncio
     *
     * @return el titulo del anuncio
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Getter de la descripcion del anuncio
     *
     * @return la descripcion del anuncio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Getter del tipo de operacion del inmueble
     *
     * @return el tipo de operacion del inmueble
     */
    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Setter de la foto
     *
     * @param foto direccion de la foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * Setter del titulo del anuncio
     *
     * @param titulo titulo del anuncio
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Setter de la descripcion del anuncio
     *
     * @param descripcion descripcion del anuncio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Setter del precio del anuncio
     *
     * @param precio precio del anuncio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Setter del tipo de operacion del anuncio
     *
     * @param tipoOperacion tipo de operacion del anuncio
     */
    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    /**
     * Setter del coordinador del anuncio
     *
     * @param coordinador coordinador a establecer en el anuncio
     */
    public void setCoordinador(Administrador coordinador) {
        this.coordinador = coordinador;
    }

    /**
     * Getter del coordinador del anuncio
     *
     * @return coordinador del anuncio
     */
    public Administrador getCoordinador() {
        return coordinador;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", foto=" + foto + ", precio=" + precio + ", tipoOperacion=" + tipoOperacion + ", inmueble=" + inmueble + ", coordinador=" + coordinador + '}';
    }

}

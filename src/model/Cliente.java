package model;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase para representar los clientes de la inmobiliaria
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private CatalogoAnuncios anuncios = new CatalogoAnuncios();
    private List<Mensajeria> from = new ArrayList<>();
    
    /**
     * Constructor del cliente
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     * @param password contraseña del cliente
     */
    public Cliente(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }
    
    /**
     * Constructor auxiliar del cliente
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     * @param password contraseña del cliente
     * @param anuncios catalogo de anuncnios del cliente
     */
    public Cliente(String nombre, String apellido, String correo, String password, CatalogoAnuncios anuncios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
          this.anuncios = anuncios;
    }
    
    /**
     * Constructor auxiliar para no pasar informacion de la contraseña
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     */
    public Cliente(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = "";
        this.anuncios = null;
        this.from = null;
    }
    
    /**
     * Getter del nombre
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Getter del apellido
     * @return apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * Getter del correo
     * @return correo del cliente
     */
    public String getCorreo() {
        return correo;
    }
    
    /**
     * Getter de la contraseña
     * @return la contraseña del cliente
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Getter de los mensajes del cliente
     * @return los mensajes del clientes
     */
    public List<Mensajeria> getFrom() {
        return from;
    }
    
    /**
     * Getter del catalogo de anuncios del cliente
     * @return catalogo de anuncios del cliente
     */
    public CatalogoAnuncios getAnuncios() {
        return anuncios;
    }
    
    /**
     * Setter del nombre del cliente
     * @param nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Setter del apellido del cliente
     * @param apellido del cleinte
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Setter del correo del cliente
     * @param correo del cliente
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * Setter de la contraseña del cliente
     * @param password contraseña nueva del cliente
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Setter del catalogo de anuncios del cliente
     * @param anuncios catalogo de anuncios del cliente
     */
    public void setAnuncios(CatalogoAnuncios anuncios) {
        this.anuncios = anuncios;
    }

    /**
     * Setter de la lista de  mensajes del cliente
     * @param from la lista de mensajes
     */
    public void setFrom(List<Mensajeria> from) {
        this.from = from;
    }  
    
    /**
     * Metodo para enviar un mensaje a un cliente
     * @param mensaje a enviar del cliente interesado 
     */
    public void enviarMensaje(Mensajeria mensaje) {
        from.add(mensaje);
    }
    
    /**
     * toString() del cliente
     * @return el nombre y apellido del cliente
     */
    @Override
    public String toString() {
        return nombre +" "+ apellido + ", esta interesado";
    }
}

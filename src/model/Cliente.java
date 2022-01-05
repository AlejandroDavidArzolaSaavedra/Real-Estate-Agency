package model;

import java.util.ArrayList;
import java.util.List;
import model.AnuncioFacade.Anuncio;
import model.CatalogoAnunciosComposite.CatalogoAnunciosComposite;

public class Cliente {

    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private CatalogoAnunciosComposite anuncios = new CatalogoAnunciosComposite();
    private List<Mensajeria> from = new ArrayList<Mensajeria>();// mensajes recibidos
    private List<Mensajeria> to = new ArrayList<Mensajeria>();;// Enviar mensaje
    
    
    public void imprimirMensajesRecibidos(){
        for( Mensajeria mensajesFrom : from) {
            System.out.println(mensajesFrom);
        }
    }
   
    public void elimimnarMensajesRecibidos(Mensajeria mensaje){
        from.remove(mensaje);
    }
    
    public void enviarMensaje(Mensajeria mensaje){
        to.add(mensaje);
    }
    
    public Cliente(String nombre, String apellido, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        CatalogoAnunciosComposite anuncios = new CatalogoAnunciosComposite();
    }
    
        public Cliente(String nombre, String apellido, String correo, String password, CatalogoAnunciosComposite anuncios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.anuncios = anuncios;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CatalogoAnunciosComposite getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(CatalogoAnunciosComposite anuncios) {
        this.anuncios = anuncios;
    }

}

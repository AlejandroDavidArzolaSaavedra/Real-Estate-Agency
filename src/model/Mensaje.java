package model;

/**
 * Clase para representar los mensajes que recibe el
 * cliente de otras personas de la inmobiliaria
 */
public class Mensaje {

    Cliente from;
    private final String texto;
    
    /**
     * Constructor del mensaje
     * @param from persona de la que recibes mensajes
     * @param mensaje mensaje que ha enviado un cliente interesado
     */
    public Mensaje(Cliente from, String mensaje) {
        this.from = from;
        this.texto = mensaje;
    }

    /**
     * Getter del cliente interesado
     * @return clientes interesado
     */
    public Cliente getFrom() {
        return this.from;
    }
    
    /**
     * Setter del cliente interesado
     * @param from cliente interesado
     */
    public void setFrom(Cliente from) {
        this.from = from;
    }
    
    /**
     * Getter del cliente interesado
     * @return clientes interesados
     */
    public String getMensaje() {
        return this.texto;
    }
}

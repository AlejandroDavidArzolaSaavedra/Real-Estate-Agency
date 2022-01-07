package model;
/**
 * Clase para representar los tipos precios de la inmobiliaria
 */
public abstract class Precio {
    private final int precio;
    
    /**
     * Constructor del precio
     * @param precio del inmueble
     */
    public Precio(int precio) {
        this.precio = precio;
    }
    
    /**
     * Getter del precio
     * @return precio del inmueble 
     */
    public int getPrecio() {
        return this.precio;
    }
    // Clase que informa sobre el tipo de pago del inmueble
    public abstract String getTipo();
}

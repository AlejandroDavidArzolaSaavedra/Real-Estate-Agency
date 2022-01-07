package model;
/**
 * Clase para representar precio de tipo alquilar del inmueble
 */
public class PrecioAlquiler extends Precio {
    
    /**
     * Constructor del precio de alquiler
     * @param precio precio mensual 
     */
    public PrecioAlquiler(int precio) {
        super(precio);
    }
    
    /**
     * toString() del precio mensual
     * @return precio mensual 
     */
    @Override
    public String toString() {
        return "Precio Mensual = " + getPrecio();
    }

    /**
     * Metodo para representar inmuebles ofrecidos para alquiler
     * @return tipo de precio del inmueble a alquilar
     */
    @Override
    public String getTipo() {
        return "Alquiler";
    }
}

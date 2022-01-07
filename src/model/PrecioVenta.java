package model;
/**
 * Clase para representar los precios de los inmuebles para venderlos
 */
public class PrecioVenta extends Precio {

    /**
     * Constructor del precio de venta
     * @param precio precio total
     */    
    public PrecioVenta(int precio) {
        super(precio);
    }
    
    /**
     * toString() del precio anual
     * @return precio total 
     */
    @Override
    public String toString() {
        return "Precio Total = " + getPrecio();
    }
    
    /**
     * Metodo para representar inmuebles ofrecidos para venta
     * @return tipo de precio del inmueble a vender
     */
    @Override
    public String getTipo() {
        return "Venta";
    }
}

package model;


public class PrecioAlquiler extends Precio{
    
   private int precioMensual;
   
   public PrecioAlquiler(int precio) {
        this.precioMensual = precio;
    }
   
    @Override
    public int getPrecio() {
        return this.precioMensual;
    }
    
    public void setPrecioMensual(int precio) {
        this.precioMensual = precio;
    }
}


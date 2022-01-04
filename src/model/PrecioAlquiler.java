package model;


public class PrecioAlquiler extends Precio{
    
   private int precioMensual;
   
   public PrecioAlquiler(int precio) {
        this.precioMensual = precio;
    }

    @Override
    public String toString() {
        return "Precio Mensual = " + getPrecio();
    }
   
    @Override
    public int getPrecio() {
        return this.precioMensual;
    }
    
    public void setPrecioMensual(int precio) {
        this.precioMensual = precio;
    }
}


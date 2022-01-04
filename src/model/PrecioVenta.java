package model;

public class PrecioVenta extends Precio {

    private int precioTotal;

    public PrecioVenta(int precio) {
        this.precioTotal = precio;
    }

    @Override
    public String toString() {
        return "Precio Total=" + getPrecio();
    }

    @Override
    public int getPrecio() {
        return this.precioTotal;
    }

    public void setPrecioMensual(int precio) {
        this.precioTotal = precio;
    }

    @Override
    public String getTipo() {
        return "Venta";
    }
}

package model;

public class Inmueble {

    private final Direccion direccion;
    private TipologiaInmueble tipoInmueble;
    private Double superficie;
    private int numeroHabitaciones;
    private String ubicacion;

    public Inmueble(TipologiaInmueble tipoInmueble, Double superficie, int numeroHabitaciones, String ubicacion, Direccion direccion) {
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
    }

    public TipologiaInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(TipologiaInmueble tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

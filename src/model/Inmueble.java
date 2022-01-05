
package model;


public class Inmueble {
    private TipologiaInmueble tipoInmueble;
    private Double superficie;
    private String ubicacion;
    private int numeroHabitaciones;
    
    public Inmueble(TipologiaInmueble tipoInmueble, Double superficie, int numeroHabitaciones) {
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
    }
    
    @Override
    public String toString() {
        return "Tipo Inmueble = " + tipoInmueble + 
                    ", superficie ="  + superficie + 
                        ", numeroHabitaciones = " + numeroHabitaciones;
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
}

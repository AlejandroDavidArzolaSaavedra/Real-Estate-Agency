package model;
/**
 * Clase para representar el inmueble de los anuncios
 */
public class Inmueble {
    private final TipologiaInmueble tipoInmueble;
    private final Double superficie;
    private final int numeroHabitaciones;
    
    /**
     * Constructor del inmueble
     * @param tipoInmueble tipo del inimueble
     * @param superficie superficie del inmueble
     * @param numeroHabitaciones numero de habitaciones del inimueble
     */
    public Inmueble(TipologiaInmueble tipoInmueble, Double superficie, int numeroHabitaciones) {
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
    }
    
    /**
     * Getter del tipo  inmueble
     * @return el tipo de inmueble
     */
    public TipologiaInmueble getTipoInmueble() {
        return this.tipoInmueble;
    }

    /**
     * Getter de la superficie del inmueble
     * @return el tipo de inmueble
     */
    public Double getSuperficie() {
        return this.superficie;
    }
    
    /**
     * Getter del numero de habitaciones  inmueble
     * @return el numero de habitaciones
     */
    public int getNumeroHabitaciones() {
        return this.numeroHabitaciones;
    }

    /**
     * toString() del inmueble
     * @return el inmueble con la superficie y el numero de habitaciones
     */
    @Override
    public String toString() {
        return "Tipo Inmueble = " + this.tipoInmueble + 
                    ", superficie ="  + this.superficie + 
                        ", numeroHabitaciones = " + this.numeroHabitaciones;
    }
}

package model;
/**
 * Clase para representar el inmueble de los anuncios
 */
public class Inmueble {
    private final Double superficie;
    private final TipoInmueble tipoInmueble;
    private final TipoEstadoInmueble tipoEstadoInmueble;
    private final int numeroHabitaciones;
    private final int numeroDeWc;
    
    /**
     * Constructor del inmueble
     * @param tipoInmueble tipo del inmueble
     * @param superficie superficie del inmueble
     * @param numeroHabitaciones numero de habitaciones del inimueble
     * @param numeroDeWc numero de wc del inmueble
     * @param tipoEstadoInmueble tipo del estado del inmueble
     */
    public Inmueble(TipoInmueble tipoInmueble, Double superficie, int numeroHabitaciones, int numeroDeWc, TipoEstadoInmueble tipoEstadoInmueble) {
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroDeWc = numeroDeWc;
        this.tipoEstadoInmueble = tipoEstadoInmueble;
    }
    
    /**
     * Getter del tipo  inmueble
     * @return el tipo de inmueble
     */
    public TipoInmueble getTipoInmueble() {
        return this.tipoInmueble;
    }
    
    /**
     * Getter del estado del inmueble
     * @return el estado de inmueble
     */
    public TipoEstadoInmueble getTipoEstadoInmueble() {
        return tipoEstadoInmueble;
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
     * Getter del numero de wc
     * @return la cantidad de wc del inmueble
     */
    public int getNumeroDeWc() {
        return numeroDeWc;
    }
    
    /**
     * toString() del inmueble
     * @return el inmueble con la superficie y el numero de habitaciones
     */
    @Override
    public String toString() {
        return "Tipo Inmueble = " + this.tipoInmueble +
                ", estado ="  + this.tipoEstadoInmueble + 
                    ", superficie ="  + this.superficie + 
                        ", numeroHabitaciones = " + this.numeroHabitaciones +
                            ", numeroBaños ="  + this.numeroDeWc;
    }
}

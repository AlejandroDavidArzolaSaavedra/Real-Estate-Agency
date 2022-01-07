package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Clase para representar los catalogo de anuncios de cada cliente
 */
public class CatalogoAnuncios{
    private final List<Anuncio> anuncios = new ArrayList<>();
    
    /**
     * Constructor vacio del catalogo de anuncios
     */
    public CatalogoAnuncios() {
    }
    
    /**
     * Getter de la lista de anuncios ordenados por precio
     * @return lista de  anuncios ordenador por precio
     */
    public List<Anuncio> getListAnunciosOrdenadoPorPrecio(){
        List<Anuncio> anunciosOrdenadosPorPrecio = new ArrayList<>();
        anunciosOrdenadosPorPrecio.addAll(anuncios);
        Collections.sort(anunciosOrdenadosPorPrecio, (c1, c2) -> (int) (c1.getPrecio().getPrecio() - c2.getPrecio().getPrecio()));
        return anunciosOrdenadosPorPrecio;
    }

    /**
     * Metodo auxiliar para añadir anuncios al cliente
     * @param inmueble inmueble del cliente
     * @param direccion del inmueble del cliente
     * @param precio del anuncio
     * @param foto del inmueble
     */
    public void addAnuncios(Inmueble inmueble, Direccion direccion, Precio precio, String foto) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, direccion, precio, foto);
        if (comprobar(anuncioNuevo)) {
            this.anuncios.add(anuncioNuevo);
        }
    }
    
    /**
     * Metodo auxiliar para añadir anuncios al cliente
     * @param anuncios anuncio a añadir
     */
    public void addAnuncios(Anuncio anuncios) {
        this.anuncios.add(anuncios);
    }
    
    /**
     * Getter de la lista de anuncios del cliente
     * @return lista de anuncios del cliente
     */
    public List<Anuncio> getAnunciosList() {
        return this.anuncios;
    }
    
    /*
     * Metodo auxiliar para que no se repitan 2 anuncios iguales de un cliente
     * se comparan el numero la calle el zipcode y el municipio del inmueble
     * @param anuncioNuevo anuncio a comparar
     * @return verdadero o falso si son iguales los anuncios
     */
    public boolean comprobar(Anuncio anuncioNuevo) {
        return anuncios.stream().noneMatch((anunciosVisitados) -> (anunciosVisitados.getDireccion().getCalle().equals(anuncioNuevo.getDireccion().getCalle())
                & anunciosVisitados.getDireccion().getNumero() == anuncioNuevo.getDireccion().getNumero()
                & anunciosVisitados.getDireccion().getZipCode() == anuncioNuevo.getDireccion().getZipCode()
                & anunciosVisitados.getDireccion().getMunicipio().equals(anuncioNuevo.getDireccion().getMunicipio())));
    }
}
    
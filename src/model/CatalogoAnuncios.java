package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase para representar los catalogo de anuncios de cada cliente
 */
public class CatalogoAnuncios {

    private TipoCatalogo tipoCatalogo;
    private ArrayList<Anuncio> anuncios = new ArrayList<>();

    public CatalogoAnuncios(TipoCatalogo tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }

    public CatalogoAnuncios(TipoCatalogo tipoCatalogo, ArrayList<Anuncio> anuncios) {
        this.tipoCatalogo = tipoCatalogo;
        this.anuncios = anuncios;
    }
    
    /**
     * Getter de la lista de anuncios ordenados por precio
     *
     * @return lista de anuncios ordenador por precio
     */
    public List<Anuncio> getListAnunciosOrdenadoPorPrecio() {
        List<Anuncio> anunciosOrdenadosPorPrecio = new ArrayList<>();
        anunciosOrdenadosPorPrecio.addAll(anuncios);
        Collections.sort(anunciosOrdenadosPorPrecio, (c1, c2) -> (int) (c1.getPrecio() - c2.getPrecio()));
        return anunciosOrdenadosPorPrecio;
    }

    public TipoCatalogo getTipoCatalogo() {
        return tipoCatalogo;
    }

    public void addAnuncios(Inmueble inmueble, int precio, String foto, String titulo, String descripcion, TipoOperacion tipoOperacion) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, precio, foto, titulo, descripcion, tipoOperacion);
        if (comprobar(anuncioNuevo)) {
            this.anuncios.add(anuncioNuevo);
        }
    }

    /**
     * Metodo auxiliar para añadir anuncios al cliente
     *
     * @param anuncios anuncio a añadir
     */
    public void addAnuncios(Anuncio anuncios) {
        this.anuncios.add(anuncios);
    }

    /**
     * Metodo auxiliar para añadir anuncios al cliente
     *
     * @param anuncios anuncio a añadir
     */
    public void removeAnuncios(Anuncio anunciosRemove) {
        Anuncio anuncioAux = null;
        for (Anuncio anuncio : anuncios) {
            if (comprobar(anunciosRemove)) {
                anuncioAux = anuncio;
            }
        }
        anuncios.remove(anunciosRemove);
    }
    
        /**
     * Metodo auxiliar para añadir anuncios al cliente
     *
     * @param anuncios anuncio a añadir
     */
    public void removeAnuncio(int i) {
        anuncios.remove(i);
    }


    /**
     * Getter de la lista de anuncios del cliente
     *
     * @return lista de anuncios del cliente
     */
    public List<Anuncio> getAnuncios() {
        return this.anuncios;
    }

    /*
     * Metodo auxiliar para que no se repitan 2 anuncios iguales de un cliente
     * se comparan el numero la calle el zipcode y el municipio del inmueble
     * @param anuncioNuevo anuncio a comparar
     * @return verdadero o falso si son iguales los anuncios
     */
    public boolean comprobar(Anuncio anuncioNuevo) {
        return anuncios.stream().noneMatch((anunciosVisitados) -> (anunciosVisitados.getInmueble().getDireccion().getCalle().equals(anuncioNuevo.getInmueble().getDireccion().getCalle())
                & anunciosVisitados.getInmueble().getDireccion().getNumero() == anuncioNuevo.getInmueble().getDireccion().getNumero()
                & anunciosVisitados.getInmueble().getDireccion().getZipCode() == anuncioNuevo.getInmueble().getDireccion().getZipCode()
                & anunciosVisitados.getInmueble().getDireccion().getMunicipio().equals(anuncioNuevo.getInmueble().getDireccion().getMunicipio())));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CatalogoAnuncios other = (CatalogoAnuncios) obj;
        if (this.tipoCatalogo != other.tipoCatalogo) {
            return false;
        }
        return true;
    }
    
    
}

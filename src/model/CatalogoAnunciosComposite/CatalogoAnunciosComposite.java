package model.CatalogoAnunciosComposite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.AnuncioFacade.Anuncio;
import model.Cliente;
import model.Direccion;
import model.Inmueble;
import model.Precio;

public class CatalogoAnunciosComposite extends CatalogoAnuncios {

    public CatalogoAnunciosComposite() {
    }

    @Override
    public void addAnuncios(Inmueble inmueble, Direccion direccion, Precio precio) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, direccion, precio);
        if (comprobar(anuncioNuevo)) {
            this.anuncios.add(anuncioNuevo);
        }
    }
    
    public List<Anuncio> getListAnunciosOrdenadoPorPrecio(){
        List<Anuncio> anunciosOrdenadosPorPrecio = new ArrayList<>();
        anunciosOrdenadosPorPrecio.addAll(anuncios);
        Collections.sort(anunciosOrdenadosPorPrecio, (c1, c2) -> (int) (c1.getPrecio().getPrecio() - c2.getPrecio().getPrecio()));
        return anunciosOrdenadosPorPrecio;
    }
    
    public void addAnuncios(Inmueble inmueble, Direccion direccion, Precio precio, String foto) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, direccion, precio, foto);
        if (comprobar(anuncioNuevo)) {
            this.anuncios.add(anuncioNuevo);
        }
    }

    @Override
    public void removeAnuncios(Anuncio anuncioNuevo) {
        this.anuncios.remove(anuncioNuevo);
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void getAnuncios() {
        this.anuncios.forEach((anuncios) -> {
            System.out.println(anuncios);
        });
    }

    @Override
    public boolean isRecomended() {
        return false;
    }

    @Override
    public boolean isForSold() {
        return false;
    }

    @Override
    public boolean isForRent() {
        return false;
    }

    @Override
    public List<Anuncio> getAnunciosList() {return this.anuncios;}
    
    
    public void getAnunciosList(Cliente cliente) {
        for(Anuncio anuncios: cliente.getAnuncios().getAnunciosList()){
            System.out.println(anuncios);
        }
    }
    
    
    
    public void addAnuncios(Anuncio anuncios) {
        this.anuncios.add(anuncios);
    }
}

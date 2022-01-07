package model.CatalogoAnunciosComposite;

import java.util.ArrayList;
import java.util.List;
import model.AnuncioFacade.Anuncio;
import model.Direccion;
import model.Inmueble;
import model.Precio;


public abstract class CatalogoAnuncios {
    protected List<Anuncio> anuncios = new ArrayList<>();
    public abstract void addAnuncios(Inmueble inmueble,Direccion direccion,Precio precio);
    public abstract void removeAnuncios(Anuncio anuncio);
    public abstract boolean isComposite();
    public abstract void getAnuncios();
    public abstract List<Anuncio> getAnunciosList();
    public abstract boolean isRecomended();
    public abstract boolean isForSold();
    public abstract boolean isForRent();
    
    public boolean comprobar(Anuncio anuncioNuevo){
        for(Anuncio anunciosVisitados: anuncios) {
                 if (anunciosVisitados.getDireccion().getCalle().equals(anuncioNuevo.getDireccion().getCalle())
                    || anunciosVisitados.getDireccion().getNumero() == anuncioNuevo.getDireccion().getNumero()
                    || anunciosVisitados.getDireccion().getZipCode() == anuncioNuevo.getDireccion().getZipCode()
                    || anunciosVisitados.getDireccion().getMunicipio().equals(anuncioNuevo.getDireccion().getMunicipio()))
                        return false;
            }
        return true;
        }
}

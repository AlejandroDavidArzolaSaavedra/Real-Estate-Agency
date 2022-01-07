package model.CatalogoAnunciosComposite;

import java.util.List;
import model.AnuncioFacade.Anuncio;
import model.Direccion;
import model.Inmueble;
import model.Precio;
public class CatalogoAnuncioVentaNoRecomendado extends CatalogoAnuncios {
    public CatalogoAnuncioVentaNoRecomendado(){
        super();
    }
    @Override
    public void addAnuncios(Inmueble inmueble,Direccion direccion,Precio precio) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, direccion, precio);
        if(comprobar(anuncioNuevo))
            super.anuncios.add(anuncioNuevo);
    }

    @Override
    public void removeAnuncios(Anuncio anuncioNuevo) {
        super.anuncios.remove(anuncioNuevo);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void getAnuncios() {
        super.anuncios.forEach((anuncios) -> System.out.println(anuncios));
    }

    @Override
    public boolean isRecomended() {
        return false;
    }

    @Override
    public boolean isForSold() {
        return true;
    }

    @Override
    public boolean isForRent() {
        return false;
    }
    
    @Override
    public List<Anuncio> getAnunciosList() {
        return super.anuncios;
    }
}

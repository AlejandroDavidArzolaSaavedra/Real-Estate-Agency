
package model.CatalogoAnunciosComposite;

import java.util.ArrayList;
import java.util.List;
import model.AnuncioFacade.Anuncio;
import model.Direccion;
import model.Inmueble;
import model.Precio;
public class CatalogoAnunciosComposite extends CatalogoAnuncios {  
    
    public CatalogoAnunciosComposite(){}
    
    private static class SingletonHelper {
        private static final CatalogoAnunciosComposite INSTANCE = new CatalogoAnunciosComposite();
    }
    
    public static CatalogoAnunciosComposite getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public void addAnuncios(Inmueble inmueble,Direccion direccion,Precio precio) {
        Anuncio anuncioNuevo = new Anuncio(inmueble, direccion, precio);
        if(comprobar(anuncioNuevo))
            this.anuncios.add(anuncioNuevo);
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
        this.anuncios.forEach((anuncios) -> { System.out.println(anuncios);});
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
    public List<Anuncio> getAnunciosList() {
        return this.anuncios;
    }
}

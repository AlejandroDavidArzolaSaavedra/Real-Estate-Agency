
package model.AnuncioFacade;
import model.CatalogoAnunciosComposite.CatalogoAnuncios;
import model.Direccion;
import model.Inmueble;
import model.Precio;

public class Anuncio {
    
    private String nombre;
    private String Descripcion;
    private String foto;
    
    Inmueble inmueble;

    public Inmueble getInmueble() {
        return inmueble;
    }
    Direccion direccion;
    Precio precio;
    CatalogoAnuncios catalogoAnuncio;
    
    // Facade
    AnuncioArrendador anuncioArrendador = new AnuncioArrendador();
    AnuncioArrendatario anuncioArrendatario;
    AnuncioComprador anuncioComprador;
    AnuncioVendedor anuncioVendedor;
    
   

    public Precio getPrecio() {
        return precio;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String calle, String piso, String municipio, int numero){
        this.direccion.calle = calle;
        this.direccion.piso = piso;
        this.direccion.municipio = municipio;
        this.direccion.numero = numero;
    }

    public Anuncio(Inmueble inmueble,Direccion direccion, Precio precio) {
        this.inmueble = inmueble;
        this.precio = precio;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Tipo de Inmueble : "+inmueble.getTipoInmueble()+", en "+inmueble.getUbicacion()+"con precio"
                + " "+ precio.getPrecio();
    }
    public void verificar(){
        this.anuncioArrendador.mirar();
    }
    
}

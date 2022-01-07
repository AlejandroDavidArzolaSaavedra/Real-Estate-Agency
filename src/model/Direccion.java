package model;
/**
 * Clase  que representa la direccion del inmueble a arrendar o vender
 */
public class Direccion {
    public String calle;
    public String piso;
    public String municipio;
    public int numero;
    public int zipCode;
    
    /**
    * Clase  que representa la direccion del inmueble a arrendar o vender
     * @param calle calle del inmueble
     * @param piso piso del inmueble
     * @param municipio municipio del inmueble
     * @param numero numero de la calle del inmueble
     * @param zipCode codigo zip del inmueble
    */
    public Direccion(String calle, String piso, String municipio, int numero, int zipCode) {
        this.calle = calle;
        this.piso = piso;
        this.municipio = municipio;
        this.numero = numero;
        this.zipCode = zipCode;
    }

    /**
     * Getter de la calle
     * @return calle del inmueble
     */
    public String getCalle() {
        return this.calle;
    }
    
    /**
     * Getter del zipCode
     * @return codigo zip del inmueble
     */
    public int getZipCode() {
        return this.zipCode;
    }
    
    /**
     * Getter del piso
     * @return piso del inmueble
     */
    public String getPiso() {
        return this.piso;
    }
    
    /**
     * Getter del municipio
     * @return municipio de gc del inmueble
     */
    public String getMunicipio() {
        return this.municipio;
    }
    
    /**
     * Getter del numero 
     * @return numero del piso del inmueble
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * toString() de la direccion
     * @return concatenacion de todos los atributos del inmueble
     */
    @Override
    public String toString() {
        return this.calle + ", piso=" + this.piso + ", municipio=" + this.municipio + ", numero=" + this.numero + ", zipCode=" + this.zipCode;
    }
}

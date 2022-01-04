
package model;

public class Direccion {
    public String calle;
    public String piso;
    public String municipio;
    public int numero;
    public int zipCode;

    public Direccion(String calle, String piso, String municipio, int numero, int zipCode) {
        this.calle = calle;
        this.piso = piso;
        this.municipio = municipio;
        this.numero = numero;
        this.zipCode = zipCode;
    }

    public String getCalle() {
        return calle;
    }
    
    public int getZipCode() {
        return zipCode;
    }

    public String getPiso() {
        return piso;
    }

    public String getMunicipio() {
        return municipio;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "calle=" + calle + ", piso=" + piso + ", municipio=" + municipio + ", numero=" + numero + ", zipCode=" + zipCode + '}';
    }
    

}

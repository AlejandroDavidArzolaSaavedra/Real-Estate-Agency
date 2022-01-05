package model;

public class Mensajeria {

    Cliente from;
    private String mensaje;

    public Mensajeria(Cliente from, String mensaje) {
        this.from = from;
        this.mensaje = mensaje;
    }

    public Cliente getFrom() {
        return from;
    }

    public void setFrom(Cliente from) {
        this.from = from;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensajeria{" + "from=" + from + ", mensaje=" + mensaje + '}';
    }

}

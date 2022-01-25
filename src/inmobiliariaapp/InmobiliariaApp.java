package inmobiliariaapp;
import file.AgenciaFile;
import gui.AgenciaForm;
import model.Administrador;
import model.Cliente;
import model.Inmobiliaria;
/**
 * Clase principal para arrancar el programa
 * @author JAD, ADAS
 * @date 07/01/2021
 */
public class InmobiliariaApp {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        //AgenciaForm agenciaForm = new AgenciaForm();
        //agenciaForm.setLocationRelativeTo(null);
        //agenciaForm.setVisible(true);
        //agenciaForm.inmobiliaria = inmobiliaria;
        inmobiliaria.addCliente(new Cliente("asd","",";",""));
        
        inmobiliaria.addCliente(new Cliente("asd","asdasd",";aasd",""));
        
        inmobiliaria.addCliente(new Cliente("asda","asdasd","asddsa;",""));
        
        inmobiliaria.addCliente(new Cliente("wwww","",";",""));
        Administrador pepe = new Administrador("wwww","");
        inmobiliaria.addAdministrador(pepe);
        
        //AgenciaFile file = new AgenciaFile();
        //file.loadFromFile(inmobiliaria);
        //agenciaForm.file = file;
    }
}

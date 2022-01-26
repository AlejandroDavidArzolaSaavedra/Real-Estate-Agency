package inmobiliariaapp;
import file.AgenciaFile;
import gui.AgenciaForm;
import model.Inmobiliaria;
import model.Administrador;

/**
 * Clase principal para arrancar el programa
 * @author JAD, ADAS
 * @date 07/01/2021
 */
public class InmobiliariaApp {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        AgenciaForm agenciaForm = new AgenciaForm();
        agenciaForm.setLocationRelativeTo(null);
        agenciaForm.setVisible(true);
        agenciaForm.inmobiliaria = inmobiliaria;

        inmobiliaria.addAdministrador( new Administrador("admin", "admin"));
        
        AgenciaFile file = new AgenciaFile();
        file.loadFromFile(inmobiliaria);
        agenciaForm.file = file;
    }
}

package inmobiliariaapp;

import file.AgenciaFile;
import gui.AgenciaForm;
import model.Inmobiliaria;

public class InmobiliariaApp {

    public static void main(String[] args) {

        Inmobiliaria inmobiliaria = new Inmobiliaria();

        AgenciaForm agenciaForm = new AgenciaForm();

        agenciaForm.setLocationRelativeTo(null);
        agenciaForm.setVisible(true);
        agenciaForm.inmobiliaria = inmobiliaria;

        AgenciaFile file = new AgenciaFile();
        //cargo los datos del fichero de clientes 
        file.loadFromFile(inmobiliaria);
        agenciaForm.file = file;

    }
}

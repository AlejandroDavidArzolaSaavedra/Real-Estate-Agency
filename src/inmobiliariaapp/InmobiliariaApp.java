package inmobiliariaapp;

import file.AgenciaFile;
import gui.AgenciaForm;
import model.Inmobiliaria;

public class InmobiliariaApp {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        AgenciaForm agenciaForm = new AgenciaForm();

        agenciaForm.setVisible(true);
        agenciaForm.inmobiliaria = inmobiliaria;

        AgenciaFile file = new AgenciaFile();
        //cargo los datos del fichero 
        file.loadFromFile(inmobiliaria);
        agenciaForm.file = file;
    }
}
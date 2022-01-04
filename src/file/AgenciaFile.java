package file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import model.Cliente;
import model.Inmobiliaria;

public class AgenciaFile {

    String name = "Agencia.txt";

    public void saveToFile(Inmobiliaria inmobiliaria) {
        int i;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(name);
            pw = new PrintWriter(fichero);
            int c;
            pw.write(inmobiliaria.getClientes().size() + "\n");
            Cliente client;

            for (c = 0; c < inmobiliaria.getClientes().size(); c++) {
                if (inmobiliaria.getClientes().get(c) instanceof Cliente) {
                    client = (Cliente) inmobiliaria.getClientes().get(c);
                    // se utilzará como separador el carácter / para cada dato del fichero
                    pw.write(client.getNombre() + "/" + client.getApellido() + "/" + client.getCorreo() + "/" + client.getPassword() + "/\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void loadFromFile(Inmobiliaria inmobiliaria) {
        try {
            Scanner s = new Scanner(new File("C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\AgenciaInmobiliariaClonada\\Agencia.txt"));
            int i, k, c, n = s.nextInt();
            s.nextLine();
            s.useDelimiter("/");
            for (i = 0; i < n; i++) {
                inmobiliaria.addCliente(s.next(), s.next(), s.next(), s.next());
                s.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

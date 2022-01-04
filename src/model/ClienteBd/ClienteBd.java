
package model.ClienteBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteBd {
    private final List<Cliente> map = new ArrayList();

    private Connection connect() {
        String url = "jdbc:sqlite:C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\AgenciaInmobiliariaClonada\\usuariosInmobiliaria.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll(){
        String sql = "SELECT * FROM CLIENT";
        try (Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                map.add(new Cliente(rs.getString("Name"),rs.getString("Apellido"),rs.getString("Correo"),rs.getString("Password")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Cliente> leerBdClientes(){
        return map;
    }
}

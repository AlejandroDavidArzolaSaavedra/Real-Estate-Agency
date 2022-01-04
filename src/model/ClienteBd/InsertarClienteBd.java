
package model.ClienteBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertarClienteBd {
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
    
    public void insert(String nombre, String apellido, String correo, String password) {
        String sql = "INSERT INTO CLIENT(Name, Apellido, Correo, Password) VALUES(?,?,?,?)";
        try (Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, correo);
            pstmt.setString(4, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

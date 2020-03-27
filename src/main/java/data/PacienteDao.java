/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import domain.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tron
 */
public class PacienteDao {

    private static final String SQL_SELECT = "SELECT * FROM PACIENTES";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM PACIENTES WHERE id_cliente = ?";
    private static final String SQL_INSERT = "INSERT INTO PACIENTES VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public List<Paciente> Listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Paciente paciente = null;
        List<Paciente> pacientes = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id_paciente = rs.getInt("id_paciente");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String ocupacion = rs.getString("ocupacion");
                String direccion = rs.getString("direccion");
                String cod_postal = rs.getString("cod_postal");
                String poblacion = rs.getString("poblacion");
                String provincia = rs.getString("provincia");
                String pais = rs.getString("pais");
                String tlf1 = rs.getString("tlf1");
                String tlf2 = rs.getString("tlf2");
                String email = rs.getString("email");
                String web = rs.getString("web");
                String estado_civil = rs.getString("estado_civil");
                String fecha_nacimiento = rs.getString("fecha_nacimiento");
                String lugar_nacimiento = rs.getString("lugar_nacimiento");
                String n_hijos = rs.getString("n_hijos");
                String fecha_alta = rs.getString("fecha_alta");
                String recomendado_por = rs.getString("recomendado_por");
                String motivo_consulta = rs.getString("motivo_consulta");

                paciente = new Paciente(id_paciente, nombre, apellidos, ocupacion, direccion, cod_postal, poblacion, provincia, pais, tlf1, tlf2, email, web, estado_civil, fecha_nacimiento, lugar_nacimiento, n_hijos, fecha_alta, recomendado_por, motivo_consulta);
                pacientes.add(paciente);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
            printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }

        return pacientes;

    }

}

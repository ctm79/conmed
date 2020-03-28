/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.mariadb.jdbc.MariaDbDataSource;

/**
 *
 * @author tron
 */
public class DBConnection {
    private static final Logger LOG = Logger.getLogger(DBConnection.class.getName());
    private static final String JDBC_URL = "jdbc:mariadb://192.168.1.185:3306/conmed?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "conmed";
    private static final String JDBC_PASSWORD = "conmed";
    private static MariaDbDataSource dataSource;

    
    public static  DataSource getDataSource() throws SQLException {
                
        if(dataSource==null) {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUserName(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
        }
        
        return dataSource;
    }
    
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
    
    public static void close (ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close (PreparedStatement ps) {
        try {
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close (Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

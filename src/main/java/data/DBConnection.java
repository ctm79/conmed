/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.mariadb.jdbc.MariaDbDataSource;

/**
 *
 * @author tron
 */
public class DBConnection {
    private static final Logger LOG = Logger.getLogger(DBConnection.class.getName());
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/conmed?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //private static final String JDBC_URL = "jdbc:mariadb://127.0.0.1:3306/conmed?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    //private static final String JDBC_URL = "jdbc:mariadb://127.0.0.1:3306/conmed";
    private static final String JDBC_USER = "conmed";
    private static final String JDBC_PASSWORD = "conmed";

    
    
    public static  DataSource getDataSource() throws SQLException {
        /*
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(JDBC_URL);
        bds.setUsername(JDBC_USER);
        bds.setPassword(JDBC_PASSWORD);
        bds.setInitialSize(50);
        */
        MariaDbDataSource bds = new MariaDbDataSource();
	bds.setUrl(JDBC_URL);
        bds.setUserName(JDBC_USER);
        bds.setPassword(JDBC_PASSWORD);
        
        
        
        return bds;
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

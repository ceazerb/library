
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    
    Connection con;
    String password = "test123";
    String uri = "jdbc:mysql://localhost:3306/library";
    String user = "root";
    
    public Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(uri, user, password);
        return con;
    }
    
    public void closeConnection() throws SQLException{
    	con.close();
    }
}

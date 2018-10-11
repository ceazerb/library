
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Borrow {
    public String date_time;
    
    public Borrow(String date_time){
        this.date_time = date_time;
        System.out.println("It's Done!!!");
    }
    
    public void insertborrow(Connection con) throws SQLException{
        String sql = "insert into borrow values(null,null,null,?);";
           
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.date_time);
        ps.executeUpdate();
        ps.close();           
        
    }
   
   
    
}

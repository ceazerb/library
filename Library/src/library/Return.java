
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Return {
    public String date_time;

    
    public Return(String date_time){
        this.date_time = date_time;
        System.out.println("It's Done!!!");
    }
    
    public void insertreturn(Connection con) throws SQLException{
        String sql = "insert into return values(null,null,?);";
           
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.date_time);
        ps.executeUpdate();
        ps.close();           
        
    }
}

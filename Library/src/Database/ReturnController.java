
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ReturnController {
    public String person_name;
    public String book_name;
    public String date_time;

    
    public ReturnController(String person_name, String book_name, String date_time){
        this.person_name = person_name;
        this.book_name = book_name;
        this.date_time = date_time;
        System.out.println("It's Done!!!");
    }
    
    public void insertreturn(Connection con) throws SQLException{
        String sql = "insert into returns values(null,?,?,?);";
           
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.person_name);
        ps.setString(2, this.book_name);
        ps.setString(3, this.date_time);
        ps.executeUpdate();
        ps.close();           
        
    }
}

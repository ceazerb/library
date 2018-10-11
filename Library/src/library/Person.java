
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Person {
    public String person_name;
    public String phone_no;
    public String place;
    
    public Person(String person_name, String phone_no, String place){
        this.person_name = person_name;
        this.phone_no = phone_no;
        this.place = place;
        System.out.println("It's Done!!!");
    }
    
    public void insertperson(Connection con) throws SQLException{
        String sql = "insert into person values(null,?,?,?);";
           
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.person_name);
        ps.setString(2, this.phone_no);
        ps.setString(3, this.place);
        ps.executeUpdate();
        ps.close();           
        
    }
}

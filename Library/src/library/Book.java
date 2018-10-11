
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.application.Application;


public class Book {
    
    public String name;
    public String isbn;
    public String author;
    public String publisher;
    
    public Book(String name, String isbn, String auth, String pubG){
        this.name = name;
        this.isbn = isbn;
        this.author = auth;
        this.publisher = pubG;
        System.out.println("It's Done!!!");
    }
    
    public void insertbook(Connection con) throws SQLException{
        String sql = "insert into book values(null,?,?,?,?);";
           
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.name);
        ps.setString(2, this.isbn);
        ps.setString(3, this.author);
        ps.setString(4, this.publisher);
        ps.executeUpdate();
        ps.close();           
        
    }
   
   
    
}

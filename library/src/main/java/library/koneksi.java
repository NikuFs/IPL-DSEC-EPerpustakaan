package library;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;


public class koneksi {
    Connection koneksi = null;
    public static Connection koneksiDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_library","root","");
        }catch(Exception e){
            return null;
        }
    }
}

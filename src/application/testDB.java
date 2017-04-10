package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Ashfaq on 4/6/17.
 */
public class testDB {


    public String db_URL = "jdbc:mysql://localhost/universityofgugsi";
    public String db_Username = "root";
    public String db_Password = "";


    public void db_Connect(){

        try {
            Connection con = DriverManager.getConnection(db_URL,db_Username,db_Password);
            if (con != null){
                System.out.println("Succesful");
            }
        }catch (SQLException e){
            System.out.println(e);
        }


    }

//    public static void main(String[] args) {
//        testDB sd = new testDB();
//        sd.db_Connect();
//    }

}

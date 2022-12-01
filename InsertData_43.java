

import java.sql.*;
//import java.util.*;

public class InsertData_43 {
    public static void main(String[] args) {
        //Scanner obj = new Scanner(System.in);

       String url = "jdbc:mysql://localhost:3306/java_lab";
       String username = "root";
       String password = "";

       try {

           //Create a connection
           Connection conn = DriverManager.getConnection(url, username, password);

           //Create a statement
           Statement stmt = conn.createStatement();

           //Execute query
           String sql = "insert into demo" + "(Name, Address, Age, Phone Number)" + "values ('john', 'us', '21', '9835264725')";
           stmt.executeUpdate(sql);
           System.out.println("Data Inserted.");


           // close connection
           conn.close();
       }
       catch(Exception e) {
            e.printStackTrace();
        }
    }
}

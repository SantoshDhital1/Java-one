import java.sql.*;


public class MysqlDemo_42 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java_lab";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

//            Statement statement = connection.createStatement();
//
//            ResultSet resultset = statement.executeQuery("select * from demo");
//
//            while(resultset.next()) {
//                System.out.println(resultset.getString(1) + " " + resultset.getString(2) + " " + resultset.getInt(3) + " " + resultset.getString(4));
//
//
//            }
//            connection.close();
            System.out.println("Database Connected.");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

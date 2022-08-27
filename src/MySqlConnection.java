import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnection {
    public static void main(String[] args) {

        try {
            // 1.Register Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            // 2.Make Connection
            String url = "jdbc:mysql://localhost:3306/adityadb";
            String username = "root";
            String password = "Aditya@4629";
            Connection con = DriverManager.getConnection(url, username, password);
            // 3.Create Statement Object
            Statement stmt = con.createStatement();
            String query = "select * from college";
            // 4.Process
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println("connection fail");
            e.printStackTrace();
        }

    }
}

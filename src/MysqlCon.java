

import java.sql.*;

public class MysqlCon {
    public static void main(String args[]){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= (Connection) DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/adityadb","root","Aditya@4629");
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("select * from college");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//            con.close();
//        }catch(Exception e){ System.out.println(e);}
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/adityadb", "root", "Aditya@4629");
            Statement statement = con.createStatement();
            // String query = "insert into emp_table values(1,'suraj','farmer',18);";
            String query2 = "select *from college";

            ResultSet rs = statement.executeQuery(query2);

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3));
            }
            int count = statement.executeUpdate(query2);
            System.out.println(count);
            statement.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);

        }
    }
}

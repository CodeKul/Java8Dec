package jdbc;

import java.sql.*;

/**
 * driver register
 * connection establishment
 * statement creation
 * statement execute
 *
 */
public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java8dec","root7","password");

            Statement st = connection.createStatement();
            String select = "select * from employee";

            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

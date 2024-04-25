import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBExample {

    public static void main(String[] args) {
        Properties prop = new Properties();
        String url = "";
        String username = "";
        String password = "";

        try (InputStream input = DBExample.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Unable to find application.properties");
                return;
            }

            // Load properties from the file
            prop.load(input);
            url = prop.getProperty("db.url");
            username = prop.getProperty("db.username");
            password = prop.getProperty("db.password");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Database operations in a separate try block
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users;")) {

            while (resultSet.next()) {
                System.out.println("First Name: "+resultSet.getString("first_name"));
                System.out.println("Last Name: "+resultSet.getString("last_name"));
                System.out.println("Email: "+resultSet.getString("email"));
                System.out.println("Contact Number: +91"+resultSet.getString("contact_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.SQLException;
//
//public class DatabaseConnectionExample {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/codejavadb"; // replace 'yourdatabasename'
//        String username = "root"; // replace with your MySQL username
//        String password = "root"; // replace with your MySQL password
//
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM users;"); // replace 'yourtablename'
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("first_name")); // replace 'yourcolumnname'
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

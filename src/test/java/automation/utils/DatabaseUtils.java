package automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils {
    static Connection con;
    static Statement stmt;

    public static void createDBConnection() {
        try {
            String url = PropertyReader.getProperty("db.url");
            String username = PropertyReader.getProperty("db.username");
            String password = PropertyReader.getProperty("db.password");
            Class.forName(PropertyReader.getProperty("db.driver.class"));
            con = DriverManager.getConnection(url,username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void closeDBConnection() {
        try {
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        // 1. Connect to the Database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://3.129.60.236:3306/digitalbank","digitaluser","Demo123!");

        // 2. Execute Query
        Statement statement = con.createStatement();
        ResultSet rs =  statement.executeQuery("select username from users;");

        // 3. Process / print result
        while(rs.next()){
            System.out.println(rs.getString("username"));
        }

        // 4. Close the connections
        con.close();

    }
}

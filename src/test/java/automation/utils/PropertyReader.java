package automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PropertyReader {
    static Properties prop = new Properties();

    public static void initProperties(){
        try {
            prop.load(new FileReader("src//test//resources//config//config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public static String getProperty(String key){
       return prop.getProperty(key);
    }

    public static void main(String[] args) throws SQLException {
        PropertyReader.initProperties();
        DatabaseUtils.createDBConnection();

        ResultSet rs = DatabaseUtils.executeQuery("SELECT CURDATE() as todayDate;");
        while(rs.next()){
            System.out.println(rs.getString("todayDate"));
        }

        DatabaseUtils.closeDBConnection();
    }
}

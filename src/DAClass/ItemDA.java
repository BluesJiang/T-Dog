package DAClass;

/**
 * T-Dog
 * Created by Blues on 2016/11/21.
 */
import java.sql.*;
import java.util.Objects;
public class ItemDA {

    private static Connection conn;
    private static Statement statement;

    public static void init() {
        String driverName = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://123.207.59.11:3306/T-Dog?";
        try {
            Object driver = Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection(dbURL, "root", "5Believe!!");
            statement = conn.createStatement();

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (InstantiationException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}

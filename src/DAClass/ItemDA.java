package DAClass;

/**
 * T-Dog
 * Created by Blues on 2016/11/21.
 */
import PDClass.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;
public class ItemDA {

    private static Connection conn;
    private static Statement statement;

    public static void init() {
        String driverName = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://123.207.59.11:3306/T-Dog?useSSL=false";
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

    public static ArrayList<Item> findItemWithName(String name) {
        ArrayList<Item> items = new ArrayList<Item>();
        String sql = "select title, price, store, thumbnail_url, detail_image_url from itemtable where title like '%"+name+"%'";
        System.out.println(sql);
        Statement stmt;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            stmt = null;
        }
        try {
            ResultSet result = stmt.executeQuery(sql);
            while (result.next()) {
                Item tmpItem = new Item();
                tmpItem.setName(result.getString("title"));
                tmpItem.setPrice(result.getFloat("price"));
                tmpItem.setStore(result.getString("store"));
                tmpItem.setThumbnailUrl(result.getString("thumbnail_url"));
                tmpItem.setDetailImageUrl(result.getString("detail_image_url"));
                items.add(tmpItem);
            }
            result.close();
            stmt.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return items;
    }

}

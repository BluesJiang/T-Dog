package PDClass;

/**
 * T-Dog
 * Created by Blues on 2016/11/14.
 */
import DAClass.ItemDA;

import java.*;
import java.util.ArrayList;

public class Item {
    private int id;
    private String name;
    private String thumbnailUrl;
    private String detailImageUrl;
    private String store;
    private float price;

    public Item() {
    }

    public Item(int id,String name, String thumbnailUrl, String detailImageUrl, String store, float price) {
        this.id=id;
        this.name = name;
        this.thumbnailUrl = thumbnailUrl;
        this.detailImageUrl = detailImageUrl;
        this.store = store;
        this.price = price;
    }

    public int getId() {return id;}

    public void setId(int id){this.id=id;}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void init() {
        ItemDA.init();
    }


    public static ArrayList<Item> findItemWithName(String name) {
        ItemDA.init();
        ArrayList<Item> result = ItemDA.findItemWithName(name);
        ItemDA.terminate();
        return result;
    }

    public static Item findItemWithID(String id){
        ItemDA.init();
        Item myResult =ItemDA.findItemWithID(id);
        ItemDA.terminate();
        return myResult;
    }


}

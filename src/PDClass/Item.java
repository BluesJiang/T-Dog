package PDClass;

/**
 * T-Dog
 * Created by Blues on 2016/11/14.
 */
import DAClass.ItemDA;

import java.*;
import java.util.ArrayList;

public class Item {
    private String name;
    private String thumbnailUrl;
    private String detailImageUrl;
    private String store;
    private float price;

    public Item() {

    }

    public Item(String name, String thumbnailUrl, String detailImageUrl, String store, float price) {
        this.name = name;
        this.thumbnailUrl = thumbnailUrl;
        this.detailImageUrl = detailImageUrl;
        this.store = store;
        this.price = price;
    }

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

    static public ArrayList<Item> findItemWithName(String name) {
        return ItemDA.findItemWithName(name);
    }
}

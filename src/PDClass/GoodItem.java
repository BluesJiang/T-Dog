package PDClass;

/**
 * T-Dog
 * Created by Blues on 2016/11/14.
 */
import java.*;
public class GoodItem {
    private String name;
    private String imageUrl;
    private String store;
    private int price;

    public GoodItem(String name, String imageUrl, String store, int price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.store = store;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

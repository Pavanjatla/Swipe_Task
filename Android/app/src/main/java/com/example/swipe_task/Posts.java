package com.example.swipe_task;
import com.google.gson.annotations.SerializedName;

public class Posts {
    private String product_name;
    private String product_type;
    private String image;
    private String tax;
    private String price;

    public Posts(String product_name, String product_type, String image, String tax, String price) {
        this.product_name = product_name;
        this.product_type = product_type;
        this.image = image;
        this.tax = tax;
        this.price = price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public String getImage() {
        return image;
    }

    public String getTax() {
        return tax;
    }

    public String getPrice() {
        return price;
    }
}

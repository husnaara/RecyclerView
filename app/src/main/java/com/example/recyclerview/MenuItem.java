package com.example.recyclerview;

public class MenuItem {
    private String title;

    private String price;
    private int image;

    public MenuItem(String title,  String price, int image) {
        this.title = title;

        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}

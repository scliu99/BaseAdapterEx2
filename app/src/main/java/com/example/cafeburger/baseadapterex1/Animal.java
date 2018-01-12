package com.example.cafeburger.baseadapterex1;

/**
 * Created by cafeburger on 2018/1/12.
 */

public class Animal {
    private String name;
    private int image;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Animal(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

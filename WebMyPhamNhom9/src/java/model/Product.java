/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chuva
 */
public class Product {
    private int id;
    private String name,image,title,description;
    private double price;
    private int mount;

    public Product() {
    }

//    public Product(int id, String name, String image, String title, String description, double price) {
//        this.id = id;
//        this.name = name;
//        this.image = image;
//        this.title = title;
//        this.description = description;
//        this.price = price;
//    }

    public Product(int id, String name, String image, String title, String description, double price, int mount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.mount = mount;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
//    public String toString() {
//        return "Product{" + "id=" + id + ", name=" + name + ", image=" + image + ", title=" + title + ", description=" + description + ", price=" + price + '}';
//    }
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", image=" + image + ", title=" + title + ", description=" + description + ", price=" + price +", mount=" + mount + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Product_Detail {
    private int id;
    private Product product;
    private Brand brand;
    private static int count = 0;

    public Product_Detail() {
    }
    
    public Product_Detail(int id, Product product, Brand brand) {
        this.id = count++;
        this.product = product;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product_Detail.count = count;
    }
}

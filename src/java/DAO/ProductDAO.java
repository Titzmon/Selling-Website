/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Product;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProductDAO {
    public ArrayList<Product> getAllProducts(HttpSession session) {
        ArrayList<Product> productList = (ArrayList<Product>) session.getAttribute("productList");
        if (productList == null) {
            productList = new ArrayList<>();
            session.setAttribute("productList", productList);
        }
        return productList;
    }

    public void addProduct(HttpSession session, Product product) {
        ArrayList<Product> productList = getAllProducts(session);
        productList.add(product);
    }
}

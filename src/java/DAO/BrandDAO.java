/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import Models.Brand;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
public class BrandDAO {
     public ArrayList<Brand> getAllBrands(HttpSession session) {
        ArrayList<Brand> brandList = (ArrayList<Brand>) session.getAttribute("brandList");
        if (brandList == null) {
            brandList = new ArrayList<>();
            brandList.add(new Brand(1, "Nike"));
            brandList.add(new Brand(2, "Adidas"));
            session.setAttribute("brandList", brandList);
        }
        return brandList;
    }
}

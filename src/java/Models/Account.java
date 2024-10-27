/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Account {
    private int Account_id;
    private static int count = 0;
    private String username;
    private String password;

    public Account() {
    }

    public Account(int Account_id, String username, String password) {
        this.Account_id = count++;
        this.username = username;
        this.password = password;
    }
    
    public int getAccount_id() {
        return Account_id;
    }

    public void setAccount_id(int Account_id) {
        this.Account_id = Account_id;
    }

    public static int getCount() {
        return count;
    }

  

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    
}

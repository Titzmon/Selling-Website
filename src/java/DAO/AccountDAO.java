/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import Models.Account;
import java.util.ArrayList;
public class AccountDAO {
    private ArrayList<Account> accountList;

    public AccountDAO() {
        accountList = new ArrayList<>();
        accountList.add(new Account(1, "user1", "pass1"));
        accountList.add(new Account(2, "user2", "pass2"));
    }

    public ArrayList<Account> getAllAccounts() {
        return accountList;
    }

    public Account getAccountByUsername(String username) {
        for (Account account : accountList) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }
        return null;
    }
}

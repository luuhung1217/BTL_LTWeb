/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author acer
 */
public class Account {
    private int id,isSell,isAdmin;
    private String user,pass;
    private String gmail,address,phone;
    public Account() {
    }

    public Account(int id, int isSell, int isAdmin, String user, String pass) {
        this.id = id;
        this.isSell = isSell;
        this.isAdmin = isAdmin;
        this.user = user;
        this.pass = pass;
    }

    public Account(int id, String user, String gmail, String address, String phone) {
        this.id = id;
        this.user = user;
        this.gmail = gmail;
        this.address = address;
        this.phone = phone;
    }
    
    public Account(int id, int isSell, int isAdmin, String user, String pass, String gmail, String address, String phone) {
        this.id = id;
        this.isSell = isSell;
        this.isAdmin = isAdmin;
        this.user = user;
        this.pass = pass;
        this.gmail = gmail;
        this.address = address;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", isSell=" + isSell + ", isAdmin=" + isAdmin + ", user=" + user + ", pass=" + pass + '}';
    }
    
}

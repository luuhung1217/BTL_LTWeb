/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Order extends Product {

    private int orderId;
    private int uid;
    private String qunatity,pid,pname;
    private String date;
    private float totalmoney;
    private String nameuser,phone,address,email;
    public Order() {
    }

    public Order(int orderId, int uid, String qunatity, String pid, String pname, String date, float totalmoney, String nameuser, String phone, String address, String email) {
        this.orderId = orderId;
        this.uid = uid;
        this.qunatity = qunatity;
        this.pid = pid;
        this.pname = pname;
        this.date = date;
        this.totalmoney = totalmoney;
        this.nameuser = nameuser;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public Order(int orderId, int uid, String qunatity, String pid, String pname, String date, float totalmoney) {
        this.orderId = orderId;
        this.uid = uid;
        this.qunatity = qunatity;
        this.pid = pid;
        this.pname = pname;
        this.date = date;
        this.totalmoney = totalmoney;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Order(int orderId, int uid, String qunatity, String pid, String date, float totalmoney) {
        this.orderId = orderId;
        this.uid = uid;
        this.qunatity = qunatity;
        this.pid = pid;
        this.date = date;
        this.totalmoney = totalmoney;
    }
    
    

    public Order(int orderId, int uid, String qunatity, String date, float totalmoney) {
        this.orderId = orderId;
        this.uid = uid;
        this.qunatity = qunatity;
        this.date = date;
        this.totalmoney = totalmoney;
    }

    public Order(int uid, String qunatity, String date) {
        this.uid = uid;
        this.qunatity = qunatity;
        this.date = date;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getQunatity() {
        return qunatity;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setQunatity(String qunatity) {
        this.qunatity = qunatity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    
}

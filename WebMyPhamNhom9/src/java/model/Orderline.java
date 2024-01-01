/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author ACER
 */
public class Orderline {
    private int uid;
    private List<String> pid;
    private List<String> pname;
    private List<Integer> quantity;
    private String date;
    private Float sum;
    private String nameuser,phone,address,email;
    public Orderline() {
    }

    public Orderline(int uid, List<String> pid, List<String> pname, List<Integer> quantity, String date, Float sum, String nameuser, String phone, String address, String email) {
        this.uid = uid;
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.date = date;
        this.sum = sum;
        this.nameuser = nameuser;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public Orderline(int uid, List<String> pid, List<String> pname, List<Integer> quantity, String date, Float sum) {
        this.uid = uid;
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.date = date;
        this.sum = sum;
    }

    public Orderline(int uid, String date, Float sum) {
        this.uid = uid;
        this.date = date;
        this.sum = sum;
    }

    
    
    public Orderline(int uid, List<String> pid, List<Integer> quantity, String date) {
        this.uid = uid;
        this.pid = pid;
        this.quantity = quantity;
        this.date = date;
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

    public Float getSum() {
        return sum;
    }

    public void setSum(Float sum) {
        this.sum = sum;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<String> getPid() {
        return pid;
    }

    public void setPid(List<String> pid) {
        this.pid = pid;
    }

    public List<String> getPname() {
        return pname;
    }

    public void setPname(List<String> pname) {
        this.pname = pname;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}

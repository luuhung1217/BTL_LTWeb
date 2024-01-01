/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.Product;

/**
 *
 * @author ACER
 */
public class OrderDao extends DBContext{


    public OrderDao() {
    }
    public void insertProduct(String pid, int uid, String oquanlity, Double osum, String odate,String pname, String username, String email, String phone, String address){
        String sql="INSERT [dbo].[order] ([p_id], [u_id], [o_quanlity], [o_sum], [o_date], [p_name], [username], [email], [phone], [address]) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st= connection.prepareStatement(sql);
            st.setString(1, pid);
            st.setInt(2, uid);
            st.setString(3, oquanlity);
            st.setDouble(4, osum);
            st.setString(5, odate);
            st.setString(6, pname);
            st.setString(7, username);
            st.setString(8, email);
            st.setString(9, phone);
            st.setString(10, address);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public List<Order> getOrderByCID(String oid) {
        List<Order> list = new ArrayList<>();
        String sql = "select * from [dbo].[order] where u_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order p = new Order();
                p.setOrderId(rs.getInt("id"));
                p.setPid(rs.getString("p_id"));
                p.setUid(rs.getInt("u_id"));
                p.setQunatity(rs.getString("o_quanlity"));
                p.setTotalmoney(rs.getFloat("o_sum"));
                p.setDate(rs.getString("o_date"));
                p.setPname(rs.getString("p_name"));
                p.setNameuser(rs.getString("username"));
                p.setEmail(rs.getString("email"));
                p.setPhone(rs.getString("phone"));
                p.setAddress(rs.getString("address"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
   
//    public void deleteProduct(String pid){
//        String sql="delete from product where id=?";
//        try {
//            PreparedStatement st=connection.prepareStatement(sql);
//            st.setString(1, pid);
//            st.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }

}


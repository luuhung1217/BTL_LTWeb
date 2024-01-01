/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import dao.OrderDao;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.Orderline;

/**
 *
 * @author ACER
 */
public class DetailAccountServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        OrderDao dao = new OrderDao();
       
        String uId = request.getParameter("uid");
        List<Order> listorder = dao.getOrderByCID(uId);
        
        List<Orderline> listorderline = new ArrayList<>();
        
        
        for(Order o:listorder){
            List<String> listpid = new ArrayList<>();
            List<String> listpname = new ArrayList<>();
            List<Integer> listquanlity = new ArrayList<>();
            String[] pidArray = o.getPid().split(",");
            String[] nameidArray = o.getPname().split(",");
            String[] quanlityArray = o.getQunatity().split(",");
            for (String nameid : nameidArray){
                listpname.add(nameid);
                
            }
           for (String pid : pidArray){
               listpid.add(pid);
           }
           for (String pid : quanlityArray){
               listquanlity.add(Integer.parseInt(pid));
           }
            listorderline.add(new Orderline(o.getUid(),listpid,listpname,listquanlity,o.getDate(),o.getTotalmoney(),o.getNameuser(),o.getPhone(),o.getAddress(),o.getEmail()));

        }
        request.setAttribute("listorderline",listorderline);
        request.getRequestDispatcher("DetailAccount.jsp").forward(request, response);  
      

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

}

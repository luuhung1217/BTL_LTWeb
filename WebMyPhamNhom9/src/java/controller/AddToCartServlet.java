/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author ACER
 */
public class AddToCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        int productId = Integer.parseInt(request.getParameter("productId"));
        DAO dao = new DAO();
        Product product = dao.getProductByID(String.valueOf(productId));

        HttpSession session = request.getSession();
        List<Product> cartItems = (List<Product>) session.getAttribute("cartItems");
        if (cartItems == null) {
            cartItems = new ArrayList<>();
            session.setAttribute("cartItems", cartItems);
        }

        boolean productExists = false;
        for (Product item : cartItems) {
            if (item.getId() == productId) {
                item.setMount(item.getMount() + 1); // Tăng giá trị mount
                productExists = true;
                break;
            }
        }

        if (!productExists && product != null) {
            product.setMount(1);
            cartItems.add(product);
        }
        double total = 0.0;
        int totalquality = 0;
        for (Product o : cartItems) {
            totalquality = totalquality + o.getMount();
        }
        for (Product o : cartItems) {
            total = total + o.getMount() * o.getPrice();
        }
        double sum = 1.1 * total;
        double roundedSum = Math.round(sum * 10.0) / 10.0;
        session.setAttribute("total", total);
        session.setAttribute("totalquality", totalquality);
        session.setAttribute("vat", 0.1 * total);
        session.setAttribute("sum",roundedSum);
        response.sendRedirect("Cart.jsp");

    }

}

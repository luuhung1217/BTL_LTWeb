/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Product;

/**
 *
 * @author ACER
 */
public class UpdateQuanityServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String productId = request.getParameter("productId");
        String action = request.getParameter("action");

        // Lấy giỏ hàng từ session
        List<Product> cartItems = (List<Product>) request.getSession().getAttribute("cartItems");

        // Tìm sản phẩm trong giỏ hàng với productId tương ứng
        Product productToUpdate = null;
        for (Product product : cartItems) {
            String productidString = String.valueOf(product.getId());
            if (productidString.equals(productId)) {
                productToUpdate = product;
                break;
            }
        }

        if (productToUpdate != null) {
            if (action.equals("increase")) {
                productToUpdate.setMount(productToUpdate.getMount() + 1);
            } else if (action.equals("decrease")) {
                if (productToUpdate.getMount() > 1) {
                    productToUpdate.setMount(productToUpdate.getMount() - 1);
                }
            }

            // Cập nhật totalquality và sum
            int totalQuality = 0;
            double total = 0.0;
            for (Product product : cartItems) {
                totalQuality += product.getMount();
                total += product.getMount() * product.getPrice();
            }
            double sum = 1.1 * total;
            double roundedSum = Math.round(sum * 10.0) / 10.0;
            request.getSession().setAttribute("total", total);
            request.getSession().setAttribute("vat", 0.1 * total);
            request.getSession().setAttribute("totalquality", totalQuality);
            request.getSession().setAttribute("sum", roundedSum);

        }

        // Chuyển hướng về trang "Cart.jsp"
        response.sendRedirect("Cart.jsp");
    }

}

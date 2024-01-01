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
import jakarta.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.List;
import model.Product;

/**
 *
 * @author ACER
 */
public class DeleteProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        int productId = Integer.parseInt(request.getParameter("productId"));

        HttpSession session = request.getSession();
        List<Product> cartItems = (List<Product>) session.getAttribute("cartItems");
        if (cartItems != null) {
            // Tìm và xóa sản phẩm trong danh sách cartItems
            Iterator<Product> iterator = cartItems.iterator();
            while (iterator.hasNext()) {
                Product item = iterator.next();
                if (item.getId() == productId) {
                    iterator.remove();
                    break;
                }
            }

            // Cập nhật lại các giá trị
            double total = 0;
            int totalQuality = 0;
            for (Product o : cartItems) {
                total += o.getMount() * o.getPrice();
                totalQuality += o.getMount();
            }

            session.setAttribute("total", total);
            session.setAttribute("totalquality", totalQuality);
            session.setAttribute("vat", 0.1 * total);
            session.setAttribute("sum", 1.1 * total);

            response.sendRedirect("Cart.jsp");
        }
    }

}

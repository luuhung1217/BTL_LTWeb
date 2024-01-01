package controller;

import dao.DAO;
import dao.OrderDao;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.Account;
import model.Product;

public class OrderToCartServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        OrderDao dao = new OrderDao();
        DAO dao1 = new DAO();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
          SimpleDateFormat formatter = new SimpleDateFormat("HH:mm, dd/MM/yyyy");
        Date date = new Date();
        String formattedDate = formatter.format(date);
//        int userId = Integer.parseInt(request.getParameter("userId"));
        HttpSession session = request.getSession();
	Account a = (Account) session.getAttribute("acc");
        int userId = a.getId();
        String username=request.getParameter("name");
        String phone =request.getParameter("phoneNumber");
        String email=request.getParameter("email");
        String addressdelivery=request.getParameter("deliveryAddress");
        List<Product> cartItems = (List<Product>) session.getAttribute("cartItems");
        List<Product> listp=dao1.getAllProduct();
        
        if (listp != null) {
            for (Product i : listp) {
                for (Product j : cartItems) {
                    if (i.getId() == j.getId()) {
                        dao1.updateProductMount(i.getId(),i.getMount() - j.getMount());
                    }
                }
            }
        }
        
//        request.setAttribute("listP", listp);
//        double productSum = Double.parseDouble(request.getParameter("productSum"));
        double productSum = (Double) request.getSession().getAttribute("sum");
        String listProduct = "";
        String listQuanlity="";
        String listName="";
        if (!cartItems.isEmpty()) {
            for (Product product : cartItems) {
                String productId = String.valueOf(product.getId());
                String productquanlity = String.valueOf(product.getMount());
                String productname = product.getName();
                listProduct+=productId+",";
                listQuanlity+=productquanlity+","; 
                listName+=productname+",";
            }
            listQuanlity = listQuanlity.substring(0, listQuanlity.length() - 1);
            listProduct = listProduct.substring(0,listProduct.length()-1);
            listName = listName.substring(0,listName.length()-1);
            dao.insertProduct(listProduct, userId, listQuanlity, productSum, formattedDate,listName,username,email,phone,addressdelivery);
        }
        
        session.removeAttribute("cartItems"); // Xóa giỏ hàng sau khi đã đặt hàng
        session.removeAttribute("total");
        session.removeAttribute("vat");
        session.removeAttribute("totalquality");
        session.removeAttribute("sum");
        response.sendRedirect("Order.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
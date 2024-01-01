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
import model.Account;
import model.Category;
import model.Product;

/**
 *
 * @author acer
 */
public class DAO extends DBContext {

    // select * from product
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setMount(rs.getInt("mount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String sql = "select * from account";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account p = new Account();
                p.setId(rs.getInt("uID"));
                p.setUser(rs.getString("user"));
                p.setIsAdmin(rs.getInt("isAdmin"));
                p.setPass(rs.getString("pass"));
                p.setGmail(rs.getString("gmail"));
                p.setAddress(rs.getString("address"));
                p.setPhone(rs.getString("phone"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void updateProductMount(int productId, int newMount) {
        String sql = "UPDATE product SET mount = ? WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, newMount);
            st.setInt(2, productId);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // select * from Category
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from Category";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // select top 1 * from product order by id desc
    public Product getgetLast() {
        String sql = "select top 1 * from product order by id desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    // select * from product where cateID=1
    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where cateID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setMount(rs.getInt("mount"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Product getProductByID(String id) {
        String sql = "SELECT * FROM product WHERE id=?";
        try ( PreparedStatement st = connection.prepareStatement(sql)) {
            st.setString(1, id);
            try ( ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    Product p = new Product();
                    p.setId(rs.getInt("id"));
                    p.setName(rs.getString("name"));
                    p.setImage(rs.getString("image"));
                    p.setPrice(rs.getDouble("price"));
                    p.setTitle(rs.getString("title"));
                    p.setDescription(rs.getString("description"));
                    p.setMount(rs.getInt("mount"));
                    return p;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Account getAccountByID(String id) {
        String sql = "SELECT * FROM [dbo].[Account] WHERE uID=?";
        try ( PreparedStatement st = connection.prepareStatement(sql)) {
            st.setString(1, id);
            try ( ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    Account p = new Account();
                    p.setId(rs.getInt("uID"));
                    p.setUser(rs.getString("user"));
                    p.setGmail(rs.getString("gmail"));
                    p.setAddress(rs.getString("address"));
                    p.setPhone(rs.getString("phone"));
                    return p;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Product getProductByID1(String id) {
        String sql = "select * from product where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setMount(rs.getInt(1));
                return p;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    // select * from product where [name] like '%adidas%'
    public List<Product> getProductByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where [name] like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + txtSearch + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // select * from account where [user]='adam' and pass='123456'
    public Account login(String user, String pass) {
        String sql = "select * from account where [user]=? and pass=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("uID"));
                a.setUser(rs.getString("user"));
                a.setPass(rs.getString("pass"));
                a.setIsSell(rs.getInt("isSell"));
                a.setIsAdmin(rs.getInt("isAdmin"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    // select * from account where [user]='Adam'
    public Account checkAccountExist(String user) {
        String sql = "select * from account where [user]=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("uID"));
                a.setUser(rs.getString("user"));
                a.setPass(rs.getString("pass"));
                a.setIsSell(rs.getInt("isSell"));
                a.setIsAdmin(rs.getInt("isAdmin"));
                a.setGmail(rs.getString("gmail"));
                a.setAddress(rs.getString("address"));
                a.setPhone(rs.getString("phone"));
                return a;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    // insert into account values('phuccv','140',0,0)
    public void signup(String user, String pass, String gmail, String address, String phone) {
        String sql = "insert into Account values(?,?,0,0,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            st.setString(3, gmail);
            st.setString(4, address);
            st.setString(5, phone);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // delete from product where id=1
    public void deleteProduct(String pid) {
        String sql = "delete from product where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, pid);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void deleteAccount(String aid) {
        String sql = "delete from account where uId=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, aid);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    // select * from product where sell_ID=1
    public List<Product> getProductBySellID(int sid) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product where sell_ID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, sid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // INSERT [dbo].[product] ([name], [image], [price], [title], [description], [cateID], [sell_ID]) VALUES (N'Giày đá bóng', N'https://canary.contestimg.wish.com/api/webimage/5f5ad3f3706bf3003d7acbd3-normal.jpg?cache_buster=10f7d3b88daf4019fa9d8be157793111', 100.0000, N'Giày thể thao nam Adidas Enerergy Falcon EE9844', N'Giày thể thao Adidas Advantage Clean sử dụng chất liệu cao cấp, thoáng khí cả mặt trong và mặt ngoài giúp bạn luôn dễ chịu và thoải mái dù mang trong thời gian dài. Giày Adidas VS Advantage có bộ đế êm ái giúp người đi tận hưởng cảm giác thoải mái cho cả ngày dài vận động. Thời trang vốn là sự quay vòng, và thiết kế đơn giản, cổ điển đại diện cho xu hướng thời trang hoài cổ đang quay trở lại và được giới trẻ đón nhận nồng nhiệt hơn bao giờ hết. Không giống như những loại giày thể thao thông thường, mẫu giày adidas Advantage có kiểu dáng "thon thả" hơn, khiến cho đôi chân không bị trở nên lạc lõng so với đôi giày thể thao vốn bị "mang tiếng" là thô kệch, không đẹp mắt. Thêm nữa, đế của loại giày này được thiết kế theo kiểu đế xuồng 3cm vừa tạo tính đàn hồi cho từng bước đi mà cũng "tiện tay" giúp cho người đi "ăn gian" chiều cao khá đáng kể. Và tất nhiên, điểm cộng tuyệt vời nhất chính là sự phối hợp tuyệt vời từ kiểu dáng đến màu sắc của các nhà thiết kế tài hoa đã làm cho đôi giày phù hợp với mọi giới tính, mọi lứa tuổi, mix được với rất nhiều phong cách khác nhau', 1, 1)
    public void insertProduct(String name, String image, String price, String title, String description, String category, int sid, int mount) {
        String sql = "INSERT [dbo].[product] ([name], [image], [price], [title], [description], [cateID], [sell_ID], [mount]) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, image);
            st.setString(3, price);
            st.setString(4, title);
            st.setString(5, description);
            st.setString(6, category);
            st.setInt(7, sid);
            st.setInt(8, mount);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // update product set [name]='', [image]='', price='', title='', [description]='', cateID='' where id='' 
//    public void editProduct(String name, String image, String price, String title, String description, String category, String pid){
//        String sql="update product set [name]=?, [image]=?, price=?, title=?, [description]=?, cateID=? where id=?";
//        try {
//            PreparedStatement st=connection.prepareStatement(sql);
//            st.setString(1, name);
//            st.setString(2, image);
//            st.setString(3, price);
//            st.setString(4, title);
//            st.setString(5, description);
//            st.setString(6, category);
//            st.setString(7, pid);
//            st.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
    public void editProduct(String name, String image, String price, int mount, String title, String description, String category, String pid) {
        String sql = "update product set [name]=?, [image]=?, price=?, mount=?, title=?, [description]=?, cateID=? where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, image);
            st.setString(3, price);
            st.setInt(4, mount);
            st.setString(5, title);
            st.setString(6, description);
            st.setString(7, category);
            st.setString(8, pid);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // select top 3 * from product
    public List<Product> getTop3() {
        List<Product> list = new ArrayList<>();
        String sql = "select top 3 * from product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    // select * from product order by id offset 3 rows fetch next 3 rows only
    public List<Product> getNext3Product(int amount) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product order by id offset ? rows fetch next 3 rows only";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, amount);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getDouble("price"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public static void main(String[] args) {
        DAO d = new DAO();
        List<Product> listp = d.getAllProduct();
        List<Category> listc = d.getAllCategory();
//        for(Product i:listp){
//            System.out.println(i);
//        }
//        for(Category i:listc){
//            System.out.println(i);
//        }
//        System.out.println(d.getgetLast());
        System.out.println(d.getProductByID("1"));
    }
}

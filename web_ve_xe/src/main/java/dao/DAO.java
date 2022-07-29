/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import entity.Account;
import entity.Category;
import entity.Product;

/**
 *
 * @author trinh
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    public List<Product> getAllProduct() {
    	List<Product> list = new ArrayList<>();
    	String query = "SELECT * FROM wish.product;";
    	try {
    		conn = new DBContext().getConnection();//mo ket noi voi sql
    		ps = conn.prepareStatement(query);
    		rs = ps.executeQuery();
    		while (rs.next()) {
    			list.add(new Product(rs.getInt(1),
    					rs.getString(2),
    					rs.getString(3),
    					rs.getInt(4),
    					rs.getString(5),
    					rs.getString(6)));
    		}
    	} catch (Exception e) {
    	}
    	return list;
    }
    public List<Product> getProductByCategory(String cid) {
    	List<Product> list = new ArrayList<>();
    	String query = "SELECT * FROM wish.product \n" + " where cateID = ?";
    	try {
    		conn = new DBContext().getConnection();//mo ket noi voi sql
    		ps = conn.prepareStatement(query);
    		ps.setString(1, cid);
    		rs = ps.executeQuery();
    		while (rs.next()) {
    			list.add(new Product(rs.getInt(1),
    					rs.getString(2),
    					rs.getString(3),
    					rs.getInt(4),
    					rs.getString(5),
    					rs.getString(6)));
    		}
    	} catch (Exception e) {
    	}
    	return list;
    }
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Product getLast() {
        String query = "select top 1 * from product\n"
                + "order by id desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Account login(String email,String pass) {
    	String query = "SELECT * FROM users\r\n"
    			+ "where userEmail = ?\r\n"
    			+ "and userPass = ?";
    		try {
    			 conn = new DBContext().getConnection();//mo ket noi voi sql
    	            ps = conn.prepareStatement(query);
    	            ps.setString(1, email);
    	            ps.setString(2, pass);
    	            rs = ps.executeQuery();
    	            while(rs.next()) {
    	            	return  new Account(rs.getInt(1),
    	            			rs.getString(2),
    	            			rs.getString(3),
    	            			rs.getString(4),
    	            			rs.getString(5),
    	            			rs.getInt(6));
    	            }
			} catch (Exception e) {
				// TODO: handle exception
			}
    	return null;
    }
    public void signup(String username, String phone,String email,String pass,Boolean sex) {
    	String query = "INSERT INTO users \n" 
    				+ "(userName,userPhone, userEmail, userPass, userSex) values " 
    				+"( ?, ?, ?, ?, ?)";
    	try {
    		conn = new DBContext().getConnection();//mo ket noi voi sql
    		ps = conn.prepareStatement(query);
    		ps.setString(1, username);
    		ps.setString(2, phone);
    		ps.setString(3, email);
    		ps.setString(4, pass);
    		ps.setBoolean(5, sex);
    		System.out.println(ps);
    		ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    public Account checkAcccountExist(String userEmail) {
    	String query = "SELECT * FROM users\n"
    			+ "where userEmail = ?;";
    	try {
    		conn = new DBContext().getConnection();//mo ket noi voi sql
    		ps = conn.prepareStatement(query);
    		ps.setString(1, userEmail);
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			return new Account(rs.getInt(1),
            			rs.getString(2),
            			rs.getString(3),
            			rs.getString(4),
            			rs.getString(5),
            			rs.getInt(6));
    			}
    	} catch (Exception e) {
    		// TODO: handle exception
    	}
    	return null;
    }
    public entity.TicketManagement findTicket(String ticketId,String phone) {
    	String query = "SELECT ticketID, userName, userPhone,userEmail, carName,  routeFrom, routeTo,timeFrom, timeTo,carPrice, paymentName\r\n"
    			+ "FROM ticket\r\n"
    			+ "INNER JOIN users ON ticket.userID = users.userID\r\n"
    			+ "INNER JOIN payments ON ticket.paymentID = payments.paymentID\r\n"
    			+ "INNER JOIN times ON ticket.timeID = times.timeID\r\n"
    			+ "INNER JOIN cars ON ticket.carID = cars.carID\r\n"
    			+ "INNER JOIN routes ON ticket.routeID = routes.routeID\r\n"
    			+ "where userPhone = ? and ticketID = ?; ";
    	try {
    			 conn = new DBContext().getConnection();//mo ket noi voi sql
    	         ps = conn.prepareStatement(query);
    	         ps.setString(1, phone);
    	         ps.setString(2, ticketId);
    	         rs = ps.executeQuery();
    	            while(rs.next()) {
    	            	return new entity.TicketManagement(rs.getInt(1),
    	            			rs.getString(2),
    	            			rs.getString(3),
    	            			rs.getString(4),
    	            			rs.getString(5),
    	            			rs.getString(6),
    	            			rs.getString(7),
    	            			rs.getString(8),
    	            			rs.getString(9),
    	            			rs.getInt(10),
    	            			rs.getString(11));
    	            }
			} catch (Exception e) {
				// TODO: handle exception
			}
    	return null;
    }
    //    public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<Product> list = dao.getProductByCategory("2");
//        List<Category> listC = dao.getAllCategory();
//
//        for (Product o : list) {
//            System.out.println(o);
//        }
//        Account a= dao.login("hoangvanchien2206@gmail.com", "123456");
//        System.out.println(a);
//    }

}

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
import entity.ticket;
import entity.trip;

/**
 *
 * @author trinh
 */
public class DAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<trip> getAllTrip() {
		List<trip> list = new ArrayList<>();
		String query = "SELECT tripID,carName, carNumberSlot, carPrice, routeFrom, routeTo, timeFrom, timeTo\r\n"
				+ "FROM vexe.trips\r\n" + "INNER JOIN cars ON trips.carID = cars.carID\r\n"
				+ "INNER JOIN times ON trips.timeID = times.timeID\r\n"
				+ "INNER JOIN routes ON trips.routeID = routes.routeID\r\n"
				+ "where routeFrom = 'Đà Nẵng' and routeTo = 'Sài Gòn' and timeFrom like '2022-08-10%' ";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new trip(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8)));
			}

		} catch (Exception e) {

		}
		return list;
	}

	public Account login(String email, String pass) {
		String query = "SELECT * FROM users\r\n" + "where userEmail = ?\r\n" + "and userPass = ?";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public void signup(String username, String phone, String email, String pass, Boolean sex) {
		String query = "INSERT INTO users \n" + "(userName,userPhone, userEmail, userPass, userSex) values "
				+ "( ?, ?, ?, ?, ?)";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, phone);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setBoolean(5, sex);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void signupQuess(String nameuser, String phone, String email) {
		String query = "INSERT INTO users  (userName,userPhone, userEmail)"
				+" values( ?,?,?);";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, nameuser);
			ps.setString(2, phone);
			ps.setString(3, email);
			ps.executeUpdate(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Account checkAcccountExist(String userEmail) {
		String query = "SELECT * FROM users\n" + "where userEmail = ?;";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, userEmail);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public int getUserIdQuess(String phone, String email) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM users\r\n" + "where  userPhone = ? " + "and  userEmail = ?\r\n ";
		System.out.println("sdfd");
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, phone);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public entity.TicketManagement findTicket(String ticketId, String phone) {
		String query = "SELECT ticketID, userName, userPhone,userEmail, carName,  routeFrom, routeTo,timeFrom, timeTo,carPrice, paymentName\r\n"
				+ "FROM ticket\r\n" + "INNER JOIN users ON ticket.userID = users.userID\r\n"
				+ "INNER JOIN payments ON ticket.paymentID = payments.paymentID\r\n"
				+ "INNER JOIN times ON ticket.timeID = times.timeID\r\n"
				+ "INNER JOIN cars ON ticket.carID = cars.carID\r\n"
				+ "INNER JOIN routes ON ticket.routeID = routes.routeID\r\n" + "where userPhone = ? and ticketID = ?; ";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setString(1, phone);
			ps.setString(2, ticketId);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new entity.TicketManagement(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getInt(10), rs.getString(11));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public void signupTicket(ticket Ticket) {
//		String query = "INSERT INTO users \n" + "(userName,userPhone, userEmail, userPass, userSex) values "
//				+ "( ?, ?, ?, ?, ?)";
//		try {
//			conn = new DBContext().getConnection();// mo ket noi voi sql
//			ps = conn.prepareStatement(query);
//			ps.setString(1, username);
//			ps.setString(2, phone);
//			ps.setString(3, email);
//			ps.setString(4, pass);
//			ps.setBoolean(5, sex);
//			ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

	// public static void main(String[] args) {
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

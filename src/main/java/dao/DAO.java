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
import entity.TicketManagement;
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
			System.out.println(ps);
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

	public entity.TicketManagement findTicketByPhoneAndIdTicket(String ticketId, String phone) {
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

	public List<trip> searching(String routeFrom, String routeTo, String timeFrom) {
		List<trip> list = new ArrayList<>();
		String query = "SELECT tripID, carName, carNumberSlot, carType, carPrice, routeFrom, routeTo, timeFrom, timeTo \n"
				+ "FROM trips \n" + "INNER JOIN cars ON trips.carID = cars.carID \n "
				+ "INNER JOIN times ON trips.timeID = times.timeID \n"
				+ "INNER JOIN routes ON trips.routeID = routes.routeID \n"
				+ "where routeFrom = ? and routeTo = ? and timeFrom like ?";

		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, routeFrom);
			ps.setString(2, routeTo);
			ps.setString(3, timeFrom + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new trip(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	public int getCarIdByTripId(int tripid) {
		String tripId = String.valueOf(tripid);
		String query = "SELECT * FROM trips\n" + "where tripID = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, tripId);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(2);
			}
		} catch (Exception e) {

		}
		return 0;
	}

	public int getTimeIdByTripId(int tripid) {
		String tripId = String.valueOf(tripid);
		String query = "SELECT * FROM trips\n" + "where tripID = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, tripId);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(3);
			}
		} catch (Exception e) {

		}
		return 0;
	}

	public int getRouteIdByTripId(int tripid) {
		String tripId = String.valueOf(tripid);
		String query = "SELECT * FROM trips\n" + "where tripID = ?";
		try {
			conn = new DBContext().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, tripId);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(4);
			}
		} catch (Exception e) {

		}
		return 0;
	}

	public int getUserIdQuess(String phone, String email) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM users\n" + "where userPhone = ? and  userEmail = ?";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);

			ps.setString(1, phone);
			ps.setString(2, email);
			rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	public void signupTicket(ticket Ticket) {
		String query = "INSERT INTO `vexe`.`ticket` " + " (`userID`, `paymentID`, `carID`, `timeID`, `routeID`) VALUES "
				+ "(?,?,?,?,?);";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setInt(1, Ticket.getUserID());
			ps.setInt(2, Ticket.getPaymentID());
			ps.setInt(3, Ticket.getCarID());
			ps.setInt(4, Ticket.getTimeID());
			ps.setInt(5, Ticket.getRouteID());
			rs = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void signupQuess(String nameuser, String phone, String email) {
		String query = "INSERT INTO users  (userName,userPhone, userEmail)\n" + "	values( ?,?,?)";
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

	public List<TicketManagement> findTicketByUserID(int userID) {
		List<TicketManagement> list = new ArrayList<TicketManagement>();
		String query = "SELECT ticketID, userName, userPhone,userEmail, carName,  routeFrom, routeTo,timeFrom, timeTo,carPrice, paymentName,ticket.userID\r\n"
				+ "FROM ticket\r\n" + "INNER JOIN users ON ticket.userID = users.userID\r\n"
				+ "INNER JOIN payments ON ticket.paymentID = payments.paymentID\r\n"
				+ "INNER JOIN times ON ticket.timeID = times.timeID\r\n"
				+ "INNER JOIN cars ON ticket.carID = cars.carID\r\n"
				+ "INNER JOIN routes ON ticket.routeID = routes.routeID\r\n" + "where ticket.userID = ? ";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.setInt(1, userID);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new entity.TicketManagement(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getInt(10), rs.getString(11)));
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public int getTicketIdSignUp() {
		String query = "SELECT * FROM vexe.ticket\n" + "where ticketID = (SELECT MAX(ticketID)\n"
				+ "FROM vexe.ticket)\n";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	public TicketManagement getLastTicket() {
		String query = "SELECT * FROM vexe.ticket\n" + "where ticketID = (SELECT MAX(ticketID)\n"
				+ "FROM vexe.ticket)\n";
		try {
			conn = new DBContext().getConnection();// mo ket noi voi sql
			ps = conn.prepareStatement(query);
			ps.executeUpdate();
			if (rs.next()) {
				return (new entity.TicketManagement(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getInt(10), rs.getString(11)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public static void main(String[] args) {
		DAO dao = new DAO();
		TicketManagement t = dao.findTicketByPhoneAndIdTicket("7","3");
		System.out.println(t);
	}
}

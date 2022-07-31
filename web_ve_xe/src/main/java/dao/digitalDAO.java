package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import entity.trip;

public class digitalDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	DBContext db = new DBContext();
	public List<trip> searching(String routeFrom, String routeTo, String timeFrom){
		List<trip> list = new ArrayList<>();
		String query="SELECT tripID, carName, carNumberSlot, carType, carPrice, routeFrom, routeTo, timeFrom, timeTo \n" +
					 "FROM vexe.trips \n" +
					 "INNER JOIN cars ON trips.carID = cars.carID \n " +
					 "INNER JOIN times ON trips.timeID = times.timeID \n" +
					 "INNER JOIN routes ON trips.routeID = routes.routeID \n" +
					 "where routeFrom = ? and routeTo = ? and timeFrom like ?";
		
		try {
			conn= new DBContext().getConnection();
			ps= conn.prepareStatement(query);
			ps.setString(1, routeFrom);
			ps.setString(2, routeTo);
			ps.setString(3, timeFrom +"%");
			rs= ps.executeQuery();
			while (rs.next()) {
				list.add(new trip(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
			}
		}catch(Exception e) {
			
		}
		return list;
	}
	

		}

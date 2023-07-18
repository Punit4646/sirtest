package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.employee;

public class employeeDao {

		public static void insertemployee(employee e) {
			try {
				Connection conn = DBConnection.createConnection();
				String sql = "insert into employee(name,contact,gender,address,dob,email,password) values(?,?,?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, e.getName());
				pst.setLong(2, e.getContact());
				pst.setString(3, e.getGender());
				pst.setString(4, e.getAddress());
				pst.setString(5, e.getDob());
				pst.setString(6, e.getEmail());
				pst.setString(7, e.getPassword());
				pst.executeUpdate();
				System.out.println("data inserted");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	
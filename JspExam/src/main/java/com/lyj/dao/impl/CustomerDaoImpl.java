package com.lyj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Customer;
import com.lyj.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
	
	

	public ResultSet customerExist(Connection conn, Customer cust) throws SQLException {
		String sql = "select * from customer where first_name = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cust.getFirst_name());
		return ps.executeQuery();
		
	}

}

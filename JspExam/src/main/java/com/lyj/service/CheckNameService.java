package com.lyj.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Customer;
import com.lyj.dao.CustomerDao;
import com.lyj.dao.impl.CustomerDaoImpl;
import com.lyj.util.ConnectionFactory;

public class CheckNameService {

	private CustomerDao cd = new CustomerDaoImpl();
	
	public boolean check(Customer cust){
		boolean b = false;
		
		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		try {
			
			
			ResultSet rs = cd.customerExist(conn, cust);
			while(rs.next()){
				b = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return b;
		
	}

}

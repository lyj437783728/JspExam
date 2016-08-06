package com.lyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Customer;

public interface CustomerDao {

	public ResultSet customerExist(Connection conn,Customer cust)throws SQLException;
}

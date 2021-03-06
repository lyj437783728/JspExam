package com.lyj.util;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	
    private static final ConnectionFactory factory = new ConnectionFactory();
    
    private Connection conn;
	
	static {
		Properties prop = new Properties();
		try {
			InputStream in =ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");
			prop.load(in);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("============配置文件读取错误=============");
			e.printStackTrace();
		}
		
		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}
	
	private ConnectionFactory(){
		
	}
	
	public static ConnectionFactory getInstance(){
		return factory;
	}
	
	public Connection getConnection(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl,user,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}

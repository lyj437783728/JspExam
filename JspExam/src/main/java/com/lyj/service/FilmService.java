package com.lyj.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lyj.bean.Film;
import com.lyj.dao.FilmDao;
import com.lyj.dao.impl.FilmDaoImpl;
import com.lyj.util.ConnectionFactory;

public class FilmService {

	/**
	 * 显示所有film的相关内容
	 * @return ArrayList
	 */
	public ArrayList getAllFilm(){
		
		ArrayList al = new ArrayList();
		FilmDao fd = new FilmDaoImpl();
		
		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		try {
			
			ResultSet rs = fd.getAll(conn);
			while(rs.next()){
				Film film = new Film();
				film.setFilm_id(rs.getInt(1));
				film.setTitle(rs.getString(2));
				film.setDescription(rs.getString(3));
				film.setLanguage(rs.getString(4));
				al.add(film);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return al;
	}

	/**
	 * 插入一条新的film
	 * @param film
	 * @return
	 */
	public boolean insertFilm(Film film){
		boolean b = false;
		FilmDao fd = new FilmDaoImpl();
		
		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		try {
			
			int i = fd.insert(conn, film);
			if(i == 1){
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
	
	public boolean updateFilm(Film film){
		boolean b = false;
		FilmDao fd = new FilmDaoImpl();
		
		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		try {
			
			int i = fd.update(conn, film);
			if(i == 1){
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

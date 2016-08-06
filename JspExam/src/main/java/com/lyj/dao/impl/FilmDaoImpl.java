package com.lyj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Film;
import com.lyj.dao.FilmDao;

public class FilmDaoImpl implements FilmDao {

	public int insert(Connection conn, Film film) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Connection conn, Long id, Film film) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Connection conn, Film film) throws SQLException {
		return 0;
	}

	public ResultSet getAll(Connection conn) throws SQLException {
		String sql = "select f.film_id,f.title,f.description,l.name from film f,language l where f.language_id = l.language_id";
		PreparedStatement ps = conn.prepareStatement(sql);
		return ps.executeQuery();
	}

}

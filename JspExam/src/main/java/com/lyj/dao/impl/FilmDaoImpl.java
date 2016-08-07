package com.lyj.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Film;
import com.lyj.dao.FilmDao;

public class FilmDaoImpl implements FilmDao {

	public int insert(Connection conn, Film film) throws SQLException {
		int i = 0;
		
		String sql = "insert into film(title,description,language_id) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, film.getTitle());
		ps.setString(2, film.getDescription());
		ps.setInt(3, film.getLanguage_id());
		i = ps.executeUpdate();
		System.out.println(i);
		
		return i;
	}

	public int update(Connection conn, Film film) throws SQLException {
		int i = 0;

		String sql = "update film set title=?,description=?,language_id=? where film_id =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, film.getTitle());
		ps.setString(2, film.getDescription());
		ps.setInt(3, film.getLanguage_id());
		ps.setInt(4, film.getFilm_id());
		i = ps.executeUpdate();
		System.out.println(i);

		return i;
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

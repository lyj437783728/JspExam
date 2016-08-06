package com.lyj.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lyj.bean.Film;



public interface FilmDao {

	public int insert(Connection conn, Film film) throws SQLException;

	public int update(Connection conn, Long id, Film film) throws SQLException;

	public int delete(Connection conn, Film film) throws SQLException;

	public ResultSet getAll(Connection conn)throws SQLException;
}

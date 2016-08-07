package com.lyj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyj.bean.Film;
import com.lyj.service.FilmService;

/**
 * Servlet implementation class UpdateFilmServlet
 */
public class UpdateFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String film_id = request.getParameter("film_id");
		int id = Integer.parseInt(film_id);
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language = request.getParameter("language");
		int language_id = Integer.parseInt(language);
		
		Film film = new Film();
		film.setFilm_id(id);
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		
		FilmService fs = new FilmService();
		if(fs.updateFilm(film)){
			request.setAttribute("msg", "修改成功");
			request.getRequestDispatcher("suc.jsp").forward(request, response);
		}else{
			request.setAttribute("msg", "修改失败");
			request.getRequestDispatcher("err.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

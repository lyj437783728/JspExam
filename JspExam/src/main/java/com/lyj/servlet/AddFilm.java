package com.lyj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lyj.bean.Film;
import com.lyj.service.FilmService;

/**
 * Servlet implementation class AddFilm
 */
public class AddFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language = request.getParameter("language");
		int language_id = Integer.parseInt(language);
		
		Film film =new Film();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		
		FilmService fs = new FilmService();
		if(fs.insertFilm(film)){
			request.setAttribute("msg", "插入成功");
			request.getRequestDispatcher("suc.jsp").forward(request, response);
		}else{
			request.setAttribute("msg", "插入失败");
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

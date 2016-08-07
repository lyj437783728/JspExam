package com.lyj.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.*;

/**
 * Servlet implementation class EditFilmServlet
 */
public class EditFilmServlet extends HttpServlet {
	
	private Configuration cfg ; 
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		cfg = new Configuration();
        cfg.setDefaultEncoding("utf-8");
 
        try {
			cfg.setDirectoryForTemplateLoading(
					new File("src/main/webapp/templates"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("EditFilmServlet:"+request.getContextPath());
		
		
		
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language = request.getParameter("language");
		
		Map root = new HashMap();
		root.put("id", id);
		root.put("title", title);
		root.put("description", description);
		root.put("language", language);
		
		Template t = cfg.getTemplate("editFilm.ftl");
		
		
		Writer out = new OutputStreamWriter(new FileOutputStream("src/main/webapp/editfilm.html"),"UTF-8");
		try {
            t.process(root, out);
        } catch (TemplateException e) {
        	throw new ServletException(
                    "Error while processing FreeMarker template", e);
        }
		
		request.getRequestDispatcher("editfilm.html").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

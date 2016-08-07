package com.lyj.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class PermissionFilter
 */
public class PermissionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PermissionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String servletPath = request.getServletPath();
		System.out.println("Servlet Path ==> " + servletPath);
		
		HttpSession session = request.getSession();
		String flag = (String) session.getAttribute("LoginInfo");
		
		if((servletPath != null) 
				&& servletPath.equals("/index.jsp") || servletPath.equals("/login.jsp") || servletPath.equals("/CheckName")){
			chain.doFilter(request, response);
		}else{
			if (flag != null && flag.equals("success")) {
				chain.doFilter(servletRequest, servletResponse);
			}else{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

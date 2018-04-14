package com.another.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Filter implements javax.servlet.Filter {
	private static List<String> paths = null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession();
		String requestPath = request.getServletPath();
		if (paths.contains(requestPath)) {
			chain.doFilter(request, response);
		} else if (session.getAttribute("user") == null) {
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath+"/jsp/other/login.jsp");
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		String path = arg0.getInitParameter("paths");
		String[] args = path.split(",");
		paths = Arrays.asList(args);

	}

}

package com.hdu.library.filter;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class RequestFilter implements Filter {

	@Override
	public void destroy() {	
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		
        HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        filterChain.doFilter(servletRequest,httpServletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {	
	
	}


}

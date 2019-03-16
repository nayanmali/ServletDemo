package in.ac.adit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Content Length : "+request.getContentLength());
		out.println("<br/>Char Encoding : "+request.getCharacterEncoding());
		out.println("<br/>Context Path : "+request.getContextPath());
		out.println("<br/>Content Type : "+request.getContentType());
		out.println("<br/>Header Names Object : "+request.getHeaderNames());
		
		out.println("<br/>Header Names<br/>");
		Enumeration headerInfo = request.getHeaderNames();
		while(headerInfo.hasMoreElements()) {
			String headerName = (String) headerInfo.nextElement();
			out.println("<br/>"+headerName+":"+request.getHeader(headerName));
			
		}
		
		out.println("<br/>getLocalAddr : "+request.getLocalAddr());
		out.println("<br/>getUserPrincipal : "+request.getUserPrincipal());
		out.println("<br/>getLocalName : "+request.getLocalName());
		out.println("<br/>getLocalPort : "+request.getLocalPort());
		out.println("<br/>getMethod : "+request.getMethod());
		out.println("<br/>getQueryString : "+request.getQueryString());
		out.println("<br/>getPathInfo : "+request.getPathInfo());
		out.println("<br/>getProtocol : "+request.getProtocol());
		out.println("<br/>getRemoteAddr : "+request.getRemoteAddr());
		out.println("<br/>getRemoteUser : "+request.getRemoteUser());
		out.println("<br/>getRemotePort : "+request.getRemotePort());
		out.println("<br/>getRemoteHost : "+request.getRemoteHost());
		
	}
}

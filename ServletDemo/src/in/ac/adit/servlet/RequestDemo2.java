package in.ac.adit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo2
 */
public class RequestDemo2 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Query String " + request.getQueryString());
		out.println("<br/>firstname " + request.getParameter("firstname"));
		out.println("<br/>lastname " + request.getParameter("lastname"));
		out.println("<br/>gendername " + request.getParameter("gendername"));
		out.println("<br/>mobileno " + request.getParameter("mobileno"));
		out.println("<br/>emailaddress " + request.getParameter("emailaddress"));

	}
}

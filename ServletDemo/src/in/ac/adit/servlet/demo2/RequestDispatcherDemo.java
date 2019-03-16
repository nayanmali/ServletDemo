package in.ac.adit.servlet.demo2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo
 */
public class RequestDispatcherDemo extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.sendRedirect("requestdemo3.jsp");
		response.sendRedirect("requestdemo3.jsp");
	}
}

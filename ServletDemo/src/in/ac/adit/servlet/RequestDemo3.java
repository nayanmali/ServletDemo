package in.ac.adit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo3
 */
public class RequestDemo3 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Enumeration<String> requestParameterNames = request.getParameterNames();
		while (requestParameterNames.hasMoreElements()) {
			String parameterNames = requestParameterNames.nextElement();
			out.println("<br/>" + parameterNames + " - " + request.getParameter(parameterNames));

		}
	}
}

package web.servlet;

import java.io.PrintWriter;

public class HelloServlet {
	public void service(PrintWriter out) {
		out.println("<html><h1>Hello Servlet!</h1><br>");
	}
}

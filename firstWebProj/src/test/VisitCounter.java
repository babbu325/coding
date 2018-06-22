package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitCounter")
public class VisitCounter extends HttpServlet {
	int i=0;
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		RequestDispatcher rd = req.getRequestDispatcher("callVisit");
		i+=1;
		PrintWriter out = resp.getWriter();
		out.print(i);
		rd.forward(req, resp);
	}
}

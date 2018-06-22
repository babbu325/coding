

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class javalab12b
 */
@WebServlet("/javalab12b")
public class javalab12b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab12b() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	String name=req.getParameter("name");
	String age=req.getParameter("age");
	String gender=req.getParameter("gender");
	
	int a=Integer.parseInt(age);
	
	
	if(a==60 && gender.equals("m"))
	{	out.println("hellow uncle "+name);
	}
	else
	{
	if(a==60 && gender.equals("f"))
		out.println("hellow anty "+name);
	
	
	else {
		if(a==18 && gender.equals("m"))
		
		out.println("hi dude "+name);
	   
		else out.println(name+"wa madharchod");
	}
	
	}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

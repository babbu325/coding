

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class javalab6b
 */
@WebServlet("/javalab6b")
public class javalab6b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab6b() {
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
	String s=req.getParameter("fib");
	int n=Integer.parseInt(s);
	int f1=0,f2=1,f3;
	if(n==1)out.println(f1);
	if(n==2)out.println(f1+"\t"+f2);
	else{
		out.println(f1+"\t"+f2);
		
		while(n-2 >0)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			out.println("\t"+f3);
			n--;
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

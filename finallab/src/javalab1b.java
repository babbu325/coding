

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class javalab1b
 */
@WebServlet("/javalab1b")
public class javalab1b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab1b() {
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
		String url="jdbc:mysql://localhost:3306/marksheet";
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String pass="";
	    Statement stnt;
	    
	    
	    try{
	    	Class.forName(driver).newInstance();
	    	Connection conn=(Connection) DriverManager.getConnection(url, user, pass);
	    	String sql="select * from makr";
	    	stnt=(Statement) conn.createStatement();
	    	ResultSet rs=stnt.executeQuery(sql);
	    	out.println("<html>");
	    	String f1,f2,f3,f4,f5;
	    	
	    	while(rs.next())
	    	{
	    		f1=rs.getString(1);
	    		f2=rs.getString(2);
	    		f3=rs.getString(3);
	    		f4=rs.getString(4);
	    		f5=rs.getString(5);
	    		
	    		
	    	
		    	int n1=Integer.parseInt(f4);
		    	int n2=Integer.parseInt(f5);
		    	int n3=n1+n2;
		    	String grade;
		    	if(n3>=90)
		    		grade="s";
		    	else if(n3>=75 && n3 <90)
		    		grade="a";
		    	else if(n3>=60 && n3<75)
		    		grade="b";
		    	else if(n3>=50 && n3 < 60)
		    		grade="c";
		    	else
		    		grade="fail";
		    	out.println(f1+ " " +f2+ " " +f3+ " " +f4+ " " +f5+" "+grade+"<br>");
		    	out.println("</body>");
		    	out.println("</html>");
	    	}
	     }
		
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	
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

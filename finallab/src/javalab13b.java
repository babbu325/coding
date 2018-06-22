
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
 * Servlet implementation class javalab13b
 */
@WebServlet("/javalab13b")
public class javalab13b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab13b() {
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
	Statement stmt;
	
	try{
		Class.forName(driver).newInstance();
		Connection conn=(Connection) DriverManager.getConnection(url, user, pass);
		String sql="select name from student where branch='cse' && quota='comed-k'";
		stmt=(Statement) conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		out.println("<html>");
		String f1;
		while(rs.next())
		{
		f1=rs.getString(1);
		out.println(f1+"<br>");
		    out.println("</body>");
			out.println("</html>");
		}
		
		
	}
	catch(Exception e){System.out.println(e);}
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

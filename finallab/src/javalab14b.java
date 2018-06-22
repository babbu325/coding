

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
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class javalab14b
 */
@WebServlet("/javalab14b")
public class javalab14b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab14b() {
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
	PreparedStatement ps;
	String n=req.getParameter("name");
	String p=req.getParameter("paisa");
	String h=req.getParameter("hero");
	String hr=req.getParameter("heroin");
	int pa=Integer.parseInt(p);
	try{
		Class.forName(driver).newInstance();
		Connection conn=(Connection) DriverManager.getConnection(url, user, pass);
		String sql="insert into movie values(?,?,?,?)";
		ps= (PreparedStatement) conn.clientPrepareStatement(sql);
		ps.setString(1, n);
		ps.setInt(2, pa);
		ps.setString(3, h);
		ps.setString(4, hr);
		int r=ps.executeUpdate();
		String sql1="select * from movie";
		ResultSet rs=ps.executeQuery(sql1);		
		out.println("<html>");
		String f1,f2,f3,f4;
		
		while(rs.next())
		{
			
			f1=rs.getString(1);
			f2=rs.getString(2);
			f3=rs.getString(3);
			f4=rs.getString(4);
			out.println(f1+"\t"+f2+"\t"+f3+"\t"+f4);
			
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

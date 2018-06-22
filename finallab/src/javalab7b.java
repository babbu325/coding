

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
 * Servlet implementation class javalab7b
 */
@WebServlet("/javalab7b")
public class javalab7b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public javalab7b() {
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
	String driver ="com.mysql.jdbc.Driver";
	String user="root";
	String pass="";
    Statement stnt;
    try{
    	Class.forName(driver).newInstance();
    	Connection conn= (Connection) DriverManager.getConnection(url, user, pass);
    	String sql="insert into employee values('raju','1ms13cs099','math',10000,'1990-02-04','chapra')";
    	stnt=(Statement) conn.createStatement();
    	 int i=stnt.executeUpdate(sql);
    	 String p="select distinct * from employee";
    	 ResultSet rs=stnt.executeQuery(p);
    	 out.println("<html>");
    	 String f1,f2,f3,f4,f5,f6;
    	 
    	while(rs.next()){
    		f1=rs.getString(1);
    		f2=rs.getString(2);
    		f3=rs.getString(3);
    		f4=rs.getString(4);
    		f5=rs.getString(5);
    		f6=rs.getString(6);
    		
    		out.println(f1+ " " +f2+ " " +f3+ " " +f4+ " " +f5+" "+f6+"<br>");
    		
    		out.println("</body>");
	    	out.println("</html>");
    	}
    	
    	
    	
    }
	catch(Exception e){
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

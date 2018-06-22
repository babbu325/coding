import java.io.*;
import java.net.*;

public class javalb2b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		javalb2b c=new javalb2b();
		
		c.run();
	}

	public void run() throws Exception {
		// TODO Auto-generated method stub
		
		Socket sock=new Socket("localhost", 444);
		PrintStream ps=new PrintStream(sock.getOutputStream());
		ps.println("hello to server");
		InputStreamReader ir=new InputStreamReader(sock.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		String msg=br.readLine();
		System.out.println(msg);
	
			
			
	}

}

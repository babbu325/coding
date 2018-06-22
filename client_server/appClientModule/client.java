import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		client c=new client();
		
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

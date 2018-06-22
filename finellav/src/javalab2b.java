import java.io.*;
import java.net.*;

public class javalab2b {

	public static void main(String[] args) throws Exception {
		

		javalab2b s=new javalab2b();
		
		s.run();
	}

	public void run() throws Exception {
		// TODO Auto-generated method stub
		
		ServerSocket sk=new ServerSocket(444);
		Socket sock=sk.accept();
		InputStreamReader ir=new InputStreamReader(sock.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		String msg=br.readLine();
		System.out.println(msg);
		if(msg != null)
		{
			
			PrintStream ps=new PrintStream(sock.getOutputStream());
			ps.println("massage recieved");
		}
			
			
	}

}

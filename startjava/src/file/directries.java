//this will create directri of files
package file;
import java.io.*;
import java.util.*;

public class directries {

	public static void main(String[] args) throws IOException {
		Scanner sc ;
		
		File file = new File("test1");//doesn't create files
		FileWriter fm = new FileWriter("dim.txt");//create file

		FileWriter f = null;
		System.out.println(new File("dir4").mkdir()); 
		        for (int i = 0; i < 10; i++) {
		            try {
		            f = new FileWriter("dir4/file3"+i+".txt");
		            f.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		}
		        
		 while(sc.hasNext())
			 System.out.println(sc.next());
	}
}

package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) {
    
		Scanner sc;
		// if file exists , then di nothing else create
		/*Formatter x = null;
		try {
			x= new Formatter("file1.txt");
			System.out.println("created a ifle:");
		}
		catch(Exception e){
			System.out.println("Didn't created any file");
		}
		//x.format("%d %d %d %d %d %d %d %d %d",9,7,8,6,7,5,6,4,5,3,4,2 );
		x.close();
		*/
		File f= new File("file1.txt");
		System.out.println(f.exists());
		ArrayList a = new ArrayList();
		try {
			sc= new Scanner(f);
			while(sc.hasNext()){
				a.add(sc.next());
				//System.out.print(a.get(a.size()-1)+" ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.sort(null);
		for(int i=0;i<a.size();i++)
		System.out.print(a.get(i)+" ");
		
		
	}

}
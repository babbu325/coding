package linkedLiat;

import java.util.Scanner;

public class deletefromend {

	class list{
	int data;
	list link;
	
	list()
	{
		this.link=null;
	}
	}  
	
	 list getnode(){
		 list temp=new list();
		 temp.link=null;
		return temp;
		 
	 }
	
	public static void main(String[] args) {
		list root;
		Scanner sc=new Scanner(System.in);
		
		for(;;){
		System.out.println("Enter y/n");
		char c=sc.next().charAt(0);
		if(c=='n') break;
		else{
			
			
			
		}
		
		
		}
	}

}

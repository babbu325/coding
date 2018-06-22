package quad1java2a;

import java.util.Scanner;

class person{
	String name;
	
}

class teacher extends person{
	int salary;
	}

class student extends person
{
String usn;
}

class exam extends student
{
int marks;
}

class awards extends exam implements sports
{

	awards(int m, String u, String n) {
		marks=m;
		usn=u;
		name=n;
		
		
	}

	public awards() {
	
	}
	
}

public class javalab6a {

	
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			
			 System.out.println("enter the marks:");
			 int m=obj.nextInt();
             awards a=new awards(m,"1ms13cs085","ram");
    if(a.marks >=90  && a.mom>2)
    {
    	 System.out.println(a.name + "with usn"+a.usn +"satisfy the conditon and won the award");
    }
    else  System.out.println("land lelo");
   
	//exam e=new exam(90, "1ms13cs085"," ram");
		
		
	}

}

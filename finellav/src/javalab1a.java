

class student
{
String name,usn;
int m1,m2,m3;

student()
{
	name="rrrrrr";
	usn="1ms13";
	m1=22;
	m2=34;
	m3=45;
}
student(String n,String u,int mm1,int mm2,int mm3)
{
	name=n;
	usn=u;
	m1=mm1;
	m2=mm2;
	m3=mm3;
	
}

String setname()
{
	return name;
	
}

String setusn()
{
return usn;	
}


int setm1()
{
	
return m1;}

int setm2()
{
	
return m2;}

int setm3()
{
	
return m3;
}
}

public class javalab1a

{
public static void main(String[] args) {
		// TODO Auto-generated method stub

	student s=new student();
	System.out.println("name=\t" +s.setname()+"\tusn=\t"+s.setusn()+"m1 ,m2,m3-->"+s.setm1()+" "+s.setm2()+" "+s.setm3());
	
	student s2=new student("param","1ms14",55,66,77);
	System.out.println("name=\t" +s2.setname()+"\tusn=\t"+s2.setusn()+"m1 ,m2,m3-->"+s2.setm1()+" "+s2.setm2()+" "+s2.setm3());
	
	student s3=new student("aadi","1ms15",555,643,756);
	System.out.println("name=\t" +s3.setname()+"\tusn=\t"+s3.setusn()+"m1 ,m2,m3-->"+s3.setm1()+" "+s3.setm2()+" "+s3.setm3());
	
	
	}
}


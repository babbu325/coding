package quad2java2a;

import quad1java2a.equation;

class  calculate implements equation
     {
            int a,b,c;
            double root1;
            double root2;
            
       public void rt(int i, int j, int k)
        {
	        a=i;
	        b=j;
	        c=k;
	      try{ 
	        double D= ( b*b - 4*a*c );
	        D= Math.sqrt(D);
	         root1=(-b+D) / (2*a);
	         root2=(-b-D) / (2*a);
	        
            }
	      catch(Exception e){System.out.println(e);}
        
        }//try
       
            
         public double   retroot1()
         { return root1;}
        
         
         public double retroot2()
         {return root2;}
    }

public class root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculate r=new calculate();
		 r.rt(1,-3,5);
		System .out.println("root of equation is:" + r.retroot1() + "\t\t"+r.retroot2());
				
	}

}

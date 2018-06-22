class MathSin extends Thread {
double deg,result;
    public MathSin(double degree)
    {
    deg=degree;    
    }
    public void run()
    {
    deg=Math.toRadians(deg);
    result=Math.sin(deg);  
    }
    

}


 class MathCos extends Thread {
    
    double deg,result;
    public MathCos(double degree)
    {
    deg=degree;    
    }
    public void run()
    {
     deg=Math.toRadians(deg);
    result=Math.cos(deg);    
    }
    

}




class MathTan extends Thread {
    double deg,result;
    public MathTan(double degree)
    {
    deg=degree;    
    }
    public void run()
    {
     deg=Math.toRadians(deg);
    result=Math.tan(deg);    
    }
    
}
public class math {

    public static void main(String[] args) {
        double totaladd;
        MathSin sin=new MathSin(60.0);
        MathCos cos=new MathCos(60.0);
        MathTan tan=new MathTan(60.0);
        sin.start();
        cos.start();
        tan.start();
        try{
            sin.join();
            cos.join();
            tan.join();
            totaladd=sin.result+cos.result+tan.result;
            
            System.out.println("sin(x) + cos(x) +tan(x) :"+totaladd);
            
        }catch(InterruptedException IntExp){
        
        }
    }

}

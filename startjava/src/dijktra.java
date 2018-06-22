import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class dijktra {

	int[] nodevalue;
	private LinkedList list[];
	static Scanner s= new Scanner(System.in);
	public dijktra(int n,int start) {
		nodevalue = new int[n];
		list = new LinkedList[n];
		for(int i=0;i<n;i++){
			nodevalue[i]=9999;
		   list[i] = new LinkedList();
		}
		nodevalue[start]=0;	
		
		//for(int i=0;i<n;i++)
			//System.out.printf(nodevalue[i]+" ");
	}
	
	
	void getadjlist(int n){
		//Scanner sc= new Scanner(System.in);
		
		
		for(int i=0;i<n;i++)
		{   
			int adj=0;
			System.out.println("Enter the adjecency list of " + i +":" ); 
			while(true)
			{
				 adj=s.nextInt();
				if(Character.isLetter(adj))
				break;
				
				else 
					list[i].add(adj);
					// System.out.println("hi");
			}
		}
		
		for(int i=0;i<n;i++)
		{
			Iterator<Integer> it = list[i].iterator();
			while(it.hasNext()){
				System.out.printf(list[i].poll()+" ");
			}
			System.out.println();
			
			
		}
		
		
	}//end of getlist
	

	public static void main(String[] args) {
		
		System.out.println("Enter the no. of vertices:");
		int n= s.nextInt();
		System.out.println("Enter the start node:");
		int start = s.nextInt();
		    dijktra d = new dijktra( n, start);
		
       d.getadjlist(n);
        
		
	}

}

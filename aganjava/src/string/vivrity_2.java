package string;
import java.util.*;;

public class vivrity_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
				String x ="";
		for(int i=0;i<n;i++){
			int pos = Math.abs(a[i]);
			if(a[i]>=0) x = x.concat(s.substring(0,pos+1));
			else x = x.concat(s.substring(pos));
		}
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)=='a' || x.charAt(i)=='e' ||x.charAt(i)=='i' ||x.charAt(i)=='o' ||x.charAt(i)=='u'){
			 list.add(x.charAt(i));
			}
		}
		int q = sc.nextInt();
		while(q-- > 0){
			int k = sc.nextInt();
			if(k <= list.size())System.out.println(list.get(k-1));
			else System.out.println(-1);
			
		}
	}
}

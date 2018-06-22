//http://www.geeksforgeeks.org/smartprix-interview-experience-set-1-on-campus/
package hashmap;

import java.util.HashMap;

public class StringFormatting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Smartprix site india comparison best";
        String s2= "{} is {4} online {3} shopping {} in {}";
        String res="";
		HashMap<Integer, String> hm= new HashMap<Integer,String>();
		int k=0;
		int s=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) == ' '){
				hm.put(k,s1.substring(s,i));
				k++;
				s=i+1;
			}
		}
		hm.put(k, s1.substring(s, s1.length()));
        System.out.println(hm);
        
        int i=0;
        boolean[] check= new boolean[hm.size()];
        int h=0;
        while(i<s2.length()){
        	
        	if(s2.charAt(i)=='{'){
        		
        		if(s2.charAt(i+1)=='}'){
        			
        			for(int c=0;c<hm.size();c++){
        				
        				if(check[c]==false){
        			res += hm.get(c);
        			i=i+2;
        			check[c]=true;
        			break;
        		   }
        		}		
        	}
        		else{
        			res += hm.get(s2.charAt(i+1)-'0');
        			check[s2.charAt(i+1)-'0']=true;
        			res += " ";
        			i=i+3;
        		}
        	}
        	else
        	{
        		res+=s2.charAt(i);
        		i++;
        		
        	}
        }
        System.out.println(res);
        for(int q=0;q<check.length;q++)
        System.out.print(check[q]+" ");
	}
}















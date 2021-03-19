import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		String s="AB";
		int n=1;
		
		System.out.println(solution(s,n));
	}
	   public static String solution(String s, int n) {
		   StringBuilder sb=new StringBuilder();
		   char[] arr=s.toCharArray();
		   
		   for(int i=0; i<s.length(); i++)
		   {
			   if(arr[i]==' ')
				   sb.append(arr[i]);
			   if(Character.isLowerCase(arr[i]))
			   {
				   if((arr[i]+n)>'z')
				   {
					   arr[i]+=n-26;
					   sb.append(arr[i]);
				   }
				   else
				   {
					   arr[i]+=n;
					   sb.append(arr[i]);
				   }
				   
			   }
			   else if(Character.isUpperCase(arr[i]))
			   {
				   if((arr[i]+n)>'Z')
				   {
					   arr[i]+=n-26;					  
					   sb.append(arr[i]);
				   }
				   else
				   {
					   arr[i]+=n;
					   sb.append(arr[i]);
				   }
			   }
		   }
		      
		   return sb.toString();
	    }
}
	
	



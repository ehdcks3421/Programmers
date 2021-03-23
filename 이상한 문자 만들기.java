import java.util.*;

public class Level1 {
	public static void main(String[] args) {	
		String s="TRY    HELLO WORLD";
		System.out.println(solution(s));
	}
	public static String solution(String s) {
        String answer = "";
        StringTokenizer st=new StringTokenizer(s," ",true);
        StringBuilder sb=new StringBuilder();
        
        while(st.hasMoreTokens())
        {
        	String word=st.nextToken();
        	for(int i=0; i<word.length(); i++)
        	{
        		if(i%2==0)
        			sb.append(word.toUpperCase().charAt(i));
        		else
        			sb.append(word.toLowerCase().charAt(i));
        	}
        }
        
        return sb.toString();
    }	   
}
	
	



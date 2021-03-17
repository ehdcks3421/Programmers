import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		int n=10;
		System.out.println(solution(n));
	}
	public static String solution(int n) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<n; i++)
        {
        	if(i%2==0)
        		sb.append("¼ö");
        	else
        		sb.append("¹Ú");
        }
        return sb.toString();

	}
}
	
	



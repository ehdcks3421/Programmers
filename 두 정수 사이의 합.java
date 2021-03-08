//2월 29일까지
//1월 1일은 금요일
import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=3;
		
		System.out.println(solution(a,b));
	}
	   public static long solution(int a, int b) {
	        long answer = 0;
	        if(a<=b)
	        {
	        	for(int i=a; i<=b; i++)
	        	{
	        		answer+=i;
	        	}
	        }
	        else if(a>b)
	        {
	        	for(int i=b; i<=a; i++)
	        	{
	        		answer+=i;
	        	}
	        }
	        
	        return answer;
	    }

	

}

	
	



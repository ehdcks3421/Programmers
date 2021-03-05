//2월 29일까지
//1월 1일은 금요일
import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=30;
		
		System.out.println(solution(a,b));
		
	}
	
    public static String solution(int a, int b) {
    	int[] Month= {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
    	String[] Date= {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    	int count=0;
    	
    	for(int i=1; i<a; i++)
    	{
    		count+=Month[i-1];
    	}
    	
    	count+=(b-1);

        String answer = Date[count%7];
    
        return answer;
    }
}
	



import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mmm";
		
		System.out.println(solution(s));
	}
	static boolean solution(String s)
	{
		boolean answer=true;
		int num=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.toLowerCase().charAt(i)=='p') num++;
			else if(s.toLowerCase().charAt(i)=='y') num--;	
		}
		
		if(num!=0) answer=false;
		
		return answer;
	}
}
	
	



import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="222234";
		System.out.println(solution(s));
	}
	
    public static boolean solution(String s) {
        boolean answer = true;
        char[] ch=s.toCharArray();
        
        if(s.length()==4 || s.length()==6)
        {
        for(int i=0; i<ch.length; i++)
        {
        	if('0'<=ch[i] && ch[i]<='9')
        		continue;
        	else
        		return false;
        }
        }
        else answer=false;
        
        return answer;
    }
}
	
	



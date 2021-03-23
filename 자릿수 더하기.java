import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		int n=123;
		System.out.println(solution(n));
		}
    public static int solution(int n) {
        int answer = 0;
        String s=Integer.toString(n);
        
        for(int i=0; i<s.length(); i++)
        {
        	answer+=Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return answer;
    }

}
	
	



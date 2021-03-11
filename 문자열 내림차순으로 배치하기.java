import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ZAbcdefg";
		
		System.out.println(solution(s));
	}
	
        public static String solution(String s) {
        	char[] ch=s.toCharArray();
        	Arrays.sort(ch);
        	
        	return new StringBuilder(String.valueOf(ch)).reverse().toString();
        			
        }
}
	
	



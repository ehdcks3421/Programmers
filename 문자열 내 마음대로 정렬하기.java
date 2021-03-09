import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strings[]= {"abce", "abcd", "cdx"};
		int n=2;
		
		for(int i=0; i<strings.length; i++)
				System.out.print(solution(strings, n)[i]+" ");
	}
    public static String[] solution(String[] strings, int n) {
    	
    	Arrays.sort(strings, new Comparator<String>() {
    		public int compare(String s1, String s2)
    		{
    			char c1=s1.charAt(n);
    			char c2=s2.charAt(n);
    			
    			if(c1==c2)
    				return s1.compareTo(s2);
    			else
    				return c1-c2;
    		}
		});
    	
    	return strings;
    }
}
	
	



import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		long n =12345;
		System.out.println(solution(n));
	}
        public static ArrayList<Integer> solution(long n) {
            ArrayList<Integer> arr=new ArrayList<>();
            String s=Long.toString(n);
            for(int i=s.length()-1; i>=0; i--)
            {
            	arr.add(Integer.parseInt(Character.toString(s.charAt(i))));
            }
            
            return arr;
        }
}
	
	



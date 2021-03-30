import java.util.*;
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        int index=0;
        long term=x;
        while(index!=n)
        {
        	answer[index]=x;
        	x+=term;
        	index++;
        }
        
        return answer;
    }
}

public class Level1 {
	public static void main(String[] args) {
		Solution s=new Solution();
		long x=2;
		int n=5;
		System.out.println(Arrays.toString(s.solution(x, n)));
				
	}
}
	
	



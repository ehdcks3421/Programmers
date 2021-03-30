import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int X=x;
        int sum=0;
        
        while(x!=0)
        {
        	sum+=(x%10);
        	x/=10;
        }
        
        if(X%sum==0)
        	answer=true;
        
        return answer;
    }
}

public class Level1 {
	public static void main(String[] args) {
		Solution s=new Solution();
		int x=9000;
		System.out.println(s.solution(x));
	}
}
	
	



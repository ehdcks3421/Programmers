import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		int n=626331;
		System.out.println(solution(n));
	}
    	public static int solution(int n) {
    		long num=n; //�����÷ο찡 �߻��ϱ� ������ long������ �ٲ㼭 Coding
    		int answer = 0;
    		
    		while(num!=1)
    		{
    			if(num%2==0)
    				num/=2;
    			else if(num%2!=0)
    				num=(num*3)+1;
    			
    			answer++;
    			
    			if(answer>=500)
    			{
    				answer=-1;
    				break;
    			}
    			
    		}
    		
    		return answer;
    	}
 	}
	
	



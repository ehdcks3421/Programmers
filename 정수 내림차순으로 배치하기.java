import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		long n =118372;
		System.out.println(solution(n));;
	}
    public static long solution(long n) {
    	long answer=0;
    	Integer[] arr=new Integer[Long.toString(n).length()];
    	StringBuilder sb=new StringBuilder();
    	int index=0;
    	
    	while(n!=0)
    	{
    		arr[index]=(int) (n%10);
    		n/=10;
    		index++;
    	}
    	
    	Arrays.sort(arr, Collections.reverseOrder()); //내림차순
    	
    	for(int i=0; i<arr.length; i++)
    	{
    		sb.append(arr[i]);
    	}
    	
    	answer=Long.valueOf(sb.toString());
    	
    	return answer;
    }
}
	
	



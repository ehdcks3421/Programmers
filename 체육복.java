import java.util.*;

public class Level1 {
	
	static int count=0;
	static ArrayList<Integer> list=new ArrayList<Integer>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int[] lost= {2,4};
		int[] reserve= {1,3,5};
		
	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        for(int i=0; i<lost.length; i++) //여벌옷이 있는 친구가 도난을 당하였을 때
        	for(int j=0; j<reserve.length; j++)
        	{
        		if(lost[i]==reserve[j])
        		{
        			answer++;
        			lost[i]=-1;
        			reserve[j]=-1;
        			break;
        		}
        	}
        
        
        for(int i=0; i<lost.length; i++)
        {
        	for(int j=0; j<reserve.length; j++)
        	{
        		if(lost[i]-1==reserve[j] || lost[i]+1==reserve[j])
        		{
        			answer++;
        			lost[i]=-1;
        			reserve[j]=-1;
        			break;
        		}
        	}
        }
        
        
        return answer;
    }
}
	



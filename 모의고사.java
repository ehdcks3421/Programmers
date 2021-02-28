import java.util.*;


public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers= {1,3,2,4,2,2,2,3,4,4,4,4,4};
	
		
		for(int i=0; i<solution(answers).length; i++)
		 System.out.println(solution(answers)[i]);
		
	}
	 public static int[] solution(int[] answers) {
	        
	        int[] a= {1,2,3,4,5};
	        int[] b= {2,1,2,3,2,4,2,5};
	        int[] c= {3,3,1,1,2,2,4,4,5,5};
	        int[] result= {0,0,0};
	        
	        for(int i=0; i<answers.length; i++)
	        {
	        	if(answers[i] == a[i%5]) result[0]++;
	        	if(answers[i] == b[i%8]) result[1]++;
	        	if(answers[i] == c[i%10]) result[2]++;
	        }
	        
	        int max=0;
	        for(int i=0; i<result.length; i++)
	        {
	        	if(result[i] > max) max=result[i];
	        }
	        
	        int maxCount=0;
	        for(int i=0; i<result.length; i++)
	        {
	        	if(result[i]==max) maxCount++;
	        }
	        
	        int[] answer =new int[maxCount];
	        int idx=0;
	        for(int i=0; i<result.length; i++)
	        {
	        	if(max==result[i]) answer[idx++]=i+1; 
	        }
	        
	        
	        return answer;
	    }
}
	



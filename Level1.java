import java.util.*;

public class Level1 {
	static ArrayList<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves={1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	    public static int solution(int[][] board, int[] moves) {
	    	
	        int answer = 0;
	        
	        for(int i=0; i<moves.length; i++)
	        {
	        	for(int j=0; j<board.length; j++)
	        	{
	        		if(board[j][moves[i]-1]!=0)
	        		{
	        			list.add(board[j][moves[i]-1]);
	        			board[j][moves[i]-1]=0;
	        			break;
	        		}	
	        	}	
	        }
	        
	        for(int k=0; k<list.size(); k++)
	        {
	        	if(k==list.size()-1)
	        		break;
	        	else if(list.get(k)==list.get(k+1))
	        	{
	        		list.remove(k);
	        		list.remove(k);
	        		answer+=2;	        		
	        		k=-1;
	        		
	        	}
	        }
	        
	        return answer;
	    }
	}
	



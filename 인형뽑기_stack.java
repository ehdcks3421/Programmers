import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves={1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
	    public static int solution(int[][] board, int[] moves) {
	    	
	        int answer = 0;
	        Stack<Integer> stack=new Stack<>();
	        
	        for(int i=0; i<moves.length; i++)
	        {
	        	int m=moves[i]-1;
	        	for(int j=0; j<board.length; j++)
	        	{
	        		if(board[j][m]!=0)
	        		{
	        			if(stack.empty())
	        				stack.push(board[j][m]);
	        			else 
	        			{
	        				if(stack.peek() == board[j][m])
	        				{
	        					stack.pop();
	        					answer+=2;
	        				}
	        				else
	        					stack.push(board[j][m]);
	        			}
	        			board[j][m]=0;
		        		break;
		        	
	        		}
	        	}
	        }
	        return answer;
	    }
	}
	



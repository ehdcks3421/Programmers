//2월 29일까지
//1월 1일은 금요일
import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,3,3,0,1,1};
		
		System.out.println(solution(arr));
		
	}
    public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        int idx=0;
        for(int i=0; i<arr.length; i++)
        {
        	if(stack.empty())
        	{
        		stack.push(arr[i]);
        		list.add(stack.get(idx++));
        	}
        	else
        	{
        		if(stack.peek()==arr[i]) continue;
        		else
        		{
        			stack.push(arr[i]);
        			list.add(stack.get(idx++));
        		}
        	}
        }
        return list;
    }
}
	



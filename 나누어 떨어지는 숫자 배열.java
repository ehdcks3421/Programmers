import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 9, 7, 10};
		int divisor=5;
		
		System.out.println(solution(arr, divisor));
		
		
	}
	public static ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
        	if(arr[i]%divisor==0)
        	{
        		list.add(arr[i]);
        	}
        }
        
        Collections.sort(list);
        if(list.isEmpty())
        {
        	list.add(-1);
        }
        
        return list;
    }

	

}
	
	



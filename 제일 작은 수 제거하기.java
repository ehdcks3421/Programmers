import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		int arr[]= {10};
		System.out.println(solution(arr));
	}
    public static ArrayList<Integer> solution(int[] arr) {
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	if(arr.length>=2)
    	{
    		for(int i=0; i<arr.length; i++)
    		{
    			list.add(arr[i]);
    		}
    		list.remove(Collections.min(list));
    		
    		return list;
    	}
    	
    	list.add(-1);
    	return list;
    }
	
}
	
	



import java.util.*;



public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,5,2,6,3,7,4};
		int[][] commands= {{2,5,3}, {4,4,1}, {1,7,3}};
		
		
		System.out.println(solution(array, commands));
		
		
	}
    public static ArrayList<Integer> solution(int[] array, int[][] commands) {
        int[] result = {};
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for(int i=0; i<commands.length; i++)
        {
        	result=Arrays.copyOfRange(array, (commands[i][0])-1, (commands[i][1]));
        	Arrays.sort(result);
        	list.add(result[(commands[i][2])-1]);

        }
        return list;
    }
}
	



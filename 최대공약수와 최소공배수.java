import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		int x=85;
		int y=51;
		System.out.println(solution(x,y));
	}
    public static ArrayList<Integer> solution(int x, int y) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int X=x;
        int Y=y;
        while(y!=0)
        {
        	if(x<y)
        	{
        		int temp=0;
        		temp=x;
        		x=y;
        		y=temp;
        	}
        	int R=x%y;
        	x=y;
        	y=R;
        }
        list.add(x);
        list.add((X*Y)/list.get(0));
        return list;
    }    
}
	
	



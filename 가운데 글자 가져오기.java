//2�� 29�ϱ���
//1�� 1���� �ݿ���
import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		System.out.println(solution(s));
	}
    public static String solution(String s) {
        String answer = "";
        if(s.length()%2!=0)
        {
        	answer=s.substring(s.length()/2,s.length()/2+1);
        }
        else if(s.length()%2==0)
        {
        	answer=s.substring(s.length()/2-1,s.length()/2+1);
        }
        return answer;
    }

	
}
	



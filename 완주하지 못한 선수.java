import java.util.*;

public class Level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant= {"leo", "kiki", "eden"};
		String[] completion= {"eden", "kiki"};
		
		System.out.println(solution(participant, completion));
	}
    public static String solution(String[] participant, String[] completion) {
    	String answer=" ";
    	HashMap<String, Integer> map=new HashMap<>();
    	
    	for(String person : participant)
    	{
    		map.put(person, map.getOrDefault(person, 0)+1);
    	}
    	
    	for(String p_minus : completion)
    	{
    		map.put(p_minus, map.getOrDefault(p_minus, 0)-1);
    	}
    	
    	for(String m : map.keySet())
    		if(map.get(m)==1) answer=m;
    	return answer;
    }

}
	



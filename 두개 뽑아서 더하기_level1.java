import java.util.*;

class Solution { 
    
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<Integer>();
        
        
        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                hash.add(numbers[i]+numbers[j]);
            }
        }
        
        Iterator<Integer> iter=hash.iterator();
        while(iter.hasNext())
        {
            list.add(iter.next());
        }
        
        Collections.sort(list);
        
        
        return list;
        
    }
}

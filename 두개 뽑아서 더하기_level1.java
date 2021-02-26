//정수 배열 numbers가 주어집니다. 
//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
//배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

import java.util.*;

class Solution {     
    public ArrayList<Integer> solution(int[] numbers) { //return type을 arraylist형태로 하겠다.
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> hash=new HashSet<Integer>(); //중복제거
        
        
        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                hash.add(numbers[i]+numbers[j]);
            }
        }
        
        Iterator<Integer> iter=hash.iterator(); //hashset을 배열 형태로 바꿔준다.
        while(iter.hasNext()) //iter배열에 값이 있다면
        {
            list.add(iter.next()); //list에 값을 넣어주겠다.
        }
        
        Collections.sort(list); //오름차순으로 정렬
        
        
        return list;
        
    }
}

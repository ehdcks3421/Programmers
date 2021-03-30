import java.util.*;

class Solution {
    public String Phone(String phone_number) {
    	StringBuilder sb=new StringBuilder();
    	char[] ch=phone_number.toCharArray();
    	
    	for(int i=0; i<phone_number.length()-4; i++)
    	{
    		ch[i]='*';
    	}
    	
    	return String.valueOf(ch);
    }
}

public class Level1 {
	public static void main(String[] args) {
		Solution s=new Solution();
		String number="01041935767";
		System.out.println(s.Phone(number));
	}
}
	
	



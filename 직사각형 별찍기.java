import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Level1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int row=Integer.parseInt(st.nextToken());
		int column=Integer.parseInt(st.nextToken());
	
		for(int i=0; i<column; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
				
	}
}
	
	



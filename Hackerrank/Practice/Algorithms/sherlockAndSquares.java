import java.util.*;
import java.io.*;
public class sherlockAndSquares{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int testcases,min,max;

		testcases=Integer.parseInt(obj.readLine());
		for (int i=0;i<testcases;i++){
			int count=0;
			String input [] = obj.readLine().split(" ");
			min=Integer.parseInt(input[0]);
			max=Integer.parseInt(input[1]);

			for (int j=min;j<=max;j++)
				if(((int)(Math.sqrt(j)))>0)
					count++;
				System.out.println(count);
		}
	} 
}
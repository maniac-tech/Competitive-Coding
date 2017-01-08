import java.util.*;
import java.io.*;
public class binaryNumber{
	public static void main (String [] args)throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int n=Integer.parseInt(obj.readLine());
		int i=0;
		int count=0;
		int tempCount=0;
		Map <Integer,Integer> myMap = new HashMap <Integer,Integer>();
		while (n>0){
			int temp = n%2;
			n/=2;
			myMap.put(i,temp);
			i++;
		}

		for (int j=i-1;j>=0;j--){
			if(myMap.get(j)==1)
				count++;
			else if (myMap.get(j)==0)
				if (count>tempCount){
					tempCount=count;
					count=0;
				}
				else{
					count=0;
				}
		}
		if (tempCount>=count)
			System.out.println(tempCount);
		else
			System.out.println(count);	
	}
}
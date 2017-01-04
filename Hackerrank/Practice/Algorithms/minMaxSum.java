import java.io.*;
import java.util.Arrays;
public class minMaxSum{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		// System.out.println("Enter the array:");
		String input [] = obj.readLine().split(" ");
		long arr [] = new long [5];
		long min=0,max=0;
		for (int i=0;i<5;i++)
			arr[i]=Long.parseLong(input[i]);

		Arrays.sort(arr);
		for (int i=0;i<5;i++){
			if (i>=0 && i<=3) 
				min+=arr[i];
			if (i>=1 && i<=4)
				max+=arr[i];
		}

		System.out.print (min+" "+max);
	}
}
import java.io.*;
public class array_ds{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int n=Integer.parseInt(obj.readLine());
		int arr [] = new int[n];
		String input [] = obj.readLine().split(" ");
		for (int i=0;i<n;i++)
			arr [i]=Integer.parseInt(input[i]);
		
		for (int i=n-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}
import java.io.*;
public class sortingTutorial{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int v=Integer.parseInt(obj.readLine());
		int n=Integer.parseInt(obj.readLine());
		String input []=obj.readLine().split(" ");
		int arr[]=new int[n];

		for (int i=0;i<n;i++)
			arr[i]=Integer.parseInt(input[i]);

		for (int i=0;i<n;i++)
			if (arr[i]==v)
				System.out.println(i);
	}
}
import java.io.*;
public class sumPairs{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input []= obj.readLine().split(" ");
		String input_array[]=obj.readLine().split(" ");

		int n=Integer.parseInt(input[0]);
		int k=Integer.parseInt(input[1]);
		int arr [] = new int[n];
		int pair=0;

		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(input_array[i]);

		for (int i=0;i<n;i++)
			for (int j=i;j<n;j++)
				if (i<j)
					if ((arr[i]+arr[j])%k==0)
						pair++;

		System.out.println(pair);
	}
}
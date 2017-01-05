import java.io.*;
public class bonAppetit{
	public static void main(String []args)throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		String input_NK [] = obj.readLine().split(" ");
		String input_cost[]=obj.readLine().split(" ");
		int anna_share=Integer.parseInt(obj.readLine());

		int n=Integer.parseInt(input_NK[0]);
		int k=Integer.parseInt(input_NK[1]);
		int arr_cost[]=new int[n];
		int share=0;

		for (int i=0;i<n;i++)
			arr_cost[i]=Integer.parseInt(input_cost[i]);

		for (int i=0;i<n;i++)
			share+=arr_cost[i];
		
		share/=2;

		if (k!=0 && anna_share==share)
			System.out.println(arr_cost[k]/2);
			
		else
			System.out.println("Bon Appetit");

	}
}
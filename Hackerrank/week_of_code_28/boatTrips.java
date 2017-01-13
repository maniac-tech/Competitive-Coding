import java.io.*;
public class boatTrips{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		String input [] = obj.readLine().split(" ");
		String input_pass[]=obj.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int c=Integer.parseInt(input[1]);
		int m=Integer.parseInt(input[2]);
		int array_pass[]=new int[n];
		int count=0;

		for (int i=0;i<n;i++)
			array_pass[i]=Integer.parseInt(input_pass[i]);

		for (int i=0;i<n;i++){
			if ((m*c)>=array_pass[i])
				count++;
			else
				break;
		}

		if (count==n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
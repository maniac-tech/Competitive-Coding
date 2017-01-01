import java.io.*;
public class sol{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(obj.readLine());
		for (int i=0;i<n;i++)
		{
			for (int k=0;k<(n-i-1);k++)
				System.out.print(" ");
			for (int j=0;j<=i;j++)
				System.out.print("#");
			System.out.println();
		}
	}
} 
/*Problem Code: FLOW002*/
import java.io.*;
/*public*/ class remainder
{
	public static void main (String [] args)throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));

		int t;
		int n1;
		int n2;

		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int ans[] =new int[t];

		for (int i=0;i<t;i++)
		{
			String input []=obj.readLine().split(" ");
			n1 = Integer.parseInt(input[0]);
			n2 = Integer.parseInt(input[1]);

			ans[i]=n1%n2;
		}
		for (int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
		}
	}
}
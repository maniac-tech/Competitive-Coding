/*Problem Code: FLOW001*/

import java.io.*;
/*public*/ class add
{
	public static void main (String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int t=0;
		int A;
		int B;

		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		/*int arr[][]=new int [t][2];*/
		int sum[] = new int[t];

		for (int i=0;i<t;i++)
		{
			String [] input = obj.readLine().split(" ");

			/*System.out.println("Enter A:");*/
			A=Integer.parseInt(input[0]);
			/*System.out.println("Enter B:");*/
			B=Integer.parseInt(input[1]);

			sum[i]=A+B;
		}

		/*System.out.println("Output is:");*/
		for (int i=0;i<t;i++) 
		{
			System.out.println(sum[i]);
		}
	} 
}
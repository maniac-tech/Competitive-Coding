/*Problem Code: FLOW004*/

import java.io.*;
/*public*/ class firstAndLastDigit
{
	public static void main (String [] args)throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));

		int t;
		int num;

		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int ans [] = new int [t];

		for (int i=0;i<t;i++)
		{
			/*System.out.println("Enter number:");*/
			num=Integer.parseInt(obj.readLine());
			ans[i]=sum(num);    
		}

		for (int i=0;i<t;i++)
		{
			/*System.out.println("The sum is:");*/
			System.out.println(ans[i]); 
		}
	}

	public static int sum(int num)
	{
		int num1=num;
		int count=0;

		if (num1<=9)
			return num1;
		else
		{
			count=num1%10;
			num1/=10;

			while (num1>9)
			{
				num1/=10;
			}
			count+=num1;

			return count;
		}
	}
}
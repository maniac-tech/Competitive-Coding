/* Problem Code: FLOW006 */
import java.io.*;
/*public*/ class sumOfDigits
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

		int t;
		int num;

		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int ans[] =new int[t];

		for (int i=0;i<t;i++)
		{
			num=Integer.parseInt(obj.readLine());
			ans[i]=sum(num);	
		}

		for (int i=0;i<t;i++)
		{
			// System.out.println("The sum of digits:");
			System.out.println(ans[i]);	
		}
	}

	public static int sum(int num)
	{
		int num1=num;
		int count=0;	

		while (num1>0)
		{
			int del=num1%10;
			count+=del;
			num1/=10;
		}
		return count;
	}
}
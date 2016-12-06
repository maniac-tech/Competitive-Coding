/*Problem Code: FLOW007*/
import java.io.*;
/*public*/ class reverseNumber
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		int t;
		int num;

		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int ans[]=new int[t];

		for (int i=0;i<t;i++)
		{
			/*System.out.println("Enter number:");*/
			num = Integer.parseInt(obj.readLine());
			ans[i]=reverse(num);
		}

		for (int i=0;i<t;i++) 
		{
			System.out.println(ans[i]);
		}
	}
	public static int reverse (int num)
	{
		int num1=num;
		int new_num=0;
		while (num1>0)
		{
			int del=num1%10;
			new_num+=del;
			new_num*=10;
			num1/=10;
		}
		new_num/=10;

		return new_num;
	}
}
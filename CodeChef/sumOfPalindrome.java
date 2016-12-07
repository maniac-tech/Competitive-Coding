/*Problem Code: SPALNUM*/
import java.io.*;
/*public*/ class sumOfPalindrome
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int t;
		int l,r;

		/*System.out.println("Enter testcases:");*/
		t=Integer.parseInt(obj.readLine());
		
		int extreme [][] = new int[t][2];
		int sum=0;

		for (int i=0;i<t;i++)
		{
			/*System.out.println("Ente the extreme ranges:");*/
			String input []= obj.readLine().split(" ");

			extreme[i][0]=Integer.parseInt(input[0]);
			extreme[i][1]=Integer.parseInt(input[1]);
		}

		for (int j=0;j<t;j++)
		{
			for (int i=extreme[j][0];i<=extreme[j][1];i++)
			{
				sum+=palindrome(i);
			}
			System.out.println(sum);
			sum=0;
		}

	}

	public static int palindrome(int num)
	{
		int n=num;
		int sum=0;
		while (n>0)
		{
			int del=n%10;
			sum+=del;
			sum*=10;
			n/=10;
		}
		sum/=10;
		if (num==sum)
			return sum;
		else
			return 0;
	}
}
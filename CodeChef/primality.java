/*Problem Code: PRB01*/
import java.io.*;
/*public*/ class primality
{
	public static void main (String [] args)throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int t;
		int n;

		/*System.out.println("Enter testcases:");*/
		t=Integer.parseInt(obj.readLine());

		String ans[] = new String [t];
		for (int i=0;i<t;i++)
		{
			n=Integer.parseInt(obj.readLine());
			ans[i]=check(n);
		}

		for (int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
		}
	}

	public static String check(int n)
	{
		int num=n;
		int count=2;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
				break;
			else
				count++;
		}

		if (count==num)
			return "yes";
		else
			return "no";
	}
}
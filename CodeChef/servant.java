/*Problem code: FLOW008*/
import java.io.*;
/*public*/ class servant
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		int t;
		/*System.out.println("Enter testcases:");*/
		t=Integer.parseInt(obj.readLine());
		int ans[]=new int [t];

		for (int i=0;i<t;i++)
		{
			if ((Integer.parseInt(obj.readLine()))<10)
				ans[i]=1;
			else
				ans[i]=-1;
		}
		for (int i=0;i<t;i++)
			if (ans[i]==-1)
				System.out.println("-1");
			else
				System.out.println("What an obedient servant you are!");
	}
}
/*Problem code: FLOW018*/
import java.io.*;
/*public*/ class smallFactorial
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		int t;
		/*System.out.println("Enter testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int ans [] =new int [t];
		for (int i=0;i<t;i++)
		{
			/*System.out.println("Enter number:");*/
			ans[i]=factorial(Integer.parseInt(obj.readLine()));
		}

		for(int i=0;i<t;i++)
			System.out.println(ans[i]);
	}

	public static int factorial(int num)
	{
		int i=1;
		for (int j=1;j<=num;j++)
		{
			i*=j;
		}
		return i;
	} 
}
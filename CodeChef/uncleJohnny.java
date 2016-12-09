/*Problem Code: JOHNY*/
import java.io.*;
/*public*/ class uncleJohnny
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int t;

		/*System.out.println("Enter testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int arr_n[][] = new int [t][100];
		int track_uncle[]=new int[t];
		int n[]=new int[t];

		int ans[] = new int[t];

		for (int i=0;i<t;i++)
		{
			/*System.out.println("Enter no of Songs:");*/
			n[i]=Integer.parseInt(obj.readLine());

			/*System.out.println("Enter the lengths:");*/
			String input [] = obj.readLine().split(" ");

			for (int j=0;j<n[i];j++)
				arr_n[i][j]=Integer.parseInt(input[j]);

			// System.out.println("Enter the position of your fav track:");
			track_uncle[i]=arr_n[i][(Integer.parseInt(obj.readLine())-1)];

		}

		for (int i=0;i<t;i++)
		{
			for (int j=0;j<n[i];j++)
			{
				for (int k=j;k<n[i];k++)
				{
					if (arr_n[i][j]>arr_n[i][k])
					{
						int temp=arr_n[i][j];
						arr_n[i][j]=arr_n[i][k];
						arr_n[i][k]=temp;
					}
				}
			}
		}

		for (int i=0;i<t;i++)
		{
			for (int j=0;j<n[i];j++)
			{
				if (track_uncle[i]==arr_n[i][j]) {
					ans[i]=j+1;
				}
			}
		}

		// System.out.println("The answers are as follows:");
		for (int i=0;i<t;i++)
		{
			System.out.println(ans[i]);
		}


	}
}
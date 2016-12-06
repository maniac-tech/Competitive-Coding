/*Problem Code: SMPAIR*/
import java.io.*;
/*public*/ class smallestSeriesSum
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		int t=0;
		int n=0;
		
		/*System.out.println("Enter Testcases:");*/
		t=Integer.parseInt(obj.readLine());

		int arr[][]=new int[t][t];
		int arr_n[] = new int[t];

		for (int i=0;i<t;i++)
		{
			/*System.out.println("Enter value of N:");*/
			n=Integer.parseInt(obj.readLine());	
			arr_n[i]=n;

			/*System.out.println("Enter series:");*/
			String input [] = obj.readLine().split(" ");	

			for (int j=0;j<n;j++)
			{
				arr[i][j]=Integer.parseInt(input [j]);
			}
		}

		//Ascending Order loop:
		for (int k=0;k<t;k++)
		{
			for (int i=0;i<arr_n[k];i++)
			{
				for (int j=i+1;j<arr_n[k];j++)
				{
					if (arr[k][j]<arr[k][i])
					{
						int temp = arr[k][i];
						arr[k][i]=arr[k][j];
						arr[k][j]=temp;
					}
				}
			}
		}

		for (int i=0;i<t;i++)
		{
				System.out.println(/*"Sum is:"+*/(arr[i][0]+arr[i][1]));
		}
		
	}
}
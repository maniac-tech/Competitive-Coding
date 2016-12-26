import java.io.*;
public class drawingBook
{
	public static void main(String args [])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));

		int n;
		int p;
		int ans=0;
		int count_frwd=0;
		int count_bck=-1;

		System.out.println("Enter No of Pages:");
		n=Integer.parseInt(obj.readLine());

		System.out.println("Enter Page no:");
		p=Integer.parseInt(obj.readLine());

		int arr_pages [] = new int [(n+1)];
		arr_pages[0]=0;

		for (int i=1;i<=n;i++ )
			arr_pages[i]=i;

		for (int i=1;i<p;i++)
		{
			if (i%2!=0)
				count_frwd++;
		}
		

		for (int i=n+2;i>p;i--)
		{
			if (i%2==0) 
				count_bck++;
		}
		
		if (count_frwd<count_bck)
			System.out.println(count_frwd);
		else
			System.out.println(count_bck);
	}
}
/* Problem Code: LUCKFOUR */
import java.io.*;
/*public*/ class noOfFours
{
    public static void main(String args[])throws IOException
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
            ans[i]=occurences(num); 
        }

        for (int i=0;i<t;i++)
        {
            // System.out.println("The sum of digits:");
            System.out.println(ans[i]); 
        }
    }

    public static int occurences(int num)
    {
        int num1=num;
        int count=0;    
        while (num1>0)
		{
			int del=num1%10;
			num1/=10;
			if (del==4)
				count++;
		}
        
        return count;
    }
}
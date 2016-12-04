/*Problem Code : HS08TEST*/

import java.io.*;
/*public*/ class atm
{
	public static void main (String args[])throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		String [] input= obj.readLine().split(" ");

		int withdrawal=0;
		double balance=0.00;
		double transaction=0.0;

		/*System.out.println("Enter Withdrawal Amount:");*/
		withdrawal = Integer.parseInt (input [0]);

		/*System.out.println("Enter balance:");*/
		balance = Double.parseDouble (input [1]);    

		if (withdrawal%5==0 && ((withdrawal+0.5) < (balance)))
		{
			transaction=balance- withdrawal - 0.5;
			if (transaction<=balance)
			{
				System.out.print (/*"Available Balance: "+*/transaction);
			}
			/*else
			{
				System.out.print("Available Balance: "+balance);
			}*/
		}    
		else
		{
			System.out.print(/*"Available Balance:"+*/balance);
		}
	}
}

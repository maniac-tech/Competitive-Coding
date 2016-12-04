/*Problem code: HOLES*/

	import java.io.*;
	class HolesInAText
	{
	public static void main (String[] args)throws IOException
	{
	BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
	int t = Integer.parseInt(obj.readLine());
	if (t<=40)
	{ 
	 for (int j = 0 ; j < t ; j++)
	{
	 int count = 0 ;
	String str = obj.readLine();
	int len = str.length();
	for (int i = 0 ; i < len ; i++)
	{ 
	char ch = str.charAt(i);
	if (ch=='A'||ch=='D'||ch=='O'||ch=='P'||ch=='Q'||ch=='R')
	{ 
	 count++;
	}
	else
	{ 
	count = count;
	}
	if (ch=='B')
	{  
	 count+=2;
	}
	else
	{  
	 count=count;
	}  
	}
	System.out.println(count);    
	}
	}   
	}    
	}
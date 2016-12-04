1.	import java.io.*;
2.	class LifeUniverseEverything
3.	{
4.			public static void main (String[] args)throws IOException
5.			{
6.				BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
7.				int a1 = 0;
8.				
9.				
10.				while (true)
11.				{
12.				a1 = Integer.parseInt(obj.readLine());
13.				
14.				if(a1!=42)
15.				System.out.println(a1);
16.				else
17.				break;
18.				}
19.			}
20.	} 

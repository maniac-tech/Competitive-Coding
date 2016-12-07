import java.io.*;
class LifeUniverseEverything
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int a1 = 0;
		
		
		while (true)
		{
			a1 = Integer.parseInt(obj.readLine());
			
			if(a1!=42)
				System.out.println(a1);
			else
				break;
		}
	}
}
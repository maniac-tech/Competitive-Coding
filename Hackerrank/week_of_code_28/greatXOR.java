import java.io.*;
public class greatXOR{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());
		int count=0;

		for (int i=0;i<t;i++){
			count=0;
			long x=Long.parseLong(obj.readLine());

			for (long j=0;j<x;j++){
				if ((j^x)>x)
					count++;
			}
			System.out.println(count);
		}
	}
}
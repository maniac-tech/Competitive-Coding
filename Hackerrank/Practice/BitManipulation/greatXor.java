import java.io.*;
public class greatXpr{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new  BufferedReader(new InputStreamReader (System.in));
		int q=Integer.parseInt(obj.readLine());	
		for (int j=0;j<q;j++){
			long x = long.parseLong(obj.readLine());
			long count =0;

			for (long i=1;i<x;i++){
				if ((i^x)>x)
					count++;
			}
			System.out.println(count);
		}
	}
}
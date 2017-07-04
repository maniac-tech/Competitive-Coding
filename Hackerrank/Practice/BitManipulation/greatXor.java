import java.io.*;
public class greatXpr{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new  BufferedReader(new InputStreamReader (System.in));
		int q=Integer.parseInt(obj.readLine());
		for (int j=0;j<q;j++){
			int x = Integer.parseInt(obj.readLine());
			int count =0;

			for (int i=1;i<x;i++){
				if ((i^x)>x)
					count++;
			}
			System.out.println(count);
		}
	}
}
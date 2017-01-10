import java.io.*;
public class kangaroo{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input [] = obj.readLine().split(" ");

		int x1, x2;
		int v1, v2;
		x1=Integer.parseInt(input[0]);
		x2=Integer.parseInt(input[2]);
		v1=Integer.parseInt(input[1]);
		v2=Integer.parseInt(input[3]);

		if ((x1<x2 && v1<v2 )||v1==v2)
			System.out.println("NO");
		else {
			while (x1!=x2){
				x1+=v1;
				x2+=v2;
				if (x1==x2)
					System.out.println("YES");
				if (x1>x2 && v1>v2){
					System.out.println("NO");
					break;
				}
			}
		}
	}
}
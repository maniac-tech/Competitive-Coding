import java.io.*;
public class findDigits{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());

		for (int i=0;i<t;i++){
			int n=Integer.parseInt(obj.readLine());
			int ans = traverse(n);
			System.out.println(ans);
		}
	}

	public static int traverse(int n){
		int n1=n;
		int count=0;
		while (n1>0){
			int temp=n1%10;
			n1/=10;
			if (temp!=0)
				if (n%temp==0)
					count++;
		}
		return count;
	}
}
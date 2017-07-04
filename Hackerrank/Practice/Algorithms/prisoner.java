import java.io.*;
public class prisoner{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t=Integer.parseInt(obj.readLine());

		int n,m,s;
		for (int j=0;j<t;j++){
			String input []=obj.readLine().split(" ");
			n=Integer.parseInt(input[0]);
			m=Integer.parseInt(input[1]);
			s=Integer.parseInt(input[2]);
			int trace=s;

			for (int i=1;i<m;i++){
				if (trace<=n)
					trace++;
				else
					trace=1;
			} 
			System.out.println(trace);
			
		}
	}
}
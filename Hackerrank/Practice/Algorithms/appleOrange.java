import java.io.*;
public class appleOrange{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input_ST []=obj.readLine().split(" ");
		String input_AB []=obj.readLine().split(" ");
		String input_MN []=obj.readLine().split(" ");
		String input_m []=obj.readLine().split(" ");
		String input_n []=obj.readLine().split(" ");

		int s=Integer.parseInt(input_ST[0]);
		int t=Integer.parseInt(input_ST[1]);
		int a=Integer.parseInt(input_AB[0]);
		int b=Integer.parseInt(input_AB[1]);
		int m=Integer.parseInt(input_MN[0]);
		int n=Integer.parseInt(input_MN[1]);
		int arr_m[]=new int[m];
		int arr_n[]=new int[n];
		int count_apple=0,count_orange=0;

		if (a<s && s<t && t<b && a<b){
			for (int i=0;i<m;i++)
				arr_m[i]=Integer.parseInt(input_m[i]);
			for(int i=0;i<n;i++)
				arr_n[i]=Integer.parseInt(input_n[i]);
			

			for (int i=0;i<m;i++){
				int sum=arr_m[i]+a;
				if (sum>=s && sum <=t)
					count_apple++;
			}
			for (int i=0;i<n;i++){
				int sum=arr_n[i]+a;
				if (sum>=s && sum <=t)
					count_orange++;
			}

			System.out.println(count_apple);
			System.out.println(count_orange);
		}
	}
}
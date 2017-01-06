import java.io.*;
public class angryTeacher{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("Enter testcases:");
		int testcases=Integer.parseInt(obj.readLine());
		String input [];
		int n[]=new int[testcases], k[]=new int[testcases];

		for (int i=0;i<testcases;i++){
			input =obj.readLine().split(" ");
			n[i]=Integer.parseInt(input[0]);
			k[i]=Integer.parseInt(input[1]);
			int arr []= new int[n[i]];
			String inputArray[] = obj.readLine().split(" ");

			for (int j=0;j<n[i];j++)
				arr[j]=Integer.parseInt(inputArray[j]);

			calculate(arr,n[i],k[i]);
		}
	}

	public static void calculate(int arr[],int n,int k){
		int onTime=0;
		int late=0;

		for (int i=0;i<n;i++){
			if (arr[i]<=0)
				onTime++;
			else if (arr[i]>0)
				late++;
		}
		if ((n-late)<k)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
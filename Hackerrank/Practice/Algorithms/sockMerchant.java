import java.io.*;
import java.util.Arrays;
public class sockMerchant{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int n =Integer.parseInt(obj.readLine());
		int arr [] = new int [n];
		String inputArray[]=obj.readLine().split(" ");

		for (int i=0;i<n;i++)
			arr[i]=Integer.parseInt(inputArray[i]);
		
		int pairs=0;
		Arrays.sort (arr);

		for (int i=0;i<n;i++)
			for (int j=i+1;j<n;j++){
				if (arr[i]==arr[j]&&arr[i]>0&&arr[j]>0){
					pairs++;
					arr[i]=-1;
					arr[j]=-1;
				}
			}

		System.out.println(pairs);
	}
}
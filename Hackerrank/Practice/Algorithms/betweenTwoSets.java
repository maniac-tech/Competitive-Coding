import java.util.Arrays;
import java.io.*;
public class betweenTwoSets{
	public static void main()throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		String input_NM [] = obj.readLine().split(" ");
		String input_setA[]=obj.readLine().split(" ");
		String input_setB[]=obj.readLine().split(" ");

		int n=Integer.parseInt(input_NM[0]);
		int m=Integer.parseInt(input_NM[1]);
		int arr_setA[] = new int[n];
		int arr_setB[]=new int[m];
		int max=0;
		int factor_a=0, factor_b=0;
		int skip=0;
		int count=0;

		for (int i=0;i<n;i++)
			arr_setA[i]=Integer.parseInt(input_setA[i]);
		for(int i=0;i<m;i++)
			arr_setB[i]=Integer.parseInt(input_setB[i]);

		Arrays.sort(arr_setA);
		Arrays.sort(arr_setB);

		if (arr_setA[n-1]>arr_setB[m-1])
			max=arr_setA[n-1];
		else
			max=arr_setB[m-1];

		for (int i=1;i<=max;i++){
			for (int j=0;j<n;j++){
				skip=0;
				if (i%arr_setA[j]==0)
					factor_a=1;
				else {
					factor_a=0;
					skip=1;
					break;
				}
			}

			for (int j=0;j<m;j++){
				if (skip!=1){
					if (arr_setB[j]%i==0)
						factor_b=1;
					else{
						factor_b=0;
						break;
					}
				}
			}

			if (factor_a==1 && factor_b==1)
				count++;
		}
		System.out.println(count);
	}
}
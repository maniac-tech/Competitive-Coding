import java.io.*;
public class plusMinus{
	public static void main(String []args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		/*System.out.println("Enter the size of array:");*/
		int n=Integer.parseInt(obj.readLine());

		/*System.out.println("Enter array:");*/
		String input [] = obj.readLine().split(" ");
		int array [] = new int [n];
		int j=0;

		double zero=0, positive=0, negative=0;

		for (int i=0;i<n;i++){
			array[j]=Integer.parseInt(input[i]);
			j++;
		}

		for (int i=0;i<n;i++){
			if (array[i]==0)
				zero++;
			else if (array[i]>0)
				positive++;
			else if (array[i]<0)
				negative++;
		}

		System.out.println(positive/n);
		System.out.println(negative/n);
		System.out.println(zero/n);
	}
}
import java.io.*;
public class triplets{
	public static void main(String []args)throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int arr_a[]=new int [3];
		int arr_b[]=new int [3];
		int score_a=0;
		int score_b=0;

		// System.out.println("Enter the values for Alice:");
		String input [] = obj.readLine().split(" ");		
		for (int i=0;i<3;i++)
			arr_a[i]=Integer.parseInt(input[i]);

		// System.out.println("Enter the values for Bob:");
		String inputB [] = obj.readLine().split(" ");
		for (int i=0;i<3;i++)
			arr_b[i]=Integer.parseInt(inputB[i]);

		for (int i=0;i<3;i++)
			if ((arr_a[i]>arr_b[i])&&(arr_a[i]!=arr_b[i]))
				score_a++;
			else if ((arr_a[i]<arr_b[i])&&(arr_a[i]!=arr_b[i]))
				score_b++;

		// System.out.println("Score of Alice:");
		System.out.print(score_a+" ");

		// System.out.println("Score of Bob:");
		System.out.println(score_b);
	}
}
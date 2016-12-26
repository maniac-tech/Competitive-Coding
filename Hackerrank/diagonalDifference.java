import java.io.*;
public class diagonalDifference{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));

		int n;
		//System.out.println("Enter the n:");
		n=Integer.parseInt(obj.readLine());
		int matrix [][]=new int [n][n];

		for (int i=0;i<n;i++){
			String input[]=obj.readLine().split(" ");
			for (int j=0;j<n;j++)
				matrix[i][j]=Integer.parseInt(input[j]);
		}

		int diagonal1=0,diagonal2=0;
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
				if (i==j)
					diagonal1+=matrix[i][j];

		int n1=n-1;
		for (int i=0;i<n;i++){
			diagonal2+=matrix[i][n1];
			n1--;
		}

		if (diagonal1>diagonal2)
			System.out.println(diagonal1-diagonal2);
		else
			System.out.println(diagonal2-diagonal1);
	}
}
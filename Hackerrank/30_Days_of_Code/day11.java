import java.io.*;
import java.util.*;

public class day11{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		
		int array [][]=new int[6][6];
		int hourglass []=new int[16];
		int sum=0; //variable to store the sum of each hourglass
		int count=0;
		
		//Accepting Input from User:
		for (int i=0;i<6;i++){
			String input [] =obj.readLine().split(" ");
			for (int j=0;j<6;j++)
				array[i][j]=Integer.parseInt(input[j]);
		}

		//Main processing
		for (int i=0;i<4;i++){//This loop to jump to next rows 
			int a=0; //This variable corresponds to the one in the explanation
			int d=1;
			int e=i+2;

			int junk=0;//This variable is to count the number of iterations
			for (int k=0;k<4;k++){
				junk=0;
				for (int j=a;junk<3;j++,junk++){
					sum+=array[i][j];
				}

				sum+=array[i+1][d]; 
				junk=0;
				for (int j=a;junk<3;junk++,j++){
					sum+=array[e][j];
				}

				hourglass[count]=sum;
				count++;
				a++;
				d++;
				sum=0;
			}
			sum=0;
		}
		Arrays.sort(hourglass);
		System.out.print(hourglass[15]);
	}
}
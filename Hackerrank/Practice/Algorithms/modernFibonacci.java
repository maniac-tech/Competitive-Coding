import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class modernFibonacci{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input [] = obj.readLine().split(" ");
		int n = Integer.parseInt(input[2]);
		BigInteger arr [] = new BigInteger [n];
		
		arr[0]=new BigInteger(input[0]);
		arr[1]=new BigInteger(input[1]);

		for (int i=2;i<n;i++){
			arr[i]=arr[i-2].add(arr[i-1].multiply(arr[i-1]));
		}
		//BigInteger ans = new BigInteger(arr[n-1]);
		System.out.println(arr[n-1]);
	}
}

// YOU NEED TO USE BIGINTEGER BECAUSE THE ANS MAY CROSS 64-BIT SIZE
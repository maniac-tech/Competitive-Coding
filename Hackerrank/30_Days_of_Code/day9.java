import java.io.*;
public class factorial_recursive{
	public static void main (String args [])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int n;

		/*System.out.println("Enter n:");*/
		n= Integer.parseInt(obj.readLine());

		if (n>0)
			System.out.println(factorial(n));	
	}

	public static int factorial (int n){
		if (n==1)
			return n;
		else
			return (n*factorial (n-1));
	}
}
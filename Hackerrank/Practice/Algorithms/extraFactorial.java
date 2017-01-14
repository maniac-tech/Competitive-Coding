import java.math.*;
import java.io.*;
public class extraFactorial{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int n=Integer.parseInt(obj.readLine());
		BigInteger fact=new BigInteger("1");
		for (int i=n;i>0;i--)
			fact=fact.multiply(new BigInteger(i+""));
		System.out.print(fact);
	} 
}
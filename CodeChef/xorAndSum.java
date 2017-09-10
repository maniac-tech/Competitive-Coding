import java.io.*;
import java.math.*;
public class xorSum{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
		int a=Integer.parseInt(obj.readLine());
		int b=Integer.parseInt(obj.readLine());
		BigInteger sum = new BigInteger("0");
        //int div = 1000000000+7;
		//System.out.println(div);
		BigInteger divB = new BigInteger("1000000000");
		for (int i=0;i<=314159;i++){
		    int shtl = b<<i;
		    int xor = a^shtl;
		    BigInteger temp = new BigInteger(String.valueOf(xor));
			sum=sum.add(temp);
		}
		//System.out.println(sum);
        System.out.println(sum.mod(divB));
        System.out.println((sum.mod(divB).add(7));
	}
}
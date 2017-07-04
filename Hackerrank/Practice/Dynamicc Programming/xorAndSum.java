import java.io.*;
import java.math.*;
public class xorSum{
    public static void main()throws IOException{
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        String input_a = obj.readLine();
        String input_b = obj.readLine();
        
        BigInteger sum = new BigInteger(String.valueOf("0"));
        BigInteger divB = new BigInteger(String.valueOf("1000000007"));
        BigInteger xor; 
        //converting the binary input to its equivalent iNTEGER.
        int a ;
        int b ;
        int binary_b = Integer.parseInt(input_b); ;
        
        a = Integer.parseInt(input_a,2);
        b = Integer.parseInt(input_b,2);
        for (int i=0;i<=314159;i++){            
            int shtl = b<<i; //shtl is crossing the size of int
            xor = new BigInteger(String.valueOf((a^shtl)));
            BigInteger temp = new BigInteger(String.valueOf(xor));
            sum=sum.add(temp);
            System.out.println(sum);
        }
        System.out.println(sum);
        //System.out.println(sum);
        System.out.println(sum.mod(divB));
        //System.out.println((sum.mod(divB).add(7));
    }
}
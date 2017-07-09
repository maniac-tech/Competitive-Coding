import java.io.*;
import java.util.*;

public class flipBits{
	public static void main(String args[])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		int t = Integer.parseInt(obj.readLine());
		for (int i=0;i<t;i++){
			long num = Long.parseLong(obj.readLine());
        //System.out.println(Long.toBinaryString(num));
			complement(num);
		}
	}
	public static void complement(long num){
		long maxInt = (long)(Math.pow(2,32)-1);
		System.out.println (maxInt - num) ;
        //System.out.println (Long.toBinaryString(maxInt - num)) ;
	}
}
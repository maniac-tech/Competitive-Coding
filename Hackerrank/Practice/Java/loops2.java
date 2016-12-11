import java.io.*;
import java.util.*;

public class loops2 {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int q = Integer.parseInt(obj.readLine());

        if (q>=0&&q<=500){
	        for (int i=0;i<q;i++){
	        	String input [] = obj.readLine().split(" ");
	        	int a,b,n;
	        	a=Integer.parseInt(input[0]);
	        	b=Integer.parseInt(input[1]);
	        	n=Integer.parseInt(input[2]);
	        	int sum=(a+b);
	        	int mul=1;
	        	System.out.print(sum+" ");
	        	for (int j=1;j<n;j++){
	        		mul*=(2);
	        		sum+=((mul*b));
	        		System.out.print(sum+" ");
	        	}
	        	System.out.println();
        	}
        }
    }
}
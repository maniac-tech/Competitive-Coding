import java.io.*;
import java.util.*;

public class loops {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int n= Integer.parseInt(obj.readLine());
        if (n>=2 && n<=20){
        	for (int i=1;i<=10;i++)
        		System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int q = Integer.parseInt(obj.readLine());

        if (q>=2&&q<=20){
        	for (int j=1;j<=10;j++){
	        		System.out.println(q+" x "+j+" = "+(q*j));
	        	}
	        	System.out.println();
        	}
        }
    }
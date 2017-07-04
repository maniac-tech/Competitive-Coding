import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class encryption{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String input = (obj.readLine()).replaceAll("\\s","");
		int len = input.length();
        double sqrt = Math.sqrt(len);
        sqrt=Math.round(sqrt);
        double floor = Math.floor(sqrt);
        double ceil = Math.ceil(sqrt);
        int row=(int)floor;
        int col=len/row;
        while (row==col||row>col)
            col++;
        
 	       /*
        System.out.println(len);
        System.out.println(sqrt);
        System.out.println(); 
        System.out.println(floor); 
        System.out.println(ceil);  
        */
        //if (row>=floor && col<=ceil && row<=col){
        	System.out.println(row);
        	System.out.println(col);   
       // 	}   
	}
}
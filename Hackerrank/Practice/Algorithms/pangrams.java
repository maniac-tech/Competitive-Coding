import java.io.*;
public class pangrams{
    public static void main(String args [])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
        String input  = (obj.readLine()).toLowerCase();
        int count=0;
        for (int i=97;i<=122;i++){
        	if (input.indexOf((char)i)!=-1)
        		count++;
        	else
        		break;
        }
        if (count==26)
        	System.out.println("pangram");
        else
        	System.out.println("not pangram");
    }
}
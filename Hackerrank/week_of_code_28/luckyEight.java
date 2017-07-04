import java.util.*;
import java.io.*;
public class luckyEight { 
    static int count=0;
    public static void print(String prefix, String remaining, int k) {
        if (k == 0) {
            int temp=Integer.parseInt(prefix);
            if (temp%8==0){
                // System.out.println(temp+ " is divisible by 8");
                count++;
            }
            return;
        }
        if (remaining.length() == 0) return;
        print(prefix + remaining.charAt(0), remaining.substring(1), k-1);
        print(prefix, remaining.substring(1), k);
    }


    public static void main(String args [])throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in)); 
        int k=Integer.parseInt(obj.readLine());
        String s = obj.readLine();
        int i=1;
        while (i<k){
            print("", s, i);
            i++;
        }
         
            
        System.out.println(count%(1000000000+7));
    }

}
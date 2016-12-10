import java.io.*;

public class stdin2 {

    public static void main(String[] args)throws IOException {
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int i = Integer.parseInt(obj.readLine());
        double d= Double.parseDouble(obj.readLine());
        String s= obj.readLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
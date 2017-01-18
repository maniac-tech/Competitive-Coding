import java.io.*;
public class viralAdvt {

    public static void main(String[] args)throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
        int n = Integer.parseInt(obj.readLine());
        int person = 5,count = 0;
        while(n>0){
            int interested = person / 2;
            person = interested * 3;
            count = count + interested;
            n--;
        }
        System.out.println(count);
    }
}
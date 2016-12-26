import java.io.*;
public class bigSum{
    public static void main(String [] args)throws IOException{
        BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
        //System.out.println("Enter your size:");
        int n=Integer.parseInt(obj.readLine());
        int arr[]= new int[n];

        //System.out.println("Enter array:");
        String input [] = obj.readLine().split(" ");

        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input[i]);

        long sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            //System.out.println(sum);
        }

        //System.out.println("Sum is :");
        System.out.println(sum);
    }
}
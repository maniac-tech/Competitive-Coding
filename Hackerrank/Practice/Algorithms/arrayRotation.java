import java.io.*;
public class arrayRotation{
    public static void main()throws IOException{
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        String input [] = obj.readLine().split (" ");

        // System.out.println("Enter array size:");
        int n=Integer.parseInt(input[0]);
        int k=Integer.parseInt(input[1]), q=Integer.parseInt(input[2]);
        int arr [] = new int [n];
        int arr_q[]=new int[q];

        // System.out.println("Enter elements:");
        String input1 [] = obj.readLine().split(" ");

        //Values of Q:
        for (int i=0;i<q;i++)
        	arr_q[i]=Integer.parseInt(obj.readLine());

        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input1[i]);
         
        for (int j=0;j<k;j++){
            int temp = arr[n-1];
            for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
        }

        for (int i=0;i<q;i++)
        	System.out.println(arr[arr_q[i]]);
    }
}
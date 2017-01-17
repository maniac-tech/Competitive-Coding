import java.io.*;
import java.util.*;

public class cutTheSticks{
    public static int lengthArray=0;

    public static void main(String args [])throws IOException{
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        int n=Integer.parseInt(obj.readLine());
        String input [] = obj.readLine().split(" ");

        int arr[]=new int [n];
        
        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input[i]);

        lengthArray=n;
        Arrays.sort(arr);
        while (lengthArray>0){
            for (int i=0;i<n;i++){
                if (arr[i]!=0 && arr[i]>0)
                    cutIntoPieces(arr,n,i);
            }
        }
    }

    public static void cutIntoPieces(int arr[],int n,int smallestIndex){
        int smallestStick=arr[smallestIndex];
        int tempLength=0;
        int zero=0;
        for (int i=0;i<n;i++){
            if (arr[i]>0 && arr[i]!=0){
                tempLength++;
                arr[i]-=smallestStick;
            }
            
            if (arr[i]==0)
                zero++;
        }
        lengthArray=n-zero;
        System.out.println(tempLength);
    }
}
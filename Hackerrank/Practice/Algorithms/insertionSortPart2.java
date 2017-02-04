import java.io.*;
public class insertionSortPart2{
    public static void main(String args [])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
        int n=Integer.parseInt(obj.readLine());
        String input[]=obj.readLine().split(" ");
        int arr[]=new int[n];
        
        //Accepting input
        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(input[i]);

        sort(arr,n);        
    }

    public static void sort (int arr1[],int n){
        int len=n;
        for (int k=1;k<len;k++){
            int temp=arr1[k];
            int j=k-1;

            while (j>=0 && arr1[j]>temp){
                arr1[j+1]=arr1[j];
                j=j-1;
                
            }
            arr1[j+1]=temp;   
            if (k<len-1) {   
            	for (int i=0;i<n;i++)
                    System.out.print(arr1[i]+" ");
              	System.out.println();
            }
        	    
        }
        for (int i=0;i<n;i++)
                    System.out.print(arr1[i]+" ");
        System.out.println();
        
        
    }
}
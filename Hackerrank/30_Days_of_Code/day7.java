import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[])throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader (System.in));
        int n =Integer.parseInt(ob.readLine());

        int[] arr = new int[n];
        String input [] = ob.readLine().split(" ");
        for(int i=0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

		for(int i=n-1; i >= 0; i--){
            System.out.print (arr[i]+" ");        }        
    }
}
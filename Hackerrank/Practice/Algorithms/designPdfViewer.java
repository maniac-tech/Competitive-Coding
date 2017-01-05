import java.io.*;
import java.util.*;

public class designPdfViewer{
    public static void main(String [] args)throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
        String size_input []= obj.readLine().split(" ");
        String word = obj.readLine();
        char ref [] = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int size[] = new int [26];
        for(int i=0;i<26;i++)
            size[i]=Integer.parseInt(size_input[i]);

        char alphabets [] = word.toCharArray();
        int alphabets_len = alphabets.length;
        int values[]=new int[alphabets_len];

        for (int i=0;i<alphabets_len;i++)
            for (int j=0;j<26;j++)
                if (alphabets[i]==ref[j])
                    values[i]=size[j];

        Arrays.sort(values);
        System.out.print(alphabets_len*1*values[alphabets_len-1]);
    }
}
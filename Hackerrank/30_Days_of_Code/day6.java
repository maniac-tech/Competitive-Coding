import java.io.*;
public class day6{
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
        int t = Integer.parseInt(obj.readLine());
        char ch[][]=new char [t][10000];
        int len [] = new int [t];
        String even="";
        String odd="";
        if ( t>=1 && t<=10){
            for (int i=0;i<t;i++){
                String str = obj.readLine(); 
                ch [i] = (str).toCharArray();
                len[i]=str.length();
            }
        }
        for (int i=0;i<t;i++){
            for (int j=0;j<len[i];j++)
                if (j%2==0)
                    even+=ch[i][j];
                else
                    odd+=ch[i][j];
            System.out.println(even+" "+odd);
            even="";
            odd="";
        }
    }
}
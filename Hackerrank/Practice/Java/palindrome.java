import java.io.*;
public class palindrome{
	public static void main(String [] args)throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String str = obj.readLine();
		int len=str.length();
		String str2="";
		for (int i=len-1;i>=0;i--){
			str2+=str.charAt(i);
		}

		if (str.equals(str2))
			System.out.println("Yes");
        else
            System.out.println("No");
	}
}
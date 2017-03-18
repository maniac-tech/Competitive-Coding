import java.io.*;
public class camelCase{
	public static void main(String args [])throws IOException{
		BufferedReader obj = new BufferedReader(new InputStreamReader (System.in));
		String str = obj.readLine();
		char str_to_char[] = str.toCharArray();
		int len=str.length();
		int count=1;
		for (int i=0;i<len;i++){
			// System.out.println(str_to_char[i]);
			if(Character.isUpperCase(str_to_char[i]))
				count++;
		}
		System.out.println(count);
	}
}